package hEvil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.activation.DataSource;
import javax.swing.SwingWorker;

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
							"jdbc:mysql://rds.amazonaws.com:3306",
							"username", "664651702a546e3b702628355c2229");			java.sql.PreparedStatement pstmt = conn
					.prepareStatement("USE db_registration");
			java.sql.PreparedStatement pstmt2 = conn
					.prepareStatement("CREATE TABLE IF NOT EXISTS db_table{user_tag TINYTEXT");
			java.sql.PreparedStatement pstmt3 = conn
					.prepareStatement("INSERT INTO db_table (user, pass, repass, name, lame, dob, gender, adds, apt, city, zip, phone, email) VALUES(id int NOT NULL auto_increment, VARCHAR(30) user, VARCHAR(30) pass, VARCHAR(30) repass, VARCHAR(30) name, VARCHAR(30) lname, VARCHAR(10) dob, TEXT gender, TEXT addr, TEXT apt, TEXT city, TEXT zip, TEXT phone, VARCHAR(30) email, PRIMARY KEY(id));");

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

	class UpdateTask extends SwingWorker<DataSource, Void> {
		

		public UpdateTask(String cs) {
            
			
		

		}

		protected DataSource doInBackground() throws Exception {
			return null;

		}
	}
		class PassTask extends SwingWorker<DataSource, Void> {

			public PassTask(char[] password) {
				
				
			}

			@Override
			protected DataSource doInBackground() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}

		}

	}

