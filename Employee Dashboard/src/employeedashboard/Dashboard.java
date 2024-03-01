package employeedashboard;

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
		setTitle("MotorPH Employee Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 539);
		buttons = new JPanel();
		buttons.setBackground(new Color(192, 192, 192));
		buttons.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(buttons);
		buttons.setLayout(null);
		
		// profile button
		JButton btnProfile = new JButton("PROFILE");
		btnProfile.setFont(new Font("Arial", Font.PLAIN, 30));
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProfile.setBounds(248, 75, 270, 130);
		buttons.add(btnProfile);
		
		// leave page button
		JButton btnLeavePage = new JButton("LEAVE PAGE");
		btnLeavePage.setFont(new Font("Arial", Font.PLAIN, 30));
		btnLeavePage.setBounds(30, 265, 270, 130);
		buttons.add(btnLeavePage);
		
		// payroll button
		JButton btnPayroll = new JButton("PAYROLL");
		btnPayroll.setFont(new Font("Arial", Font.PLAIN, 30));
		btnPayroll.setBounds(460, 265, 270, 130);
		buttons.add(btnPayroll);
	}
}
