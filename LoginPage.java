package HotelAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;
	private final JPasswordField passwordField = new JPasswordField();
	private JLabel lblLoginPage;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		getContentPane().setLayout(null);
		passwordField.setBounds(135, 136, 75, 31);
		getContentPane().add(passwordField);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(136, 66, 86, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setText("");
		password.setBounds(136, 128, 86, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection connection;
try {
	connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/hotelmang","root","1403");
	Statement state=connection.createStatement();
	String sql="Select * From login where password='"+password.getText()+"'and username='"+username.getText()+"'";
	ResultSet result = state.executeQuery(sql);
	if (result.next()) {
	
	JOptionPane.showMessageDialog(null,"Login sucessfully");
	MainPage main = new MainPage();
	main.setVisible(true);
	
	}
	 else
	
	 {	JOptionPane.showMessageDialog(null,"incorrect password or username");
	}
	state.close();
	result.close();
	connection.close();
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

}


			
		});
		btnLogin.setBounds(80, 195, 89, 23);
		contentPane.add(btnLogin);
		
		lblLoginPage = new JLabel("Login page");
		lblLoginPage.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblLoginPage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginPage.setBounds(183, 11, 94, 20);
		contentPane.add(lblLoginPage);
		
		lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(23, 69, 71, 14);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(23, 131, 71, 17);
		contentPane.add(lblPassword);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCancel.setBounds(215, 197, 89, 23);
		contentPane.add(btnCancel);
	}
}
