	package com.ilong.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	public static synchronized Connection getConnection()   {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection conn=null;
		String user="root";
		String password="admin";  
		String url="jdbc:mysql://localhost:3306/yueqian";
		try {
			conn= DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("数据库数据成功获取！！");	
			}
		return conn;
		
	}
}
