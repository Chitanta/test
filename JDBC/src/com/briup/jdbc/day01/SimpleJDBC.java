package com.briup.jdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试JDBC连接数据库的步骤
 * 
 * @author Hyouka
 *
 */
public class SimpleJDBC {

	private static ResultSet rs;
	private static Statement statement;
	private static Connection connection;

	public static void main(String[] args) {

		try {
			// 1、加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2、建立连接
			/**
			 * 第一个参数：指定数据库的URL标识 第二个参数：数据库中的用户名 第三个参数：数据库中的用户名的密码
			 */
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "Hyouka",
					"Hyouka123");

			// 3、创建执行sql语句的statement对象
			statement = connection.createStatement();

			// 4、执行sql语句
			String sql = "select * from s_dept";
			String sql1 = "insert into s_dept values(1,'Play',1)";
			// 接收返回数据的结果集
			/*
			 * executeQuery():专门用来执行select语句 有resultset结果集。
			 * executeUpdate:专门用来执行Insert/update/delete 语句，返回int类型结果。
			 * execute():判断当前语句是否有结果集返回。 如果有为true，如果没有为false。 3种方式都会执行sql语句
			 */
			rs = statement.executeQuery(sql);
			// int i = statement.executeUpdate(sql1);
			// System.out.println("插入："+i+"条数据");
			// 5、树立结果集
			// .next()方法，用来判断是否有下一行数据。如果有返回true，如果没有返回false。
			while (rs.next()) {
				// 获取想要的数据
				// .getXXX()是根据查找字段的类型来决定的
				System.out.println("id:" + rs.getInt("id") + "-->name:"
						+ rs.getString("name") + "-->region_id:"
						+ rs.getInt("region_id"));
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			// 6、关闭资源: 先开的后关

			try {
				if (rs != null)
					rs.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
