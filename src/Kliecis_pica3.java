import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;

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
    
    JButton btnNewButton = new JButton("New button");
    btnNewButton.setBorder(null);
    btnNewButton.setContentAreaFilled(false);
    btnNewButton.setBounds(250, 383, 182, 45);
    btnNewButton.setForeground(new Color(255, 0, 0));
    btnNewButton.setBackground(new Color(255, 0, 0));
    btnNewButton.setSelectedIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/tuksa.png")));
    btnNewButton.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/neons.png")));
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Kliecis_piaa newWIndow = new Kliecis_piaa();
    		newWIndow.setVisible(true);
    		Kliecis_pica3.this.dispose();
    	}
    });
    

	Random rand = new Random();
	int laiks = rand.nextInt(58-34+1)+34;	

    
    JLabel lblNewLabel_3 = new JLabel("Atgriezties");
    lblNewLabel_3.setForeground(Color.WHITE);
    lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 25));
    lblNewLabel_3.setBounds(275, 384, 188, 30);
    contentPane.add(lblNewLabel_3);
    contentPane.add(btnNewButton);
    
    
    JLabel lblNewLabel_2_1 = new JLabel("Jūsu pica būs gatava apmēram pēc:"+laiks+" minūtuem");
    lblNewLabel_2_1.setForeground(Color.WHITE);
    lblNewLabel_2_1.setFont(new Font("Serif", Font.BOLD, 28));
    lblNewLabel_2_1.setBounds(45, 279, 601, 94);
    contentPane.add(lblNewLabel_2_1);
    
    JLabel lblNewLabel_2 = new JLabel("Paldies par pirkumu!");
    lblNewLabel_2.setForeground(Color.RED);
    lblNewLabel_2.setFont(new Font("Serif", Font.ITALIC, 27));
    lblNewLabel_2.setBounds(213, 54, 341, 37);
    contentPane.add(lblNewLabel_2);
    
    int numurs = readOrderNumberFile();
    
    JLabel lblNewLabel_6 = new JLabel("Picelīno");
    lblNewLabel_6.setForeground(Color.RED);
    lblNewLabel_6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
    lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
    lblNewLabel_6.setBounds(275, 0, 277, 48);
    contentPane.add(lblNewLabel_6);
    
    ImageIcon originalImageIcon2 = new ImageIcon(getClass().getResource("/resources/slice.png"));
    int scaledWidth2 = 200;
    int scaledHeight2 = 200;
    ImageIcon scaledImageIcon2 = new ImageIcon(originalImageIcon2.getImage().getScaledInstance(scaledWidth2, scaledHeight2, java.awt.Image.SCALE_SMOOTH));
    contentPane.setLayout(null);
    
    JLabel slice = new JLabel(scaledImageIcon2);
    slice.setBounds(168, 89, 317, 284);
    contentPane.add(slice);
    
    JLabel label = new JLabel(scaledImageIcon);
    label.setBounds(-16, -114, 700, 700);
    contentPane.add(label);
    
}
    private int  readOrderNumberFile() {
    	int numurs = -1;
    	
    	try(BufferedReader br = new BufferedReader(new FileReader("Pasutijums.txt"))){
    		String line;
    		while((line = br.readLine()) != null) {
    			if(line.startsWith("Pasūtijuma numurs: ")) {
    				Pattern pat = Pattern.compile(("\\d+"));
    				Matcher mat = pat.matcher(line);
    				if(mat.find()) {
    					numurs = Integer.parseInt(mat.group());
    					break;
    					
    				}
    				
    			}
    		}
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    
	    JLabel lblNewLabel_4 = new JLabel("Jūsu sūtijuma numurs ir: ");
	    lblNewLabel_4.setForeground(new Color(255, 255, 255));
	    lblNewLabel_4.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
	    lblNewLabel_4.setBounds(223, 78, 277, 69);
	    contentPane.add(lblNewLabel_4);

	    
	    
	    return numurs;
    }

}
