package hotel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Customer_Info extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Info frame = new Customer_Info();
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
	public Customer_Info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(128, 53, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Customer_ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 54, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstname.setBounds(23, 91, 86, 14);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("Lastname:");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastname.setBounds(23, 130, 86, 14);
		contentPane.add(lblLastname);
		
		JLabel lblAddress = new JLabel("Address1:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(23, 167, 86, 14);
		contentPane.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 88, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 127, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 164, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblCustomerinfo = new JLabel("Customer_Info");
		lblCustomerinfo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCustomerinfo.setBounds(322, 11, 160, 30);
		contentPane.add(lblCustomerinfo);
		
		JLabel lblAddress_1 = new JLabel("Address2:");
		lblAddress_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress_1.setBounds(23, 206, 80, 14);
		contentPane.add(lblAddress_1);
		
		JLabel lblPstalCode = new JLabel("Pstal Code:");
		lblPstalCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPstalCode.setBounds(23, 254, 86, 14);
		contentPane.add(lblPstalCode);
		
		JLabel lblTelNo = new JLabel("Tel. no.:");
		lblTelNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelNo.setBounds(23, 299, 80, 14);
		contentPane.add(lblTelNo);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(23, 341, 80, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNationality = new JLabel("Nationality:");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationality.setBounds(23, 387, 80, 14);
		contentPane.add(lblNationality);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(23, 472, 62, 14);
		contentPane.add(lblGender);
		
		JLabel lblRoomType = new JLabel("Room Type:");
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRoomType.setBounds(23, 514, 80, 19);
		contentPane.add(lblRoomType);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(128, 203, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(128, 251, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(128, 296, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(128, 338, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(128, 384, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(128, 471, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(128, 515, 86, 20);
		contentPane.add(textField_10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 90, 484, 326);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Customer_ID", "Firstname", "Surname", "Address1", "Address2", "Post Code", "Tel No", "Email", "Nationality", "Date of Birth", "Gender", "Room Type"
			
	}
));
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(23, 432, 86, 14);
		contentPane.add(lblDateOfBirth);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(128, 431, 86, 20);
		contentPane.add(textField_11);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBounds(278, 458, 102, 47);
		contentPane.add(btnNewButton);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.setBounds(417, 458, 102, 47);
		contentPane.add(btnShow);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(597, 458, 102, 47);
		contentPane.add(btnNext);
}}