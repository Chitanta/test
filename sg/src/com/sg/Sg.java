package com.sg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sg {
	
	/**
	 * 添加学生 
	 */
	public void add(Student Student) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//1.2.  获取连接
				conn = ConnectionFactory.getConn();
				//3预处理sql
				String sql = "insert into t_Student(aclass,name,grade,major) values(?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, Student.getAclass());
				pstmt.setString(2, Student.getName());
				pstmt.setDouble(3, Student.getGrade());
				pstmt.setString(4, Student.getMajor());
				//4执行
				pstmt.executeUpdate();
			}finally{
				//6释放资源
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 通过id删除学生
	 */
	public void deleteById(long id) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_Student where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 通过id查找学生
	 */
	public Student findById(long id) {
		Student Student = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_Student where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				rs = pstmt.executeQuery();
				while(rs.next()){
					//long id = rs.getLong("id");
					String aclass = rs.getString("aclass");
					String name = rs.getString("name");
					double grade = rs.getDouble("grade");
					String major = rs.getString("major");
					Student = new Student(id, aclass, name, grade, major);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Student;
	}

	/**
	 * 查找所有学生
	 */
	public List<Student> findAll() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_Student";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					long id = rs.getLong("id");
					String aclass = rs.getString("aclass");
					String name = rs.getString("name");
					double grade = rs.getDouble("grade");
					String major = rs.getString("major");
					Student Student = new Student(id, aclass, name, grade, major);
					list.add(Student);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 修改学生信息
	 */
	public void update(Student Student) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "update t_Student set aclass=?,name=?,grade=?,major=? where id =?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, Student.getAclass());
				pstmt.setString(2, Student.getName());
				pstmt.setDouble(3, Student.getGrade());
				pstmt.setString(4, Student.getMajor());
				pstmt.setLong(5, Student.getId());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 菜单
	public void menu() {
		System.out.println("*********学生信息管理系统*********");
		System.out.println("* 1. 查看所有学生信息");
		System.out.println("* 2. 录入学生信息");
		System.out.println("* 3. 删除学生信息");
		System.out.println("* 4. 更新学生信息");
		System.out.println("* 5. 查询学生信息");
		System.out.println("* help. 帮助");
		System.out.println("* exit. 退出");
		System.out.println("**********************************");
	}

	public static void main(String[] args) {
		Sg sms = new Sg();
		sms.menu();
		// 扫描标准输入，等待用户的输入
		Scanner sc = new Scanner(System.in);
		while (true) {
			try{
				System.out.print("请输入功能编号：");
				// 阻塞，直到用户输入回车，将回车前所有用户输入返回
				String line = sc.nextLine();
				switch (line) {
				case "1":
					System.out.println("以下是所有学生的信息：");
					List<Student> arr = sms.findAll();
					for (Student stu : arr) {
						System.out.println(stu);
					}
					System.out.println("共计 " + arr.size() + " 人");
					break;
				case "2":
					while (true) {
						System.out.println("请输入学生信息【aclass#name#grade#major】或者输入【break】返回上一级");
						String stuStr = sc.nextLine();
						if (stuStr.equals("break")) {
							break;
						}
						// 1001#terry#12
						String[] stuArr = stuStr.split("#");
						String aclass = stuArr[0];
						String name = stuArr[1];
						double grade = Double.parseDouble(stuArr[2]);
						String major = stuArr[3];
						
						Student stu = new Student(null, aclass, name, grade, major);
						sms.add(stu);
						System.out.println("保存成功！");
					}

					break;
				case "3":
					while (true) {
						System.out.println("请输入要删除学生的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if (idStr.equals("break")) {
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if (stu == null) {
							System.out.println("您要删除的学生不存在！");
							continue; // 结束当前循环，继续下一次循环
						}
						sms.deleteById(id);
						System.out.println("删除成功！");
					}
					break;
				case "4":
					while (true) {
						System.out.println("请输入要更改学生的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if (idStr.equals("break")) {
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if (stu == null) {
							System.out.println("您要更改的学生不存在！");
							continue; // 结束当前循环，继续下一次循环
						}
						System.out.println("原有学生信息为：");
						System.out.println(stu);
						System.out.println("请输入要修改的信息【aclass#name#grade#major】");
						String stuStr = sc.nextLine();
						String[] stuArr = stuStr.split("#");
						String aclass = stuArr[0];
						String name = stuArr[1];
						double grade = Double.parseDouble(stuArr[2]);
						String major = stuArr[1];
						Student newStu = new Student(id, aclass, name, grade, major);
						sms.update(newStu);
						System.out.println("修改成功");
					}
					break;
				case "5":
					while (true) {
						System.out.println("请输入要查询学生的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if (idStr.equals("break")) {
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if (stu == null) {
							System.out.println("您要查询的学生不存在！");
							continue; // 结束当前循环，继续下一次循环
						}
						System.out.println(stu);
					}
					break;
				case "help":
					sms.menu();
					break;
				case "exit":
					System.out.println("bye bye!欢迎下次再访问！");
					sc.close();
					System.exit(0);
				default:
					System.out.println("输入错误！");
				}
			}catch(Exception e){
				System.out.println("输入错误！"+e.getMessage());
				continue;
			}
		}
	}
}



