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
		setSize(700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		Image Backround = new ImageIcon(this.getClass().getResource("/resources/PicasBackround.jpeg")).getImage();
		
	    ImageIcon originalImageIcon = new ImageIcon(getClass().getResource("/resources/cep.jpg"));
	    int scaledWidth = 700;
	    int scaledHeight = 700;
	    ImageIcon scaledImageIcon = new ImageIcon(originalImageIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    contentPane.setLayout(null);
	    
		Random rand = new Random();
		int laiks = rand.nextInt(58-34+1)+34;	
	    
	    JButton maja = new JButton("");
	    maja.setBorder(null);
	    maja.setContentAreaFilled(false);
	    maja.setIcon(new ImageIcon(Kliecis_pica.class.getResource("/resources/maja.png")));
	    maja.setBounds(521, -13, 232, 101);
	    maja.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Kliecis_piaa newWIndow = new Kliecis_piaa();
	    		newWIndow.setVisible(true);
	    		Kliecis_pica2.this.dispose();
	    	}
	    });
	    ImageIcon originalImageIcon2 = new ImageIcon(getClass().getResource("/resources/slice.png"));
	    int scaledWidth2 = 200;
	    int scaledHeight2 = 200;
	    ImageIcon scaledImageIcon2 = new ImageIcon(originalImageIcon2.getImage().getScaledInstance(scaledWidth2, scaledHeight2, java.awt.Image.SCALE_SMOOTH));
	    contentPane.setLayout(null);
	    
	    JLabel slice = new JLabel(scaledImageIcon2);
	    slice.setBounds(207, 107, 205, 195);
	    contentPane.add(slice);
	    		
	    	    JButton btnNewButton = new JButton("New button");
	    	    btnNewButton.setBorder(null);
	    	    btnNewButton.setContentAreaFilled(false);
	    	    btnNewButton.setBounds(235, 388, 182, 45);
	    	    btnNewButton.setForeground(new Color(255, 0, 0));
	    	    btnNewButton.setBackground(new Color(255, 0, 0));
	    	    btnNewButton.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/neons.png")));
	    	    btnNewButton.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent e) {
	    	    		Kliecis_piaa newWIndow = new Kliecis_piaa();
	    	    		newWIndow.setVisible(true);
	    	    		Kliecis_pica2.this.dispose();
	    	    	}
	    	    });
	    	    
		JLabel lblNewLabel_2 = new JLabel("Paldies par pirkumu!");
		lblNewLabel_2.setBounds(197, 59, 341, 37);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Serif", Font.ITALIC, 27));
		contentPane.add(lblNewLabel_2);
	    	    
	    	    JLabel lblNewLabel_3 = new JLabel("Atgriezties");
	    	    lblNewLabel_3.setForeground(new Color(255, 255, 255));
	    	    lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 25));
	    	    lblNewLabel_3.setBounds(254, 389, 160, 30);
	    	    contentPane.add(lblNewLabel_3);
	    	    contentPane.add(btnNewButton);
	    

	    	    
	    JLabel lblNewLabel_2_1 = new JLabel("Jūsu picas piegādes laiks ir: "+laiks+" minūtues");
	    lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
	    lblNewLabel_2_1.setFont(new Font("Serif", Font.BOLD, 28));
	    lblNewLabel_2_1.setBounds(91, 297, 516, 37);
	    contentPane.add(lblNewLabel_2_1);
	    
	    JLabel lblNewLabel_6 = new JLabel("Picelīno");
	    lblNewLabel_6.setBounds(236, 0, 277, 48);
	    lblNewLabel_6.setForeground(Color.RED);
	    lblNewLabel_6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
	    lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
	    contentPane.add(lblNewLabel_6);
	    contentPane.add(maja);
	    
	    JLabel label = new JLabel(scaledImageIcon);
	    label.setBounds(0, -74, 700, 804);
	    contentPane.add(label);
	    
	    JLabel lblNewLabel_1 = new JLabel("Pica");
	    lblNewLabel_1.setBounds(-37, -13, 491, 315);
	    lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
	    lblNewLabel_1.setForeground(new Color(255, 255, 0));
	    contentPane.add(lblNewLabel_1);
	    lblNewLabel_1.setIcon(new ImageIcon(Backround));
	    contentPane.setLayout(null);
	    
	   
		
		JLabel label1 = new JLabel("");
		label1.setBounds(39, 145, 46, 14);
		contentPane.add(label1);
	    
	    JLabel lblNewLabel = new JLabel("");
	    lblNewLabel.setBounds(10, 0, 472, 295);
	    contentPane.add(lblNewLabel);
		
		

	}

}