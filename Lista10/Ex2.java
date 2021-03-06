package Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfval;
	private JTextField tfAnos;
	private JTextField tfTon;
	JRadioButton rbCaminhao = new JRadioButton("Caminhao");
	JRadioButton rbAutomovel = new JRadioButton("Automovel");
	private JTextField tfValatual;
	private JTextField tfSeguro;
	private JTextField tfIPVA;
	JLabel lbton = new JLabel("Capacidade em Toneladas");
	Automovel at= new Automovel();
	Caminhao ca= new Caminhao();
	Moto mt= new Moto();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdMoto = new JRadioButton("Moto");
		rdMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdMoto.isSelected()) {
					tfTon.setVisible(false);
					lbton.setVisible(false);
					tfTon.setText("");
				}
			}
		});
		buttonGroup.add(rdMoto);
		rdMoto.setSelected(true);
		rdMoto.setBounds(6, 7, 109, 23);
		contentPane.add(rdMoto);
		
		rbAutomovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbAutomovel.isSelected()) {
					tfTon.setVisible(false);
					lbton.setVisible(false);
					tfTon.setText("");
				}
			}
		});
		buttonGroup.add(rbAutomovel);
		rbAutomovel.setBounds(163, 7, 109, 23);
		contentPane.add(rbAutomovel);
		
		
		rbCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbCaminhao.isSelected()) {
					
					lbton.setVisible(true);
					tfTon.setVisible(true);
					
					
				}
			}
		});
		buttonGroup.add(rbCaminhao);
		rbCaminhao.setBounds(319, 7, 109, 23);
		contentPane.add(rbCaminhao);
		
		JLabel lbvalnv = new JLabel("Valor Do Carro Novo");
		lbvalnv.setHorizontalAlignment(SwingConstants.CENTER);
		lbvalnv.setBounds(6, 53, 164, 28);
		contentPane.add(lbvalnv);
		
		tfval = new JTextField();
		tfval.setBounds(225, 55, 140, 24);
		contentPane.add(tfval);
		tfval.setColumns(10);
		
		JLabel lbAnos = new JLabel("Anos de Uso do Carro");
		lbAnos.setHorizontalAlignment(SwingConstants.CENTER);
		lbAnos.setBounds(6, 93, 164, 28);
		contentPane.add(lbAnos);
		
		tfAnos = new JTextField();
		tfAnos.setColumns(10);
		tfAnos.setBounds(225, 95, 140, 24);
		contentPane.add(tfAnos);
		
		lbton.setVisible(false);
		lbton.setHorizontalAlignment(SwingConstants.CENTER);
		lbton.setBounds(6, 136, 164, 28);
		contentPane.add(lbton);
		
		
		tfTon = new JTextField();
		tfTon.setVisible(false);
		tfTon.setColumns(10);
		tfTon.setBounds(225, 138, 140, 24);
		contentPane.add(tfTon);
		
		JLabel lbvalores = new JLabel("Valores");
		lbvalores.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbvalores.setHorizontalAlignment(SwingConstants.CENTER);
		lbvalores.setBounds(137, 175, 145, 23);
		contentPane.add(lbvalores);
		
		JLabel lbValAtual = new JLabel("Valor Atual");
		lbValAtual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbValAtual.setBounds(34, 213, 105, 23);
		contentPane.add(lbValAtual);
		
		tfValatual = new JTextField();
		tfValatual.setEditable(false);
		tfValatual.setBounds(141, 209, 131, 26);
		contentPane.add(tfValatual);
		tfValatual.setColumns(10);
		
		JLabel lblSeguro = new JLabel("Seguro");
		lblSeguro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSeguro.setBounds(34, 260, 105, 23);
		contentPane.add(lblSeguro);
		
		tfSeguro = new JTextField();
		tfSeguro.setEditable(false);
		
		tfSeguro.setColumns(10);
		tfSeguro.setBounds(141, 256, 131, 26);
		contentPane.add(tfSeguro);
		
		JLabel lblIpva = new JLabel("IPVA");
		lblIpva.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIpva.setBounds(34, 304, 105, 23);
		contentPane.add(lblIpva);
		
		tfIPVA = new JTextField();
		tfIPVA.setEditable(false);
		tfIPVA.setColumns(10);
		tfIPVA.setBounds(141, 300, 131, 26);
		contentPane.add(tfIPVA);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdMoto.isSelected()) {
					mt.setValornv(Double.parseDouble(tfval.getText()));
					mt.setAnovei(Integer.parseInt(tfAnos.getText()));
				
					
					tfValatual.setText(String.valueOf(mt.Valdepre()));
					tfSeguro.setText(mt.getSeguroMoto());
					tfIPVA.setText(""+mt.ValIPVA());
				}else if(rbAutomovel.isSelected()) {
					at.setValornv(Double.parseDouble(tfval.getText()));
					at.setAnovei(Integer.parseInt(tfAnos.getText()));
					
					tfValatual.setText(String.valueOf(at.Valdepre()));
					tfSeguro.setText(""+at.getSeguroAuto());
					tfIPVA.setText(""+at.ValIPVA());
				}else {
					ca.setValornv(Double.parseDouble(tfval.getText()));
					ca.setAnovei(Integer.parseInt(tfAnos.getText()));
					ca.setTon(Integer.parseInt(tfTon.getText()));
					
					tfValatual.setText(String.valueOf(ca.Valdepre()));
					tfSeguro.setText(""+ca.getSegurocam());
					tfIPVA.setText(""+ca.ValIPVA());
				}
				
			}
		});
		btnNewButton.setBounds(313, 209, 89, 118);
		contentPane.add(btnNewButton);
		
	}
}
