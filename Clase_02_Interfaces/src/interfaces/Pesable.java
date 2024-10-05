package interfaces;

public interface Pesable {
	
	//metodo asbtracto-sin logica//
	
	public double getPesoEnGr();
	
	//metodo concreto- con logica//
	public default double getPesoEnKg() {
		
	return this.getPesoEnGr() /1000;
			
	}
	
	public default double getPesoEnMg() {
		return this.getPesoEnGr() * 1000;
		
		
	}
	
}
