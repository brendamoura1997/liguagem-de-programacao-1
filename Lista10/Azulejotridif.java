package Lista10;

public class Azulejotridif extends Azulejos {
	public double areap(){
		return this.getLp()*this.getAp()*4;
	}
	
	public double areatd() {
		return (this.getAa()*this.getLa())/2;
	}
	
	public double qntazutd() {
		return this.areap()/this.areatd();
	}
}
