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
	
public JTextComponent heyText8;
public JTextComponent heyText7;
public JTextComponent heyText6;
public JTextComponent heyText5;
public JTextComponent heyText4;
public JTextComponent heyText3;
public JTextComponent genDer;
public JTextComponent userAge;
public JTextComponent heyText2;
public JTextComponent heyText;
public JTextComponent tagText;
public JTextComponent passText;
public JTextComponent passConfirm = new JPasswordField();
public JTextComponent passTask = new JPasswordField();



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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

		}

		protected DataSource doInBackground() throws Exception {
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 

				
			}

			@Override
			protected DataSource doInBackground() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}

		}


	public static void sqlDriver(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

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
					.prepareStatement("CREATE TABLE IF NOT EXISTS db_table(user_tag TINYTEXT NULL");
			java.sql.PreparedStatement pstmt3 = conn
					.prepareStatement("INSERT INTO db_table (user , pass, repass, name, lame, dob, gender, adds, apt, city, zip, phone, email) VALUES(id int NOT NULL auto_increment, VARCHAR(30) user, VARCHAR(30) pass, VARCHAR(30) repass, VARCHAR(30) name, VARCHAR(30) lname, VARCHAR(10) dob, TEXT gender, TEXT addr, TEXT apt, TEXT city, TEXT zip, TEXT phone, VARCHAR(30) email, PRIMARY KEY(id));");

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

