import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Kliecis_pica3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kliecis_pica3 frame = new Kliecis_pica3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Kliecis_pica3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	
    ImageIcon originalImageIcon = new ImageIcon(getClass().getResource("/resources/cep.jpg"));
    int scaledWidth = 700;
    int scaledHeight = 700;
    ImageIcon scaledImageIcon = new ImageIcon(originalImageIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH));
    contentPane.setLayout(null);
    
    JLabel label = new JLabel(scaledImageIcon);
    label.setBounds(-26, -141, 700, 700);
    contentPane.add(label);

}

}
