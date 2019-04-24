package HotelAdmin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Customer_Info extends JFrame {

	protected static final AbstractButton Table = null;
	protected static final JTable model = null;
	protected static final JTable Jtable = null;
	String gender;
	/*public Customer_Info()
	{
		countComponents();
	}*/
	
	
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_4;
	private JTable table_2;

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
			
			}});}

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
		
		JLabel lblAddress = new JLabel("Address");
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
		
		JLabel lblPstalCode = new JLabel("mobile_no");
		lblPstalCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPstalCode.setBounds(23, 204, 86, 14);
		contentPane.add(lblPstalCode);
		
		JLabel lblTelNo = new JLabel("gender");
		lblTelNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelNo.setBounds(38, 243, 80, 14);
		contentPane.add(lblTelNo);
		
		JLabel lblEmail = new JLabel("room_type");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(38, 285, 80, 14);
		contentPane.add(lblEmail);
		
		JLabel lblGender = new JLabel("email");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(41, 322, 62, 14);
		contentPane.add(lblGender);
		
		JLabel lblRoomType = new JLabel("postal_code");
		lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRoomType.setBounds(23, 354, 80, 19);
		contentPane.add(lblRoomType);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(128, 203, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(128, 242, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(128, 284, 86, 20);
		contentPane.add(textField_7);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(138, 355, 86, 20);
		contentPane.add(textField_10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 90, 484, 326);
		contentPane.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con;
				try { 
					
					con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/hotelmang","root","1403");
					String query="insert into customer(id,firstname,lastname,adress,mobile_no,gender,room_type,email,postal_code)values(?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst =con.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, textField_1.getText());
					pst.setString(3, textField_2.getText());
					pst.setString(4, textField_3.getText());
					pst.setString(5, textField_5.getText());
					pst.setString(6, textField_6.getText());
					pst.setString(7, textField_7.getText());
					pst.setString(8, textField_4.getText());
					pst.setString(9, textField_10.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "data saved");
					pst.close();
					
				}catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();}
			}});
		btnNewButton.setBounds(272, 432, 102, 47);
		contentPane.add(btnNewButton);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					Connection con;
					con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/hotelmang","root","1403");
					String query="select * from customer";
					DefaultTableModel model= new DefaultTableModel();
					model.addColumn("id");
					model.addColumn("firstname");
					model.addColumn("lastname");
					model.addColumn("adress");
					model.addColumn("mobile_no");
					model.addColumn("gender");
					model.addColumn("room_type");
					model.addColumn("email");
					model.addColumn("postal_code");
					Statement st = con.createStatement();
				st.execute(query);
				 ResultSet res=st.executeQuery(query);
		         while (res.next()) {
		      	   
			              model.addRow(new Object [] {
			            		  res.getInt("id"),
			            		  res.getString("firstname"),
			            		  res.getString("lastname"),
			            		  res.getString("adress"),
			            		  res.getInt("mobile_no"),
			            		  res.getString("gender"),
			            		  res.getString("room_type"),
			  					res.getString("email"),
			  					 res.getInt("postal_code")
			              });
		         }
		         res.close();
		         st.close();
		         con.close();
		          table_2.setModel(model);
					table_2.setAutoResizeMode(0);
					table_2.getColumnModel().getColumn(0).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(1).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(2).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(3).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(4).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(5).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(6).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(7).setPreferredWidth(100);
					table_2.getColumnModel().getColumn(8).setPreferredWidth(100);
		         }catch(SQLException e1) {
				
					e1.printStackTrace();
			}
							
					   
					    
					    }});	
			
				
		btnShow.setBounds(390, 432, 102, 47);
		contentPane.add(btnShow);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				room c = new room();
				c.setVisible(true);
				dispose();
				
		
			}});
		btnNext.setBounds(448, 502, 102, 47);
		contentPane.add(btnNext);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int rowToRemove = 0;
				((DefaultTableModel)table_2.getModel()).removeRow(rowToRemove);
			
			}
		});
		btnReset.setBounds(614, 435, 102, 39);
		contentPane.add(btnReset);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i= table_2.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table_2.getModel();
				if(i>=0) {
					model.setValueAt(textField.getText(), i, 0);
					model.setValueAt(textField_1.getText(), i, 1);
					model.setValueAt(textField_2.getText(), i, 2);
					model.setValueAt(textField_3.getText(), i, 3);
					model.setValueAt(textField_5.getText(), i, 4);
					model.setValueAt(textField_6.getText(), i, 5);
					model.setValueAt(textField_7.getText(), i, 6);
					model.setValueAt(textField_4.getText(), i, 7);
					model.setValueAt(textField_10.getText(),i,8);
					JOptionPane.showMessageDialog(null, "updated");
				}else {
					JOptionPane.showMessageDialog(null, "error");
				}
}           
					
				
			
		});
		btnUpdate.setBounds(502, 432, 102, 47);
		contentPane.add(btnUpdate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(128, 321, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}}
