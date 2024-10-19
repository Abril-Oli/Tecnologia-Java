package models;
import interfaces.Pesable;

//usamos interfaz comparable, para comparar naturalmente solo obj tipo perro//
public class Perro implements Comparable<Perro> {
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

	// TO STRING- seteamos atributos a comparar de cada perro/objeto//
		@Override
		public String toString() {
			return "Perro [nombre=" + nombre + ", pesoEnKg=" + pesoEnKg + "]";
		}

	// Implementacion COMPARE TO- //
	//logica de comparacion entre obj actual y obj argumentado en compareTo //
		@Override
		public int compareTo(Perro otro) {
			
			//valor premisa//
			//si el valor del perro actual es igual al Perro otro, devuelve 0//
			int resultado = 0;
			//logica comparacion//
			//si el valor del perro actual es MAYOR al OTRO, da 1//
			if(this.getPesoEnKg() > otro.getPesoEnKg()) {
				resultado = 1;
		//sino el valor del perro actual es menor al OTRO, da -1//
			}else  if(this.getPesoEnKg() < otro.getPesoEnKg()) {
				resultado = -1;
			}
			
		//devuelve el resultado obtenido de comparacion//	
			return resultado;
		}
		
	}