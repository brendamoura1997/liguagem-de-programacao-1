package Lista10;

public class Notebook extends Computador {
	private double carregador;
	private double pasta;
	private String carregadorDesc;
	private String pastaDesc;
	
	public double getCarregador() {
		return carregador;
	}
	
	public void setCarregador(double carregador) {
		this.carregador= carregador;
	}

	public double getPasta() {
		return pasta;
	}

	public void setPasta(double pasta) {
		this.pasta = pasta;
	}

	public String getCarregadorDesc() {
		return carregadorDesc;
	}

	public void setCarregadorDesc(String carregadorDesc) {
		this.carregadorDesc = carregadorDesc;
	}

	public String getPastaDesc() {
		return pastaDesc;
	}

	public void setPastaDesc(String pastaDesc) {
		this.pastaDesc = pastaDesc;
	}
	public double SomaDesk() {
		return this.getCarregador()+this.getHd()+this.getMemoria()+this.getPlacaMae()+this.getProcessador()+this.getPasta()+this.getPV();
}
	
	public String notaFiscalNote() {
		return "Dados do Notebook\n"
				+ this.getCarregadorDesc()
				+this.getHdDesc()
				+this.getMemoriaDesc()
				+this.getPlacaDesc()
				+this.getProcessadorDesc()
				+this.getPastaDesc()
				+"Placa De Video "+this.getPVdesc();
	}
	
}
