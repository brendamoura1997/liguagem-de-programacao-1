package Lista10;

public class Caminhao extends Veiculo {
	private double valdepre;
	private double seguroAuto;
	private double ValIPVA;
	private int ton;
	public int getTon() {
		return ton;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}
	public double Valdepre() {
		return getValornv()-(((getValornv()/100)*3.5)*getAnovei());
	}
	public double getSegurocam() {
		return 500*(this.ton/10);
	}
	public double ValIPVA() {
		if(getAnovei()<=50) {
		if(this.ton<=0 && this.ton<=50) {
			return (getValornv()/100)*4;
		}else{
			return (getValornv()/100)*3; 
		}
		}
		else
		{
			return 0;
		}
	}
}
