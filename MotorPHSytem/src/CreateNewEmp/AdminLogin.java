package CreateNewEmp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import LoginP.Login_Page;
import empPayroll.empPayrollPage;

public class AdminLogin extends JFrame {
	public JFrame adminFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin adminWindow = new AdminLogin();
					adminWindow.adminFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminFrame = new JFrame("MotorPH Admin Login Page");
		adminFrame.getContentPane().setBackground(new Color(220, 220, 220));
		adminFrame.getContentPane().setEnabled(true);
		adminFrame.setSize(1652,899);
		adminFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(1039, 592, 45, 26);
		adminFrame.getContentPane().add(separator);
		
		JLabel AdminUserNameText = new JLabel("Username");
		AdminUserNameText.setFont(new Font("Arial", Font.BOLD, 22));
		AdminUserNameText.setBounds(783, 343, 128, 16);
		adminFrame.getContentPane().add(AdminUserNameText);
		
		JLabel passwordText = new JLabel("Password");
		passwordText.setFont(new Font("Arial", Font.BOLD, 22));
		passwordText.setBounds(783, 418, 128, 16);
		adminFrame.getContentPane().add(passwordText);
		
		JTextField adminUserTextField = new JTextField();
		adminUserTextField.setBounds(934, 337, 226, 32);
		adminFrame.getContentPane().add(adminUserTextField);
		adminUserTextField.setColumns(10);
		
		JPasswordField adminPasswordField = new JPasswordField();
		adminPasswordField.setBounds(934, 412, 226, 32);
		adminFrame.getContentPane().add(adminPasswordField);
		
		JButton logInButton = new JButton("Login");
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					empPayrollPage empPayrollPageMain = new empPayrollPage();
					empPayrollPage.main(null);
			}
			private void logInButton(java.awt.event.ActionEvent evt) {
				String adminUsername = adminUserTextField.getText();
				String adminPassword = adminPasswordField.getText();
				
				
				
			}
		
		});
		logInButton.setBackground(Color.LIGHT_GRAY);
		logInButton.setForeground(Color.BLACK);
		logInButton.setBounds(1074, 500, 86, 26);
		adminFrame.getContentPane().add(logInButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image logo = new ImageIcon(this.getClass().getResource("/logoM1.png")).getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(logo));
		lblNewLabel.setBounds(495, 313, 243, 210);
		adminFrame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("Main Login");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page adminMainLogin = new Login_Page();
				Login_Page.main(null);
			}
		});
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(SystemColor.control);
		btnNewButton_1_1.setBounds(1050, 592, 110, 26);
		adminFrame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Create New Account");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(SystemColor.control);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(876, 592, 155, 26);
		adminFrame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN LOGIN");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 38));
		lblNewLabel_1.setBounds(670, 169, 346, 45);
		adminFrame.getContentPane().add(lblNewLabel_1);
		
		JTextField adminTextField = new JTextField();
		adminTextField.setBackground(new Color(178, 34, 34));
		adminTextField.setEditable(false);
		adminTextField.setBounds(446, 159, 774, 60);
		adminFrame.getContentPane().add(adminTextField);
		adminTextField.setColumns(10);
		
		JPanel adminPanel = new JPanel();
		adminPanel.setBackground(Color.WHITE);
		adminPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		adminPanel.setBounds(446, 204, 774, 448);
		adminFrame.getContentPane().add(adminPanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(0, 0, 1652,899);
		adminFrame.getContentPane().add(panel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBounds(109, 60, 86, 16);
		adminFrame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.DARK_GRAY);
		separator_1_1.setBounds(484, 60, 86, 16);
		adminFrame.getContentPane().add(separator_1_1);
	}
	}
	
