import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Kliecis_pica1 extends JFrame {

	
	static File dekstop = new File(System.getProperty("user.home"),"Desktop");
	static String cels = dekstop.getAbsolutePath();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea PiedevasTextArea;
    private JTextArea txtrCena;
    private JTextArea MercesTextArea;
    double cena = 0.0;
    String izmers = "";
    String vieta = "Uz vietas";
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kliecis_pica1 frame = new Kliecis_pica1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Kliecis_pica1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

	    
	    JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Piegādāt picu");
	    lblNewLabel_2_1_1_1_1.setForeground(Color.RED);
	    lblNewLabel_2_1_1_1_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
	    lblNewLabel_2_1_1_1_1.setBounds(73, 257, 169, 23);
	    contentPane.add(lblNewLabel_2_1_1_1_1);


	    
	    JRadioButton Pats = new JRadioButton("");
	    Pats.setSelected(false);
	    Pats.setBackground(Color.YELLOW);
	    Pats.setBounds(46, 257, 21, 23);
	    contentPane.add(Pats);
		Pats.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
			if(Pats.isSelected()) {
			cena += 5;
			txtrCena.setText("Cena:  "+cena+" eur");
			vieta = "Piegāde";
		}else {
			cena -= 5;
			txtrCena.setText("Cena:  "+cena+" eur");
			vieta = "Uz vietas";
		}
		}
		});
	    

	    
	    JTextArea txtrLielums_1 = new JTextArea();
	    txtrLielums_1.setWrapStyleWord(true);
	    txtrLielums_1.setText("Lielums: ");
	    txtrLielums_1.setRows(5);
	    txtrLielums_1.setLineWrap(true);
	    txtrLielums_1.setEditable(false);
	    txtrLielums_1.setBounds(252, 259, 82, 30);
	    contentPane.add(txtrLielums_1);
		
	    txtrCena = new JTextArea();
		txtrCena.setWrapStyleWord(true);
		txtrCena.setText("Cena: "+cena+" eur");
		txtrCena.setRows(5);
		txtrCena.setLineWrap(true);
		txtrCena.setEditable(false);
		txtrCena.setBounds(252, 288, 286, 67);
		contentPane.add(txtrCena);
		
		JTextArea txtrLielums = new JTextArea();
		txtrLielums.setWrapStyleWord(true);
		txtrLielums.setRows(5);
		txtrLielums.setLineWrap(true);
		txtrLielums.setEditable(false);
		txtrLielums.setBounds(330, 259, 208, 30);
		contentPane.add(txtrLielums);
		
		MercesTextArea = new JTextArea();
		MercesTextArea.setWrapStyleWord(true);
		MercesTextArea.setRows(5);
		MercesTextArea.setLineWrap(true);
		MercesTextArea.setText("Mērces:");
		MercesTextArea.setEditable(false);
		MercesTextArea.setBounds(252, 229, 286, 30);
		contentPane.add(MercesTextArea);
		
		PiedevasTextArea = new JTextArea();
		PiedevasTextArea.setLineWrap(true);
		PiedevasTextArea.setRows(5);
		PiedevasTextArea.setWrapStyleWord(true);
		PiedevasTextArea.setText("Piedevas: ");
		PiedevasTextArea.setEditable(false);
		PiedevasTextArea.setBounds(252, 199, 286, 30);
		contentPane.add(PiedevasTextArea);
		
	    JButton maja = new JButton("");
	    maja.setBorder(null);
	    maja.setContentAreaFilled(false);
	    maja.setIcon(new ImageIcon(Kliecis_pica1.class.getResource("/resources/maja.png")));
	    maja.setBounds(391, -13, 232, 101);
		maja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Kliecis_piaa newWIndow = new Kliecis_piaa();
				newWIndow.setVisible(true);
				Kliecis_pica1.this.dispose();
			}
		});
		
			
		contentPane.add(maja);
		
		JLabel lblNewLabel_6 = new JLabel("Picelīno");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6.setBounds(221, -13, 277, 48);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("Sastāvdaļas:");
		lblNewLabel_5_1.setForeground(Color.YELLOW);
		lblNewLabel_5_1.setFont(new Font("Serif", Font.ITALIC, 22));
		lblNewLabel_5_1.setBounds(150, 43, 121, 18);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("Izmērs:");
		lblNewLabel_5.setFont(new Font("Serif", Font.ITALIC, 22));
		lblNewLabel_5.setForeground(new Color(255, 255, 0));
		lblNewLabel_5.setBounds(27, 43, 78, 18);
		contentPane.add(lblNewLabel_5);
		
	
		
		JLabel lblNewLabel_2 = new JLabel("Lielā pica");
		lblNewLabel_2.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(54, 87, 64, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vidējā pica");
		lblNewLabel_3.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(54, 113, 84, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mazā pica");
		lblNewLabel_4.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(54, 141, 84, 23);
		contentPane.add(lblNewLabel_4);
		
		
		JRadioButton Ananass_Poga = new JRadioButton("");
		Ananass_Poga.setBackground(Color.YELLOW);
		Ananass_Poga.setBounds(144, 87, 21, 23);
		contentPane.add(Ananass_Poga);
		Ananass_Poga.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
			if (Ananass_Poga.isSelected()) {
				PiedevasTextArea.append(" Ananass");
				cena += 1.5;
				txtrCena.setText("Cena:  "+cena+" eur");
			}else {
				PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Ananass",""));
				cena -= 1.5;
				txtrCena.setText("Cena:  "+cena+" eur");
			}	
			}
		});
		
		JRadioButton Peperoni_Poga = new JRadioButton("");
		Peperoni_Poga.setBackground(Color.YELLOW);
		Peperoni_Poga.setBounds(144, 113, 21, 23);
		contentPane.add(Peperoni_Poga);
		Peperoni_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Peperoni_Poga.isSelected()) {
			PiedevasTextArea.append(" Peperoni");
			cena += 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Peperoni",""));
			cena -= 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}	
		}
	});
		
		JRadioButton Senes_Poga = new JRadioButton("");
		Senes_Poga.setBackground(Color.YELLOW);
		Senes_Poga.setBounds(144, 139, 21, 23);
		contentPane.add(Senes_Poga);
		Senes_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Senes_Poga.isSelected()) {
			PiedevasTextArea.append(" Senes");
			cena += 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Senes",""));
			cena -= 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}	
		}
	});
		
		JRadioButton Skinkis_Poga = new JRadioButton("");
		Skinkis_Poga.setBackground(Color.YELLOW);
		Skinkis_Poga.setBounds(144, 165, 21, 23);
		contentPane.add(Skinkis_Poga);
		Skinkis_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Skinkis_Poga.isSelected()) {
			PiedevasTextArea.append(" Šķiņķis");
			cena += 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Šķiņķis",""));
			cena -= 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}	
		}
	});
		
		JRadioButton Desa_Poga = new JRadioButton("");
		Desa_Poga.setBackground(Color.YELLOW);
		Desa_Poga.setBounds(144, 193, 21, 23);
		contentPane.add(Desa_Poga);
		Desa_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Desa_Poga.isSelected()) {
			PiedevasTextArea.append(" Desa");
			cena += 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Desa",""));
			cena -= 1.5;
			txtrCena.setText("Cena:  "+cena+" eur");
		}
		}
	});
		JRadioButton Tomatu_Poga = new JRadioButton("");
		Tomatu_Poga.setBackground(Color.YELLOW);
		Tomatu_Poga.setBounds(303, 87, 21, 23);
		contentPane.add(Tomatu_Poga);
		Tomatu_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Tomatu_Poga.isSelected()) {
			MercesTextArea.append(" Tomātu");
			cena += 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			MercesTextArea.setText(MercesTextArea.getText().replace(" Tomātu",""));
			cena -= 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}
		}
	});
		
		JRadioButton Majo_Poga = new JRadioButton("");
		Majo_Poga.setBackground(Color.YELLOW);
		Majo_Poga.setBounds(303, 113, 21, 23);
		contentPane.add(Majo_Poga);
		Majo_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Majo_Poga.isSelected()) {
			MercesTextArea.append(" Majonēze");
			cena += 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			MercesTextArea.setText(MercesTextArea.getText().replace(" Majonēze",""));
			cena -= 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}
		}
	});
		
		JRadioButton Karija_Poga = new JRadioButton("");
		Karija_Poga.setBackground(Color.YELLOW);
		Karija_Poga.setBounds(303, 139, 21, 23);
		contentPane.add(Karija_Poga);
		Karija_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Karija_Poga.isSelected()) {
			MercesTextArea.append(" Karija");
			cena += 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			MercesTextArea.setText(MercesTextArea.getText().replace(" Karija",""));
			cena -= 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}
		}
	});
		
		JRadioButton BBQ_Poga = new JRadioButton("");
		BBQ_Poga.setBackground(Color.YELLOW);
		BBQ_Poga.setBounds(303, 165, 21, 23);
		contentPane.add(BBQ_Poga);
		BBQ_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (BBQ_Poga.isSelected()) {
			MercesTextArea.append(" BBQ");
			cena += 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}else {
			MercesTextArea.setText(MercesTextArea.getText().replace(" BBQ",""));
			cena -= 2;
			txtrCena.setText("Cena:  "+cena+" eur");
		}
		}
	});
		
		JRadioButton Maza_Poga = new JRadioButton("");
		Maza_Poga.setBackground(new Color(255, 255, 0));
		Maza_Poga.setBounds(27, 141, 21, 23);
		contentPane.add(Maza_Poga);
		Maza_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Maza_Poga.isSelected()) {
			txtrLielums.setText("");
			txtrLielums.append(" Mazā pica");
			cena = 8;
			txtrCena.setText("Cena:  "+cena+" eur");
			Ananass_Poga.setSelected(false);
			Peperoni_Poga.setSelected(false);
			Senes_Poga.setSelected(false);
			Desa_Poga.setSelected(false);
			Skinkis_Poga.setSelected(false);
			Tomatu_Poga.setSelected(false);
			Majo_Poga.setSelected(false);
			Karija_Poga.setSelected(false);
			BBQ_Poga.setSelected(false);
			Pats.setSelected(false);
			PiedevasTextArea.setText("Piedevas: ");
			MercesTextArea.setText("Mērces: ");
			izmers = "Mazā pica";
		}else {
			txtrLielums.setText(PiedevasTextArea.getText().replace(" Mazā pica",""));
			cena -= 8;
			txtrCena.setText("Cena:  "+cena+" eur");
		}	
		}
	});
		
		
		
		JRadioButton Liela_Poga = new JRadioButton("");
		Liela_Poga.setBackground(new Color(255, 255, 0));
		Liela_Poga.setBounds(27, 87, 21, 23);
		contentPane.add(Liela_Poga);
		Liela_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Liela_Poga.isSelected()) {
			txtrLielums.setText("");
			txtrLielums.append(" Lielā pica");
			cena = 12;
			txtrCena.setText("Cena:  "+cena+" eur");
			Ananass_Poga.setSelected(false);
			Peperoni_Poga.setSelected(false);
			Senes_Poga.setSelected(false);
			Desa_Poga.setSelected(false);
			Skinkis_Poga.setSelected(false);
			Tomatu_Poga.setSelected(false);
			Majo_Poga.setSelected(false);
			Karija_Poga.setSelected(false);
			BBQ_Poga.setSelected(false);
			Pats.setSelected(false);
			PiedevasTextArea.setText("Piedevas:");
			MercesTextArea.setText("Mērces: ");
			izmers = "Lielā pica";
			
		}else {
			txtrLielums.setText(PiedevasTextArea.getText().replace(" Lielā pica",""));
			cena -= 12;
			txtrCena.setText("Cena:  "+cena+" eur");
			
			
		}	
		}
	});
		
		JRadioButton Vid_Poga = new JRadioButton("");
		Vid_Poga.setBackground(new Color(255, 255, 0));
		Vid_Poga.setBounds(27, 113, 21, 23);
		contentPane.add(Vid_Poga);
		Vid_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Vid_Poga.isSelected()) {
			txtrLielums.setText("");
			txtrLielums.append(" Vidējā pica");
			cena = 10;
			txtrCena.setText("Cena:  "+cena+" eur");
			Ananass_Poga.setSelected(false);
			Peperoni_Poga.setSelected(false);
			Senes_Poga.setSelected(false);
			Desa_Poga.setSelected(false);
			Skinkis_Poga.setSelected(false);
			Tomatu_Poga.setSelected(false);
			Majo_Poga.setSelected(false);
			Karija_Poga.setSelected(false);
			BBQ_Poga.setSelected(false);
			Pats.setSelected(false);
			PiedevasTextArea.setText("Piedevas:");
			MercesTextArea.setText("Mērces: ");
			izmers = "Vidējā pica";
		}else {
			txtrLielums.setText(PiedevasTextArea.getText().replace(" Vidējā pica",""));
			cena -= 10;
			txtrCena.setText("Cena:  "+cena+" eur");
		}	
		}
	});
		JLabel lblNewLabel_2_1 = new JLabel("Ananāss");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1.setBounds(180, 87, 64, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Peperoni");
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_2.setBounds(180, 113, 64, 23);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Šampinjoni");
		lblNewLabel_2_3.setForeground(Color.RED);
		lblNewLabel_2_3.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_3.setBounds(180, 141, 78, 23);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Šķiņķis");
		lblNewLabel_2_4.setForeground(Color.RED);
		lblNewLabel_2_4.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_4.setBounds(180, 165, 64, 23);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Desa");
		lblNewLabel_2_5.setForeground(Color.RED);
		lblNewLabel_2_5.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_5.setBounds(180, 193, 64, 23);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Mērces:");
		lblNewLabel_5_1_1.setForeground(Color.YELLOW);
		lblNewLabel_5_1_1.setFont(new Font("Serif", Font.ITALIC, 22));
		lblNewLabel_5_1_1.setBounds(303, 43, 121, 18);
		contentPane.add(lblNewLabel_5_1_1);
		
	    ImageIcon originalIcon = new ImageIcon("src/resources/Pizza.png");
	    ImageIcon resizedIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
	    JButton btnNewButton_1 = new JButton("");
	    btnNewButton_1.setBorder(null);
	    btnNewButton_1.setContentAreaFilled(false);
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(Pats.isSelected() && (Liela_Poga.isSelected() || Maza_Poga.isSelected() || Vid_Poga.isSelected())) {
		    	Pasutijums();
	    		Kliecis_pica2 newWIndow = new Kliecis_pica2();
	    		newWIndow.setVisible(true);
	    		Kliecis_pica1.this.dispose();

	    	}if(!Pats.isSelected() && (Liela_Poga.isSelected() || Vid_Poga.isSelected() || Maza_Poga.isSelected())) {
	    		Pasutijums();
		    	JFrame orderFrame = new JFrame();
		    	orderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    	orderFrame.setTitle("Pasūtijuma informācija");
		    	orderFrame.setSize(350,150);
		    	orderFrame.setLocationRelativeTo(null);
		    	JLabel orderLabel = new JLabel("Paldies par pirkumu!"
		    			+ "Jūsu pasūtijuma numurs: "+nr, SwingConstants.CENTER);
		    	orderFrame.add(orderLabel, BorderLayout.CENTER);
		    	orderFrame.setVisible(true);
	    		Kliecis_pica3 newWindow = new Kliecis_pica3();
	    		newWindow.setVisible(true);
	    		Kliecis_pica1.this.dispose();

	    	}
	    	}
	    });
	    
	    
	    JLabel lblNewLabel_7 = new JLabel("Pirkt");
	    lblNewLabel_7.setFont(new Font("Serif", Font.ITALIC, 20));
	    lblNewLabel_7.setForeground(new Color(255, 0, 0));
	    lblNewLabel_7.setBounds(58, 293, 78, 49);
	    contentPane.add(lblNewLabel_7);
	    btnNewButton_1.setIcon(resizedIcon);
	    btnNewButton_1.setBounds(27, 294, 109, 48);
	    contentPane.add(btnNewButton_1);

		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tomātu");
		lblNewLabel_2_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_1.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_1.setBounds(330, 87, 64, 23);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("BBQ");
		lblNewLabel_2_1_2.setForeground(Color.RED);
		lblNewLabel_2_1_2.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_2.setBounds(330, 165, 64, 23);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Karija");
		lblNewLabel_2_1_3.setForeground(Color.RED);
		lblNewLabel_2_1_3.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_3.setBounds(330, 141, 64, 23);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Majonēze");
		lblNewLabel_2_1_4.setForeground(Color.RED);
		lblNewLabel_2_1_4.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_4.setBounds(330, 113, 64, 23);
		contentPane.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(154, 151, 669, 439);
		Image Backround = new ImageIcon(this.getClass().getResource("/resources/t.jpg")).getImage();
		contentPane.add(lblNewLabel);
	

	
		JLabel lblNewLabel_1 = new JLabel("Pica");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(-32, -59, 839, 534);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Backround));
		Pats.addActionListener(e ->{
			if (Pats.isSelected()) {
	;		}
			});
		
		
		Maza_Poga.addActionListener(e ->{
		if(Maza_Poga.isSelected()) {
			Liela_Poga.setSelected(false);
			Vid_Poga.setSelected(false);
		}
		});
		Liela_Poga.addActionListener(e ->{
		if(Liela_Poga.isSelected()) {
			Maza_Poga.setSelected(false);
			Vid_Poga.setSelected(false);
	}
		});
		Vid_Poga.addActionListener(e ->{
		if(Vid_Poga.isSelected()) {
			Liela_Poga.setSelected(false);
			Maza_Poga.setSelected(false);
}
		
		
		});
		
	}
	Random rand = new Random();
	int nr = rand.nextInt(58-34+1)+34;	
	
	public void Pasutijums() {
	try {
		StringBuilder sutijumi = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader("Pasutijums.txt"))){
			String line;
			while((line = br.readLine())!=null) {
				sutijumi.append(line).append("\n");
			}
		}
		
		FileWriter fw = new FileWriter("Pasutijums.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Pasūtijuma numurs: "+nr);
		pw.println("Picas izmērs: "+izmers);
		pw.println("Piedevas: "+PiedevasTextArea.getText());
		pw.println("Papildus mērces: "+MercesTextArea.getText());
		pw.println("Maksa: "+cena);
		pw.println("Sūtijuma atrašanās vieta: "+vieta);
		pw.close();
		System.out.print("Sūtijums pabeigts");
	}	catch (IOException e) {
		e.printStackTrace();
		System.out.print("Notikusi kļūme"+ e.getMessage());

	}
	
	}
}



