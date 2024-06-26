package MotorPHEmployeePage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeLeavePage {

	private JFrame frmEmployeeLeavePage;
	private JTextField CommentsTxt;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLeavePage window = new EmployeeLeavePage();
					window.frmEmployeeLeavePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeLeavePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeeLeavePage = new JFrame();
		frmEmployeeLeavePage.setTitle("Employee Leave Page");
		frmEmployeeLeavePage.setBounds(100, 100, 1015, 881);
		frmEmployeeLeavePage.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmEmployeeLeavePage.setSize(1295,762);
		frmEmployeeLeavePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmployeeLeavePage.getContentPane().setLayout(null);
		
		JButton ProfileButton = new JButton("Profile");
		ProfileButton.setBounds(782, 95, 122, 32);
		ProfileButton.setBackground(new Color(255, 255, 255));
		ProfileButton.setFont(new Font("Arial", Font.BOLD, 12));
		frmEmployeeLeavePage.getContentPane().add(ProfileButton);
		
		JButton btnLeaveRequest = new JButton("Leave Request");
		btnLeaveRequest.setBounds(782, 136, 122, 32);
		btnLeaveRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLeaveRequest.setFont(new Font("Arial", Font.BOLD, 12));
		btnLeaveRequest.setBackground(new Color(176, 196, 222));
		frmEmployeeLeavePage.getContentPane().add(btnLeaveRequest);
		
		JButton btnPayroll = new JButton("Payroll");
		btnPayroll.setBounds(784, 212, 122, 32);
		btnPayroll.setFont(new Font("Arial", Font.BOLD, 12));
		btnPayroll.setBackground(new Color(255, 255, 255));
		frmEmployeeLeavePage.getContentPane().add(btnPayroll);
		
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.setBounds(782, 176, 122, 32);
		btnAttendance.setFont(new Font("Arial", Font.BOLD, 12));
		btnAttendance.setBackground(new Color(255, 255, 255));
		frmEmployeeLeavePage.getContentPane().add(btnAttendance);
		
		JLabel PersonalInformationlblmenu = new JLabel("Personal Information");
		PersonalInformationlblmenu.setBounds(62, 55, 173, 14);
		PersonalInformationlblmenu.setFont(new Font("Arial", Font.BOLD, 14));
		frmEmployeeLeavePage.getContentPane().add(PersonalInformationlblmenu);
		
		JLabel employeeNoLabelPI = new JLabel("Employee No:");
		employeeNoLabelPI.setBounds(62, 104, 111, 14);
		employeeNoLabelPI.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(employeeNoLabelPI);
		
		JLabel lastNameLabelPI = new JLabel("Last Name:");
		lastNameLabelPI.setBounds(62, 155, 111, 14);
		lastNameLabelPI.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(lastNameLabelPI);
		
		JLabel firstNameLabelPI = new JLabel("First Name:");
		firstNameLabelPI.setBounds(62, 204, 111, 14);
		firstNameLabelPI.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(firstNameLabelPI);
		
		JLabel positionLabelPI = new JLabel("Position:");
		positionLabelPI.setBounds(62, 252, 111, 14);
		positionLabelPI.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(positionLabelPI);
		
		JTextArea EmployeeNoTxt = new JTextArea();
		EmployeeNoTxt.setTabSize(12);
		EmployeeNoTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		EmployeeNoTxt.setBounds(165, 95, 220, 25);
		frmEmployeeLeavePage.getContentPane().add(EmployeeNoTxt);
		
		JTextArea LastNameTxt = new JTextArea();
		LastNameTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		LastNameTxt.setBounds(165, 146, 220, 25);
		frmEmployeeLeavePage.getContentPane().add(LastNameTxt);
		
		JTextArea FirstNameTxt = new JTextArea();
		FirstNameTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		FirstNameTxt.setBounds(165, 194, 220, 25);
		frmEmployeeLeavePage.getContentPane().add(FirstNameTxt);
		
		JTextArea PositionTxt = new JTextArea();
		PositionTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		PositionTxt.setBounds(165, 247, 220, 25);
		frmEmployeeLeavePage.getContentPane().add(PositionTxt);
		
		JLabel requestLeaveLabelmenu = new JLabel("Request Leave");
		requestLeaveLabelmenu.setBounds(62, 359, 111, 14);
		requestLeaveLabelmenu.setFont(new Font("Arial", Font.BOLD, 14));
		frmEmployeeLeavePage.getContentPane().add(requestLeaveLabelmenu);
		
		JLabel leaveTypeLabel_RL = new JLabel("Leave Type:");
		leaveTypeLabel_RL.setBounds(62, 406, 111, 14);
		leaveTypeLabel_RL.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(leaveTypeLabel_RL);
		
		JLabel startDateLabel_RL = new JLabel("Start Date:");
		startDateLabel_RL.setBounds(62, 458, 111, 14);
		startDateLabel_RL.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(startDateLabel_RL);
		
		JLabel endDateLabel_RL = new JLabel("End Date:");
		endDateLabel_RL.setBounds(62, 507, 111, 14);
		endDateLabel_RL.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(endDateLabel_RL);
		
		CommentsTxt = new JTextField();
		CommentsTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		CommentsTxt.setBounds(165, 563, 220, 69);
		frmEmployeeLeavePage.getContentPane().add(CommentsTxt);
		CommentsTxt.setColumns(10);
		
		JLabel commentsLabel_RL = new JLabel("Comment(s)");
		commentsLabel_RL.setBounds(62, 563, 122, 14);
		commentsLabel_RL.setFont(new Font("Arial", Font.PLAIN, 12));
		frmEmployeeLeavePage.getContentPane().add(commentsLabel_RL);
		
		JTextArea StartDateTxt = new JTextArea();
		StartDateTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		StartDateTxt.setBounds(165, 453, 220, 25);
		frmEmployeeLeavePage.getContentPane().add(StartDateTxt);
		
		JTextArea EndDateTxt = new JTextArea();
		EndDateTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		EndDateTxt.setBounds(165, 502, 220, 25);
		frmEmployeeLeavePage.getContentPane().add(EndDateTxt);
		
		JLabel pendingRequestLabelmenu = new JLabel("Pending Request");
		pendingRequestLabelmenu.setBounds(519, 357, 161, 14);
		pendingRequestLabelmenu.setFont(new Font("Arial", Font.BOLD, 14));
		frmEmployeeLeavePage.getContentPane().add(pendingRequestLabelmenu);
		
		JSeparator RLseparator_1 = new JSeparator();
		RLseparator_1.setBounds(175, 364, 258, 24);
		frmEmployeeLeavePage.getContentPane().add(RLseparator_1);
		
		JSeparator RLseparator_3 = new JSeparator();
		RLseparator_3.setBounds(57, 654, 376, 2);
		frmEmployeeLeavePage.getContentPane().add(RLseparator_3);
		
		JSeparator RLseparator_4 = new JSeparator();
		RLseparator_4.setBounds(57, 359, 17, 297);
		RLseparator_4.setOrientation(SwingConstants.VERTICAL);
		frmEmployeeLeavePage.getContentPane().add(RLseparator_4);
		
		JSeparator RLseparator_2 = new JSeparator();
		RLseparator_2.setBounds(430, 364, 14, 292);
		RLseparator_2.setOrientation(SwingConstants.VERTICAL);
		frmEmployeeLeavePage.getContentPane().add(RLseparator_2);
		
		
		JSeparator PIseparator_2 = new JSeparator();
		PIseparator_2.setBounds(430, 60, 14, 260);
		PIseparator_2.setOrientation(SwingConstants.VERTICAL);
		frmEmployeeLeavePage.getContentPane().add(PIseparator_2);
		
		JSeparator PIseparator_3 = new JSeparator();
		PIseparator_3.setBounds(57, 318, 376, 2);
		frmEmployeeLeavePage.getContentPane().add(PIseparator_3);
		
		JSeparator PIseparator_4 = new JSeparator();
		PIseparator_4.setBounds(57, 59, 17, 260);
		PIseparator_4.setOrientation(SwingConstants.VERTICAL);
		frmEmployeeLeavePage.getContentPane().add(PIseparator_4);
		
		JSeparator imageSeparator_4 = new JSeparator();
		imageSeparator_4.setBounds(517, 60, 17, 260);
		imageSeparator_4.setOrientation(SwingConstants.VERTICAL);
		frmEmployeeLeavePage.getContentPane().add(imageSeparator_4);
		
		JSeparator imageSeparator_3 = new JSeparator();
		imageSeparator_3.setBounds(517, 318, 402, 14);
		frmEmployeeLeavePage.getContentPane().add(imageSeparator_3);
		
		JSeparator imageSeparator_2 = new JSeparator();
		imageSeparator_2.setBounds(919, 55, 14, 265);
		imageSeparator_2.setOrientation(SwingConstants.VERTICAL);
		frmEmployeeLeavePage.getContentPane().add(imageSeparator_2);
		
		JSeparator imageSeparator_1 = new JSeparator();
		imageSeparator_1.setBounds(517, 55, 402, 24);
		frmEmployeeLeavePage.getContentPane().add(imageSeparator_1);
		
		
				
	
		frmEmployeeLeavePage.setBounds(100, 100, 1015, 881);
		frmEmployeeLeavePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
		JComboBox comboBoxSelectLeaveTypeTxt = new JComboBox();
		comboBoxSelectLeaveTypeTxt.setBounds(165, 401, 220, 25);
		comboBoxSelectLeaveTypeTxt.setModel(new DefaultComboBoxModel(LeaveType.values()));
		comboBoxSelectLeaveTypeTxt.setFont(new Font("Arial", Font.PLAIN, 13));
		frmEmployeeLeavePage.getContentPane().add(comboBoxSelectLeaveTypeTxt);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(114, 694, 86, 25);
		submitButton.setFont(new Font("Arial", Font.BOLD, 12));
		frmEmployeeLeavePage.getContentPane().add(submitButton);
		
		JSeparator PIseparator_1 = new JSeparator();
		PIseparator_1.setBounds(221, 57, 210, 14);
		frmEmployeeLeavePage.getContentPane().add(PIseparator_1);
		
		JScrollPane PendingRequestscrollPane = new JScrollPane();
		PendingRequestscrollPane.setBounds(514, 399, 660, 257);
		frmEmployeeLeavePage.getContentPane().add(PendingRequestscrollPane);
		
		table = new JTable();
		PendingRequestscrollPane.setViewportView(table);
		table.setFont(new Font("Arial", Font.PLAIN, 8));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"001", "Sario", "Felicity", "CEO", "Annual Leave", "April 1,2024", "April 30,2024", "Waiting for Approval"},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Employee No", "Last Name", "First Name", "Position", "Leave Type", "Start Date", "End Date", "Status"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogOut.setBounds(274, 694, 86, 25);
		frmEmployeeLeavePage.getContentPane().add(btnLogOut);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setFont(new Font("Arial", Font.BOLD, 12));
		btnDashboard.setBackground(new Color(255, 255, 255));
		btnDashboard.setBounds(784, 252, 122, 32);
		frmEmployeeLeavePage.getContentPane().add(btnDashboard);
		
		JLabel Imagelbl = new JLabel("Image (Passport Size)");
		Imagelbl.setHorizontalAlignment(SwingConstants.CENTER);
		Imagelbl.setBorder(new LineBorder(new Color(0, 0, 0)));
		Imagelbl.setBackground(new Color(240, 248, 255));
		Imagelbl.setBounds(544, 95, 188, 185);
		frmEmployeeLeavePage.getContentPane().add(Imagelbl);
		
		
		submitButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			handleLeaveRequestSubmission();
			String leaveType = comboBoxSelectLeaveTypeTxt.getSelectedItem().toString();
	        String startDate = StartDateTxt.getText();
	        String endDate = EndDateTxt.getText();
	        String comments = CommentsTxt.getText();
	        String employeeNo = EmployeeNoTxt.getText();
	        String lastName = LastNameTxt.getText();
	        String firstName = FirstNameTxt.getText();
	        String position = PositionTxt.getName();
	        
	        try {
                FileWriter fw = new FileWriter("leave.txt", true);
                fw.write(""+employeeNo+","+lastName+","+firstName+","+position+","+leaveType+","+startDate+","+endDate+","+comments+",");
                fw.write(System.getProperty("line.separator"));
                fw.close();
                        
                
                JFrame successfulAccount = new JFrame();
                JOptionPane.showMessageDialog(successfulAccount, "Your leave has been submitted!");
                dispose();
                }catch(Exception e1){}
            
            }

        private void handleLeaveRequestSubmission() {
			// TODO Auto-generated method stub
			
		}

		

        private void dispose() {
			
			
		}
		});
	}
}
