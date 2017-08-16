package com.zhiyou100.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class DBUtil {
	private static Properties p = new Properties();
	private static DataSource dataSource = null;//数据源
	private static Connection conn = null;
	static{
		//读取properties
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("dbcp.properties");
		try {//加载
			p.load(is);
			dataSource = BasicDataSourceFactory.createDataSource(p);//工厂模式放入properties中存放的键值对
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		try {
			conn =dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection con,Statement st,ResultSet rs) {
		try {
			if(rs != null && !rs.isClosed())
				rs.close();
			if(st != null && !st.isClosed())
				st.close();
			if(con !=null && !conn.isClosed())
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
