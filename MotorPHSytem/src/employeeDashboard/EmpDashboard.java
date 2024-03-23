package employeeDashboard;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import EmployeeLeavePage.EmployeeLeavePage;
import LoginP.Login_Page;
import employeeLeave.Employee;
import employeeLeave.EmployeeProfilePage;

import java.awt.Component;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.JSeparator;

public class EmpDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JFrame dashboardFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpDashboard frame = new EmpDashboard();
					frame.dashboardFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmpDashboard() {
		setTitle("MotorPH Employee Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		
		dashboardFrame = new JFrame();
		dashboardFrame.setBounds(100, 100, 1015, 881);
		dashboardFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		dashboardFrame.setSize(1652,899);
		dashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dashboardFrame.getContentPane().setLayout(null);
		
		//Side Panel
		JPanel profileSeparator = new JPanel();
		profileSeparator.setBackground(new Color(165, 42, 42));
		profileSeparator.setBounds(0, 0, 400, 1080);
		dashboardFrame.getContentPane().add(profileSeparator);
		
		
		//BUTTON 1
		JButton dashboardBtn = new JButton("HOME");
		dashboardBtn.setHorizontalAlignment(SwingConstants.LEFT);
		dashboardBtn.setBackground(new Color(165, 42, 42));
		dashboardBtn.setBorderPainted(false);
		dashboardBtn.setForeground(new Color(255, 255, 255));
		dashboardBtn.setBounds(45, 335, 300, 70);
		dashboardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		profileSeparator.setLayout(null);
		dashboardBtn.setFont(new Font("Arial Black", Font.BOLD, 30));
		profileSeparator.add(dashboardBtn);
		
		//BUTTON 2
		JButton profileBtn = new JButton("PROFILE");
		profileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeProfilePage employeeMain = new EmployeeProfilePage();
				EmployeeProfilePage.main(null);
			}
		});
		profileBtn.setHorizontalAlignment(SwingConstants.LEFT);
		profileBtn.setBackground(new Color(165, 42, 42));
		profileBtn.setBorderPainted(false);
		profileBtn.setForeground(new Color(255, 255, 255));
		profileBtn.setBounds(45, 420, 300, 70);
		profileBtn.setFont(new Font("Arial Black", Font.BOLD, 30));
		profileSeparator.add(profileBtn);
		
		//BUTTON 3
		JButton leaveBtn = new JButton("LEAVE");
		leaveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		leaveBtn.setHorizontalAlignment(SwingConstants.LEFT);
		leaveBtn.setBackground(new Color(165, 42, 42));
		leaveBtn.setBorderPainted(false);
		leaveBtn.setForeground(new Color(255, 255, 255));
		leaveBtn.setBounds(45, 520, 300, 70);
		leaveBtn.setFont(new Font("Arial Black", Font.BOLD, 30));
		profileSeparator.add(leaveBtn);
		
		//BUTTON 4
		JButton payrollBtn = new JButton("PAYROLL");
		payrollBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		payrollBtn.setHorizontalAlignment(SwingConstants.LEFT);
		payrollBtn.setBackground(new Color(165, 42, 42));
		payrollBtn.setBorderPainted(false);
		payrollBtn.setForeground(new Color(255, 255, 255));
		payrollBtn.setBounds(45, 620, 300, 70);
		payrollBtn.setFont(new Font("Arial Black", Font.BOLD, 30));
		profileSeparator.add(payrollBtn);
		
		
		//Button 6
		JButton attendanceBtn = new JButton("ATTENDANCE");
		attendanceBtn.setHorizontalAlignment(SwingConstants.LEFT);
		attendanceBtn.setBackground(new Color(165, 42, 42));
		attendanceBtn.setBorderPainted(false);
		attendanceBtn.setForeground(new Color(255, 255, 255));
		attendanceBtn.setBounds(45, 720, 300, 70);
		attendanceBtn.setFont(new Font("Arial Black", Font.BOLD, 30));
		profileSeparator.add(attendanceBtn);
				
		//Employee Name Label
		JLabel lblempname = new JLabel("Mark Bautista");
		lblempname.setForeground(new Color(0, 0, 0));
		lblempname.setBounds(46, 270, 300, 37);
		lblempname.setHorizontalAlignment(SwingConstants.CENTER);
		lblempname.setFont(new Font("Arial", Font.BOLD, 20));
		profileSeparator.add(lblempname);
		
		//Employee Designation Label
		JLabel lblempdesignation = new JLabel("Account Rank and File");
		lblempdesignation.setForeground(new Color(0, 0, 0));
		lblempdesignation.setBounds(46, 296, 300, 30);
		lblempdesignation.setHorizontalAlignment(SwingConstants.CENTER);
		lblempdesignation.setFont(new Font("Arial", Font.PLAIN, 15));
		profileSeparator.add(lblempdesignation);
		
		JSeparator homeSeparator = new JSeparator();
		homeSeparator.setForeground(new Color(0, 0, 0));
		homeSeparator.setBackground(new Color(0, 0, 0));
		homeSeparator.setBounds(1, 410, 400, 2);
		profileSeparator.add(homeSeparator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(1, 505, 400, 2);
		profileSeparator.add(separator_1);
		
		JSeparator leaveSeparator = new JSeparator();
		leaveSeparator.setForeground(Color.BLACK);
		leaveSeparator.setBackground(Color.BLACK);
		leaveSeparator.setBounds(1, 605, 400, 2);
		profileSeparator.add(leaveSeparator);
		
		JSeparator payrollSeparator = new JSeparator();
		payrollSeparator.setForeground(Color.BLACK);
		payrollSeparator.setBackground(Color.BLACK);
		payrollSeparator.setBounds(1, 705, 400, 2);
		profileSeparator.add(payrollSeparator);
		
		JSeparator attendanceSeparator = new JSeparator();
		attendanceSeparator.setForeground(Color.BLACK);
		attendanceSeparator.setBackground(Color.BLACK);
		attendanceSeparator.setBounds(1, 805, 400, 2);
		profileSeparator.add(attendanceSeparator);
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page backLogin = new Login_Page();
				Login_Page.main(null);
			}
		});
		logoutBtn.setHorizontalAlignment(SwingConstants.RIGHT);
		logoutBtn.setForeground(new Color(255, 255, 255));
		logoutBtn.setFont(new Font("Arial", Font.PLAIN, 15));
		logoutBtn.setBorderPainted(false);
		logoutBtn.setBackground(new Color(165, 42, 42));
		logoutBtn.setBounds(300, 810, 110, 26);
		profileSeparator.add(logoutBtn);
		
		JLabel empPhoto = new JLabel("Employee Image");
		empPhoto.setForeground(new Color(255, 255, 255));
		empPhoto.setBackground(new Color(255, 255, 255));
		empPhoto.setFont(new Font("Arial", Font.PLAIN, 12));
		empPhoto.setBounds(122, 114, 150, 150);
		empPhoto.setBorder(new LineBorder(new Color(0, 0, 0)));
		empPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		profileSeparator.add(empPhoto);
		
		//Overview Panel
		JPanel overviewpanel = new JPanel();
		overviewpanel.setBackground(Color.WHITE);
		overviewpanel.setBounds(394, 0, 1920, 1080);
		dashboardFrame.getContentPane().add(overviewpanel);
		overviewpanel.setLayout(null);
	}
}
