package example_sqlinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UpdateExample {

	
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employeesdb", "root", "e118528!");

				
				) {
			
				
			String query = "update employee set salary=? where id=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setDouble(1, 5000);
			psmt.setInt(2, 11);
			
			int numRows =  psmt.executeUpdate();
			
			if(numRows>0) {
				System.out.println("Update successfull");
			}else{
				System.out.println("nothing updated");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
}
