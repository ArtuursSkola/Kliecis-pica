import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

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
	    
	    JButton btnNewButton = new JButton("New button");
	    btnNewButton.setSelectedIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/tuksa.png")));
	    btnNewButton.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/red.jpg")));
	    btnNewButton.setBounds(281, 179, 210, 63);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kliecis_pica newWIndow = new Kliecis_pica();
				newWIndow.setVisible(true);
				Kliecis_piaa.this.dispose();
			}
		});
	    contentPane.add(btnNewButton);
	    
	    JButton btnNewButton1 = new JButton("New button");
	    btnNewButton1.setSelectedIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/tuksa.png")));
	    btnNewButton1.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/red.jpg")));
	    btnNewButton1.setBounds(281, 275, 210, 63);
	    
	    contentPane.add(btnNewButton1);

	    
	    JLabel backroundLabel = new JLabel(scaledImageIcon);
	    backroundLabel.setBounds(-12, 0, 807, 561);
	    contentPane.add(backroundLabel);
	    
	    

	    

	}
}
	
