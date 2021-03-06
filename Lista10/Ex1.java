package Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JCheckBox chCarregador = new JCheckBox("Carregador - R$ 200,00");
	JCheckBox chPasta = new JCheckBox("Pasta - R$ 150,00");		
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$ 150,00");		
	JCheckBox chTeclado = new JCheckBox("Teclado - R$ 50,00");
	
	Notebook no= new Notebook();
	Desktop de = new Desktop();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbEscolha = new JLabel("Escolha o Tipo do Computador");
		lbEscolha.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lbEscolha.setBounds(120, 11, 212, 24);
		contentPane.add(lbEscolha);
		
		JRadioButton rbNote = new JRadioButton("Notebook");
		buttonGroup.add(rbNote);
		rbNote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbNote.isSelected()){
					
						chCarregador.setEnabled(true);
						chPasta.setEnabled(true);
						chEstabilizador.setEnabled(false);
						chTeclado.setEnabled(false);
						chEstabilizador.setSelected(false);
						chTeclado.setSelected(false);
					
				}
			}
		});
		rbNote.setSelected(true);
		rbNote.setBounds(39, 42, 109, 23);
		contentPane.add(rbNote);
		
		JRadioButton rdDesktop = new JRadioButton("Desktop");
		buttonGroup.add(rdDesktop);
		rdDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdDesktop.isSelected()){
				chCarregador.setEnabled(false);
				chPasta.setEnabled(false);
				chEstabilizador.setEnabled(true);
				chTeclado.setEnabled(true);
				chCarregador.setSelected(false);
				chPasta.setSelected(false);
				}
			}
		});
		rdDesktop.setBounds(245, 42, 109, 23);
		contentPane.add(rdDesktop);
		
		
		chCarregador.setBounds(39, 75, 169, 23);
		contentPane.add(chCarregador);
		
		
		chPasta.setBounds(39, 112, 155, 23);
		contentPane.add(chPasta);
		
		
		chEstabilizador.setEnabled(false);
		chEstabilizador.setBounds(245, 75, 169, 23);
		contentPane.add(chEstabilizador);
		
		chTeclado.setEnabled(false);
		chTeclado.setBounds(245, 112, 169, 23);
		contentPane.add(chTeclado);
		
		JComboBox cbHD = new JComboBox();
		cbHD.setModel(new DefaultComboBoxModel(new String[] {"HD 500 GB-200,00", "HD 1TB-500,00", "HD 2TB-700,00"}));
		cbHD.setBounds(39, 152, 155, 20);
		contentPane.add(cbHD);
		
		JComboBox cbPlacamae = new JComboBox();
		cbPlacamae.setModel(new DefaultComboBoxModel(new String[] {"Placa M\u00E3e 1-500,00", "Placa M\u00E3e 2-700,00"}));
		cbPlacamae.setBounds(245, 152, 155, 20);
		contentPane.add(cbPlacamae);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Processador 1-500,00", "Processador 2-1000,00", "rocessador 3-1500,00"}));
		cbProcessador.setBounds(39, 183, 155, 20);
		contentPane.add(cbProcessador);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"Mem\u00F3ria 4GB-250,00", "Mem\u00E9ria 8GB-500,00", "Mem\u00F3ria 16GB-1000,00"}));
		cbMemoria.setBounds(245, 183, 155, 20);
		contentPane.add(cbMemoria);
		
		JLabel lblEscolhaDePlaca = new JLabel("Escolha de Placa De video");
		lblEscolhaDePlaca.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblEscolhaDePlaca.setBounds(120, 214, 212, 24);
		contentPane.add(lblEscolhaDePlaca);
		
		JComboBox cbPlacaVideo = new JComboBox();
		cbPlacaVideo.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Modelo 1-200,00", "Modelo 2-400,00", "Modelo 3-600,00"}));
		cbPlacaVideo.setBounds(120, 249, 184, 20);
		contentPane.add(cbPlacaVideo);
		
		JCheckBox chckbxGarantiaExtendida = new JCheckBox("Garantia Extendida Para o Computador");
		chckbxGarantiaExtendida.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxGarantiaExtendida.setBounds(39, 293, 361, 23);
		contentPane.add(chckbxGarantiaExtendida);
		
		JButton btCalcular = new JButton("Calcular");
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbNote.isSelected()) {
					double total=0;
					int garantia=1;
					if(chCarregador.isSelected()) {
						no.setCarregador(200);
						no.setCarregadorDesc(chCarregador.getText()+"\n");
					}else
					{
						no.setCarregadorDesc("");
					}
					
					if(chPasta.isSelected()) {
						no.setPasta(150);
						no.setPastaDesc(chPasta.getText()+"\n");
					}else {
						no.setPastaDesc("");
					}
					if(cbPlacamae.getSelectedIndex()==0) {
						total+=500;
						no.setPlacaDesc(String.valueOf(cbPlacamae.getSelectedItem())+"\n");
					}else {
						total+=700;
						no.setPlacaDesc(String.valueOf(cbPlacamae.getSelectedItem())+"\n");
					}
					if(cbMemoria.getSelectedIndex()==0) {
						total+=250;
						no.setMemoriaDesc(String.valueOf(cbMemoria.getSelectedItem())+"\n");
					}else if(cbMemoria.getSelectedIndex()==1) {
						total+=500;
						no.setMemoriaDesc(String.valueOf(cbMemoria.getSelectedItem())+"\n");
					}else {
						total+=1000;
						no.setMemoriaDesc(String.valueOf(cbMemoria.getSelectedItem())+"\n");
					}
					if(cbHD.getSelectedIndex()==0) {
						total+=200;
						no.setHdDesc(String.valueOf(cbHD.getSelectedItem())+"\n");
					}else if(cbHD.getSelectedIndex()==1) {
						total+=500;
						no.setHdDesc(String.valueOf(cbHD.getSelectedItem())+"\n");
					}else {
						total+=700;
						no.setHdDesc(String.valueOf(cbHD.getSelectedItem())+"\n");
					}
					if(cbProcessador.getSelectedIndex()==0) {
						total+=500;
						no.setProcessadorDesc(String.valueOf(cbProcessador.getSelectedItem())+"\n");
					}else if(cbProcessador.getSelectedIndex()==1) {
						total+=1000;
						no.setProcessadorDesc(String.valueOf(cbProcessador.getSelectedItem())+"\n");
					}else {
						total+=1500;
						no.setProcessadorDesc(String.valueOf(cbProcessador.getSelectedItem())+"\n");
					}
					
					
					if(cbPlacaVideo.getSelectedIndex()==0) {
						no.setPVdesc("");
						
					}else if(cbPlacaVideo.getSelectedIndex()==1) {
						no.setPV(200);
						no.setPVdesc(String.valueOf(cbPlacaVideo.getSelectedItem())+"\n");
					}else if(cbPlacaVideo.getSelectedIndex()==2) {
						no.setPV(400);
						no.setPVdesc(String.valueOf(cbPlacaVideo.getSelectedItem())+"\n");
					}else if(cbPlacaVideo.getSelectedIndex()==3) {
						no.setPV(600);
						no.setPVdesc(String.valueOf(cbPlacaVideo.getSelectedItem())+"\n");
					}
					
					total+=no.SomaDesk();
					
					if(chckbxGarantiaExtendida.isSelected()) {
						total=total-((total/100)*12);
						garantia++;
					}
					
					JOptionPane.showMessageDialog(null, no.notaFiscalNote()+"\n"
							+ "Garantia: "+garantia+"Anos \n"
							+ "Valor Total: R$"+total);
				}else
				{
					double total=0;
					int garantia=2;
					if(chEstabilizador.isSelected()) {
						de.setEstabilizador(200);
						de.setEstabilizadorDesc(chEstabilizador.getText()+"\n");
					}else
					{
						de.setEstabilizadorDesc("");
					}
					
					if(chTeclado.isSelected()) {
						de.setTeclado(150);
						de.setTecladoDesc(chTeclado.getText()+"\n");
					}else {
						de.setTecladoDesc("");
					}
					if(cbPlacamae.getSelectedIndex()==0) {
						total+=500;
						de.setPlacaDesc(String.valueOf(cbPlacamae.getSelectedItem())+"\n");
					}else {
						total+=700;
						de.setPlacaDesc(String.valueOf(cbPlacamae.getSelectedItem())+"\n");
					}
					if(cbMemoria.getSelectedIndex()==0) {
						total+=250;
						de.setMemoriaDesc(String.valueOf(cbMemoria.getSelectedItem())+"\n");
					}else if(cbMemoria.getSelectedIndex()==1) {
						total+=500;
						de.setMemoriaDesc(String.valueOf(cbMemoria.getSelectedItem())+"\n");
					}else {
						total+=1000;
						de.setMemoriaDesc(String.valueOf(cbMemoria.getSelectedItem())+"\n");
					}
					if(cbHD.getSelectedIndex()==0) {
						total+=200;
						de.setHdDesc(String.valueOf(cbHD.getSelectedItem())+"\n");
					}else if(cbHD.getSelectedIndex()==1) {
						total+=500;
						de.setHdDesc(String.valueOf(cbHD.getSelectedItem())+"\n");
					}else {
						total+=700;
						de.setHdDesc(String.valueOf(cbHD.getSelectedItem())+"\n");
					}
					if(cbProcessador.getSelectedIndex()==0) {
						total+=500;
						de.setProcessadorDesc(String.valueOf(cbProcessador.getSelectedItem())+"\n");
					}else if(cbProcessador.getSelectedIndex()==1) {
						total+=1000;
						de.setProcessadorDesc(String.valueOf(cbProcessador.getSelectedItem())+"\n");
					}else {
						total+=1500;
						de.setProcessadorDesc(String.valueOf(cbProcessador.getSelectedItem())+"\n");
					}
					
					
					if(cbPlacaVideo.getSelectedIndex()==0) {
						de.setPVdesc("");
						
					}else if(cbPlacaVideo.getSelectedIndex()==1) {
						de.setPV(200);
						de.setPVdesc(String.valueOf(cbPlacaVideo.getSelectedItem())+"\n");
					}else if(cbPlacaVideo.getSelectedIndex()==2) {
						de.setPV(400);
						de.setPVdesc(String.valueOf(cbPlacaVideo.getSelectedItem())+"\n");
					}else if(cbPlacaVideo.getSelectedIndex()==3) {
						de.setPV(600);
						de.setPVdesc(String.valueOf(cbPlacaVideo.getSelectedItem())+"\n");
					}
					
					total+=de.SomaDesk();
					
					if(chckbxGarantiaExtendida.isSelected()) {
						total=total-((total/100)*10);
						garantia++;
					}
					
					JOptionPane.showMessageDialog(null, de.notaFiscalDesk()+"\n"
							+"Garantia: "+garantia+" Anos\n"
							+ "Valor Total: R$"+total);
				}
			}
		});
		btCalcular.setBounds(147, 338, 129, 23);
		contentPane.add(btCalcular);
	}
}
