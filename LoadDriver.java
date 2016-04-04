package hEvil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {

	
	
	
	public static void sqlDriver(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
        
        
        
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection conn = null;
			conn =

			DriverManager
					.getConnection(
							"jdbc:mysql://darkdb.ccjv9irbi51c.us-west-2.rds.amazonaws.com:3306/db_registration",
							"darkstar", "tuDaswu47xo10807");
			

			java.sql.PreparedStatement pstmt = conn.prepareStatement("USE db_registration; CREATE TABLE IF NOT EXISTS db_table(id int NOT NULL auto_increment, VARCHAR(30) user, VARCHAR(30) pass, VARCHAR(30) repass, VARCHAR(30) name, VARCHAR(30) lname, VARCHAR(10) dob, TEXT gender, TEXT addr, TEXT apt, TEXT city, TEXT zip, TEXT phone, VARCHAR(30) email, PRIMARY KEY(id))");
			
            pstmt.executeUpdate();
            
            
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
        
	}

}