package GeneralTopics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBConnection {

	
	@Test
	public void ConnectDataBase() throws ClassNotFoundException, SQLException {
		

		
		
			Class.forName("com.mysql.jdbc.Driver");// Passing Driver of Data Base 
			
			System.out.println("driver loaded");
		 
		    Connection con= DriverManager.getConnection("jdbc:mysql://192.168.185.67:3306/RBDv34","SA","admin@123");
		
		   
		    System.out.println("onnected to my sql DB");
	
		
		   Statement stm =con.createStatement();
		   
	}
	
	
}
