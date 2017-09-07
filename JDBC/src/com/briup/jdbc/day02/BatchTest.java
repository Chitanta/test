package com.briup.jdbc.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class BatchTest {
	private static Connection connection;

	private static PreparedStatement ps;

	public static void main(String[] args) throws SQLException {
		connection = DriverFactory.getConnection();
		String sql = "insert into batch values(?,?)";
		ps = connection.prepareStatement(sql);
		for (int i = 0; i < 5000; i++) {
			ps.setInt(1, i);
			ps.setString(2, "a" + i);
			ps.addBatch();
			if (i % 5000 == 0) {
				ps.executeBatch();
				// 清空缓存
				ps.clearBatch();
			}
			
		}
		ps.clearBatch();
	}
}
