import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
	    btnNewButton.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/neons.png")));
	    btnNewButton.setBounds(297, 218, 220, 73);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kliecis_pica newWIndow = new Kliecis_pica();
				newWIndow.setVisible(true);
				Kliecis_piaa.this.dispose();
			}
		});
	    
	    ImageIcon originalImageIcon2 = new ImageIcon(getClass().getResource("/resources/wheel.png"));
	    int scaledWidth2 = 50;
	    int scaledHeight2 = 50;
	    ImageIcon scaledImageIcon2 = new ImageIcon(originalImageIcon2.getImage().getScaledInstance(scaledWidth2, scaledHeight2, java.awt.Image.SCALE_SMOOTH));
	    contentPane.setLayout(null);
	    
	    JButton Exit = new JButton("");
	    Exit.setBorder(null);
	    Exit.setContentAreaFilled(false);
	    ImageIcon originalImageIcon3 = new ImageIcon(getClass().getResource("/resources/stop.png"));
	    ImageIcon scaledImageIcon3 = new ImageIcon(originalImageIcon3.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
	    Exit.setIcon(scaledImageIcon3);
	    Exit.setBounds(-12, 0, 99, 90);
	    Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    System.exit(0);
			}
	    });
	    contentPane.add(Exit);
	    
	    JLabel slice = new JLabel(scaledImageIcon2);
	    slice.setBounds(619, -85, 261, 233);
	    contentPane.add(slice);
		
	    JLabel lblApskattVecosStijumus = new JLabel("Vecie sūtijumi");
	    lblApskattVecosStijumus.setForeground(Color.WHITE);
	    lblApskattVecosStijumus.setFont(new Font("Segoe UI", Font.BOLD, 19));
	    lblApskattVecosStijumus.setBounds(345, 314, 153, 30);
	    contentPane.add(lblApskattVecosStijumus);
	    JLabel lblNewLabel = new JLabel("Pasūtīt picu");
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
	    lblNewLabel.setBounds(345, 243, 125, 19);
	    contentPane.add(lblNewLabel);
	    contentPane.add(btnNewButton);

	    
	    JButton PasPoga = new JButton("New button");
	    PasPoga.setBorder(null);
	    PasPoga.setContentAreaFilled(false);
	    PasPoga.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String pas = readOrdersFromFile("Pasutijums.txt");
	    		displayOrdersWindow(pas);
	    	}
	    });
	    PasPoga.setIcon(new ImageIcon(Kliecis_piaa.class.getResource("/resources/neons.png")));
	    PasPoga.setBounds(307, 302, 210, 63);
	    
	    contentPane.add(PasPoga);

	    
	    JLabel backroundLabel = new JLabel(scaledImageIcon);
	    backroundLabel.setBounds(-12, 0, 807, 561);
	    contentPane.add(backroundLabel);
	}
	    private String readOrdersFromFile(String filePath) {
	    	StringBuilder pas = new StringBuilder();
	    	try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
	    		String line;
	    		while((line = br.readLine()) != null) {
	    			pas.append(line).append("\n");
	    		}
	    	}catch (IOException e){
	    		e.printStackTrace();
	    	}
	    	return pas.toString();
	}
	    private void displayOrdersWindow(String pas) {
	    	JFrame ordersFrame = new JFrame("Vecie sūtijumi");
	    	ordersFrame.setSize(600, 400);
	    	JTextArea textArea = new JTextArea(pas);
	    	textArea.setEditable(false);
	    	JScrollPane scrollPane = new JScrollPane(textArea);
	    	ordersFrame.getContentPane().add(scrollPane);
	    	ordersFrame.setVisible(true);
	    }
}
	
