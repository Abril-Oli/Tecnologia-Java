package models;
import interfaces.Pesable;

public class Perro implements Pesable {
	//propiedades//
	
	private String nombre;
	private double pesoEnKg;
	
	//constructor Perro//
	
	public Perro(String nombre, double pesoEnKg) {
		super();
		this.nombre = nombre;
		this.pesoEnKg = pesoEnKg; }
		
	//Getters//
		
		public String getNombre() {
		return nombre;
		}	
		public double getPesoEnKg() {
			return pesoEnKg;
		}	
		
		
	//Setters//
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPesoEnKg(double pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}
	
//adding unimplementeds methods- avoiding  error in Perro class for no implemented method//
	
	@Override
	public double getPesoEnGr() {
		// TODO Auto-generated method stub
		return this.pesoEnKg* 1000;
	}
	

	
	
}
