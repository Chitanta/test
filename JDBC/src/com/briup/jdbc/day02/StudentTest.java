package com.briup.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 使用preparedStatement进行增删改查
 * 
 * @author Hyouka
 *
 */
public class StudentTest {
	private static Connection connection;
	private static PreparedStatement ps;
	private static ResultSet rs;

	public static void main(String[] args) {
		connection = DriverFactory.getConnection();
		Student stu = new Student(3, "zhangsan", "33", 30, "male");

		// 测试
		getInsert(stu);
		getSelect(stu);
		getUpdate(28);
		getDelete();
	}

	// 插入方法
	public static void getInsert(Student stu) {

		try {
			String sql = "insert into student " + "values(?,?,?,?,?)";
			ps = connection.prepareStatement(sql);

			ps.setInt(1, stu.getId());
			ps.setString(2, stu.getName());
			ps.setString(3, stu.getPassword());
			ps.setInt(4, stu.getAge());
			ps.setString(5, stu.getGender());

			int i = ps.executeUpdate();
			System.out.println("插入" + i + " ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// finally {
		// DriverFactory.getClose(connection, ps, rs);
		// }
	}

	// 查询的方法
	public static void getSelect(Student stu) {
		String sql = "select * from studnet " + "where name=?";
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, stu.getName());
			rs = ps.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// 修改的方法
	public static void getUpdate(int age) {
		String sql = "update student set age=?";
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, age);
			int i = ps.executeUpdate();
			System.out.println("修改"+i+" ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	//修改的方法
	public static void getDelete(){
		String sql="delete student";
		try {
			ps=connection.prepareStatement(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			//关闭资源
			DriverFactory.getClose(connection, ps, rs);
		}
				
	}
}
