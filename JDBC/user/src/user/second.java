package user;

import java.sql.*;

public class second {
	public static void main(String[] args) {
		try {
			//1.Load or Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish Connection
			DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db","root", "root"); 
			System.out.println("connection established");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
