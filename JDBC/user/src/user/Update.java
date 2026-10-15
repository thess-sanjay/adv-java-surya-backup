package user;

import java.sql.*;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			Statement s = c.createStatement();
			
			s.executeUpdate("update  cartoons set name='JackyChan', channel='CN' where id = 3");
			
			System.out.println("Data Updated Successfully!!!");
			
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace(); 
		}
	}

}
