package user;
import java.sql.*;
import java.util.Scanner;

public class DynamicUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter id: ");
		int id = scan.nextInt();
		
		System.out.print("Enter name: ");
		String name = scan.next();
		
		System.out.print("Enter rating: ");
		Double ratings = scan.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cartoon_db", "root", "root");
			
			PreparedStatement ps = c.prepareStatement("update cartoons set name=?, ratings=? where id=?");
			
			ps.setString(1, name);
			ps.setInt(3, id);
			ps.setDouble(2, ratings);  
			
			ps.executeUpdate();
			
			System.out.println("Data successfully Updated!!!");
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
