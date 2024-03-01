package admindashboard;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel buttons;

	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// create the frame
	public Dashboard() {
		setBackground(new Color(0, 0, 0));
		setForeground(Color.BLACK);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("MotorPH Admin Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 539);
		buttons = new JPanel();
		buttons.setBackground(new Color(192, 192, 192));
		buttons.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(buttons);
		buttons.setLayout(null);
		
		// employee management button
		JButton btnEmployeeMngmt = new JButton("EMPLOYEE MANAGEMENT");
		btnEmployeeMngmt.setFont(new Font("Arial", Font.PLAIN, 18));
		btnEmployeeMngmt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmployeeMngmt.setBounds(68, 76, 270, 130);
		buttons.add(btnEmployeeMngmt);
		
		// leave processing button
		JButton btnLeaveProcessing = new JButton("LEAVE PROCESSING");
		btnLeaveProcessing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLeaveProcessing.setFont(new Font("Arial", Font.PLAIN, 18));
		btnLeaveProcessing.setBounds(68, 263, 270, 130);
		buttons.add(btnLeaveProcessing);
		
		// system management button
		JButton btnSystemmngmt = new JButton("SYSTEM MANAGEMENT");
		btnSystemmngmt.setFont(new Font("Arial", Font.PLAIN, 18));
		btnSystemmngmt.setBounds(426, 263, 270, 130);
		buttons.add(btnSystemmngmt);
		
		// payroll management button
		JButton btnPayrollMngmt = new JButton("PAYROLL MANAGEMENT");
		btnPayrollMngmt.setFont(new Font("Arial", Font.PLAIN, 18));
		btnPayrollMngmt.setBounds(426, 76, 270, 130);
		buttons.add(btnPayrollMngmt);
	}
}
