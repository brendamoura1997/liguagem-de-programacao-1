package Lista9;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		int op;
		Animal a= new Animal();
		Peixe p = new Peixe();
		Mamifero m = new Mamifero();
		
		
		for(;;){
		op=Integer.parseInt(JOptionPane.showInputDialog("Digite a op??o de cadastro desejada \n"
				+ "1-Animal \n"
				+ "2-Mamifero \n"
				+ "3-Peixe \n"
				+ "4-Sair"));
		
		if(op==1)
		{
			a.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o tipo do animal:")));
			a.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do animal:")));
			a.setPatas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de patas do animal:")));
			a.setCor(String.valueOf(JOptionPane.showInputDialog("Digite a cor do animal:")));
			a.setAmbiente(String.valueOf(JOptionPane.showInputDialog("Digite o ambiente do animal:")));
			a.setVelocidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media do animal:")));
		}else if(op==2){
			m.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o tipo do mamifero:")));
			m.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do mamifero:")));
			m.setPatas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de patas do mamifero:")));
			m.setCor(String.valueOf(JOptionPane.showInputDialog("Digite a cor do mamifero:")));
			m.setAmbiente(String.valueOf(JOptionPane.showInputDialog("Digite o ambiente do mamifero:")));
			m.setVelocidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media do mamifero:")));
			m.setAlimento(String.valueOf(JOptionPane.showInputDialog("Digite o alimento do mamifero:")));
		}else if(op==3){
			p.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o tipo do peixe:")));
			p.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do peixe:")));
			p.setPatas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de patas do peixe:")));
			p.setCor(String.valueOf(JOptionPane.showInputDialog("Digite a cor do peixe:")));
			p.setAmbiente(String.valueOf(JOptionPane.showInputDialog("Digite o ambiente do peixe:")));
			p.setVelocidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media do peixe:")));
			p.setCarac(String.valueOf(JOptionPane.showInputDialog("Digite a caracteristica do peixe:")));
		}else if(op==4){
			JOptionPane.showMessageDialog(null, "Finalizando...");
			break;
		}else{
			JOptionPane.showMessageDialog(null, "Op??o errada tente novamente");
		}
		}
		JOptionPane.showMessageDialog(null, "Animal: "+a.getNome()+"\n"
				+ "Comprimento: "+a.getComprimento()+"m \n"
						+ "Patas: "+a.getPatas()+"\n"
								+ "Cor: "+a.getCor()+"\n"
										+ "Ambiente: "+a.getAmbiente()+"\n"
												+ "Velocidade: "+a.getVelocidade()+"\n");
		JOptionPane.showMessageDialog(null, "Animal: "+p.getNome()+"\n"
				+ "Comprimento: "+p.getComprimento()+"m \n"
						+ "Patas: "+p.getPatas()+"\n"
								+ "Cor: "+p.getCor()+"\n"
										+ "Ambiente: "+p.getAmbiente()+"\n"
												+ "Velocidade: "+p.getVelocidade()+"\n"
														+ "Caracteristica: "+p.getCarac());
		JOptionPane.showMessageDialog(null, "Animal: "+m.getNome()+"\n"
				+ "Comprimento: "+m.getComprimento()+"m \n"
						+ "Patas: "+m.getPatas()+"\n"
								+ "Cor: "+m.getCor()+"\n"
										+ "Ambiente: "+m.getAmbiente()+"\n"
												+ "Velocidade: "+m.getVelocidade()+"\n"
														+ "Alimento: "+m.getAlimento());
	}
	
	
}
