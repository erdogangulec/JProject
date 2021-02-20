package sezarsifre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtifrelenmiMetin;
	private JLabel lblNewLabel_2;
	private JTextField txtifrelenecekMetin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 frame = new form1();
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
	public form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtifrelenecekMetin = new JTextField();
		txtifrelenecekMetin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtifrelenecekMetin.setText("\u015Eifrelenecek Metin");
		txtifrelenecekMetin.setBounds(10, 11, 229, 20);
		contentPane.add(txtifrelenecekMetin);
		txtifrelenecekMetin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kayd\u0131rma say\u0131s\u0131");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(20, 42, 81, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.setBounds(94, 42, 36, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u015E\u0130FRELE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(140, 38, 89, 20);
		contentPane.add(btnNewButton);
		
		txtifrelenmiMetin = new JTextField();
		txtifrelenmiMetin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtifrelenmiMetin.setText("\u015Eifrelenmi\u015F Metin");
		txtifrelenmiMetin.setBounds(10, 69, 229, 20);
		contentPane.add(txtifrelenmiMetin);
		txtifrelenmiMetin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("abc\u00E7defg\u011Fhi\u0131jklmno\u00F6prs\u015Ftu\u00FCvyz");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 100, 229, 20);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("abc\u00E7defg\u011Fhi\u0131jklmno\u00F6prs\u015Ftu\u00FCvyz");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 131, 229, 20);
		contentPane.add(lblNewLabel_2);
	
		txtifrelenecekMetin.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
			}
		});
	
	
	}
}
