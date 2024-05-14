import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Kliecis_pica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVrds;
	private JTextField txtTalrunis;
	private JTextField txtAdrese;
	private JLabel lblNewLabel_1;
	private JLabel lblVrds;
	private final JLabel lblVards = new JLabel("vards");
	private JLabel lblTalrunis;
	private JLabel lblAdrese;
	private JButton btnNewButton;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kliecis_pica frame = new Kliecis_pica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Kliecis_pica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	    btnNewButton = new JButton("Turpināt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phoneNumber = txtTalrunis.getText();
				String vards = txtVrds.getText();
				String adrese = txtAdrese.getText();
				if (phoneNumber.length() ==8 && phoneNumber.matches("\\d+") && vards.length()>2 && vards.matches("[a-zA-Z]+")
						&& adrese.length()>4 && adrese.matches("[a-zA-Z]+")) {
				Kliecis_pica1 newWIndow = new Kliecis_pica1();
				newWIndow.setVisible(true);
				Kliecis_pica.this.dispose();
			}
			}
		});
		
		
		
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(165, 179, 116, 23);
		contentPane.add(btnNewButton);
		
	    JButton maja = new JButton("");
	    maja.setBorder(null);
	    maja.setContentAreaFilled(false);
	    maja.setIcon(new ImageIcon(Kliecis_pica.class.getResource("/resources/maja.png")));
	    maja.setBounds(281, -17, 232, 101);
		maja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kliecis_piaa newWIndow = new Kliecis_piaa();
				newWIndow.setVisible(true);
				Kliecis_pica.this.dispose();
			}
		});
		contentPane.add(maja);
		
		JLabel lblNewLabel = new JLabel("Picelīno");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(174, 11, 277, 48);
		contentPane.add(lblNewLabel);
		
		
		
		txtVrds = new JTextField();
		txtVrds.setToolTipText("");
		txtVrds.setBounds(181, 70, 86, 20);
		contentPane.add(txtVrds);
		String vards = txtVrds.getText();
		txtVrds.setColumns(10);
		
		txtTalrunis = new JTextField();
		txtTalrunis.setBounds(181, 101, 86, 20);
		contentPane.add(txtTalrunis);
		txtTalrunis.setColumns(10);
			
		
		txtAdrese = new JTextField();
		txtAdrese.setBounds(181, 132, 86, 20);
		contentPane.add(txtAdrese);
		txtAdrese.setColumns(10);
		
		lblVrds = new JLabel("Vārds:");
		lblVrds.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblVrds.setForeground(new Color(255, 0, 0));
		lblVrds.setBounds(112, 70, 70, 14);
		contentPane.add(lblVrds);
		lblVards.setBounds(74, -17, 151, 65);
		contentPane.add(lblVards);
		lblVards.setVerticalAlignment(SwingConstants.TOP);
		
		lblTalrunis = new JLabel("Talrunis:");
		lblTalrunis.setForeground(Color.RED);
		lblTalrunis.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblTalrunis.setBounds(101, 104, 70, 14);
		contentPane.add(lblTalrunis);
		
		
		lblAdrese = new JLabel("Adrese:");
		lblAdrese.setForeground(Color.RED);
		lblAdrese.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblAdrese.setBounds(101, 135, 70, 14);
		contentPane.add(lblAdrese);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-121, -40, 545, 340);
		Image Backround = new ImageIcon(this.getClass().getResource("/resources/PicasBackround.jpeg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(Backround));
		contentPane.add(lblNewLabel_1);
		
}
}
