package employeedashboard;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.Component;
import javax.swing.DropMode;
import javax.swing.JTable;

public class Employeedashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel mainpanel;
	private JTextField EmpProfile;
	private JTextField txtholidays;
	private JTextField txtleavestatus;
	private JTextField textupcomingleave;
	private JTextField txtovertimehours;
	private JTextField txtabsences;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeedashboard frame = new Employeedashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employeedashboard() {
		setTitle("MotorPH Employee Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		mainpanel = new JPanel();
		mainpanel.setBackground(Color.WHITE);
		mainpanel.setBounds(100, 100, 1652, 889);
		

		setContentPane(mainpanel);
		mainpanel.setLayout(null);
		
		//Side Panel
		JPanel sidepanel = new JPanel();
		sidepanel.setBackground(Color.LIGHT_GRAY);
		sidepanel.setBounds(0, 0, 500, 1080);
		sidepanel.setLayout(null);
		mainpanel.add(sidepanel);
		
		
		//BUTTON 1
		JButton btn1 = new JButton("HOME");
		btn1.setFont(new Font("Arial", Font.BOLD, 30));
		btn1.setBounds(90, 330, 300, 90);
		sidepanel.add(btn1);
		
		//BUTTON 2
		JButton btn2 = new JButton("PROFILE");
		btn2.setFont(new Font("Arial", Font.BOLD, 30));
		btn2.setBounds(90, 440, 300, 90);
		sidepanel.add(btn2);
		
		//BUTTON 3
		JButton btn3 = new JButton("LEAVE");
		btn3.setFont(new Font("Arial", Font.BOLD, 30));
		btn3.setBounds(90, 550, 300, 90);
		sidepanel.add(btn3);
		
		//BUTTON 4
		JButton btn4 = new JButton("PAYROLL");
		btn4.setFont(new Font("Arial", Font.BOLD, 30));
		btn4.setBounds(90, 660, 300, 90);
		sidepanel.add(btn4);
		
		//BUTTON 5
		JButton btn5 = new JButton("SIGN OUT");
		btn5.setBackground(UIManager.getColor("Button.background"));
		btn5.setForeground(Color.RED);
		btn5.setFont(new Font("Arial", Font.BOLD, 15));
		btn5.setBounds(160, 900, 150, 50);
		sidepanel.add(btn5);
		
		//Button 6
		JButton btn6 = new JButton("ATTENDANCE");
		btn6.setFont(new Font("Arial", Font.BOLD, 30));
		btn6.setBounds(90, 770, 300, 90);
		sidepanel.add(btn6);
				
		//Employee Name Label
		JLabel lblempname = new JLabel("Mark Bautista");
		lblempname.setHorizontalAlignment(SwingConstants.CENTER);
		lblempname.setFont(new Font("Arial", Font.BOLD, 20));
		lblempname.setBounds(90, 260, 300, 50);
		sidepanel.add(lblempname);
		
		//Employee Designation Label
		JLabel lblempdesignation = new JLabel("Account Rank and File");
		lblempdesignation.setHorizontalAlignment(SwingConstants.CENTER);
		lblempdesignation.setFont(new Font("Arial", Font.PLAIN, 15));
		lblempdesignation.setBounds(90, 290, 300, 30);
		sidepanel.add(lblempdesignation);
		
		//Employee Profile
		EmpProfile = new JTextField();
		EmpProfile.setEnabled(false);
		EmpProfile.setEditable(false);
		EmpProfile.setBounds(140, 70, 200, 200);
		sidepanel.add(EmpProfile);
		EmpProfile.setColumns(10);
		
		//Employee ID
		JTextPane EmpID = new JTextPane();
		EmpID.setFont(new Font("Arial", Font.BOLD, 15));
		EmpID.setToolTipText("");
		EmpID.setEditable(false);
		EmpID.setText("EMPLOYEE #01");
		EmpID.setBounds(180, 45, 120, 20);
		sidepanel.add(EmpID);
		
		//Overview Panel
		JPanel overviewpanel = new JPanel();
		overviewpanel.setBackground(Color.WHITE);
		overviewpanel.setBounds(500, 0, 1920, 1080);
		mainpanel.add(overviewpanel);
		overviewpanel.setLayout(null);
		
		//Upcoming Holidays
		JPanel panel_holidays = new JPanel();
		panel_holidays.setBounds(50, 40, 400, 500);
		overviewpanel.add(panel_holidays);
		panel_holidays.setLayout(null);
		
		txtholidays = new JTextField();
		txtholidays.setEditable(false);
		txtholidays.setFont(new Font("Arial", Font.BOLD, 25));
		txtholidays.setText("UPCOMING HOLIDAYS");
		txtholidays.setHorizontalAlignment(SwingConstants.CENTER);
		txtholidays.setBounds(25, 10, 350, 50);
		panel_holidays.add(txtholidays);
		txtholidays.setColumns(10);
		
		//Leave Application Status
		JPanel panel_leavestatus = new JPanel();
		panel_leavestatus.setLayout(null);
		panel_leavestatus.setBounds(510, 40, 400, 500);
		overviewpanel.add(panel_leavestatus);
		
		txtleavestatus = new JTextField();
		txtleavestatus.setEditable(false);
		txtleavestatus.setText("LEAVE APPLICATION STATUS");
		txtleavestatus.setHorizontalAlignment(SwingConstants.CENTER);
		txtleavestatus.setFont(new Font("Arial", Font.BOLD, 22));
		txtleavestatus.setColumns(10);
		txtleavestatus.setBounds(25, 10, 350, 50);
		panel_leavestatus.add(txtleavestatus);
		
		//Upcoming Leaves
		JPanel panel_leaves = new JPanel();
		panel_leaves.setLayout(null);
		panel_leaves.setBounds(966, 40, 400, 500);
		overviewpanel.add(panel_leaves);
		
		textupcomingleave = new JTextField();
		textupcomingleave.setEditable(false);
		textupcomingleave.setText("UPCOMING LEAVES");
		textupcomingleave.setHorizontalAlignment(SwingConstants.CENTER);
		textupcomingleave.setFont(new Font("Arial", Font.BOLD, 25));
		textupcomingleave.setColumns(10);
		textupcomingleave.setBounds(25, 10, 350, 50);
		panel_leaves.add(textupcomingleave);
		
		//Overtime Hours
		JPanel panel_overtime = new JPanel();
		panel_overtime.setLayout(null);
		panel_overtime.setBounds(150, 561, 500, 400);
		overviewpanel.add(panel_overtime);
		
		txtovertimehours = new JTextField();
		txtovertimehours.setEditable(false);
		txtovertimehours.setText("OVERTIME HOURS");
		txtovertimehours.setHorizontalAlignment(SwingConstants.CENTER);
		txtovertimehours.setFont(new Font("Arial", Font.BOLD, 25));
		txtovertimehours.setColumns(10);
		txtovertimehours.setBounds(80, 10, 350, 50);
		panel_overtime.add(txtovertimehours);
		
		//Month Absences
		JPanel panel_absences = new JPanel();
		panel_absences.setLayout(null);
		panel_absences.setBounds(687, 561, 500, 400);
		overviewpanel.add(panel_absences);
		
		txtabsences = new JTextField();
		txtabsences.setText("MONTH ABSENCES");
		txtabsences.setHorizontalAlignment(SwingConstants.CENTER);
		txtabsences.setFont(new Font("Arial", Font.BOLD, 25));
		txtabsences.setEditable(false);
		txtabsences.setColumns(10);
		txtabsences.setBounds(80, 10, 350, 50);
		panel_absences.add(txtabsences);
	}
}
