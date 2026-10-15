package user;

import java.sql.*;

public class GetByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			PreparedStatement ps = c.prepareStatement("select * from cartoons where name like ?");
		}
	}

}
