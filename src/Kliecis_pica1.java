import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextArea;
public class Kliecis_pica1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea PiedevasTextArea;
    private JTextArea txtrCena;

    
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
		
		JButton btnNewButton = new JButton("Pirkt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kliecis_pica2 newWIndow = new Kliecis_pica2();
				newWIndow.setVisible(true);
				Kliecis_pica1.this.dispose();
			}
		});
		
	    txtrCena = new JTextArea();
		txtrCena.setWrapStyleWord(true);
		txtrCena.setText("Cena:");
		txtrCena.setRows(5);
		txtrCena.setLineWrap(true);
		txtrCena.setEditable(false);
		txtrCena.setBounds(252, 288, 286, 67);
		contentPane.add(txtrCena);
		
		JTextArea txtrLielums = new JTextArea();
		txtrLielums.setWrapStyleWord(true);
		txtrLielums.setText("Lielums: ");
		txtrLielums.setRows(5);
		txtrLielums.setLineWrap(true);
		txtrLielums.setEditable(false);
		txtrLielums.setBounds(252, 259, 286, 30);
		contentPane.add(txtrLielums);
		
		JTextArea txtrMrces = new JTextArea();
		txtrMrces.setWrapStyleWord(true);
		txtrMrces.setText("Mērces:");
		txtrMrces.setRows(5);
		txtrMrces.setLineWrap(true);
		txtrMrces.setEditable(false);
		txtrMrces.setBounds(252, 229, 286, 30);
		contentPane.add(txtrMrces);
		
		PiedevasTextArea = new JTextArea();
		PiedevasTextArea.setLineWrap(true);
		PiedevasTextArea.setRows(5);
		PiedevasTextArea.setWrapStyleWord(true);
		PiedevasTextArea.setText("Piedevas: ");
		PiedevasTextArea.setEditable(false);
		PiedevasTextArea.setBounds(252, 199, 286, 30);
		contentPane.add(PiedevasTextArea);
		
		
		JLabel lblNewLabel_6 = new JLabel("Picelīno");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6.setBounds(157, 0, 277, 48);
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
		
		
		JRadioButton Maza_Poga = new JRadioButton("");
		Maza_Poga.setBackground(new Color(255, 255, 0));
		Maza_Poga.setBounds(27, 141, 21, 23);
		contentPane.add(Maza_Poga);
		Maza_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Maza_Poga.isSelected()) {
			txtrLielums.append(" Mazā pica");
			updatePrice(6.0);
		}else {
			txtrLielums.setText(PiedevasTextArea.getText().replace(" Mazā pica",""));
			updatePrice(-6.0);
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
			txtrLielums.append(" Lielā pica");
			updatePrice(10.0);
		}else {
			txtrLielums.setText(PiedevasTextArea.getText().replace(" Lielā pica",""));
			updatePrice(-10.0);
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
			txtrLielums.append(" Vidējā pica");
			updatePrice(8.0);
		}else {
			txtrLielums.setText(PiedevasTextArea.getText().replace(" Vidējā pica",""));
			updatePrice(8.0);
		}	
		}
	});
		
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
			}else {
				PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Ananass",""));
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
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Peperoni",""));
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
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Senes",""));
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
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Šķiņķis",""));
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
		}else {
			PiedevasTextArea.setText(PiedevasTextArea.getText().replace(" Desa",""));
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
		
		JRadioButton Tomatu_Poga = new JRadioButton("");
		Tomatu_Poga.setBackground(Color.YELLOW);
		Tomatu_Poga.setBounds(303, 87, 21, 23);
		contentPane.add(Tomatu_Poga);
		Tomatu_Poga.addActionListener(new ActionListener( ) {
		@Override
	public void actionPerformed(ActionEvent e) {
		if (Tomatu_Poga.isSelected()) {
			txtrMrces.append(" Tomātu");
		}else {
			txtrMrces.setText(txtrMrces.getText().replace(" Tomātu",""));
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
			txtrMrces.append(" Majonēze");
		}else {
			txtrMrces.setText(txtrMrces.getText().replace(" Majonēze",""));
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
			txtrMrces.append(" Karija");
		}else {
			txtrMrces.setText(txtrMrces.getText().replace(" Karija",""));
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
			txtrMrces.append(" BBQ");
		}else {
			txtrMrces.setText(txtrMrces.getText().replace(" BBQ",""));
		}
		}
	});
		
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
		lblNewLabel.setBounds(93, 22, 669, 439);
		Image Backround = new ImageIcon(this.getClass().getResource("/resources/PicasBackround.jpeg")).getImage();
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Pica");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(-37, -13, 675, 379);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(Backround));
		

		
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
	private void updatePrice(double priceChange) {
		String currentPriceText = txtrCena.getText();
		String currentPriceStr = currentPriceText.substring(currentPriceText.index0f("Cena: ")+6, currentPriceText.index0f(" eur"));
		double currentPrice = Double.parseDouble(currentPriceStr);
		double newPrice = currentPrice + priceChange;
		txtrCena.setText("Cena: "+ newPrice + " eur\n");
	}
}