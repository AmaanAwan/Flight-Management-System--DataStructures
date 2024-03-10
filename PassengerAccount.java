import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

//public class PassengerAccount extends JFrame {
//
//	private JPanel panel,panel2;
//	private JLabel label,imagelabel;
//	private Passenger object;
//	private JButton btnBook;
//	private JButton btnSchedule;
//	private JButton btnSettings;
//	private JLabel labeltag;
//	private JButton btnLogout;
//	private JButton btnYourBookings;
//
//	public PassengerAccount(Passenger object)
//	{
//		this.object=object;
//		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//		setBounds(100, 100, 500, 450);
//		panel = new JPanel();
//		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
//		panel.setBackground(new Color (216,191,216));
//		getContentPane().add(panel);
//		panel.setLayout(null);
//
//		panel2 = new JPanel();
//		panel2.setBounds(98, 11, 264, 39);
//		panel2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
//		panel2.setBackground(new Color(255,182,193));
//		panel.add(panel2);
//
//		label = new JLabel("Welcome  "+object.getUsername());
//		panel2.add(label);
//		label.setFont(new Font("Tahoma", Font.BOLD, 19));
//
//
//
//		btnBook = new JButton("Book a Flight");
//		btnBook.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				new BookingFrame(object);
//			}
//		});
//		btnBook.setForeground(Color.BLUE);
//		btnBook.setBounds(10, 113, 140, 65);
//		panel.add(btnBook);
//
//		btnSchedule = new JButton("Flight Schedule");
//		btnSchedule.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				new DisplaySchedule();
//			}
//		});
//		btnSchedule.setForeground(Color.BLUE);
//		btnSchedule.setBounds(174, 109, 140, 32);
//		panel.add(btnSchedule);
//
//
//
//		labeltag = new JLabel("Explore The World With Us");
//		labeltag.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
//		labeltag.setForeground(Color.RED);
//		labeltag.setBounds(134, 61, 203, 24);
//		panel.add(labeltag);
//
//
//
//		btnYourBookings = new JButton("Your Bookings");
//		btnYourBookings.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				new YourBookings();
//			}
//		});
//		btnYourBookings.setForeground(Color.BLUE);
//		btnYourBookings.setBounds(174, 146, 140, 32);
//		panel.add(btnYourBookings);
//
//		setTitle("Welcome to your Account");
//		setVisible(true);
//
//	}
//
//}
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class PassengerAccount extends JFrame {

	private JPanel panel, panel2;
	private JLabel label, imagelabel;
	private Passenger object;
	private JButton btnBook;
	private JButton btnSchedule;
	private JButton btnSettings;
	private JLabel labeltag;
	private JButton btnLogout;
	private JButton btnYourBookings;

	public PassengerAccount(Passenger object) {
		this.object = object;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(216, 191, 216));
		getContentPane().add(panel);
		panel.setLayout(null);

		panel2 = new JPanel();
		panel2.setBounds(98, 11, 264, 39);
		panel2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel2.setBackground(new Color(255, 182, 193));
		panel.add(panel2);

		label = new JLabel("Welcome  " + object.getUsername());
		panel2.add(label);
		label.setFont(new Font("Tahoma", Font.BOLD, 19));

		btnBook = new JButton("Book a Flight");
		btnBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BookingFrame(object);
			}
		});
		btnBook.setForeground(Color.RED);
		btnBook.setBounds(180, 259, 140, 32);
		panel.add(btnBook);

		btnSchedule = new JButton("Flight Schedule");
		btnSchedule.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new DisplaySchedule();
			}
		});
		btnSchedule.setForeground(Color.BLUE);
		btnSchedule.setBounds(180, 159, 140, 32);
		panel.add(btnSchedule);

		labeltag = new JLabel("Explore The World With Us :)");
		labeltag.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 16));
		labeltag.setForeground(Color.RED);
		labeltag.setBounds(134, 61, 203, 24);
		panel.add(labeltag);

		btnYourBookings = new JButton("Your Bookings");
		btnYourBookings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new YourBookings();
			}
		});
		btnYourBookings.setForeground(Color.BLUE);
		btnYourBookings.setBounds(180 , 209, 140, 32);
		panel.add(btnYourBookings);

		setTitle("Welcome to your Account");
		setVisible(true);
		setResizable (false);
	}
}