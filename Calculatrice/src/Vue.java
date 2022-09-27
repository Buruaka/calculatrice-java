import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Vue extends JFrame {
	private Controle controle;
	private JPanel contentPane;
	private JTextField txtNb1;
	private JTextField txtNb2;
	private String op;
	private int nbr1;
	private int nbr2;
	private static JLabel txtResult;
	
	
	public static void aff_Res(int result) {
		String resultat = Integer.toString(result);
		txtResult.setText(resultat);
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public Vue(Controle pcontrole) {
		this.controle=pcontrole;
		
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNb1 = new JTextField();
		txtNb1 .setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNb1.setBounds(117, 291, 232, 48);
		contentPane.add(txtNb1);
		txtNb1.setColumns(10);
		
		txtNb2 = new JTextField();
		txtNb2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNb2.setColumns(10);
		txtNb2.setBounds(117, 70, 232, 48);
		contentPane.add(txtNb2);
		
		
		JButton BtnAdd = new JButton("+");
		BtnAdd.setBounds(83, 180, 85, 48);
		BtnAdd.setBackground(Color.WHITE);
		contentPane.add(BtnAdd);


		
		JButton BtnRemove = new JButton("-");
		BtnRemove.setBounds(209, 180, 85, 48);
		BtnRemove.setBackground(Color.WHITE);
		contentPane.add(BtnRemove);

	
		JButton btnMultiple = new JButton("x");
		btnMultiple.setBounds(325, 180, 85, 48);
		btnMultiple.setBackground(Color.WHITE);
		contentPane.add(btnMultiple);


		BtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BtnAdd.setBackground(Color.GRAY);
				btnMultiple.setBackground(Color.WHITE);
				BtnRemove.setBackground(Color.WHITE);
				op="+";
			}
		});

		
		BtnRemove.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			BtnRemove.setBackground(Color.GRAY);
			BtnAdd.setBackground(Color.WHITE);
			btnMultiple.setBackground(Color.WHITE);
			op="-";
		}
	});
		
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnMultiple.setBackground(Color.GRAY);
				BtnAdd.setBackground(Color.WHITE);
				BtnRemove.setBackground(Color.WHITE);
				op="*";
			}
		});
				
		
		JButton Calcule = new JButton("Calculer");
		Calcule.setBounds(175, 369, 129, 73);

		Calcule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbr1= Integer.parseInt(txtNb1.getText());
				nbr2= Integer.parseInt(txtNb2.getText());
				pcontrole.demandeCalcul(nbr1,nbr2,op);
			}
		});
		contentPane.add(Calcule);
		

		txtResult = new JLabel("",SwingConstants.CENTER);
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtResult.setBounds(10, 470, 473, 55);
		contentPane.add(txtResult);


	
	}
}