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
	private JLabel talrunisWrong;
	private JLabel adreseWrong;
	private JLabel vardsWrong;
	

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
				String telefons = txtTalrunis.getText();
				String vards = txtVrds.getText();
				String adrese = txtAdrese.getText();
				boolean isValid = true;
				
				if (vards.length() <= 2 || !vards.matches("[a-zA-Z]+")) {
					vardsWrong.setVisible(true);
					isValid = false;
				}else {
					vardsWrong.setVisible(false);
				}
				if (telefons.length() < 8 || telefons.length() > 8 || !telefons.matches("\\d+")) {
					talrunisWrong.setVisible(true);
					isValid = false;
				}else {
					talrunisWrong.setVisible(false);
				}
				if (adrese.length() <= 4 || !adrese.matches("[a-zA-Z]+")) {
					adreseWrong.setVisible(true);
					isValid = false;
				}else {
					adreseWrong.setVisible(false);
				}
				if(isValid) {
				Kliecis_pica2 newWIndow = new Kliecis_pica2();
				newWIndow.setVisible(true);
				Kliecis_pica.this.dispose();
			}
			}
		
		});
		
		adreseWrong = new JLabel("Adresē jābūt vismaz 5 burti");
		adreseWrong.setFont(new Font("Tahoma", Font.BOLD, 12));
		adreseWrong.setForeground(new Color(255, 0, 0));
		adreseWrong.setBounds(186, 132, 175, 14);
		adreseWrong.setVisible(false);
		contentPane.add(adreseWrong);
		
		talrunisWrong = new JLabel("Nepareiza ievade ( 8 cip)");
		talrunisWrong.setFont(new Font("Tahoma", Font.BOLD, 12));
		talrunisWrong.setForeground(new Color(255, 0, 0));
		talrunisWrong.setBounds(186, 101, 199, 14);
		talrunisWrong.setVisible(false);
		contentPane.add(talrunisWrong);
		
		vardsWrong = new JLabel("Vārds ir pārāk īss vai nekorekts");
		vardsWrong.setFont(new Font("Tahoma", Font.BOLD, 12));
		vardsWrong.setForeground(new Color(255, 0, 0));
		vardsWrong.setBounds(186, 70, 199, 14);
		vardsWrong.setVisible(false);
		contentPane.add(vardsWrong);
		
		
		
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
		lblNewLabel.setBounds(165, 0, 277, 48);
		contentPane.add(lblNewLabel);
		
		
		
		txtVrds = new JTextField();
		txtVrds.setToolTipText("");
		txtVrds.setBounds(90, 67, 86, 20);
		contentPane.add(txtVrds);
		txtVrds.setColumns(10);
		
		txtTalrunis = new JTextField();
		txtTalrunis.setBounds(90, 98, 86, 20);
		contentPane.add(txtTalrunis);
		txtTalrunis.setColumns(10);
			
		
		txtAdrese = new JTextField();
		txtAdrese.setBounds(90, 129, 86, 20);
		contentPane.add(txtAdrese);
		txtAdrese.setColumns(10);
		
		lblVrds = new JLabel("Vārds:");
		lblVrds.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblVrds.setForeground(new Color(255, 0, 0));
		lblVrds.setBounds(10, 68, 70, 14);
		contentPane.add(lblVrds);
		lblVards.setBounds(74, -17, 151, 65);
		contentPane.add(lblVards);
		lblVards.setVerticalAlignment(SwingConstants.TOP);
		
		lblTalrunis = new JLabel("Talrunis:");
		lblTalrunis.setForeground(Color.RED);
		lblTalrunis.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblTalrunis.setBounds(10, 102, 70, 14);
		contentPane.add(lblTalrunis);
		
		
		lblAdrese = new JLabel("Adrese:");
		lblAdrese.setForeground(Color.RED);
		lblAdrese.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 15));
		lblAdrese.setBounds(10, 133, 70, 14);
		contentPane.add(lblAdrese);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-64, -78, 581, 547);
		Image Backround = new ImageIcon(this.getClass().getResource("/resources/PicasBackround.jpeg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(Backround));
		contentPane.add(lblNewLabel_1);
		
}
}
