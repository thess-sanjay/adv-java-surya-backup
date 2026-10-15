package user;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		try {
			java.sql.Driver d = new com.mysql.cj.jdbc.Driver();
			
			//Register Driver
			DriverManager.registerDriver(d);
			
			System.out.println("Successfull!!!!!");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
