package HotelAdmin;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.CallableStatement;

public class Costs<NewJPanel> extends JFrame {

	protected static final int HIGHT = 0;
	private JPanel contentPane;
	private JTextField tax;
	private JTextField rom;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Costs frame = new Costs();
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
	public Costs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Tax:");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(47, 118, 103, 30);
		contentPane.add(label);
		
		JLabel lblRoomtype = new JLabel("roomType");
		lblRoomtype.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRoomtype.setBounds(34, 180, 130, 30);
		contentPane.add(lblRoomtype);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTotal.setBounds(34, 221, 130, 30);
		contentPane.add(lblTotal);
		
		tax = new JTextField();
		tax.setBounds(208, 102, 182, 46);
		contentPane.add(tax);
		tax.setColumns(10);
		
		rom = new JTextField();
		rom.setColumns(10);
		rom.setBounds(208, 165, 182, 46);
		contentPane.add(rom);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 236, 182, 46);
		contentPane.add(textField_2);
		final TextField tf=new TextField();		   
		JButton btnNewButton = new JButton("Total Cost");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Connection con;
				try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/hotelmang","root","1403");
				 java.sql.CallableStatement cs = con.prepareCall("{? = call taxsum(?)}");{
					 cs.registerOutParameter(1, Types.INTEGER);
					 cs.setString(2,rom.getText());
		
				   
				    cs.execute();
				    String retValue = cs.getString(1); 
				    tax.setText(retValue);
				   cs.close();} 
				
				 

				}catch(SQLException e1) {
				e1.printStackTrace();
				}
		}});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(166, 333, 123, 54);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tax.setText("");
				rom.setText("");
				textField_2.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReset.setBounds(346, 333, 103, 54);
		contentPane.add(btnReset);
		
		final JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(btnExit,"if you want to exit","Hotel Management System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnExit.setBounds(520, 333, 103, 54);
		contentPane.add(btnExit);
		
	
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				this.hide();
				Customer_Info frm=new Customer_Info();
				frm.setVisible(true);
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}
		});
		Back.setBounds(34, 352, 89, 23);
		contentPane.add(Back);
	}

	protected Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}