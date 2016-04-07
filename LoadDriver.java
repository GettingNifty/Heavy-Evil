package hEvil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
							"jdbc:mysql://dbname.dbwebsite.com:3306",
							"user", "H45H3DP455W0RD");

			java.sql.PreparedStatement pstmt = conn
					.prepareStatement("USE db_name");
			java.sql.PreparedStatement pstmt2 = conn.
					prepareStatement("CREATE TABLE IF NOT EXISTS db_table");
			java.sql.PreparedStatement pstmt3 = conn.prepareStatement("INSERT INTO db_table (user, pass, repass, name, lame, dob, gender, adds, apt, city, zip, phone, email) VALUES(id int NOT NULL auto_increment, VARCHAR(30) user, VARCHAR(30) pass, VARCHAR(30) repass, VARCHAR(30) name, VARCHAR(30) lname, VARCHAR(10) dob, TEXT gender, TEXT addr, TEXT apt, TEXT city, TEXT zip, TEXT phone, VARCHAR(30) email, PRIMARY KEY(id));");
			

			pstmt.executeUpdate();
			pstmt2.executeUpdate();
			pstmt3.executeUpdate();
			
			ResultSet rs = pstmt.executeQuery();
		    rs.close();
			

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		

	}

}
