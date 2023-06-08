package markssheet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fmarksheet2 extends JFrame {

	public JPanel contentPane;
	public JLabel name;
	public JLabel prog1;
	public JLabel institute;
	public JLabel regno;
	public JLabel dob;
	public JLabel rollno;
	
	public JLabel s1;
	public JLabel s2;
	public JLabel s3;
	public JLabel s4;
	public JLabel s5;
	
	public JLabel O1;
	public JLabel O2;
	public JLabel O3;
	public JLabel O4;
	public JLabel O5;
	public JLabel To;
	
	public JLabel Of1;
	public JLabel Of2;
	public JLabel Of3;
	public JLabel Of4;
	public JLabel Of5;
	
	public JLabel per3;
	public JLabel grade2;
	public JLabel status2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fmarksheet2 frame = new Fmarksheet2();
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
	public Fmarksheet2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(0, 0, 907, 464);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Student's Information:");
		lblNewLabel_2.setFont(new Font("Montserrat", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 92, 212, 33);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(218, 165, 32));
		panel_1.setBounds(0, 0, 907, 90);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("MARKSHEET GENERATOR");
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 35));
		lblNewLabel.setBounds(211, 11, 472, 43);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create Your Own Marksheet");
		lblNewLabel_1.setForeground(new Color(255, 165, 0));
		lblNewLabel_1.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(334, 57, 218, 19);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(294, 57, 302, 22);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Student's Name:");
		lblNewLabel_3.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3.setBounds(55, 134, 102, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Programme/Class:");
		lblNewLabel_3_1.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(45, 159, 122, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("  Institution Name:");
		lblNewLabel_3_2.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_2.setBounds(45, 184, 122, 14);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Date of Birth:");
		lblNewLabel_3_3.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_3.setBounds(490, 134, 83, 14);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Registration Number:");
		lblNewLabel_3_3_1.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_3_1.setBounds(446, 159, 127, 14);
		panel.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Roll Number:");
		lblNewLabel_3_3_2.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_3_2.setBounds(497, 184, 76, 14);
		panel.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Subjects Information:");
		lblNewLabel_2_1.setFont(new Font("Montserrat", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(10, 212, 212, 33);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("Subject Name:");
		lblNewLabel_3_4.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_4.setBounds(239, 248, 86, 14);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Marks Obtained:");
		lblNewLabel_3_5.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_5.setBounds(471, 248, 102, 14);
		panel.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_7 = new JLabel("Subject I:");
		lblNewLabel_3_7.setFont(new Font("Montserrat", Font.BOLD, 10));
		lblNewLabel_3_7.setBounds(91, 279, 52, 14);
		panel.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("Subject II:");
		lblNewLabel_3_7_1.setFont(new Font("Montserrat", Font.BOLD, 10));
		lblNewLabel_3_7_1.setBounds(88, 301, 55, 14);
		panel.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("Subject III:");
		lblNewLabel_3_7_2.setFont(new Font("Montserrat", Font.BOLD, 10));
		lblNewLabel_3_7_2.setBounds(88, 323, 55, 14);
		panel.add(lblNewLabel_3_7_2);
		
		JLabel lblNewLabel_3_7_3 = new JLabel("Subject IV:");
		lblNewLabel_3_7_3.setFont(new Font("Montserrat", Font.BOLD, 10));
		lblNewLabel_3_7_3.setBounds(88, 345, 55, 14);
		panel.add(lblNewLabel_3_7_3);
		
		JLabel lblNewLabel_3_7_4 = new JLabel("Subject V:");
		lblNewLabel_3_7_4.setFont(new Font("Montserrat", Font.BOLD, 10));
		lblNewLabel_3_7_4.setBounds(91, 367, 52, 14);
		panel.add(lblNewLabel_3_7_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Total:");
		lblNewLabel_3_4_1.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1.setBounds(460, 388, 35, 14);
		panel.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Percentage (%):");
		lblNewLabel_3_4_1_1.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1_1.setBounds(55, 437, 102, 14);
		panel.add(lblNewLabel_3_4_1_1);
		
		JLabel lblNewLabel_3_4_1_2 = new JLabel("Grade:");
		lblNewLabel_3_4_1_2.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1_2.setBounds(230, 437, 40, 14);
		panel.add(lblNewLabel_3_4_1_2);
		
		JLabel lblNewLabel_3_4_1_3 = new JLabel("Remarks:");
		lblNewLabel_3_4_1_3.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1_3.setBounds(335, 437, 60, 14);
		panel.add(lblNewLabel_3_4_1_3);
		
		JLabel Tmarks = new JLabel("");
		Tmarks.setFont(new Font("Montserrat", Font.PLAIN, 11));
		Tmarks.setBounds(111, 412, 33, 14);
		panel.add(Tmarks);
		
		JLabel Percentage = new JLabel("");
		Percentage.setFont(new Font("Montserrat", Font.PLAIN, 11));
		Percentage.setBounds(258, 412, 40, 14);
		panel.add(Percentage);
		
		JLabel Grade = new JLabel("");
		Grade.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Grade.setBounds(343, 412, 52, 14);
		panel.add(Grade);
		
		JLabel status = new JLabel("");
		status.setFont(new Font("Times New Roman", Font.BOLD, 13));
		status.setBounds(446, 412, 52, 14);
		panel.add(status);
		
		JButton calc = new JButton("Go Back");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fmarksheet bock = new Fmarksheet();
				bock.setVisible(true);
				dispose();
			}
		});
		calc.setForeground(Color.BLACK);
		calc.setBackground(new Color(112, 128, 144));
		calc.setBounds(754, 408, 102, 23);
		panel.add(calc);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("Out of:");
		lblNewLabel_3_5_1.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_5_1.setBounds(648, 248, 102, 14);
		panel.add(lblNewLabel_3_5_1);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("S. No:");
		lblNewLabel_3_4_2.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_4_2.setBounds(98, 248, 33, 14);
		panel.add(lblNewLabel_3_4_2);
		
		s1 = new JLabel(" XXXXX XXXX XXXX XXX");
		s1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		s1.setBounds(216, 278, 140, 14);
		panel.add(s1);
		
		
		s2 = new JLabel(" XXXXX XXXX XXXX XXX");
		s2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		s2.setBounds(216, 301, 140, 14);
		panel.add(s2);
		
		s3 = new JLabel(" XXXXX XXXX XXXX XXX");
		s3.setFont(new Font("Montserrat", Font.PLAIN, 12));
		s3.setBounds(216, 323, 140, 14);
		panel.add(s3);
		
		s4 = new JLabel(" XXXXX XXXX XXXX XXX");
		s4.setFont(new Font("Montserrat", Font.PLAIN, 12));
		s4.setBounds(216, 345, 140, 14);
		panel.add(s4);
		
		s5 = new JLabel(" XXXXX XXXX XXXX XXX");
		s5.setFont(new Font("Montserrat", Font.PLAIN, 12));
		s5.setBounds(216, 367, 140, 14);
		panel.add(s5);
		
		O2 = new JLabel("XXX");
		O2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		O2.setBounds(507, 301, 35, 14);
		panel.add(O2);
		
		O3 = new JLabel("XXX");
		O3.setFont(new Font("Montserrat", Font.PLAIN, 12));
		O3.setBounds(507, 323, 35, 14);
		panel.add(O3);
		
		O4 = new JLabel("XXX");
		O4.setFont(new Font("Montserrat", Font.PLAIN, 12));
		O4.setBounds(507, 345, 35, 14);
		panel.add(O4);
		
		O5 = new JLabel("XXX");
		O5.setFont(new Font("Montserrat", Font.PLAIN, 12));
		O5.setBounds(507, 367, 35, 14);
		panel.add(O5);
		
		Of1 = new JLabel("100");
		Of1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		Of1.setBounds(658, 279, 35, 14);
		panel.add(Of1);
		
		Of2 = new JLabel("100");
		Of2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		Of2.setBounds(658, 302, 35, 14);
		panel.add(Of2);
		
		Of3 = new JLabel("100");
		Of3.setFont(new Font("Montserrat", Font.PLAIN, 12));
		Of3.setBounds(658, 324, 35, 14);
		panel.add(Of3);
		
		Of4 = new JLabel("100");
		Of4.setFont(new Font("Montserrat", Font.PLAIN, 12));
		Of4.setBounds(658, 346, 35, 14);
		panel.add(Of4);
		
		Of5 = new JLabel("100");
		Of5.setFont(new Font("Montserrat", Font.PLAIN, 12));
		Of5.setBounds(658, 368, 35, 14);
		panel.add(Of5);
		
		name = new JLabel(" XXXXX XXXX XXXX XXXXX XXXX");
		name.setFont(new Font("Montserrat", Font.PLAIN, 12));
		name.setBounds(198, 136, 197, 14);
		panel.add(name);
		
		dob = new JLabel("XX/XX/XX");
		dob.setFont(new Font("Montserrat", Font.PLAIN, 12));
		dob.setBounds(583, 134, 86, 14);
		panel.add(dob);
		
		prog1 = new JLabel(" XXXXX XXXX XXXX XXXXX XXXX");
		prog1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		prog1.setBounds(198, 159, 197, 14);
		panel.add(prog1);
		
		regno = new JLabel("XX/XX/XX");
		regno.setFont(new Font("Montserrat", Font.PLAIN, 12));
		regno.setBounds(583, 159, 86, 14);
		panel.add(regno);
		
		rollno = new JLabel("XX/XX/XX");
		rollno.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rollno.setBounds(583, 183, 86, 14);
		panel.add(rollno);
		
		To = new JLabel("XXX");
		To.setFont(new Font("Montserrat", Font.BOLD, 10));
		To.setBounds(507, 389, 35, 14);
		panel.add(To);
		
		per3 = new JLabel("XXX");
		per3.setFont(new Font("Montserrat", Font.PLAIN, 12));
		per3.setBounds(167, 438, 55, 14);
		panel.add(per3);
		
		grade2 = new JLabel("XXX");
		grade2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		grade2.setBounds(280, 438, 35, 14);
		panel.add(grade2);
		
		status2 = new JLabel("XXX");
		status2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		status2.setBounds(405, 438, 35, 14);
		panel.add(status2);
		
		institute = new JLabel(" XXXXX XXXX XXXX XXXXX XXXX");
		institute.setFont(new Font("Montserrat", Font.PLAIN, 12));
		institute.setBounds(198, 183, 197, 14);
		panel.add(institute);
		
		O1 = new JLabel("XXX");
		O1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		O1.setBounds(507, 279, 35, 14);
		panel.add(O1);
	}
	}


