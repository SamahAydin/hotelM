package HotelAdmin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	protected static final JLabel RoomNo = null;
	protected static final String query = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Room");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(170, 21, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("cus_ID");
		lblNewLabel_1.setBounds(10, 56, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RoomNo");
		lblNewLabel_2.setBounds(10, 93, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Room_type");
		lblNewLabel_3.setBounds(10, 120, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rate");
		lblNewLabel_4.setBounds(10, 158, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			private JLabel roomType;
			private JLabel rate;
			private JLabel id;
			private String textFieldid;
			private String textFieldrtype;
			private String textFieldrate;
			private String textFieldrno;

			public void actionPerformed(ActionEvent e) {
				Connection connection ;
				
				
				try {
					connection = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/hotelmang","root","1403");
					String query="insert into room (id,room_no,room_type,rate) Values(?,?,?,?)";
					PreparedStatement pst =connection.prepareStatement(query);
					pst.setString(1,textField.getText());
					pst.setString(2,textField_1.getText());
					pst.setString(3,textField_2.getText());
					pst.setString(4,textField_3.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "data Added");
					pst.close();
					
				}catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		   
			}});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnNewButton.setBounds(10, 199, 89, 23);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("show");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		try {
			Connection con;
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hotelmang","root","1403");
			String query="select * from room ";
			DefaultTableModel table = new DefaultTableModel();
			table.addColumn("id");
			table.addColumn("room_no");
			table.addColumn("room_type");
			table.addColumn("rate");
			Statement st = con.createStatement();
		st.execute(query);
		 ResultSet res=st.executeQuery(query);
         while (res.next()) {
      	   
	              table.addRow(new Object [] {
	            		  res.getInt("id"),
	            		  res.getInt("room_no"),
	            		  res.getString("room_type"),
	            		  res.getInt("rate")
	              });
         }
         res.close();
         st.close();
         con.close();
         }catch(SQLException e1) {
		
			e1.printStackTrace();
	}
					
			   
			    
			    }});
	
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnNewButton_1.setBounds(107, 199, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnNewButton_2.setBounds(107, 233, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("next");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnNewButton_3.setBounds(10, 233, 89, 23);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(86, 53, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 90, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 117, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(86, 155, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(206, 67, 218, 155);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	
		table.setFillsViewportHeight(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(new Object[][] {
		},
		new String[] {
			"id", "room_no", "room_type", "rate"}));
		
		// TODO Auto-generated constructor stub
		}}
