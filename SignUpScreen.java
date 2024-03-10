import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class SignUpScreen {
	private JFrame frame = new JFrame("Sign Up");
	private JPanel panel;
	private JPanel panel2;
	private JLabel label1;
	private JLabel lblusername;
	private JLabel lblemail;
	private JLabel lblsetpass;
	private JLabel lblconfirmpass;
	private JLabel lblcnic;
	private JLabel lblcnic1;
	private JLabel lblcnic2;
	private JLabel l;
	private JLabel l2;
	private JLabel l3;
	private JTextField fieldusername;
	private JTextField fieldemail;
	private JTextField fieldcnic1;
	private JTextField fieldcnic2;
	private JTextField fieldcnic3;
	private JPasswordField pass;
	private JPasswordField confirmpass;
	private JButton btn1;
	private JButton btn3;
	private JButton btnMainMenu;

	public SignUpScreen() {
		this.frame.setDefaultCloseOperation(1);
		this.panel = new JPanel();
		this.panel.setBackground(new Color(216, 191, 216));
		this.panel2 = new JPanel();
		this.panel2.setBorder(new EtchedBorder(1, (Color)null, (Color)null));
		this.panel2.setBounds(115, 11, 208, 35);
		this.panel2.setBackground(new Color(255, 182, 193));
		this.panel.add(this.panel2);
		this.label1 = new JLabel("WELCOME : SIGN UP");
		this.label1.setFont(new Font("Serif", 1, 19));
		this.label1.setBounds(90, 4, 200, 40);
		this.panel2.add(this.label1);
		this.lblusername = new JLabel("Username : ");
		this.lblusername.setFont(new Font("Serif", 0, 17));
		this.lblusername.setBounds(25, 95, 100, 25);
		this.lblemail = new JLabel("Email : ");
		this.lblemail.setFont(new Font("Serif", 0, 17));
		this.lblemail.setBounds(25, 145, 100, 20);
		this.lblcnic = new JLabel("CNIC : ");
		this.lblcnic.setFont(new Font("Serif", 0, 17));
		this.lblcnic.setBounds(25, 195, 100, 20);
		this.lblsetpass = new JLabel("Set Password : ");
		this.lblsetpass.setFont(new Font("Serif", 0, 15));
		this.lblsetpass.setBounds(25, 245, 100, 20);
		this.lblconfirmpass = new JLabel("Confirm Password : ");
		this.lblconfirmpass.setFont(new Font("Serif", 0, 15));
		this.lblconfirmpass.setBounds(25, 295, 130, 20);
		this.fieldusername = new JTextField();
		this.fieldusername.setBounds(170, 95, 120, 20);
		this.fieldemail = new JTextField();
		this.fieldemail.setBounds(170, 145, 120, 20);
		this.fieldcnic1 = new JTextField();
		this.fieldcnic1.setDocument(new TextFieldLimit(5));
		this.fieldcnic1.setBounds(170, 195, 55, 20);
		this.lblcnic1 = new JLabel("_");
		this.lblcnic1.setBounds(233, 190, 20, 20);
		this.fieldcnic2 = new JTextField();
		this.fieldcnic2.setDocument(new TextFieldLimit(7));
		this.fieldcnic2.setBounds(245, 195, 80, 20);
		this.lblcnic2 = new JLabel("_");
		this.lblcnic2.setBounds(333, 190, 20, 20);
		this.fieldcnic3 = new JTextField();
		this.fieldcnic3.setDocument(new TextFieldLimit(1));
		this.fieldcnic3.setBounds(347, 195, 30, 20);
		this.pass = new JPasswordField();
		this.pass.setBounds(170, 245, 120, 20);
		this.confirmpass = new JPasswordField();
		this.confirmpass.setBounds(170, 295, 120, 20);
		this.btn1 = new JButton("Register");
		this.btn1.setBounds(70, 355, 100, 25);
		this.btn1.setForeground(Color.red);
		this.btn3 = new JButton("Log IN");
		this.btn3.setBounds(190, 355, 100, 25);
		this.btn3.setForeground(Color.red);
		this.btnMainMenu = new JButton("MainMenu");
		this.btnMainMenu.setBounds(320, 355, 100, 25);
		this.btnMainMenu.setForeground(Color.red);
		this.l = new JLabel();
		this.l.setForeground(Color.red);
		this.l.setBounds(120, 37, 300, 40);
		this.l2 = new JLabel();
		this.l2.setForeground(Color.red);
		this.l3 = new JLabel();
		this.l3.setForeground(Color.red);
		this.panel.setLayout((LayoutManager)null);
		this.panel.add(this.fieldusername);
		this.panel.add(this.fieldemail);
		this.panel.add(this.lblusername);
		this.panel.add(this.lblemail);
		this.panel.add(this.lblsetpass);
		this.panel.add(this.pass);
		this.panel.add(this.btn1);
		this.panel.add(this.btnMainMenu);
		this.panel.add(this.btn3);
		this.panel.add(this.confirmpass);
		this.panel.add(this.lblconfirmpass);
		this.panel.add(this.lblcnic);
		this.panel.add(this.fieldcnic1);
		this.panel.add(this.fieldcnic2);
		this.panel.add(this.fieldcnic3);
		this.panel.add(this.lblcnic1);
		this.panel.add(this.lblcnic2);
		this.panel.add(this.l);
		this.panel.add(this.l2);
		this.panel.add(this.l3);
		this.frame.add(this.panel);
		this.btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String var10000 = SignUpScreen.this.fieldcnic1.getText();
				String cnic = var10000 + SignUpScreen.this.fieldcnic2.getText() + SignUpScreen.this.fieldcnic3.getText();
				if (!SignUpScreen.this.fieldusername.getText().equals("") && !SignUpScreen.this.fieldemail.getText().equals("") && !SignUpScreen.this.pass.getText().equals("") && !SignUpScreen.this.confirmpass.getText().equals("") && !SignUpScreen.this.fieldcnic1.getText().equals("") && !SignUpScreen.this.fieldcnic2.getText().equals("") && !SignUpScreen.this.fieldcnic3.getText().equals("")) {
					boolean accountexists = false;
					Iterator var4 = MainMenu.listPassenger.iterator();

					label63: {
						Passenger object;
						do {
							if (!var4.hasNext()) {
								break label63;
							}

							object = (Passenger)var4.next();
						} while(!SignUpScreen.this.fieldusername.getText().equals(object.getUsername()) && !SignUpScreen.this.fieldemail.getText().equals(object.getEmail()) && !cnic.equals(object.getCnic()) && !SignUpScreen.this.pass.getText().equals(object.getPassword()));

						accountexists = true;
					}

					if (!accountexists) {
						if (SignUpScreen.this.fieldusername.getText().length() >= 6) {
							if (SignUpScreen.this.validEmail(SignUpScreen.this.fieldemail.getText())) {
								if (SignUpScreen.this.validCNIC(SignUpScreen.this.fieldcnic1.getText()) && SignUpScreen.this.validCNIC(SignUpScreen.this.fieldcnic2.getText()) && SignUpScreen.this.validCNIC(SignUpScreen.this.fieldcnic3.getText()) && cnic.length() == 13) {
									if (SignUpScreen.this.validPassword(SignUpScreen.this.pass.getText()) && SignUpScreen.this.pass.getText().length() >= 8) {
										if (SignUpScreen.this.pass.getText().equals(SignUpScreen.this.confirmpass.getText())) {
											Passenger obj = new Passenger(SignUpScreen.this.fieldusername.getText(), SignUpScreen.this.fieldemail.getText(), cnic, SignUpScreen.this.pass.getText());
											MainMenu.listPassenger.add(obj);
											SignUpScreen.this.fieldusername.setText((String)null);
											SignUpScreen.this.fieldemail.setText((String)null);
											SignUpScreen.this.pass.setText((String)null);
											SignUpScreen.this.confirmpass.setText((String)null);
											SignUpScreen.this.fieldcnic1.setText((String)null);
											SignUpScreen.this.fieldcnic2.setText((String)null);
											SignUpScreen.this.fieldcnic3.setText((String)null);
											SignUpScreen.this.l.setText((String)null);
											SignUpScreen.this.l2.setText((String)null);
											SignUpScreen.this.l3.setText((String)null);
											JOptionPane msg = new JOptionPane();
											JOptionPane.showMessageDialog(SignUpScreen.this.panel, "Account created Successfully!!", "Successful", 1);
										} else {
											SignUpScreen.this.l.setText("*Passwords do not match");
											SignUpScreen.this.l2.setText((String)null);
											SignUpScreen.this.l3.setText((String)null);
										}
									} else {
										SignUpScreen.this.l2.setBounds(120, 47, 330, 40);
										SignUpScreen.this.l3.setBounds(120, 57, 330, 40);
										SignUpScreen.this.l.setText("*Password must have atleast 8 characters");
										SignUpScreen.this.l2.setText("and should be a combination of uppercase,");
										SignUpScreen.this.l3.setText("lowercase, digit and a special character");
									}
								} else {
									SignUpScreen.this.l.setText("*Invalid CNIC");
									SignUpScreen.this.l2.setText((String)null);
									SignUpScreen.this.l3.setText((String)null);
								}
							} else {
								SignUpScreen.this.l.setText("*Invalid Email");
							}
						} else {
							SignUpScreen.this.l.setText("*Username must have atleast 6 characters");
							SignUpScreen.this.l2.setText((String)null);
							SignUpScreen.this.l3.setText((String)null);
						}
					} else {
						SignUpScreen.this.l.setText("*Fill all the Slots");
						SignUpScreen.this.l2.setText((String)null);
						SignUpScreen.this.l3.setText((String)null);
					}
				}

			}
		});
		this.btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpScreen.this.frame.dispose();
				new LogInScreen();
			}
		});
		this.btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpScreen.this.frame.dispose();
			}
		});
		this.frame.setBounds(100, 100, 500, 450);
		this.frame.setVisible(true);
		this.frame.setResizable (false);
	}

	public boolean validCNIC(String str) {
		char[] array = str.toCharArray();
		boolean isValid = true;
		char[] var4 = array;
		int var5 = array.length;

		for(int var6 = 0; var6 < var5; ++var6) {
			char character = var4[var6];
			if (!Character.isDigit(character)) {
				isValid = false;
				break;
			}
		}

		return isValid;
	}

	public boolean validPassword(String str) {
		char[] array = str.toCharArray();
		boolean capital = false;
		boolean small = false;
		boolean digit = false;
		boolean special = false;
		char[] var7 = array;
		int var8 = array.length;

		int var9;
		char character;
		for(var9 = 0; var9 < var8; ++var9) {
			character = var7[var9];
			if (Character.isUpperCase(character)) {
				capital = true;
				break;
			}
		}

		var7 = array;
		var8 = array.length;

		for(var9 = 0; var9 < var8; ++var9) {
			character = var7[var9];
			if (Character.isLowerCase(character)) {
				small = true;
				break;
			}
		}

		var7 = array;
		var8 = array.length;

		for(var9 = 0; var9 < var8; ++var9) {
			character = var7[var9];
			if (Character.isDigit(character)) {
				digit = true;
				break;
			}
		}

		var7 = array;
		var8 = array.length;

		for(var9 = 0; var9 < var8; ++var9) {
			character = var7[var9];
			if (!Character.isDigit(character) && !Character.isLetter(character) && !Character.isWhitespace(character)) {
				special = true;
				break;
			}
		}

		return capital && small && digit && special;
	}

	public boolean validEmail(String str) {
		if (!str.contains("@") || !str.contains(".com") && !str.contains(".pk")) {
			return false;
		} else {
			char[] array = str.toCharArray();
			boolean letter = false;
			char[] var4 = array;
			int var5 = array.length;

			for(int var6 = 0; var6 < var5; ++var6) {
				char c = var4[var6];
				if (Character.isLetter(c)) {
					letter = true;
					break;
				}
			}

			return letter;
		}
	}
}
//public class SignUpScreen {
//	private JFrame frame;
//	private JPanel panel, panel2;
//	private JLabel label1, lblusername, lblemail, lblsetpass, lblconfirmpass, lblcnic, lblcnic1, lblcnic2, l, l2, l3;
//	private JTextField fieldusername, fieldemail, fieldcnic1, fieldcnic2, fieldcnic3;
//	private JPasswordField pass, confirmpass;
//	private JButton btn1, btn3, btnMainMenu;
//
//	public SignUpScreen() {
//		frame = new JFrame("Sign Up");
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		panel = new JPanel();
//		panel.setBackground(new Color(216, 191, 216));
//
//		panel2 = new JPanel();
//		panel2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
//		panel2.setBounds(115, 11, 208, 35);
//		panel2.setBackground(new Color(255, 182, 193));
//		panel.add(panel2);
//
//
//		label1 = new JLabel("WELCOME : SIGN UP");
//		label1.setFont(new Font("Serif", Font.BOLD, 19));
//		label1.setBounds(90, 4, 200, 40);
//		panel2.add(label1);
//
//		lblusername = new JLabel("Username : ");
//		lblusername.setFont(new Font("Serif", Font.PLAIN, 17));
//		lblusername.setBounds(25, 95, 100, 25);
//
//
//		lblemail = new JLabel("Email : ");
//		lblemail.setFont(new Font("Serif", Font.PLAIN, 17));
//		lblemail.setBounds(25, 145, 100, 20);
//
//		lblcnic = new JLabel("CNIC : ");
//		lblcnic.setFont(new Font("Serif", Font.PLAIN, 17));
//		lblcnic.setBounds(25, 195, 100, 20);
//
//		lblsetpass = new JLabel("Set Password : ");
//		lblsetpass.setFont(new Font("Serif", Font.PLAIN, 15));
//		lblsetpass.setBounds(25, 245, 100, 20);
//
//		lblconfirmpass = new JLabel("Confirm Password : ");
//		lblconfirmpass.setFont(new Font("Serif", Font.PLAIN, 15));
//		lblconfirmpass.setBounds(25, 295, 130, 20);
//
//		fieldusername = new JTextField();
//		fieldusername.setBounds(170, 95, 120, 20);
//
//		fieldemail = new JTextField();
//		fieldemail.setBounds(170, 145, 120, 20);
//
//
//		fieldcnic1 = new JTextField();
//		fieldcnic1.setDocument(new TextFieldLimit(5));
//		fieldcnic1.setBounds(170, 195, 55, 20);
//
//		lblcnic1 = new JLabel("_");
//		lblcnic1.setBounds(233, 190, 20, 20);
//
//		fieldcnic2 = new JTextField();
//		fieldcnic2.setDocument(new TextFieldLimit(7));
//		fieldcnic2.setBounds(245, 195, 80, 20);
//
//		lblcnic2 = new JLabel("_");
//		lblcnic2.setBounds(333, 190, 20, 20);
//
//		fieldcnic3 = new JTextField();
//		fieldcnic3.setDocument(new TextFieldLimit(1));
//		fieldcnic3.setBounds(347, 195, 30, 20);
//
//		pass = new JPasswordField();
//		pass.setBounds(170, 245, 120, 20);
//
//		confirmpass = new JPasswordField();
//		confirmpass.setBounds(170, 295, 120, 20);
//
//		btn1 = new JButton("Register");
//		btn1.setBounds(70, 355, 100, 25);
//		btn1.setForeground(Color.red);
//
//		btn3 = new JButton("Log IN");
//		btn3.setBounds(190, 355, 100, 25);
//		btn3.setForeground(Color.red);
//
//		btnMainMenu = new JButton("MainMenu");
//		btnMainMenu.setBounds(320, 355, 100, 25);
//		btnMainMenu.setForeground(Color.red);
//
//		l = new JLabel();
//		l.setForeground(Color.red);
//		l.setBounds(120, 37, 300, 40);
//
//		l2 = new JLabel();
//		l2.setForeground(Color.red);
//
//
//		l3 = new JLabel();
//		l3.setForeground(Color.red);
//
//		panel.setLayout(null);
//		panel.add(fieldusername);
//		panel.add(fieldemail);
//		panel.add(lblusername);
//		panel.add(lblemail);
//		panel.add(lblsetpass);
//		panel.add(pass);
//		panel.add(btn1);
//		panel.add(btnMainMenu);
//		panel.add(btn3);
//		panel.add(confirmpass);
//		panel.add(lblconfirmpass);
//		panel.add(lblcnic);
//		panel.add(fieldcnic1);
//		panel.add(fieldcnic2);
//		panel.add(fieldcnic3);
//		panel.add(lblcnic1);
//		panel.add(lblcnic2);
//		panel.add(l);
//		panel.add(l2);
//		panel.add(l3);
//		frame.add(panel);
//
//		btn1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String cnic = fieldcnic1.getText() + fieldcnic2.getText() + fieldcnic3.getText();
//
//				if (!fieldusername.getText().equals("") && !fieldemail.getText().equals("") && !pass.getText().equals("") && !confirmpass.getText().equals("") && !fieldcnic1.getText().equals("") && !fieldcnic2.getText().equals("") && !fieldcnic3.getText().equals("")) {
//					boolean accountexists = false;
//
//					for (Passenger object : MainMenu.listPassenger) {
//						if (fieldusername.getText().equals(object.getUsername()) || fieldemail.getText().equals(object.getEmail()) || cnic.equals(object.getCnic()) || pass.getText().equals(object.getPassword())) {
//							accountexists = true;
//							break;
//						}
//					}
//
//					if (accountexists == false) {
//
//						if (fieldusername.getText().length() >= 6) {
//							if (validEmail(fieldemail.getText()) == true) {
//								if (validCNIC(fieldcnic1.getText()) == true && validCNIC(fieldcnic2.getText()) == true && validCNIC(fieldcnic3.getText()) == true && cnic.length() == 13) {
//									if (validPassword(pass.getText()) == true && pass.getText().length() >= 8) {
//										if (pass.getText().equals(confirmpass.getText())) {
//											//formation of object of passengers class and composition
//
//											Passenger obj = new Passenger(fieldusername.getText(), fieldemail.getText(), cnic, pass.getText());
//											MainMenu.listPassenger.add(obj);
//											fieldusername.setText(null);
//											fieldemail.setText(null);
//											pass.setText(null);
//											confirmpass.setText(null);
//											fieldcnic1.setText(null);
//											fieldcnic2.setText(null);
//											fieldcnic3.setText(null);
//											l.setText(null);
//											l2.setText(null);
//											l3.setText(null);
//											JOptionPane msg = new JOptionPane();
//											msg.showMessageDialog(panel, "Account created Successfully!!", "Successful", JOptionPane.INFORMATION_MESSAGE);
//										} else {
//											l.setText("*Passwords do not match");
//											l2.setText(null);
//											l3.setText(null);
//										}
//									} else {
//										l2.setBounds(120, 47, 330, 40);
//										l3.setBounds(120, 57, 330, 40);
//										l.setText("*Password must have atleast 8 characters");
//										l2.setText("and should be a combination of uppercase,");
//										l3.setText("lowercase,digit and a special character");
//									}
//								} else {
//									l.setText("*Invalid CNIC");
//									l2.setText(null);
//									l3.setText(null);
//								}
//							} else {
//								l.setText("Invalid Email");
//							}
//						} else {
//							l.setText("*Username must have atleast 6 characters");
//							l2.setText(null);
//							l3.setText(null);
//						}
//					} else {
//						JOptionPane msg = new JOptionPane();
//						msg.showMessageDialog(panel, "Signup Failed: The attributes you entered are already occupied", "Unsuccessful", JOptionPane.INFORMATION_MESSAGE);
//						l.setText(null);
//						l2.setText(null);
//						l3.setText(null);
//					}
//				} else {
//					l.setText("*Fill all the Slots");
//					l2.setText(null);
//					l3.setText(null);
//				}
//
//			}
//		});
//
//		btn3.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new LogInScreen();
//			}
//		});
//
//		btnMainMenu.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//			}
//		});
//
//
//		frame.setBounds(100, 100, 500, 450);
//		frame.setVisible(true);
//	}
//
//}
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.LinkedList; // Import LinkedList
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import javax.swing.border.EtchedBorder;
//
//public class SignUpScreen {
//	private JFrame frame;
//	private JPanel panel, panel2;
//	private JLabel label1, lblusername, lblemail, lblsetpass, lblconfirmpass, lblcnic, lblcnic1, lblcnic2, l, l2, l3;
//	private JTextField fieldusername, fieldemail, fieldcnic1, fieldcnic2, fieldcnic3;
//	private JPasswordField pass, confirmpass;
//	private JButton btn1, btn3, btnMainMenu;
//
//	public SignUpScreen() {
//		frame = new JFrame("Sign Up");
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		panel = new JPanel();
//		panel.setBackground(new Color(216, 191, 216));
//
//		panel2 = new JPanel();
//		panel2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
//		panel2.setBounds(115, 11, 208, 35);
//		panel2.setBackground(new Color(255, 182, 193));
//		panel.add(panel2);
//
//		label1 = new JLabel("WELCOME : SIGN UP");
//		label1.setFont(new Font("Serif", Font.BOLD, 19));
//		label1.setBounds(90, 4, 200, 40);
//		panel2.add(label1);
//
//		lblusername = new JLabel("Username : ");
//		lblusername.setFont(new Font("Serif", Font.PLAIN, 17));
//		lblusername.setBounds(25, 95, 100, 25);
//
//		lblemail = new JLabel("Email : ");
//		lblemail.setFont(new Font("Serif", Font.PLAIN, 17));
//		lblemail.setBounds(25, 145, 100, 20);
//
//		lblcnic = new JLabel("CNIC : ");
//		lblcnic.setFont(new Font("Serif", Font.PLAIN, 17));
//		lblcnic.setBounds(25, 195, 100, 20);
//
//		lblsetpass = new JLabel("Set Password : ");
//		lblsetpass.setFont(new Font("Serif", Font.PLAIN, 15));
//		lblsetpass.setBounds(25, 245, 100, 20);
//
//		lblconfirmpass = new JLabel("Confirm Password : ");
//		lblconfirmpass.setFont(new Font("Serif", Font.PLAIN, 15));
//		lblconfirmpass.setBounds(25, 295, 130, 20);
//
//		fieldusername = new JTextField();
//		fieldusername.setBounds(170, 95, 120, 20);
//
//		fieldemail = new JTextField();
//		fieldemail.setBounds(170, 145, 120, 20);
//
//		fieldcnic1 = new JTextField();
//		fieldcnic1.setDocument(new TextFieldLimit(5));
//		fieldcnic1.setBounds(170, 195, 55, 20);
//
//		lblcnic1 = new JLabel("_");
//		lblcnic1.setBounds(233, 190, 20, 20);
//
//		fieldcnic2 = new JTextField();
//		fieldcnic2.setDocument(new TextFieldLimit(7));
//		fieldcnic2.setBounds(245, 195, 80, 20);
//
//		lblcnic2 = new JLabel("_");
//		lblcnic2.setBounds(333, 190, 20, 20);
//
//		fieldcnic3 = new JTextField();
//		fieldcnic3.setDocument(new TextFieldLimit(1));
//		fieldcnic3.setBounds(347, 195, 30, 20);
//
//		pass = new JPasswordField();
//		pass.setBounds(170, 245, 120, 20);
//
//		confirmpass = new JPasswordField();
//		confirmpass.setBounds(170, 295, 120, 20);
//
//		btn1 = new JButton("Register");
//		btn1.setBounds(70, 355, 100, 25);
//		btn1.setForeground(Color.red);
//
//		btn3 = new JButton("Log IN");
//		btn3.setBounds(190, 355, 100, 25);
//		btn3.setForeground(Color.red);
//
//		btnMainMenu = new JButton("MainMenu");
//		btnMainMenu.setBounds(320, 355, 100, 25);
//		btnMainMenu.setForeground(Color.red);
//
//		l = new JLabel();
//		l.setForeground(Color.red);
//		l.setBounds(120, 37, 300, 40);
//
//		l2 = new JLabel();
//		l2.setForeground(Color.red);
//
//		l3 = new JLabel();
//		l3.setForeground(Color.red);
//
//		panel.setLayout(null);
//		panel.add(fieldusername);
//		panel.add(fieldemail);
//		panel.add(lblusername);
//		panel.add(lblemail);
//		panel.add(lblsetpass);
//		panel.add(pass);
//		panel.add(btn1);
//		panel.add(btnMainMenu);
//		panel.add(btn3);
//		panel.add(confirmpass);
//		panel.add(lblconfirmpass);
//		panel.add(lblcnic);
//		panel.add(fieldcnic1);
//		panel.add(fieldcnic2);
//		panel.add(fieldcnic3);
//		panel.add(lblcnic1);
//		panel.add(lblcnic2);
//		panel.add(l);
//		panel.add(l2);
//		panel.add(l3);
//		frame.add(panel);
//
//		btn1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String cnic = fieldcnic1.getText() + fieldcnic2.getText() + fieldcnic3.getText();
//
//				if (!fieldusername.getText().equals("") && !fieldemail.getText().equals("") && !pass.getText().equals("")
//						&& !confirmpass.getText().equals("") && !fieldcnic1.getText().equals("")
//						&& !fieldcnic2.getText().equals("") && !fieldcnic3.getText().equals("")) {
//					boolean accountexists = false;
//
//					for (Passenger object : MainMenu.listPassenger) {
//						if (fieldusername.getText().equals(object.getUsername())
//								|| fieldemail.getText().equals(object.getEmail()) || cnic.equals(object.getCnic())
//								|| pass.getText().equals(object.getPassword())) {
//							accountexists = true;
//							break;
//						}
//					}
//
//					if (accountexists == false) {
//
//						if (fieldusername.getText().length() >= 6) {
//							if (validEmail(fieldemail.getText()) == true) {
//								if (validCNIC(fieldcnic1.getText()) == true && validCNIC(fieldcnic2.getText()) == true
//										&& validCNIC(fieldcnic3.getText()) == true && cnic.length() == 13) {
//									if (validPassword(pass.getText()) == true && pass.getText().length() >= 8) {
//										if (pass.getText().equals(confirmpass.getText())) {
//											// formation of object of passengers class and composition
//
//											Passenger obj = new Passenger(fieldusername.getText(), fieldemail.getText(),
//													cnic, pass.getText());
//											MainMenu.listPassenger.add(obj);
//											fieldusername.setText(null);
//											fieldemail.setText(null);
//											pass.setText(null);
//											confirmpass.setText(null);
//											fieldcnic1.setText(null);
//											fieldcnic2.setText(null);
//											fieldcnic3.setText(null);
//											l.setText(null);
//											l2.setText(null);
//											l3.setText(null);
//											JOptionPane msg = new JOptionPane();
//											msg.showMessageDialog(panel, "Account created Successfully!!", "Successful",
//													JOptionPane.INFORMATION_MESSAGE);
//										} else {
//											l.setText("*Passwords do not match");
//											l2.setText(null);
//											l3.setText(null);
//										}
//									} else {
//										l2.setBounds(120, 47, 330, 40);
//										l3.setBounds(120, 57, 330, 40);
//										l.setText("*Password must have atleast 8 characters");
//										l2.setText("and should be a combination of uppercase,");
//										l3.setText("lowercase, digit and a special character");
//									}
//								} else {
//									l.setText("*Invalid CNIC");
//									l2.setText(null);
//									l3.setText(null);
//								}
//							} else {
//								l.setText("*Invalid Email");
//							}
//						} else {
//							l.setText("*Username must have atleast 6 characters");
//							l2.setText(null);
//							l3.setText(null);
//						}
//					} else {
//						l.setText("*Fill all the Slots");
//						l2.setText(null);
//						l3.setText(null);
//					}
//				}
//			}
//		});
//
//		btn3.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//				new LogInScreen();
//			}
//		});
//
//		btnMainMenu.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//			}
//		});
//
//		frame.setBounds(100, 100, 500, 450);
//		frame.setVisible(true);
//	}
//	//Method for the validation of CNIC
//	public boolean validCNIC(String str)
//	{
//		char [] array = str.toCharArray();
//
//		boolean isValid=true;
//
//		for (char character : array)
//		{
//			if (Character.isDigit(character)==false)
//			{
//				isValid=false;
//				break;
//			}
//		}
//		return isValid;
//	}
//
//	//Method for the validation of Password
//
//	public boolean validPassword(String str)
//	{
//		char [] array = str.toCharArray();
//		boolean capital=false,small=false,digit=false,special=false;
//
//		for (char character : array)
//		{
//			if (Character.isUpperCase(character)==true)
//			{
//				capital=true;
//				break;
//			}
//		}
//		for (char character : array)
//		{
//			if (Character.isLowerCase(character)==true)
//			{
//				small=true;
//				break;
//			}
//		}
//		for (char character : array)
//		{
//			if (Character.isDigit(character)==true)
//			{
//				digit=true;
//				break;
//			}
//		}
//		for (char character : array)
//		{
//			if (Character.isDigit(character)==false && Character.isLetter(character)==false
//					&& Character.isWhitespace(character)==false)
//			{
//				special=true;
//				break;
//			}
//		}
//
//		if (capital==true && small==true && digit==true && special==true)
//			return true;
//
//		else
//			return false;
//	}
//
//	// Function for the valid email verification
//
//	public boolean validEmail(String str)
//	{
//		if (str.contains("@") && (str.contains(".com") || str.contains(".pk")))
//		{
//			char [] array = str.toCharArray();
//			boolean letter = false;
//
//			for (char c : array)
//			{
//				if (Character.isLetter(c))
//				{
//					letter=true;
//					break;
//				}
//
//			}
//
//			if (letter==true)
//				return true;
//
//			else
//				return false;
//		}
//		else
//		{
//			return false;
//		}
//	}
//
//}










