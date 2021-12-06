package Lista10;

public class Desktop extends Computador{
	private double estabilizador;
	private double teclado;
	private String estabilizadorDesc;
	private String tecladoDesc;
	public double getEstabilizador() {
		return estabilizador;
	}
	public void setEstabilizador(double estabilizador) {
		this.estabilizador = estabilizador;
	}
	public double getTeclado() {
		return teclado;
	}
	public void setTeclado(double teclado) {
		this.teclado = teclado;
	}
	public String getEstabilizadorDesc() {
		return estabilizadorDesc;
	}
	public void setEstabilizadorDesc(String estabilizadorDesc) {
		this.estabilizadorDesc = estabilizadorDesc;
	}
	public String getTecladoDesc() {
		return tecladoDesc;
	}
	public void setTecladoDesc(String tecladoDesc) {
		this.tecladoDesc = tecladoDesc;
	}
	
	
		public double SomaDesk() {
			return this.getEstabilizador()+this.getHd()+this.getMemoria()+this.getPlacaMae()+this.getProcessador()+this.getTeclado()+this.getPV();
	}
		
		public String notaFiscalDesk() {
			return "Dados do Desktop \n"
					+ this.getEstabilizadorDesc()
					+this.getHdDesc()
					+this.getMemoriaDesc()
					+this.getPlacaDesc()
					+this.getProcessadorDesc()
					+this.getTecladoDesc()
					+"Placa De Video "+this.getPVdesc();

		}
}
