package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	static final String SERVER= "localhost";
	static final String DATABASE= "employeesdb";
	static final String USERNAME= "root";
	static final String PASSWORD= "e118528!";
	
	
	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://" + SERVER + "/" + DATABASE,USERNAME,PASSWORD);
		
		
		
	}
	
	
	
}
