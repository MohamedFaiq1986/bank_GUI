package bank_g;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUI {

	private JFrame frame;
	public JTextField t_id;
	public JTextField t_name;
	public JTextField t_amount;
	public JTextField t_phone;
	public JTextField t_address;
	public JTextField t_add_balance;
	public JTextField textField;
	public JTextField t_q;
	public JTextField t_v_id;
	public JTextField t_v_name;
	public JTextField t_v_amount;
	public JTextField t_v_phone;
	public JTextField t_v_address;
	JPanel p_list;
	JPanel p_add_customer;
	JPanel p_add_balance;
	JPanel p_withdraw;
	JPanel p_query;
	JPanel p_info_gustomer;
	public int[] acc_no = new int[5];;  
	public String[] name=new String[5];;  
	public float [] amount = new float[5];  
	public String[] phone=new String[5];
	public String[] adress=new String[5];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		 p_list = new JPanel();
		frame.getContentPane().add(p_list, "name_112038329612261");
		p_list.setLayout(null);
		
		JButton b_add_inof = new JButton("\u0623\u0636\u0627\u0641\u0629 \u0632\u0628\u0648\u0646");
		
		b_add_inof.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_list.setVisible(false);
				p_add_customer.setVisible(true);
				
			}
		});
		b_add_inof.setBounds(34, 50, 101, 23);
		p_list.add(b_add_inof);
		
		JButton b_info = new JButton("\u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0632\u0628\u0648\u0646");
		b_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_list.setVisible(false);
				p_info_gustomer.setVisible(true);
			}
		});
		b_info.setBounds(34, 133, 101, 23);
		p_list.add(b_info);
		
		JButton b_add_p = new JButton("\u0623\u064A\u062F\u0627\u0639");
		b_add_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_list.setVisible(false);
				p_add_balance.setVisible(true);
			}
		});
		b_add_p.setBounds(287, 50, 109, 23);
		p_list.add(b_add_p);
		
		JButton b_w = new JButton("\u0633\u062D\u0628 \u0645\u0646 \u0631\u0635\u064A\u062F");
		b_w.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_list.setVisible(false);
				p_withdraw.setVisible(true);
			}
		});
		b_w.setBounds(287, 133, 109, 23);
		p_list.add(b_w);
		
		JButton b_Q = new JButton("\u0627\u0633\u062A\u0639\u0644\u0627\u0645 \u0639\u0646 \u0627\u0644\u0631\u0635\u064A\u062F");
		b_Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_list.setVisible(false);
				p_query.setVisible(true);
			}
		});
		b_Q.setBounds(151, 94, 126, 23);
		p_list.add(b_Q);
		
		 p_add_customer = new JPanel();
		frame.getContentPane().add(p_add_customer, "name_108769770256495");
		p_add_customer.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(29, 11, 46, 25);
		p_add_customer.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(29, 47, 80, 21);
		p_add_customer.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("amount");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(29, 79, 61, 21);
		p_add_customer.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("phone");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(29, 117, 61, 21);
		p_add_customer.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("address");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(29, 161, 61, 14);
		p_add_customer.add(lblNewLabel_4);
		
		t_id = new JTextField();
		t_id.setBounds(119, 8, 142, 28);
		p_add_customer.add(t_id);
		t_id.setColumns(10);
		
		t_name = new JTextField();
		t_name.setBounds(119, 44, 142, 24);
		p_add_customer.add(t_name);
		t_name.setColumns(10);
		
		t_amount = new JTextField();
		t_amount.setBounds(119, 76, 142, 24);
		p_add_customer.add(t_amount);
		t_amount.setColumns(10);
		
		t_phone = new JTextField();
		t_phone.setBounds(119, 114, 142, 24);
		p_add_customer.add(t_phone);
		t_phone.setColumns(10);
		
		t_address = new JTextField();
		t_address.setBounds(119, 149, 142, 31);
		p_add_customer.add(t_address);
		t_address.setColumns(10);
		
		JButton b_save = new JButton("SAVE");
		b_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acc_no[0]=t_id.getColumns();
				
				name[0]=t_name.getText();
				amount[0]=t_amount.getAlignmentX();
				phone[0]=t_phone.getText();
				adress[0]=t_address.getText();
			
			}
		});
		b_save.setBounds(119, 215, 89, 23);
		p_add_customer.add(b_save);
		
		JButton b_cancel = new JButton("CANCEL");
		b_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_add_customer.setVisible(false);
				p_list.setVisible(true);
			}
		});
		b_cancel.setBounds(294, 215, 89, 23);
		p_add_customer.add(b_cancel);
		
		 p_add_balance = new JPanel();
		frame.getContentPane().add(p_add_balance, "name_108778139477993");
		p_add_balance.setLayout(null);
		
		JButton b_b_p_add = new JButton("\u0631\u062C\u0648\u0639");
		b_b_p_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_add_balance.setVisible(false);
				p_list.setVisible(true);
			}
		});
		b_b_p_add.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b_b_p_add.setBounds(271, 216, 89, 23);
		p_add_balance.add(b_b_p_add);
		
		JButton b_add_balance = new JButton("\u0623\u064A\u062F\u0627\u0639");
		b_add_balance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		b_add_balance.setBounds(127, 216, 89, 23);
		p_add_balance.add(b_add_balance);
		
		JLabel lblNewLabel_5 = new JLabel("\u0627\u0644\u0645\u0628\u0644\u063A ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(40, 101, 70, 32);
		p_add_balance.add(lblNewLabel_5);
		
		t_add_balance = new JTextField();
		t_add_balance.setBounds(163, 106, 105, 27);
		p_add_balance.add(t_add_balance);
		t_add_balance.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u0627\u0643\u062A\u0628 \u0627\u0644\u0645\u0628\u0644\u063A \u0627\u0644\u0630\u064A \u062A\u0631\u064A\u062F \u0623\u064A\u062F\u0627\u0639\u0647");
		lblNewLabel_6.setForeground(UIManager.getColor("ToolBar.dockingForeground"));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(142, 46, 218, 32);
		p_add_balance.add(lblNewLabel_6);
		
		 p_withdraw = new JPanel();
		frame.getContentPane().add(p_withdraw, "name_108789370746161");
		p_withdraw.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("\u0627\u0644\u0645\u0628\u0644\u063A");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(49, 87, 62, 23);
		p_withdraw.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(171, 84, 86, 20);
		p_withdraw.add(textField);
		textField.setColumns(10);
		
		JButton b_wi = new JButton("\u0633\u062D\u0628");
		b_wi.setBounds(106, 213, 89, 23);
		p_withdraw.add(b_wi);
		
		JButton p_b_p_add = new JButton("\u0631\u062C\u0648\u0639");
		p_b_p_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_withdraw.setVisible(false);
				p_list.setVisible(true);
			}
		});
		p_b_p_add.setBounds(265, 213, 89, 23);
		p_withdraw.add(p_b_p_add);
		
		JLabel lblNewLabel_8 = new JLabel("\u0627\u0644\u0645\u0628\u0644\u063A \u0627\u0644\u0630\u064A \u062A\u0631\u064A\u062F \u0633\u062D\u0628\u0647");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(171, 42, 149, 31);
		p_withdraw.add(lblNewLabel_8);
		
		 p_query = new JPanel();
		frame.getContentPane().add(p_query, "name_108792490825539");
		p_query.setLayout(null);
		
		JButton p_b_p_list = new JButton("\u0631\u062C\u0648\u0639");
		p_b_p_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_query.setVisible(false);
				p_list.setVisible(true);
			}
		});
		p_b_p_list.setBounds(161, 205, 89, 23);
		p_query.add(p_b_p_list);
		
		JLabel lblNewLabel_9 = new JLabel("\u0631\u0635\u064A\u062F\u0643 \u0647\u0648 :");
		lblNewLabel_9.setBounds(305, 97, 89, 14);
		p_query.add(lblNewLabel_9);
		
		t_q = new JTextField();
		t_q.setBounds(138, 94, 112, 31);
		p_query.add(t_q);
		t_q.setColumns(10);
		
		 p_info_gustomer = new JPanel();
		frame.getContentPane().add(p_info_gustomer, "name_108825117749277");
		p_info_gustomer.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("ID");
		lblNewLabel_10.setBounds(38, 25, 46, 14);
		p_info_gustomer.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("name");
		lblNewLabel_11.setBounds(38, 69, 46, 14);
		p_info_gustomer.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("amount");
		lblNewLabel_12.setBounds(38, 109, 46, 14);
		p_info_gustomer.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("phone");
		lblNewLabel_13.setBounds(38, 160, 46, 14);
		p_info_gustomer.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("address");
		lblNewLabel_14.setBounds(38, 202, 46, 14);
		p_info_gustomer.add(lblNewLabel_14);
		
		t_v_id = new JTextField(t_id.getColumns());
		t_v_id.setBounds(126, 22, 129, 29);
		p_info_gustomer.add(t_v_id);
		t_v_id.setColumns(10);
		name[0]=t_name.getText();
		amount[0]=t_amount.getAlignmentX();
		phone[0]=t_phone.getText();
		adress[0]=t_address.getText();
		
		t_v_name = new JTextField(t_name.getText());
		t_v_name.setBounds(126, 66, 129, 29);
		p_info_gustomer.add(t_v_name);
		t_v_name.setColumns(10);
		
		t_v_amount = new JTextField();
		t_v_amount.setBounds(126, 106, 129, 29);
		p_info_gustomer.add(t_v_amount);
		t_v_amount.setColumns(10);
		
		t_v_phone = new JTextField();
		t_v_phone.setBounds(126, 154, 129, 29);
		p_info_gustomer.add(t_v_phone);
		t_v_phone.setColumns(10);
		
		t_v_address = new JTextField();
		t_v_address.setBounds(126, 194, 129, 25);
		p_info_gustomer.add(t_v_address);
		t_v_address.setColumns(10);
		
		JButton b_b_p_list = new JButton("\u0631\u062C\u0648\u0639");
		b_b_p_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p_info_gustomer.setVisible(false);
				p_list.setVisible(true);
				
			}
		});
		b_b_p_list.setBounds(179, 228, 89, 23);
		p_info_gustomer.add(b_b_p_list);
	}
}
