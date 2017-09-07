package com.briup.jdbc.day01;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * JDBC进行增删改查
 * 
 * @author Hyouka
 *
 */
public class SimpleJDBC2 {
	private static Connection connection;
	private static ResultSet rs;
	private static Statement statement;
	public static void main(String[] args) {
		// 返回连接对象
		connection = DriverFactory.getConnection();
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Isql = "insert into t_user values(1,'tom',1000)";
		String Ssql = "select * from t_user";
		String Usql = "update t_user set name='jack'";
		String Dsql = "delete t_user";
		// 插入
		Insert(Isql);
		// 查询
		Select(Ssql);
		// 修改
		Update(Usql);
		// 查询
		Select(Ssql);
		// 删除
		Delete(Dsql);
		// 查询
		Select(Ssql);
	}

	// 插入的方法
	public static void Insert(String sql) {
		try {
			// 创建Statement对象
			//statement = connection.createStatement();
			// 执行sql语句
			int i = statement.executeUpdate(sql);
			System.out.println("插入" + i + "条数据");
		} catch (SQLException e) {
			try {
				// 如果插入出错，回滚事务
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	// 查询的方法
	public static void Select(String sql) {
		try {
			//statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				System.out.println("id:" + rs.getInt(1) + "-->name:"
						+ rs.getString(2) + "-->salary:" + rs.getInt(3));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// 修改的方法
	public static void Update(String sql) {
		try {
			// 创建Statement对象
			//statement = connection.createStatement();
			// 执行sql语句
			int i = statement.executeUpdate(sql);
			System.out.println("修改" + i + "条数据");
		} catch (SQLException e) {
//			try {
//				// 如果插入出错，回滚事务
//				connection.rollback();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			e.printStackTrace();
		}
	}

	// 删除的方法
	public static void Delete(String sql) {

		try {
			// 创建Statement对象
			//statement = connection.createStatement();
			// 执行sql语句
			int i = statement.executeUpdate(sql);
			System.out.println("删除了" + i + "条数据");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
