package Lista10;

public class Moto extends Veiculo {
	private double valdepre;
	private String seguroMoto;
	private double ValIPVA;
	public double Valdepre() {
		return getValornv()-(((getValornv()/100)*8)*getAnovei());
	}
	public String getSeguroMoto() {
		return "N�o a seguro";
	}
	public double ValIPVA() {
		if(getAnovei()<=0 && getAnovei()<=5) {
			return (getValornv()/100)*4;
		}else if(getAnovei()<=5 && getAnovei()<=10) {
			return (getValornv()/100)*3; 
		}else {
			return 0;
		}
	}


}
