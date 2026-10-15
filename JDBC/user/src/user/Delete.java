package user;

import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			Statement s = c.createStatement();
			
			s.executeUpdate("delete from cartoons where id = 3");
			
			System.out.println("Data Deleted Successfully!!!");
		} catch(ClassNotFoundException | SQLException e) {
			e.fillInStackTrace();
		}
	}

}
