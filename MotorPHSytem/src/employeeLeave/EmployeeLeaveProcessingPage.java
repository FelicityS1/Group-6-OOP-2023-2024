package employeeLeave;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JComboBox;

public class EmployeeLeaveProcessingPage {

	private JFrame frmEmployeeLeaveProcess;
	private JTable LeaveListtable;
	private JScrollPane LeaveListScrollPanel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLeaveProcessingPage window = new EmployeeLeaveProcessingPage();
					window.frmEmployeeLeaveProcess.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeLeaveProcessingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeLeaveProcess = new JFrame();
		frmEmployeeLeaveProcess.getContentPane().setBackground(new Color(192, 192, 192));
		frmEmployeeLeaveProcess.setTitle("Employee Leave Processing Page");
		frmEmployeeLeaveProcess.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeaveProcess.setBounds(100, 100, 1015, 881);
		frmEmployeeLeaveProcess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeLeaveProcess.getContentPane().setLayout(null);
		
		LeaveListScrollPanel = new JScrollPane();
		LeaveListScrollPanel.setBounds(229, 117, 764, 608);
		frmEmployeeLeaveProcess.getContentPane().add(LeaveListScrollPanel);
		
		LeaveListtable = new JTable();
		LeaveListtable.setBackground(new Color(255, 255, 255));
		LeaveListScrollPanel.setViewportView(LeaveListtable);
		LeaveListtable.setColumnSelectionAllowed(true);
		LeaveListtable.setModel(new DefaultTableModel(
			new Object[][] {
				{"001", "Sario", "Felicity", "CEO", "April 1,2024", "April 5, 2024", "Approve"},
				{"002", "Navarro", "Marjorie", "COO", "April 1,2024", "April 2, 2024", "Reject"},
				{"003", "Ambing", "Apollo", "CFO", "March 25, 2024", "March 31, 2024", "Waiting for Approval"},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Employee No", "Last Name", "First Name", "Position", "Start Date", "End Date", "Status"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		LeaveListtable.getColumnModel().getColumn(0).setPreferredWidth(83);
		LeaveListtable.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton btnSystemManagementIT = new JButton("System Management (IT)");
		btnSystemManagementIT.setBounds(14, 537, 200, 50);
		btnSystemManagementIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSystemManagementIT.setBackground(new Color(255, 255, 255));
		btnSystemManagementIT.setFont(new Font("Arial", Font.PLAIN, 13));
		frmEmployeeLeaveProcess.getContentPane().add(btnSystemManagementIT);
		
		JButton btnPayrollManagement = new JButton("Payroll Processing");
		btnPayrollManagement.setBounds(16, 468, 200, 50);
		btnPayrollManagement.setFont(new Font("Arial", Font.PLAIN, 14));
		btnPayrollManagement.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnPayrollManagement);
		
		JButton btnEmployeeManagement = new JButton("Employee Management");
		btnEmployeeManagement.setBounds(15, 403, 200, 50);
		btnEmployeeManagement.setFont(new Font("Arial", Font.PLAIN, 14));
		btnEmployeeManagement.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnEmployeeManagement);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(15, 674, 200, 50);
		btnSignOut.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSignOut.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnSignOut);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(14, 342, 200, 50);
		btnDashboard.setFont(new Font("Arial", Font.PLAIN, 14));
		btnDashboard.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnDashboard);
		
		JButton btnLeaveRequest = new JButton("Leave Process");
		btnLeaveRequest.setBounds(14, 153, 202, 50);
		btnLeaveRequest.setFont(new Font("Arial", Font.BOLD, 14));
		btnLeaveRequest.setBackground(new Color(176, 196, 222));
		frmEmployeeLeaveProcess.getContentPane().add(btnLeaveRequest);
		
		JPanel panelDepartment = new JPanel();
		panelDepartment.setToolTipText("");
		panelDepartment.setBounds(14, 26, 200, 70);
		panelDepartment.setBackground(new Color(176, 196, 222));
		frmEmployeeLeaveProcess.getContentPane().add(panelDepartment);
		
		JLabel DepartmentLabel = new JLabel("Department: Human Resources");
		panelDepartment.add(DepartmentLabel);
		DepartmentLabel.setBackground(new Color(255, 255, 255));
		DepartmentLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		JPanel Datepanel = new JPanel();
		Datepanel.setBounds(14, 117, 200, 25);
		Datepanel.setBackground(new Color(176, 196, 222));
		frmEmployeeLeaveProcess.getContentPane().add(Datepanel);
		
		JLabel lblDateMarch = new JLabel("Date: March 9,2024");
		Datepanel.add(lblDateMarch);
		lblDateMarch.setFont(new Font("Arial", Font.BOLD, 12));
		lblDateMarch.setBackground(Color.WHITE);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.setBounds(16, 609, 200, 50);
		btnSettings.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSettings.setBackground(new Color(255, 255, 255));
		frmEmployeeLeaveProcess.getContentPane().add(btnSettings);
		
		JLabel WelcomeLabel_ = new JLabel("Welcome to MotorPH Leave Processing");
		WelcomeLabel_.setForeground(new Color(0, 0, 0));
		WelcomeLabel_.setBounds(406, 16, 318, 20);
		WelcomeLabel_.setFont(new Font("Arial", Font.BOLD, 16));
		frmEmployeeLeaveProcess.getContentPane().add(WelcomeLabel_);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(989, 722, 2, 2);
		frmEmployeeLeaveProcess.getContentPane().add(scrollPane_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(528, 786, 89, 23);
		frmEmployeeLeaveProcess.getContentPane().add(btnNewButton);
		
		JButton SearchButton = new JButton("Search");
		SearchButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SearchButton.setBounds(621, 59, 89, 23);
		frmEmployeeLeaveProcess.getContentPane().add(SearchButton);
		
		textField = new JTextField();
		textField.setText("Enter Employee No ");
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(720, 58, 247, 25);
		frmEmployeeLeaveProcess.getContentPane().add(textField);
		
		JButton btnApprove = new JButton("Approve");
		btnApprove.setFont(new Font("Arial", Font.BOLD, 14));
		btnApprove.setBackground(new Color(255, 255, 255));
		btnApprove.setBounds(14, 214, 200, 36);
		frmEmployeeLeaveProcess.getContentPane().add(btnApprove);
		
		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Arial", Font.BOLD, 14));
		btnReject.setBackground(Color.WHITE);
		btnReject.setBounds(14, 261, 200, 36);
		frmEmployeeLeaveProcess.getContentPane().add(btnReject);
	}
}
