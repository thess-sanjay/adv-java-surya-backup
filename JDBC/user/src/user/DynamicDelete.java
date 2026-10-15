package user;
import java.sql.*;
import java.util.Scanner;


public class DynamicDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = scan.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies_db", "root", "root");
			
			PreparedStatement ps = c.prepareStatement("delete from movies where id = ?");
			
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
			System.err.println("Data Deleted Successfully!!!");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
