package hEvil;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import com.jogamp.opengl.awt.GLJPanel;

public class JDial extends JDialog {

	public static final long serialVersionUID = -26565050431585019L;
	public final JPanel customPanel = new JPanel();

	public static void main(String[] args) throws Exception {

		URL newURL = new URL("http://www.finalfantasy.com");

		JTextPane myOutput = new JTextPane();
		myOutput.setVisible(true);
		myOutput.setPage(newURL);
		myOutput.setBounds(0, 40, 1200, 800);
		myOutput.getEditorKit();

		JScrollBar scrollBar = new JScrollBar();
		myOutput.add(scrollBar);
		scrollBar.getBorder();

		BufferedReader inPut = new BufferedReader(new InputStreamReader(
				newURL.openStream()));

		inPut.close();

		try {

			JDial mainWindow = new JDial();
			mainWindow.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			mainWindow.setVisible(true);
			mainWindow.setTitle("Heavy Evil");
			mainWindow.add(myOutput);
			mainWindow.add(scrollBar);

		} catch (final Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.toString();
			e.getStackTrace();
		}

	}

	public JDial() {

		setBounds(0, 0, 1300, 800);
		getContentPane().setLayout(new BorderLayout());
		customPanel.setLayout(new FlowLayout());
		customPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(customPanel, BorderLayout.CENTER);
		getContentPane().setVisible(true);
		getContentPane().add(new JLabel(new ImageIcon("Images/Master.png")));
		getContentPane().isDoubleBuffered();
		getContentPane().getGraphicsConfiguration();
		getContentPane().getGraphics();

		JPanel windowPane = new JPanel();
		windowPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(windowPane, BorderLayout.SOUTH);

		{
			JButton cancelButton = new JButton("Exit");
			cancelButton.setActionCommand("Exit");
			windowPane.add(cancelButton);
			cancelButton.setBounds(0, 0, 1300, 900);
			cancelButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					dispose();

				}
			});

		}

		{
			JPanel textPane = new JPanel();
			textPane.setLayout(new FlowLayout(FlowLayout.LEFT));
			getContentPane().add(textPane, BorderLayout.NORTH);
			textPane.setVisible(true);

			{

				JTextArea textArea = new JTextArea("Enter User ID", 1, 15);
				textPane.add(textArea);
				textArea.setWrapStyleWord(true);
				textArea.setEditable(true);
				textArea.setFont(Font.getFont(Font.SANS_SERIF));
				textArea.setVisible(true);
				textArea.enableInputMethods(isEnabled());
				textArea.computeVisibleRect(getBounds());
				textArea.setBackground(Color.GRAY);
				textArea.getText();

				JPasswordField textArea2 = new JPasswordField();
				textArea2.setText("Password");
				textPane.add(textArea2);
				textArea2.setColumns(15);
				textArea2.setEditable(true);
				textArea2.setVisible(true);
				textArea2.enableInputMethods(isEnabled());
				textArea2.computeVisibleRect(getBounds());
				textArea2.setBackground(Color.GRAY);
				textArea2.getPassword();

			}
			{

				JButton registerButton = new JButton("Register");
				textPane.add(registerButton);
				registerButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent r) {

						JFrame regFrame = new JFrame();
						regFrame.setVisible(true);
						regFrame.setTitle("Register");
						regFrame.setBackground(Color.WHITE);
						regFrame.setBounds(650, 0, 200, 400);

						dispose();
						{
							JPanel textPane2 = new JPanel();
							textPane2.setLayout(new FlowLayout(
									FlowLayout.CENTER));
							regFrame.add(textPane2);
							textPane2.setVisible(true);

							{

								JTextArea userText = new JTextArea("User Name",
										1, 15);
								userText.setEditable(true);
								userText.setBackground(Color.GRAY);
								textPane2.add(userText);

								JPasswordField passText = new JPasswordField(
										"Password");
								passText.setEditable(true);
								passText.setBackground(Color.GRAY);
								textPane2.add(passText);

								JPasswordField passConfirm = new JPasswordField(
										"Re-enter");
								passConfirm.setEditable(true);
								passConfirm.setBackground(Color.GRAY);
								textPane2.add(passConfirm);

								JTextArea nameText = new JTextArea("Name", 1,
										15);
								nameText.setEditable(true);
								nameText.setBackground(Color.GRAY);
								textPane2.add(nameText);

								JTextArea lnameText = new JTextArea(
										"Last Name", 1, 15);
								lnameText.setEditable(true);
								lnameText.setBackground(Color.GRAY);
								textPane2.add(lnameText);

								JTextArea userAge = new JTextArea("DOB", 1, 15);
								userAge.setEditable(true);
								userAge.setBackground(Color.GRAY);
								textPane2.add(userAge);

								JTextArea genDer = new JTextArea("Gender", 1,
										15);
								genDer.setEditable(true);
								genDer.setBackground(Color.GRAY);
								textPane2.add(genDer);

								JTextArea addrText = new JTextArea("Address",
										1, 15);
								addrText.setEditable(true);
								addrText.setLineWrap(true);
								addrText.setBackground(Color.GRAY);
								textPane2.add(addrText);

								JTextArea aptText = new JTextArea("Apt./Suite",
										1, 15);
								aptText.setEditable(true);
								aptText.setBackground(Color.GRAY);
								textPane2.add(aptText);

								JTextArea cityText = new JTextArea("City", 1,
										15);
								cityText.setEditable(true);
								cityText.setBackground(Color.GRAY);
								textPane2.add(cityText);

								JTextArea zipText = new JTextArea("Zip Code",
										1, 15);
								zipText.setEditable(true);
								zipText.setBackground(Color.GRAY);
								textPane2.add(zipText);

								JTextArea phoneText = new JTextArea("Phone", 1,
										15);
								phoneText.setEditable(true);
								phoneText.setBackground(Color.GRAY);
								textPane2.add(phoneText);

								JTextArea emailText = new JTextArea("Email", 1,
										15);
								emailText.setEditable(true);
								emailText.setBackground(Color.GRAY);
								textPane2.add(emailText);

							}

							JButton registerSend = new JButton("Submit");
							regFrame.add(registerSend, BorderLayout.SOUTH);
							registerSend
									.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(
												ActionEvent r) {

											JFrame progFrame = new JFrame(
													"Loading Game Intro...");
											progFrame.setVisible(true);
											progFrame.setSize(500, 100);

											int min = 0;
											int max = 100;
											JProgressBar progressBar = new JProgressBar(
													min, max);
											progressBar.setStringPainted(true);
											progressBar.setEnabled(true);
											progressBar.setIndeterminate(true);
											progressBar.setVisible(true);
											progFrame.add(progressBar);
											dispose();

											try {

												LoadDriver.sqlDriver(null);
												LoadDriver.UpdateTask.class
														.isInstance(progFrame);
												LoadDriver.PassTask.class
														.isInstance(progFrame);
												GameWorld.game(null);

												System.out
														.println(" The 'USE database' syntax no longer works with the addition of"
																+ "\n SwingWorker. I may need to configure the connection using the"
																+ "\n DataSource class.");

											} catch (InstantiationException e) {
												// TODO Auto-generated catch
												// block
												e.printStackTrace();
											} catch (IllegalAccessException e) {
												// TODO Auto-generated catch
												// block
												e.printStackTrace();
											} catch (ClassNotFoundException e) {
												// TODO Auto-generated catch
												// block
												e.printStackTrace();

											}

										}
									});

						}

					}
				});
			}

			{
				JButton newButton = new JButton("Submit");
				textPane.add(newButton);
				newButton.setEnabled(true);
				getRootPane().setDefaultButton(newButton);

				newButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent evt) {

						JFrame newFrame = new JFrame(
								"Welcome to Heavy Evil, Please choose an account.");
						newFrame.setVisible(true);
						newFrame.setBackground(Color.BLACK);
						newFrame.setBounds(0, 0, 1200, 800);

						GLJPanel newPanel = new GLJPanel();
						newPanel.setBounds(0, 40, 1200, 760);
						newPanel.setVisible(true);
						newFrame.add(newPanel);

						dispose();

						JButton nuButton = new JButton("Mario");
						newPanel.add(nuButton);
						nuButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame marioFrame = new JFrame();
								marioFrame.setBounds(100, 200, 790, 790);
								marioFrame.setVisible(true);
								marioFrame.add(new JLabel(new ImageIcon(
										"Images/Mario.png")));
								marioFrame.pack();

							}

						});

						JButton nuButton2 = new JButton("Kirby");
						newPanel.add(nuButton2);
						nuButton2.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame kirbyFrame = new JFrame();
								kirbyFrame.setBounds(100, 200, 800, 800);
								kirbyFrame.setVisible(true);
								kirbyFrame.add(new JLabel(new ImageIcon(
										"Images/Kirby.png")));
								kirbyFrame.pack();
							}
						});

						JButton nuButton3 = new JButton("Mew Two");
						newPanel.add(nuButton3);
						nuButton3.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame mewtwoFrame = new JFrame();
								mewtwoFrame.setBounds(100, 200, 800, 800);
								mewtwoFrame.setVisible(true);
								mewtwoFrame.add(new JLabel(new ImageIcon(
										"Images/mewtwo.png")));
								mewtwoFrame.pack();
							}
						});

						JButton nuButton4 = new JButton("Vegeta");
						newPanel.add(nuButton4);
						nuButton4.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame vegetaFrame = new JFrame();
								vegetaFrame.setBounds(100, 200, 800, 800);
								vegetaFrame.setVisible(true);
								vegetaFrame.add(new JLabel(new ImageIcon(
										"Images/Vegeta.jpg")));
								vegetaFrame.pack();
							}
						});

						JButton nuButton5 = new JButton("Tidus");
						newPanel.add(nuButton5);
						nuButton5.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame tidusFrame = new JFrame();
								tidusFrame.setBounds(100, 200, 800, 800);
								tidusFrame.setVisible(true);
								tidusFrame.add(new JLabel(new ImageIcon(
										"Images/Tidus.jpg")));
								tidusFrame.pack();
							}
						});

						JButton nuButton6 = new JButton("Link");
						newPanel.add(nuButton6);
						nuButton6.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame linkFrame = new JFrame();
								linkFrame.setBounds(100, 200, 800, 800);
								linkFrame.setVisible(true);
								linkFrame.add(new JLabel(new ImageIcon(
										"Images/Link.png")));
								linkFrame.pack();
							}
						});

						JButton nuButton7 = new JButton("Master Chief");
						newPanel.add(nuButton7);
						nuButton7.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame masterFrame = new JFrame();
								masterFrame.setBounds(100, 200, 800, 800);
								masterFrame.setVisible(true);
								masterFrame.add(new JLabel(new ImageIcon(
										"Images/Master.png")));
								masterFrame.pack();
							}
						});

						JButton nuButton8 = new JButton("Snake");
						newPanel.add(nuButton8);
						nuButton8.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame snakeFrame = new JFrame();
								snakeFrame.setBounds(100, 200, 800, 800);
								snakeFrame.setVisible(true);
								snakeFrame.add(new JLabel(new ImageIcon(
										"Images/Snake.png")));
								snakeFrame.pack();
							}
						});

						JButton nuButton9 = new JButton("Cash");
						newPanel.add(nuButton9);
						nuButton9.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame cashFrame = new JFrame();
								cashFrame.setBounds(100, 200, 800, 800);
								cashFrame.setVisible(true);
								cashFrame.add(new JLabel(new ImageIcon(
										"Images/Cash.jpg")));
								cashFrame.pack();
							}
						});

						JButton nuButton10 = new JButton("Lara");
						newPanel.add(nuButton10);
						nuButton10.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame laraFrame = new JFrame();
								laraFrame.setBounds(100, 200, 800, 800);
								laraFrame.setBackground(Color.BLACK);
								laraFrame.setVisible(true);
								laraFrame.add(new JLabel(new ImageIcon(
										"Images/Lara.jpg")));
								laraFrame.pack();
							}
						});

						JButton nuButton11 = new JButton("Max Payne");
						newPanel.add(nuButton11);
						nuButton11.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame maxFrame = new JFrame();
								maxFrame.setBounds(100, 200, 800, 800);
								maxFrame.setVisible(true);
								maxFrame.add(new JLabel(new ImageIcon(
										"Images/Max.jpg")));
								maxFrame.pack();
							}
						});

						JButton nuButton12 = new JButton("Spyro");
						newPanel.add(nuButton12);
						nuButton12.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame spyroFrame = new JFrame();
								spyroFrame.setBounds(100, 200, 800, 800);
								spyroFrame.setVisible(true);
								spyroFrame.add(new JLabel(new ImageIcon(
										"Images/Spyro.jpg")));
								spyroFrame.pack();
							}
						});

						JButton nuButton13 = new JButton("Sephiroth");
						newPanel.add(nuButton13);
						nuButton13.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame sephFrame = new JFrame();
								sephFrame.setBounds(100, 200, 800, 800);
								sephFrame.setVisible(true);
								sephFrame.add(new JLabel(new ImageIcon(
										"Images/sephiroth.jpg")));
								sephFrame.pack();
							}
						});

						JButton nuButton14 = new JButton("Scorpion");
						newPanel.add(nuButton14);
						nuButton14.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								JFrame scorpionFrame = new JFrame();
								scorpionFrame.setBounds(100, 200, 800, 800);
								scorpionFrame.setVisible(true);
								scorpionFrame.add(new JLabel(new ImageIcon(
										"Images/Scorpion.jpg")));
								scorpionFrame.pack();

							}
						});

					}
				});

			}

		}

	}
}
