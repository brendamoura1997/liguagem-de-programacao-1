package Lista10;

public class Computador {
	private double placaMae;
	private double processador;
	private double hd;
	private double memoria;
	private double PV;
	private String placaDesc;
	private String processadorDesc;
	private String hdDesc;
	private String memoriaDesc;
	private String PVdesc;
	
	
	public void setPV(double PV){
		this.PV=PV;
	}
	
	public double getPV() {
		return PV;
	}
	
	
	public String getPVdesc() {
		return PVdesc;
	}

	public void setPVdesc(String pVdesc) {
		PVdesc = pVdesc;
	}

	public double getPlacaMae() {
		return placaMae;
	}
	public void setPlacaMae(double placaMae) {
		this.placaMae = placaMae;
	}
	public double getProcessador() {
		return processador;
	}
	public void setProcessador(double processador) {
		this.processador = processador;
	}
	public double getHd() {
		return hd;
	}
	public void setHd(double hd) {
		this.hd = hd;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	public String getPlacaDesc() {
		return placaDesc;
	}
	public void setPlacaDesc(String placaDesc) {
		this.placaDesc = placaDesc;
	}
	public String getProcessadorDesc() {
		return processadorDesc;
	}
	public void setProcessadorDesc(String processadorDesc) {
		this.processadorDesc = processadorDesc;
	}
	public String getHdDesc() {
		return hdDesc;
	}
	public void setHdDesc(String hdDesc) {
		this.hdDesc = hdDesc;
	}
	public String getMemoriaDesc() {
		return memoriaDesc;
	}
	public void setMemoriaDesc(String memoriaDesc) {
		this.memoriaDesc = memoriaDesc;
	}
	
}
