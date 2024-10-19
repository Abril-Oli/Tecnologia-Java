package mains;
import java.util.List;            // Para utilizar List

import comparators.ComparadorPerrosNombre;
import models.Perro;				//para usar modelo perro y compararlos la clase comp perros por nombre

import java.util.ArrayList;       // Para utilizar ArrayList
import java.util.Collections;     // Para utilizar Collections.max y Collections.min
import java.util.Comparator; 

public class MainPerroComparator {

	public static void main(String[] args) {
		
		// Creo una lista solo de Perros//
		List<Perro> perros = new ArrayList<Perro>();
		
		// Creo varios objetos tipo Perro //
		Perro perrin1 = new Perro("Pepe", 10);
		Perro perrin2 = new Perro("Chicho", 41);
		Perro perrin3 = new Perro("Firu", 55);
		Perro perrin4 = new Perro("Pippo", 7);
		
		// Agrego los perros a la lista//
		perros.add(perrin1);
		perros.add(perrin2);
		perros.add(perrin3);
		perros.add(perrin4);
		
			
		// Utilizo Collections para  el valor maxy min de lista perros//
		// El peso es el criterio natural del Comparable//
		Perro perroMax = Collections.max(perros); 
		Perro perroMin = Collections.min(perros); 
		
		System.out.println(perroMax); // Perro [nombre=Firu, pesoEnKg=55.0]
		System.out.println(perroMin); // Perro [nombre=Pippo, pesoEnKg=7.0]
		
		// METODO SORT - Ordena la lista bajo un criterio-peso//
		perros.sort(null);
		
		System.out.println("-------------- Lista con sort (Criterio natural) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}
		
		// Creo mi objeto  Comparator//
		ComparadorPerrosNombre compi = new ComparadorPerrosNombre();
		
		// Le implemento el criterio personalizado del Comparator- longitud de sus nombres//
		perros.sort(compi);
		
		System.out.println("-------------- Lista con sort (Criterio personalizado) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}
		
		
		
		
		

	}

}
