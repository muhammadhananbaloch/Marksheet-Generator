package markssheet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Fmarksheet extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtDdmmyyyy;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField marks1;
	private JTextField marks2;
	private JTextField marks3;
	private JTextField marks4;
	private JTextField marks5;
	public JLabel Tmarks;
	public JLabel Percentage;
	public JLabel Grade;
	public JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fmarksheet frame = new Fmarksheet();
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
	public Fmarksheet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 916, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(0, 0, 900, 458);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student's Information:");
		lblNewLabel_2.setFont(new Font("Montserrat", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 92, 212, 33);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(218, 165, 32));
		panel_1.setBounds(0, 0, 900, 90);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MARKSHEET GENERATOR");
		lblNewLabel.setBounds(211, 11, 472, 43);
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 35));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create Your Own Marksheet");
		lblNewLabel_1.setBounds(334, 57, 218, 19);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Montserrat", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 165, 0));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
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
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					textField_1.requestFocus();
			}
		});
		textField.setBounds(195, 133, 227, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_2.requestFocus();
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(195, 156, 227, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				txtDdmmyyyy.requestFocus();
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(195, 181, 227, 20);
		panel.add(textField_2);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_4.requestFocus();
			}
		});
		txtDdmmyyyy.setColumns(10);
		txtDdmmyyyy.setBounds(600, 133, 115, 20);
		panel.add(txtDdmmyyyy);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_5.requestFocus();
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(600, 156, 115, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_3.requestFocus();
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(600, 181, 115, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("Subjects Information:");
		lblNewLabel_2_1.setFont(new Font("Montserrat", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(10, 212, 212, 33);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_4 = new JLabel("Subject Name:");
		lblNewLabel_3_4.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_4.setBounds(239, 248, 102, 14);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Marks Obtained:");
		lblNewLabel_3_5.setFont(new Font("Montserrat", Font.BOLD, 11));
		lblNewLabel_3_5.setBounds(471, 248, 102, 14);
		panel.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("(Out of 100)");
		lblNewLabel_3_6.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblNewLabel_3_6.setBounds(488, 261, 69, 14);
		panel.add(lblNewLabel_3_6);
		
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
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_6.requestFocus();
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(168, 276, 227, 20);
		panel.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_7.requestFocus();
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(168, 298, 227, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_8.requestFocus();
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(168, 320, 227, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				textField_9.requestFocus();
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(168, 342, 227, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				marks1.requestFocus();
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(168, 364, 227, 20);
		panel.add(textField_9);
		
		marks1 = new JTextField();
		marks1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				marks2.requestFocus();
			}
		});
		marks1.setColumns(10);
		marks1.setBounds(508, 276, 33, 20);
		panel.add(marks1);
		
		marks2 = new JTextField();
		marks2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				marks3.requestFocus();
			}
		});
		marks2.setColumns(10);
		marks2.setBounds(508, 298, 33, 20);
		panel.add(marks2);
		
		marks3 = new JTextField();
		marks3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				marks4.requestFocus();
			}
		});
		marks3.setColumns(10);
		marks3.setBounds(508, 320, 33, 20);
		panel.add(marks3);
		
		marks4 = new JTextField();
		marks4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				marks5.requestFocus();
			}
		});
		marks4.setColumns(10);
		marks4.setBounds(508, 342, 33, 20);
		panel.add(marks4);
		
		marks5 = new JTextField();
		marks5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				float a,b,c,d,f,total,per;
				String grade;
				a=Float.parseFloat(marks1.getText());
				b=Float.parseFloat(marks2.getText());
				c=Float.parseFloat(marks3.getText());
				d=Float.parseFloat(marks4.getText());
				f=Float.parseFloat(marks5.getText());
				
				total=a+b+c+d+f;
				
				per=(total)/500*100;
				
				//for grade
				
				if(per<60) {
					grade="F";
					status.setText("FAIL");
				}else if(per>60 && per<=70) {
					grade="C";
					status.setText("PASS");
				}else if(per>70 && per<80) {
					grade="B";
					status.setText("PASS");
				}else if(per>80 && per<=90) {
					grade="B+";
					status.setText("PASS");
				}else if(per>90 && per<=100) {
					grade="A";
					status.setText("PASS");
				}else {
					grade= "INVALID";
				}
				
				Tmarks.setText(Float.toString(total));
				Grade.setText(grade);
				Percentage.setText(Float.toString(per));
				
			}}
		});

	
		
		
		
		
			
		
		marks5.setColumns(10);
		marks5.setBounds(508, 364, 33, 20);
		panel.add(marks5);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Total:");
		lblNewLabel_3_4_1.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1.setBounds(55, 411, 35, 14);
		panel.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Percentage (%):");
		lblNewLabel_3_4_1_1.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1_1.setBounds(130, 411, 102, 14);
		panel.add(lblNewLabel_3_4_1_1);
		
		JLabel lblNewLabel_3_4_1_2 = new JLabel("Grade:");
		lblNewLabel_3_4_1_2.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1_2.setBounds(301, 411, 40, 14);
		panel.add(lblNewLabel_3_4_1_2);
		
		JLabel lblNewLabel_3_4_1_3 = new JLabel("Result:");
		lblNewLabel_3_4_1_3.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblNewLabel_3_4_1_3.setBounds(398, 411, 46, 14);
		panel.add(lblNewLabel_3_4_1_3);
		
		Tmarks = new JLabel("");
		Tmarks.setFont(new Font("Montserrat", Font.PLAIN, 11));
		Tmarks.setBounds(91, 411, 33, 14);
		panel.add(Tmarks);
		
		Percentage = new JLabel("");
		Percentage.setFont(new Font("Montserrat", Font.PLAIN, 11));
		Percentage.setBounds(232, 411, 52, 14);
		panel.add(Percentage);
		
		Grade = new JLabel("");
		Grade.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Grade.setBounds(343, 412, 52, 14);
		panel.add(Grade);
		
		status = new JLabel("");
		status.setFont(new Font("Times New Roman", Font.BOLD, 13));
		status.setBounds(446, 412, 52, 14);
		panel.add(status);
		
		JButton calc = new JButton("DIsplay Result");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a,b,c,d,f,total,per;
				String grade;
				a=Float.parseFloat(marks1.getText());
				b=Float.parseFloat(marks2.getText());
				c=Float.parseFloat(marks3.getText());
				d=Float.parseFloat(marks4.getText());
				f=Float.parseFloat(marks5.getText());
				
				total=a+b+c+d+f;
				
				per=(total)/500*100;
				
				//for grade
				
				if(per<60) {
					grade="F";
					status.setText("FAIL");
				}else if(per>60 && per<=70) {
					grade="C";
					status.setText("PASS");
				}else if(per>70 && per<80) {
					grade="B";
					status.setText("PASS");
				}else if(per>80 && per<=90) {
					grade="B+";
					status.setText("PASS");
				}else if(per>90 && per<=100) {
					grade="A";
					status.setText("PASS");
				}else {
					grade= "INVALID";
				}
				
				Tmarks.setText(Float.toString(total));
				Grade.setText(grade);
				Percentage.setText(Float.toString(per));
				
			
				
			}
		});
		calc.setForeground(new Color(0, 0, 0));
		calc.setBackground(new Color(112, 128, 144));
		calc.setBounds(490, 408, 126, 23);
		panel.add(calc);
		
		JButton btnGenerateMarksheet = new JButton("Generate Marksheet");
		btnGenerateMarksheet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fmarksheet2 markSheet = new Fmarksheet2();
			
				markSheet.setVisible(true);
				dispose();
				
				
				/*String ja = textField.getText();			
				String jb = txtDdmmyyyy.getText();
//				String jc = textField_2.getText();
				String jd = textField_4.getText();
				String je = textField_5.getText();
				
				mkt.getdata(ja, jb,jd, je);*/
				
				
				markSheet.name.setText(textField.getText());
				markSheet.prog1.setText(textField_1.getText());
				markSheet.institute.setText(textField_2.getText());
				markSheet.regno.setText(textField_4.getText());
				markSheet.dob.setText(txtDdmmyyyy.getText());
				markSheet.rollno.setText(textField_5.getText());
				
				
				//sub info
				markSheet.s1.setText(textField_3.getText());
				markSheet.s2.setText(textField_6.getText());
				markSheet.s3.setText(textField_7.getText());
				markSheet.s4.setText(textField_8.getText());
				markSheet.s5.setText(textField_9.getText());
				
				//obtmarks
				
				markSheet.O1.setText(marks1.getText());
				markSheet.O2.setText(marks2.getText());
				markSheet.O3.setText(marks3.getText());
				markSheet.O4.setText(marks4.getText());
				markSheet.O5.setText(marks5.getText());

				markSheet.To.setText(Tmarks.getText());
				
				
				//result
				
				markSheet.per3.setText(Percentage.getText());
				markSheet.grade2.setText(Grade.getText());
				markSheet.status2.setText(status.getText());   
				
			
			}
		});
		btnGenerateMarksheet.setForeground(Color.BLACK);
		btnGenerateMarksheet.setBackground(new Color(112, 128, 144));
		btnGenerateMarksheet.setBounds(717, 275, 161, 23);
		panel.add(btnGenerateMarksheet);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//std info
			textField.setText(null);
			textField_1.setText(null);
			textField_2.setText(null);
			txtDdmmyyyy.setText(null);
			textField_4.setText(null);
			textField_5.setText("");
			
//				//sub info
			textField_3.setText(null);
			textField_6.setText(null);
			textField_7.setText(null);	
			textField_8.setText(null);
			textField_9.setText(null);
//				
//				//marks
			marks1.setText(null);
			marks2.setText(null);
			marks3.setText(null);
			marks4.setText(null);
			marks5.setText(null);
//				
//				//result
			Tmarks.setText(null);
			Percentage.setText(null);
			Grade.setText(null);
			status.setText(null);
//				
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setBackground(new Color(112, 128, 144));
		btnReset.setBounds(743, 319, 108, 23);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setBackground(new Color(112, 128, 144));
		btnExit.setBounds(743, 363, 108, 23);
		panel.add(btnExit);
	}
}
