package CreateNewEmp;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

import LoginP.Login_Page;

import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Button;

public class Create_New_Account {

	public JFrame newAccountPage;
	private JTextField fNameSignUp;
	private JTextField sNameSignUp;
	private JTextField createUsername;
	private JPasswordField createPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create_New_Account window = new Create_New_Account();
					window.newAccountPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Create_New_Account() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		newAccountPage = new JFrame("MotorPH Login Page");
		newAccountPage.setBounds(300, 300, 700, 500);
		newAccountPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newAccountPage.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(531, 410, 45, 26);
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		newAccountPage.getContentPane().add(separator);
		
		JLabel UserNameText = new JLabel("First Name");
		UserNameText.setBounds(138, 132, 128, 16);
		UserNameText.setFont(new Font("Arial", Font.PLAIN, 17));
		newAccountPage.getContentPane().add(UserNameText);
		
		JButton adminLogIn = new JButton("Admin Login");
		adminLogIn.setBounds(533, 410, 112, 26);
		adminLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		adminLogIn.setForeground(Color.RED);
		adminLogIn.setFont(new Font("Arial", Font.PLAIN, 13));
		adminLogIn.setBorderPainted(false);
		adminLogIn.setBackground(SystemColor.control);
		newAccountPage.getContentPane().add(adminLogIn);
		
		JButton backToLogIn = new JButton("Back to Login");
		backToLogIn.setBounds(404, 410, 121, 26);
		backToLogIn.setFont(new Font("Arial", Font.PLAIN, 13));
		backToLogIn.setForeground(Color.RED);
		backToLogIn.setBorderPainted(false);
		backToLogIn.setBackground(SystemColor.control);
		backToLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login_Page backLogin = new Login_Page();
				Login_Page.main(null);
			}
		});
		newAccountPage.getContentPane().add(backToLogIn);
		
		JLabel lblNewLabel = new JLabel("CREATE NEW ACCOUNT");
		lblNewLabel.setBounds(138, 61, 418, 50);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 34));
		newAccountPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(42, 83, 86, 16);
		separator_1.setForeground(Color.DARK_GRAY);
		newAccountPage.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(565, 83, 86, 16);
		separator_1_1.setForeground(Color.DARK_GRAY);
		newAccountPage.getContentPane().add(separator_1_1);
		
		fNameSignUp = new JTextField();
		fNameSignUp.setBounds(138, 158, 181, 35);
		UserNameText.setLabelFor(fNameSignUp);
		newAccountPage.getContentPane().add(fNameSignUp);
		fNameSignUp.setColumns(10);
		
		sNameSignUp = new JTextField();
		sNameSignUp.setBounds(364, 158, 181, 35);
		sNameSignUp.setColumns(10);
		newAccountPage.getContentPane().add(sNameSignUp);
		
		JLabel UserNameText_1 = new JLabel("Surname");
		UserNameText_1.setBounds(364, 132, 128, 16);
		UserNameText_1.setFont(new Font("Arial", Font.PLAIN, 17));
		newAccountPage.getContentPane().add(UserNameText_1);
		
		createUsername = new JTextField();
		createUsername.setBounds(138, 229, 407, 35);
		createUsername.setColumns(10);
		newAccountPage.getContentPane().add(createUsername);
		
		JLabel UserNameText_2 = new JLabel("Username");
		UserNameText_2.setBounds(138, 203, 128, 16);
		UserNameText_2.setFont(new Font("Arial", Font.PLAIN, 17));
		newAccountPage.getContentPane().add(UserNameText_2);
		
		createPassword = new JPasswordField();
		createPassword.setBounds(138, 293, 407, 35);
		newAccountPage.getContentPane().add(createPassword);
		
		JLabel UserNameText_2_1 = new JLabel("Password");
		UserNameText_2_1.setBounds(138, 274, 128, 16);
		UserNameText_2_1.setFont(new Font("Arial", Font.PLAIN, 17));
		newAccountPage.getContentPane().add(UserNameText_2_1);
		
		JButton signUpButton = new JButton("CREATE ACCOUNT");
		signUpButton.setForeground(new Color(255, 255, 255));
		signUpButton.setFont(new Font("Arial", Font.BOLD, 12));
		signUpButton.setBackground(new Color(240, 128, 128));
		signUpButton.setBounds(246, 355, 203, 26);
		newAccountPage.getContentPane().add(signUpButton);
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname = createUsername.getText();
				String passw = createPassword.getText();
				try {
					FileWriter fw = new FileWriter("login.txt", true);
					fw.write(""+uname+","+passw);
					fw.write(System.getProperty("line.separator"));
					fw.close();
							
					
					JFrame successfulAccount = new JFrame();
					JOptionPane.showMessageDialog(successfulAccount, "Your account has been successfully created!");
					dispose();
					}catch(Exception e1){}
				
				}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}

				
			
		});
		

	}

	public static void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	
}
	
	