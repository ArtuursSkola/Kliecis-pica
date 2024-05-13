import java.awt.EventQueue;

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
		contentPane.setBorder(new EmptyBorder(3, 3, 3, 3));
		setContentPane(contentPane);
		
	    ImageIcon originalImageIcon = new ImageIcon(getClass().getResource("/resources/Picerija.jpeg"));
	    int scaledWidth = 900;
	    int scaledHeight = 900;
	    ImageIcon scaledImageIcon = new ImageIcon(originalImageIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
	    contentPane.setLayout(null);
	    
	    ImageIcon poga = new ImageIcon(getClass().getResource("/resources/red.jpg"));
	    JButton imageButton = new JButton(poga);
	    
	    
	    JButton btnNewButton = new JButton("New button");
	    btnNewButton.setBounds(330, 226, 89, 23);
	    contentPane.add(btnNewButton);
	    JLabel backroundLabel = new JLabel(scaledImageIcon);
	    backroundLabel.setBounds(-12, 0, 807, 561);
	    contentPane.add(backroundLabel);
	}
}
