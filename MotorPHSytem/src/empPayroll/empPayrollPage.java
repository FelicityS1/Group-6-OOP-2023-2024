package empPayroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;


public class empPayrollPage {

	private JFrame payrollframe;
	private JTextField textField;
	private JTextField hrsWorkedText;
	private JTextField daysWorkedTxt;
	private JTextField overtimeTxt;
	private JTextField allowanceTxt;
	private JTextField textField_5;
	private JTextField taxTxt;
	private JTextField sssTxt;
	private JTextField philhealthTxt;
	private JTextField pagibigTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					empPayrollPage pwindow = new empPayrollPage();
					pwindow.payrollframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public empPayrollPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		payrollframe = new JFrame();
		payrollframe.setBounds(100, 100, 1015, 881);
		payrollframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
		payrollframe.setSize(1652,899);
		payrollframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		payrollframe.getContentPane().setLayout(null);
		
		JLabel allowance = new JLabel("Allowance:");
		allowance.setFont(new Font("Arial", Font.PLAIN, 17));
		allowance.setBounds(42, 461, 142, 21);
		payrollframe.getContentPane().add(allowance);
		
		JLabel overtimeHours = new JLabel("Overtime:");
		overtimeHours.setFont(new Font("Arial", Font.PLAIN, 17));
		overtimeHours.setBounds(42, 424, 142, 21);
		payrollframe.getContentPane().add(overtimeHours);
		
		JLabel idNumber = new JLabel("ID No.");
		idNumber.setFont(new Font("Arial", Font.BOLD, 20));
		idNumber.setBounds(82, 122, 113, 21);
		payrollframe.getContentPane().add(idNumber);
		
		JLabel employeeName = new JLabel("Employee");
		employeeName.setFont(new Font("Arial", Font.BOLD, 20));
		employeeName.setBounds(42, 170, 113, 21);
		payrollframe.getContentPane().add(employeeName);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE PAYROLL SYSTEM");
		lblNewLabel.setBounds(452, 23, 638, 54);
		payrollframe.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 38));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(10, 10, 1520, 86);
		payrollframe.getContentPane().add(panel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(165, 123, 222, 22);
		payrollframe.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(165, 171, 224, 22);
		payrollframe.getContentPane().add(textArea_1);
		
		JLabel basicSalary = new JLabel("Basic Salary");
		basicSalary.setFont(new Font("Arial", Font.BOLD, 20));
		basicSalary.setBounds(23, 219, 142, 21);
		payrollframe.getContentPane().add(basicSalary);
		
		JLabel hoursWorked = new JLabel("Hours Worked:");
		hoursWorked.setFont(new Font("Arial", Font.PLAIN, 17));
		hoursWorked.setBounds(42, 340, 142, 21);
		payrollframe.getContentPane().add(hoursWorked);
		
		JLabel employeeEarnings = new JLabel("Breakdown of Earnings");
		employeeEarnings.setFont(new Font("Arial", Font.BOLD, 20));
		employeeEarnings.setBounds(42, 292, 222, 21);
		payrollframe.getContentPane().add(employeeEarnings);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(163, 220, 224, 22);
		payrollframe.getContentPane().add(textArea_1_1);
		
		JLabel daysWorked = new JLabel("Days Worked:");
		daysWorked.setFont(new Font("Arial", Font.PLAIN, 17));
		daysWorked.setBounds(42, 381, 142, 21);
		payrollframe.getContentPane().add(daysWorked);
		
		hrsWorkedText = new JTextField();
		hrsWorkedText.setBounds(176, 339, 142, 22);
		payrollframe.getContentPane().add(hrsWorkedText);
		hrsWorkedText.setColumns(10);
		
		JLabel grossSalary = new JLabel("Gross Salary:");
		grossSalary.setFont(new Font("Arial", Font.PLAIN, 17));
		grossSalary.setBounds(42, 513, 142, 21);
		payrollframe.getContentPane().add(grossSalary);
		
		daysWorkedTxt = new JTextField();
		daysWorkedTxt.setColumns(10);
		daysWorkedTxt.setBounds(176, 383, 142, 22);
		payrollframe.getContentPane().add(daysWorkedTxt);
		
		overtimeTxt = new JTextField();
		overtimeTxt.setColumns(10);
		overtimeTxt.setBounds(176, 427, 142, 22);
		payrollframe.getContentPane().add(overtimeTxt);
		
		allowanceTxt = new JTextField();
		allowanceTxt.setColumns(10);
		allowanceTxt.setBounds(176, 464, 142, 22);
		payrollframe.getContentPane().add(allowanceTxt);
		
		textField = new JTextField();
		textField.setBounds(23, 267, 461, 280);
		payrollframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel employeeEarnings_1 = new JLabel("Breakdown of Earnings");
		employeeEarnings_1.setFont(new Font("Arial", Font.BOLD, 20));
		employeeEarnings_1.setBounds(42, 589, 222, 21);
		payrollframe.getContentPane().add(employeeEarnings_1);
		
		taxTxt = new JTextField();
		taxTxt.setColumns(10);
		taxTxt.setBounds(176, 638, 142, 22);
		payrollframe.getContentPane().add(taxTxt);
		
		sssTxt = new JTextField();
		sssTxt.setColumns(10);
		sssTxt.setBounds(176, 690, 142, 22);
		payrollframe.getContentPane().add(sssTxt);
		
		philhealthTxt = new JTextField();
		philhealthTxt.setColumns(10);
		philhealthTxt.setBounds(176, 737, 142, 22);
		payrollframe.getContentPane().add(philhealthTxt);
		
		JLabel taxLabel = new JLabel("Tax Rate");
		taxLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		taxLabel.setBounds(42, 636, 142, 21);
		payrollframe.getContentPane().add(taxLabel);
		
		JLabel sssLabel = new JLabel("SSS");
		sssLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		sssLabel.setBounds(42, 690, 142, 21);
		payrollframe.getContentPane().add(sssLabel);
		
		JLabel philhealthLabel = new JLabel("PhilHealth");
		philhealthLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		philhealthLabel.setBounds(42, 735, 142, 21);
		payrollframe.getContentPane().add(philhealthLabel);
		
		pagibigTxt = new JTextField();
		pagibigTxt.setColumns(10);
		pagibigTxt.setBounds(176, 784, 142, 22);
		payrollframe.getContentPane().add(pagibigTxt);
		
		JLabel pagibigLabel = new JLabel("Pagibig");
		pagibigLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		pagibigLabel.setBounds(42, 788, 142, 21);
		payrollframe.getContentPane().add(pagibigLabel);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(23, 565, 461, 275);
		payrollframe.getContentPane().add(textField_5);
		
	}
}
