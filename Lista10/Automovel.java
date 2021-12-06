package Lista10;

public class Automovel extends Veiculo {
	private double valdepre;
	private double seguroAuto;
	private double ValIPVA;
	public double Valdepre() {
		return getValornv()-(((getValornv()/100)*5)*getAnovei());
	}
	public double getSeguroAuto() {
		if(getAnovei()<=0 && getAnovei()<=5) {
			return (getValornv()/100)*4.5;
		}else if(getAnovei()<=5 && getAnovei()<=10) {
			return (getValornv()/100)*5; 
		}else {
			return (getValornv()/100)*5.5;
		}
	}
	public double ValIPVA() {
		if(getAnovei()<=0 && getAnovei()<=10) {
			return (getValornv()/100)*5;
		}else if(getAnovei()<=10 && getAnovei()<=20) {
			return (getValornv()/100)*4; 
		}else {
			return 0;
		}
	}

	
}
