package hEvil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.activation.DataSource;
import javax.swing.JPasswordField;
import javax.swing.SwingWorker;
import javax.swing.text.JTextComponent;

public class LoadDriver {
	

public static JTextComponent heyText8;
public static JTextComponent heyText7;
public static JTextComponent heyText6;
public static JTextComponent heyText5;
public static JTextComponent heyText4;
public static JTextComponent heyText3;
public static JTextComponent genDer;
public static JTextComponent userAge;
public static JTextComponent heyText2;
public static JTextComponent heyText;
public static JTextComponent tagText;
public static JTextComponent passText;
public static JTextComponent passConfirm = new JPasswordField();
public static JTextComponent passTask = new JPasswordField();



class UpdateTask extends SwingWorker<DataSource, Void> {
		

		public UpdateTask(String cs) {
			
			
			
			UpdateTask user = new UpdateTask(tagText.getText());
			 UpdateTask name = new UpdateTask(heyText.getText());
			 UpdateTask lname = new UpdateTask(heyText2.getText());
			 UpdateTask dob = new UpdateTask(userAge.getText());
			 UpdateTask gender = new UpdateTask(genDer.getText());
			 UpdateTask addr = new UpdateTask(heyText3.getText());
			 UpdateTask apt = new UpdateTask(heyText4.getText());
			 UpdateTask city = new UpdateTask(heyText5.getText());
			 UpdateTask zip = new UpdateTask(heyText6.getText());
			 UpdateTask phone = new UpdateTask(heyText7.getText());
			 UpdateTask email = new UpdateTask(heyText8.getText());
			 
			
			 
			 try {
				user.doInBackground();
				name.doInBackground();
				lname.doInBackground();
				dob.doInBackground();
				gender.doInBackground();
				addr.doInBackground();
				apt.doInBackground();
				city.doInBackground();
				zip.doInBackground();
				phone.doInBackground();
				email.doInBackground();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		

		}

		protected DataSource doInBackground() throws Exception {
			this.execute();
			return null;
			

		}
	}
		class PassTask extends SwingWorker<DataSource, Void> {

			public PassTask(char[] cs) {
				
				PassTask pass = new PassTask(((JPasswordField) passTask).getPassword());
				 PassTask repass = new PassTask(((JPasswordField) passConfirm).getPassword());
				 
				 try {
					 
					pass.doInBackground();
					repass.doInBackground();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				 
				 

				
			}

			
			@Override
			protected DataSource doInBackground() throws Exception {
				
				return null;
				
			}

		}


	public static void sqlDriver(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {

		try {
			

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection conn = null;
			conn =

			DriverManager
					.getConnection(
							"jdbc:mysql://darkdb.ccjv9irbi51c.us-west-2.rds.amazonaws.com:3306",
							"darkstar", "664651702a546e3b702628355c2229");

			java.sql.PreparedStatement pstmt = conn
					.prepareStatement("USE db_registration");
			java.sql.PreparedStatement pstmt2 = conn
					.prepareStatement("CREATE TABLE IF NOT EXISTS db_table(ID int NOT NULL AUTO_INCREMENT PRIMARY KEY);");
			java.sql.PreparedStatement pstmt3 = conn
					.prepareStatement("ALTER TABLE db_table ADD(user VARCHAR(30), pass VARCHAR(30), repass VARCHAR(30), name VARCHAR(30), lname VARCHAR(30), dob VARCHAR(10), gender TEXT, addr TEXT, apt TEXT, city TEXT, zip TEXT, phone TEXT, email VARCHAR(100));");
			java.sql.PreparedStatement pstmt4 = conn
					.prepareStatement("INSERT INTO db_table(user, pass, repass, name, lname, dob, gender, adds, apt, city, zip, phone, email) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?;");
           
			pstmt.executeUpdate();
			pstmt2.executeUpdate();
			pstmt3.executeUpdate();
			pstmt4.executeUpdate();
			

			ResultSet rs = pstmt.executeQuery();
			rs.close();
			
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		    System.out.println("Throwable: " + ex.getCause());
		    System.out.println("StackTrace: " + ex.getStackTrace());
		    
		    
		}
	}

	
	}

