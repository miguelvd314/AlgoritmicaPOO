import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String ops0="";
	private String ops1="";
	
	private String op="";
	private JTable table;
	//protected AbstractButton textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setBounds(135, 65, 53, 23);
		panel.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 404, 43);
		panel.add(textArea);
		textArea.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(72, 65, 53, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("7");
		btnNewButton_1_1.setBounds(10, 65, 53, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("6");
		btnNewButton_1_2.setBounds(135, 99, 53, 23);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1_3.setBounds(72, 99, 53, 23);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op.equals("")) {
					ops0=ops0+"4";
					textArea.setText(ops0);
				}else {
					ops1=ops1+"4";
					textArea.setText(ops1);
				}
			}
		});
		btnNewButton_1_4.setBounds(10, 99, 53, 23);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("3");
		btnNewButton_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op.equals("")) {
					ops0=ops0+"3";
					textArea.setText(ops0);
				}else {
					ops1=ops1+"3";
					textArea.setText(ops1);
				}
			}
		});
		btnNewButton_1_5.setBounds(135, 133, 53, 23);
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("2");
		btnNewButton_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op.equals("")) {
					ops0=ops0+"2";
					textArea.setText(ops0);
				}else {
					ops1=ops1+"2";
					textArea.setText(ops1);
				}
			}
		});
		btnNewButton_1_6.setBounds(72, 133, 53, 23);
		panel.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("1");
		btnNewButton_1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op.equals("")) {
					ops0=ops0+"1";
					textArea.setText(ops0);
				}else {
					ops1=ops1+"1";
					textArea.setText(ops1);
				}
			}
			
			
		});
		btnNewButton_1_7.setBounds(10, 133, 53, 23);
		panel.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("0");
		btnNewButton_1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(op.equals("")) {
					ops0=ops0+"0";
					textArea.setText(ops0);
				}else {
					ops1=ops1+"0";
					textArea.setText(ops1);
				}
			}
		});
		btnNewButton_1_8.setBounds(72, 166, 53, 23);
		panel.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_8_1 = new JButton("=");
		btnNewButton_1_8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = 0;
				switch(op) {
				case "+":
					result = Integer.parseInt(ops0) + Integer.parseInt(ops1);
				}
				textArea.setText(""+result);
			}
		});
		btnNewButton_1_8_1.setBounds(135, 166, 53, 23);
		panel.add(btnNewButton_1_8_1);
		
		JButton btnNewButton_1_8_2 = new JButton("+");
		btnNewButton_1_8_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op="+";
				textArea.setText("");
			}
		});
		btnNewButton_1_8_2.setBounds(198, 65, 53, 23);
		panel.add(btnNewButton_1_8_2);
		
		JButton btnNewButton_1_8_3 = new JButton("-");
		btnNewButton_1_8_3.setBounds(198, 99, 53, 23);
		panel.add(btnNewButton_1_8_3);
		
		JButton btnNewButton_1_8_4 = new JButton("x");
		btnNewButton_1_8_4.setBounds(198, 133, 53, 23);
		panel.add(btnNewButton_1_8_4);
		
		JButton btnNewButton_1_8_5 = new JButton("/");
		btnNewButton_1_8_5.setBounds(198, 166, 53, 23);
		panel.add(btnNewButton_1_8_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 210, 341, 136);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String [] {
					"Title1", "Title2", "Title3", "Title4"
				}
		));
	
		scrollPane.setViewportView(table);
		table.setValueAt(aValue, row, column);
	}
}
