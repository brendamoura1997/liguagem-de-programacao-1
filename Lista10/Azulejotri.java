package Lista10;

public class Azulejotri extends Azulejos{
	public double areap(){
		return this.getLp()*this.getAp()*4;
	}
	
	public double areat() {
		return (this.getAa()*this.getLa())/2;
	}
	
	public double qntazut() {
		return this.areap()/this.areat();
	}
}
