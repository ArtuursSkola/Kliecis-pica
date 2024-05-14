import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Kliecis_piaa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kliecis_piaa frame = new Kliecis_piaa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public Kliecis_piaa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    ImageIcon originalImageIcon = new ImageIcon(getClass().getResource("/resources/Picerija.jpeg"));
	    int scaledWidth = 900;
	    int scaledHeight = 900;
	    ImageIcon scaledImageIcon = new ImageIcon(originalImageIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    
	    JButton btnNewButton = new JButton("");
	    btnNewButton.setBorder(null);
	    btnNewButton.setContentAreaFilled(false);
	    btnNewButton.setSelectedIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/tuksa.png")));
	    btnNewButton.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/neons.png")));
	    btnNewButton.setBounds(281, 266, 220, 73);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kliecis_pica newWIndow = new Kliecis_pica();
				newWIndow.setVisible(true);
				Kliecis_piaa.this.dispose();
			}
		});
	    JLabel lblNewLabel = new JLabel("Pasūtīt picu");
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
	    lblNewLabel.setBounds(386, 75, 210, 39);
	    contentPane.add(lblNewLabel);
	    contentPane.add(btnNewButton);


	    
	    JButton btnNewButton1 = new JButton("New button");
	    btnNewButton1.setBorder(null);
	    btnNewButton1.setContentAreaFilled(false);
	    btnNewButton1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnNewButton1.setSelectedIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/tuksa.png")));
	    btnNewButton1.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/neons.png")));
	    btnNewButton1.setBounds(281, 404, 210, 63);
	    
	    contentPane.add(btnNewButton1);

	    
	    JLabel backroundLabel = new JLabel(scaledImageIcon);
	    backroundLabel.setBounds(-12, 0, 807, 561);
	    contentPane.add(backroundLabel);
	    
	    

	    

	}
}
	
