package LoginP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import CreateNewEmp.AdminLogin;
import CreateNewEmp.Create_New_Account;
import empPayroll.empPayrollPage;
import employeeDashboard.EmpDashboard;

import javax.swing.JToggleButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Login_Page {
	
	public JFrame mainloginFrame;
	private JTextField usernametextField;
	private JPasswordField passwordField1;
	protected String str;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
					window.mainloginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainloginFrame = new JFrame("MotorPH Login Page");
		mainloginFrame.getContentPane().setBackground(new Color(220, 220, 220));
		mainloginFrame.getContentPane().setEnabled(true);
		mainloginFrame.setSize(1652,899);
		mainloginFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainloginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainloginFrame.getContentPane().setLayout(null);
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(1039, 592, 45, 26);
		mainloginFrame.getContentPane().add(separator);
		
		JLabel UserNameText = new JLabel("Username");
		UserNameText.setFont(new Font("Arial", Font.BOLD, 22));
		UserNameText.setBounds(783, 343, 128, 16);
		mainloginFrame.getContentPane().add(UserNameText);
		
		JLabel passwordText = new JLabel("Password");
		passwordText.setFont(new Font("Arial", Font.BOLD, 22));
		passwordText.setBounds(783, 418, 128, 16);
		mainloginFrame.getContentPane().add(passwordText);
		
		usernametextField = new JTextField();
		usernametextField.setBounds(934, 337, 226, 32);
		mainloginFrame.getContentPane().add(usernametextField);
		usernametextField.setColumns(10);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(934, 412, 226, 32);
		mainloginFrame.getContentPane().add(passwordField1);
		
		JButton logInButton = new JButton("Login");
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					EmpDashboard empDashboardMain = new EmpDashboard();
					EmpDashboard.main(null);
			}
			private void logInButton(java.awt.event.ActionEvent evt) {
				String username = usernametextField.getText();
				String password = passwordField1.getText();
				
				try {
					FileReader fr = new FileReader("login.txt");
					Scanner reader = new Scanner(fr);
					reader.useDelimiter("[,\n");
					
					while(reader.hasNext())
					{
					String un=reader.next();
					String pw=reader.next();
					if(username.equals(un.trim()) && password.equals(pw.trim()))
					{
						reader.close();
						Create_New_Account cr=new Create_New_Account();
						cr.setVisible(true);
						this.dispose();
					}
					
					
				
				
					}
				
			JOptionPane.showMessageDialog(null, "Invalid Login");
				}catch (Exception e) {
				}
				}
			private void dispose() {
				// TODO Auto-generated method stub
				
			}
				
			
		
		});
		logInButton.setBackground(Color.LIGHT_GRAY);
		logInButton.setForeground(Color.BLACK);
		logInButton.setBounds(1074, 500, 86, 26);
		mainloginFrame.getContentPane().add(logInButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image logo = new ImageIcon(this.getClass().getResource("/logoM1.png")).getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(logo));
		lblNewLabel.setBounds(495, 313, 243, 210);
		mainloginFrame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("Admin Login");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin adminUser = new AdminLogin();
				AdminLogin.main(null);
			}
		});
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1_1.setBackground(SystemColor.control);
		btnNewButton_1_1.setBounds(1050, 592, 110, 26);
		mainloginFrame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Create New Account");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Create_New_Account CreateNewEmp = new Create_New_Account();
				Create_New_Account.main(null);
				
			}
		});
		btnNewButton_1.setBounds(876, 592, 155, 26);
		mainloginFrame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("EMPLOYEE LOGIN");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 38));
		lblNewLabel_1.setBounds(670, 169, 346, 45);
		mainloginFrame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(178, 34, 34));
		textField.setEditable(false);
		textField.setBounds(446, 159, 774, 60);
		mainloginFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(446, 204, 774, 448);
		mainloginFrame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(0, 0, 1652,899);
		
		mainloginFrame.getContentPane().add(panel_1);
	
				
	
		
	}
	}
	
