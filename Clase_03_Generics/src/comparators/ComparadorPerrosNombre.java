package comparators;

import java.util.Comparator;
import models.Perro;

public class ComparadorPerrosNombre
//definimos generics a comparar solo obj perro//
implements Comparator <Perro> {

//METODO COMPARE- solo se compararan objs tipo perro//
	
	@Override
	public int compare(Perro p1, Perro p2) {

		String nombre1 = p1.getNombre();
		String nombre2 = p2.getNombre();
		
		return nombre1.compareToIgnoreCase(nombre2);
	}

}
	
