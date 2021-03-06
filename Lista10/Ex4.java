package Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import java.awt.SystemColor;

public class Ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField tfCPF;
	private JTextField tfNome;
	private JTextField tfMAIL;
	private JTextField tfTelPesso;
	private JTextField tfSetor;
	private JTextField tfParentesco;
	private JTextField tfTel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rdbtnParente = new JRadioButton("Parente");
	JRadioButton rdbtnAmigo = new JRadioButton("Amigo");
	JRadioButton rdbtnColegaDeTrabalho = new JRadioButton("Colega de Trabalho");
	JLabel lblTelefone = new JLabel("Telefone Pessoal");
	JLabel lblSetor = new JLabel("Setor");
	JLabel lblParentesco = new JLabel("Parentesco");
	Colega_Trabalho ct= new Colega_Trabalho();
	Amigo a= new Amigo();
	Parente p= new Parente();
	private final JEditorPane epMAIL = new JEditorPane();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4 frame = new Ex4();
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
	public Ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnColegaDeTrabalho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnColegaDeTrabalho.isSelected()) {
					
					lblTelefone.setVisible(false);
					tfTelPesso.setVisible(false);
					lblSetor.setVisible(true);
					tfSetor.setVisible(true);
					lblParentesco.setVisible(false);
					tfParentesco.setVisible(false);
					
				}
			}
		});
		rdbtnColegaDeTrabalho.setSelected(true);
		buttonGroup.add(rdbtnColegaDeTrabalho);
		rdbtnColegaDeTrabalho.setBounds(6, 7, 135, 23);
		contentPane.add(rdbtnColegaDeTrabalho);
		
		
		buttonGroup.add(rdbtnAmigo);
		rdbtnAmigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAmigo.isSelected()) {
					lblParentesco.setVisible(false);
					tfParentesco.setVisible(false);
					lblTelefone.setVisible(true);
					tfTelPesso.setVisible(true);
					lblSetor.setVisible(false);
					tfSetor.setVisible(false);
					
				}
			}
		});
		rdbtnAmigo.setBounds(207, 7, 104, 23);
		contentPane.add(rdbtnAmigo);
		
		
		buttonGroup.add(rdbtnParente);
		rdbtnParente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnParente.isSelected()) {
					lblParentesco.setVisible(true);
					tfParentesco.setVisible(true);
					lblTelefone.setVisible(false);
					tfTelPesso.setVisible(false);
					lblSetor.setVisible(false);
					tfSetor.setVisible(false);
					
				}
			}
		});
		rdbtnParente.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnParente.setBounds(323, 7, 131, 23);
		contentPane.add(rdbtnParente);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(14, 57, 46, 14);
		contentPane.add(lblCpf);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(62, 51, 135, 23);
		contentPane.add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(14, 85, 46, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(62, 79, 135, 20);
		contentPane.add(tfNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(14, 113, 46, 14);
		contentPane.add(lblEmail);
		
		tfMAIL = new JTextField();
		tfMAIL.setColumns(10);
		tfMAIL.setBounds(62, 107, 135, 20);
		contentPane.add(tfMAIL);
		
		lblTelefone.setVisible(false);
		lblTelefone.setBounds(221, 54, 104, 14);
		contentPane.add(lblTelefone);
		
		tfTelPesso = new JTextField();
		tfTelPesso.setVisible(false);
		tfTelPesso.setColumns(10);
		tfTelPesso.setBounds(323, 51, 135, 20);
		contentPane.add(tfTelPesso);
		
		
		lblSetor.setBounds(221, 82, 92, 14);
		contentPane.add(lblSetor);
		
		
		tfSetor = new JTextField();
		
		tfSetor.setColumns(10);
		tfSetor.setBounds(323, 79, 135, 20);
		contentPane.add(tfSetor);
		
		lblParentesco.setVisible(false);
		lblParentesco.setBounds(221, 110, 108, 14);
		contentPane.add(lblParentesco);
		
		tfParentesco = new JTextField();
		tfParentesco.setVisible(false);
		tfParentesco.setColumns(10);
		tfParentesco.setBounds(323, 107, 135, 20);
		contentPane.add(tfParentesco);
		
		JLabel label = new JLabel("Telefone");
		label.setBounds(8, 146, 52, 14);
		contentPane.add(label);
		
		tfTel = new JTextField();
		tfTel.setColumns(10);
		tfTel.setBounds(62, 138, 135, 20);
		contentPane.add(tfTel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnColegaDeTrabalho.isSelected()) {
					ct.setCpf(Double.parseDouble(tfCPF.getText()));
					ct.setEmail(tfMAIL.getText());
					ct.setNome(tfNome.getText());
					ct.setSetor(tfSetor.getText());
					ct.setTelefone(Double.parseDouble(tfTel.getText()));
					
					epMAIL.setText(ct.msgmail());
				}else if(rdbtnAmigo.isSelected()) {
					a.setCpf(Double.parseDouble(tfCPF.getText()));
					a.setEmail(tfMAIL.getText());
					a.setNome(tfNome.getText());
					a.setTelefone_pessoal(Double.parseDouble(tfTelPesso.getText()));
					a.setTelefone(Double.parseDouble(tfTel.getText()));
					
					epMAIL.setText(a.msgmail());
				}else {
					p.setCpf(Double.parseDouble(tfCPF.getText()));
					p.setEmail(tfMAIL.getText());
					p.setNome(tfNome.getText());
					p.setParentesco(tfParentesco.getText());
					p.setTelefone(Double.parseDouble(tfTel.getText()));
					epMAIL.setText(p.msgmail());
					
				}
			}
		});
		btnCadastrar.setBounds(162, 169, 149, 23);
		contentPane.add(btnCadastrar);
		epMAIL.setBackground(SystemColor.scrollbar);
		epMAIL.setBounds(10, 199, 444, 74);
		contentPane.add(epMAIL);
	}
}
