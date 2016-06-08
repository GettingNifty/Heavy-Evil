package hEvil;

import java.beans.EventHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.activation.DataSource;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.text.JTextComponent;

public class LoadDriver {

	static String rsUser;
	protected static JTextComponent textArea = new JTextField();
	protected static JTextComponent textArea2 = new JTextField();

	protected static JTextComponent userText = new JTextField();
	protected static JTextComponent passText = new JTextField();
	protected static JTextComponent passConfirm = new JTextField();
	protected static JTextComponent nameText = new JTextField();
	protected static JTextComponent lnameText = new JTextField();
	protected static JTextComponent userAge = new JTextField();
	protected static JTextComponent genDer = new JTextField();
	protected static JTextComponent addrText = new JTextField();
	protected static JTextComponent aptText = new JTextField();
	protected static JTextComponent cityText = new JTextField();
	protected static JTextComponent zipText = new JTextField();
	protected static JTextComponent phoneText = new JTextField();
	protected static JTextComponent emailText = new JTextField();

	class UpdateTask extends SwingWorker<DataSource, Void> {

		private Object x;

		protected UpdateTask(String cs) {

			String user = new String(userText.getText());
			String pass = new String(passText.getText());
			String repass = new String(passConfirm.getText());
			String name = new String(nameText.getText());
			String lname = new String(lnameText.getText());
			String dob = new String(userAge.getText());
			String gender = new String(genDer.getText());
			String addr = new String(addrText.getText());
			String apt = new String(aptText.getText());
			String city = new String(cityText.getText());
			String zip = new String(zipText.getText());
			String phone = new String(phoneText.getText());
			String email = new String(emailText.getText());

			try {
				user.equals(user);
				pass.equals(pass);
				repass.equals(repass);
				name.equals(name);
				lname.equals(lname);
				dob.equals(dob);
				gender.equals(gender);
				addr.equals(addr);
				apt.equals(apt);
				city.equals(city);
				zip.equals(zip);
				phone.equals(phone);
				email.equals(email);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		protected DataSource doInBackground() throws Exception {
			EventHandler myHandler = new EventHandler(x, null, null, null);
			SwingUtilities.invokeLater(new Runnable() {

				public void run() {

					x.toString();
					x.getClass();

				}
			});
			myHandler.wait(0, 0);
			myHandler.hashCode();
			return null;

		}
	}

	class PassTask extends SwingWorker<DataSource, Void> {

		private Object y;

		protected PassTask(char[] cs) {

			char[] pass = ((JPasswordField) passText).getPassword();
			char[] repass = ((JPasswordField) passConfirm).getPassword();

			try {

				pass.equals(pass);
				repass.equals(repass);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		@Override
		protected DataSource doInBackground() throws Exception {
			EventHandler passHandler = new EventHandler(y, null, null, null);
			passHandler.hashCode();
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {

					y.toString();
					y.getClass();
				}
			});

			return null;
			
		}

	}

	public static void sqlDriver(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {

		try {

			String user = userText.getText();
			String pass = passText.getText();
			String repass = passConfirm.getText();
			String name = userAge.getText();
			String lname = lnameText.getText();
			String dob = userAge.getText();
			String gender = aptText.getText();
			String addr = cityText.getText();
			String apt = aptText.getText();
			String city = cityText.getText();
			String zip = zipText.getText();
			String phone = phoneText.getText();
			String email = emailText.getText();

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection conn = null;

			conn =

			DriverManager
					.getConnection(
							"jdbc:mysql://mydb.1234abc.us-region.rds.amazonaws.com:3306",
							"name", "H45H3DP455W0RD");

			PreparedStatement pstmt = conn.prepareStatement("USE my_db");
			PreparedStatement pstmt2 = conn
					.prepareStatement("CREATE TABLE IF NOT EXISTS db_table(ID int NOT NULL AUTO_INCREMENT PRIMARY KEY);");
			PreparedStatement pstmt3 = conn
					.prepareStatement("ALTER TABLE db_table ADD(user VARCHAR(30), pass VARCHAR(30), repass VARCHAR(30), name VARCHAR(30), lname VARCHAR(30), dob VARCHAR(10), gender TEXT, addr TEXT, apt TEXT, city TEXT, zip TEXT, phone TEXT, email VARCHAR(100));");
			PreparedStatement pstmt4 = conn
					.prepareStatement("INSERT INTO db_table(user, pass, repass, name, lname, dob, gender, addr, apt, city, zip, phone, email, id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?;");

			pstmt4.setString(1, user);
			pstmt4.setString(2, pass);
			pstmt4.setString(3, repass);
			pstmt4.setString(4, name);
			pstmt4.setString(5, lname);
			pstmt4.setString(6, dob);
			pstmt4.setString(7, gender);
			pstmt4.setString(8, addr);
			pstmt4.setString(9, apt);
			pstmt4.setString(10, city);
			pstmt4.setString(11, zip);
			pstmt4.setString(12, phone);
			pstmt4.setString(13, email);
			pstmt4.execute();

			pstmt.executeUpdate();
			pstmt2.executeUpdate();
			pstmt3.executeUpdate();
			pstmt4.executeUpdate();

			Statement stmt = conn.createStatement();
			String qry = "SELECT * FROM db_table;";

			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				rsUser = rs.getString(1);
				System.out.println(rsUser);

			}
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
