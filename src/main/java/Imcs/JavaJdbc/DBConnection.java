package Imcs.JavaJdbc;

import java.sql.Connection;

import java.sql.DriverManager;

public class DBConnection {

	public DBConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

}