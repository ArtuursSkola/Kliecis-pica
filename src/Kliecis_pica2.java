import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Kliecis_pica2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kliecis_pica2 frame = new Kliecis_pica2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Kliecis_pica2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 472, 295);
		Image Backround = new ImageIcon(this.getClass().getResource("/resources/PicasBackround.jpeg")).getImage();
		
	    JButton btnNewButton = new JButton("New button");
	    btnNewButton.setBorder(null);
	    btnNewButton.setContentAreaFilled(false);
	    btnNewButton.setBounds(104, 189, 182, 45);
	    btnNewButton.setForeground(new Color(255, 0, 0));
	    btnNewButton.setBackground(new Color(255, 0, 0));
	    btnNewButton.setSelectedIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/tuksa.png")));
	    btnNewButton.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/neons.png")));
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Kliecis_piaa newWIndow = new Kliecis_piaa();
	    		newWIndow.setVisible(true);
	    		Kliecis_pica2.this.dispose();
	    	}
	    });
	    contentPane.setLayout(null);
	    
	    JLabel lblNewLabel_3 = new JLabel("Atgriezties");
	    lblNewLabel_3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
	    lblNewLabel_3.setBounds(135, 190, 151, 30);
	    contentPane.add(lblNewLabel_3);
	    
	   
		Random rand = new Random();
		int laiks = rand.nextInt(58-34+1)+34;	
	    
	    JLabel lblNewLabel_2_1 = new JLabel("Jūsu picas piegādes laiks ir:"+laiks+" minūtues");
	    lblNewLabel_2_1.setForeground(Color.RED);
	    lblNewLabel_2_1.setFont(new Font("Serif", Font.ITALIC, 24));
	    lblNewLabel_2_1.setBounds(10, 122, 424, 37);
	    contentPane.add(lblNewLabel_2_1);
	    contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Paldies par pirkumu!");
		lblNewLabel_2.setBounds(83, 74, 341, 37);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Serif", Font.ITALIC, 27));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Picelīno");
		lblNewLabel_6.setBounds(157, 0, 277, 48);
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
		contentPane.add(lblNewLabel_6);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pica");
		lblNewLabel_1.setBounds(-37, -13, 491, 315);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Backround));
		
		JLabel label = new JLabel("New label");
		label.setBounds(39, 145, 46, 14);
		contentPane.add(label);
		
		

	}
}