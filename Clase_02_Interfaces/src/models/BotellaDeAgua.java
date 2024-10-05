package models;
import interfaces.Pesable;

public class BotellaDeAgua implements Pesable {
	
	//propiedades//
	
	
	private double cantLitros;

	//constructor
	
	public BotellaDeAgua(double cantLitros) {
		super();
		this.cantLitros = cantLitros;
	}

	
	//Getters & Setters//
	
	public double getCantLitros() {
		return cantLitros;
	}

	public void setCantLitros(double cantLitros) {
		this.cantLitros = cantLitros;
	}

	//Adding unimplemented method to avoid class error//
	@Override
	public double getPesoEnGr() {
		// TODO Auto-generated method stub
		return  this.cantLitros * 1000 + 20;
	}

}
