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

public class Kliecis_pica1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


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
		setBounds(100, 100, 450, 300);
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
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(16, 215, 89, 23);
		contentPane.add(btnNewButton);
		
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
		
		JRadioButton Liela_Poga = new JRadioButton("");
		Liela_Poga.setBackground(new Color(255, 255, 0));
		Liela_Poga.setBounds(27, 87, 21, 23);
		contentPane.add(Liela_Poga);
		
		JRadioButton Vid_Poga = new JRadioButton("");
		Vid_Poga.setBackground(new Color(255, 255, 0));
		Vid_Poga.setBounds(27, 113, 21, 23);
		contentPane.add(Vid_Poga);
		
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
		
		JRadioButton Peperoni_Poga = new JRadioButton("");
		Peperoni_Poga.setBackground(Color.YELLOW);
		Peperoni_Poga.setBounds(144, 113, 21, 23);
		contentPane.add(Peperoni_Poga);
		
		JRadioButton Senes_Poga = new JRadioButton("");
		Senes_Poga.setBackground(Color.YELLOW);
		Senes_Poga.setBounds(144, 139, 21, 23);
		contentPane.add(Senes_Poga);
		
		JRadioButton Skinkis_Poga = new JRadioButton("");
		Skinkis_Poga.setBackground(Color.YELLOW);
		Skinkis_Poga.setBounds(144, 165, 21, 23);
		contentPane.add(Skinkis_Poga);
		
		JRadioButton Desa_Poga = new JRadioButton("");
		Desa_Poga.setBackground(Color.YELLOW);
		Desa_Poga.setBounds(144, 193, 21, 23);
		contentPane.add(Desa_Poga);
		
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
		
		JRadioButton Ananass_Poga_1 = new JRadioButton("");
		Ananass_Poga_1.setBackground(Color.YELLOW);
		Ananass_Poga_1.setBounds(303, 87, 21, 23);
		contentPane.add(Ananass_Poga_1);
		
		JRadioButton Ananass_Poga_2 = new JRadioButton("");
		Ananass_Poga_2.setBackground(Color.YELLOW);
		Ananass_Poga_2.setBounds(303, 113, 21, 23);
		contentPane.add(Ananass_Poga_2);
		
		JRadioButton Ananass_Poga_3 = new JRadioButton("");
		Ananass_Poga_3.setBackground(Color.YELLOW);
		Ananass_Poga_3.setBounds(303, 139, 21, 23);
		contentPane.add(Ananass_Poga_3);
		
		JRadioButton Ananass_Poga_4 = new JRadioButton("");
		Ananass_Poga_4.setBackground(Color.YELLOW);
		Ananass_Poga_4.setBounds(303, 165, 21, 23);
		contentPane.add(Ananass_Poga_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tomātu");
		lblNewLabel_2_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_1.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_1.setBounds(330, 87, 64, 23);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("BBQ");
		lblNewLabel_2_1_2.setForeground(Color.RED);
		lblNewLabel_2_1_2.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_2.setBounds(330, 113, 64, 23);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Karija");
		lblNewLabel_2_1_3.setForeground(Color.RED);
		lblNewLabel_2_1_3.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_3.setBounds(330, 141, 64, 23);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Majonēze");
		lblNewLabel_2_1_4.setForeground(Color.RED);
		lblNewLabel_2_1_4.setFont(new Font("Serif", Font.ITALIC, 15));
		lblNewLabel_2_1_4.setBounds(330, 165, 64, 23);
		contentPane.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 472, 295);
		Image Backround = new ImageIcon(this.getClass().getResource("/resources/PicasBackround.jpeg")).getImage();
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pica");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(-37, -13, 491, 315);
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
}