package Lista10;

public class Colega_Trabalho extends Pessoa {
	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String msgmail() {
		return "Mensagem de assinatura de e-mail: \n Att. "+this.getNome();
	}
}
