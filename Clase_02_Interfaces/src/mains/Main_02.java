package mains;

import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.Scanner;

//TEMARIO: GENERICS//
public class Main_02 {

	public static void main(String[] args) {
		
		//Lista sin especificar que datos contendra//

		ArrayList listaCaos = new ArrayList();
		
		
		//agregamos distintos tipos de datos a la lista- Strings y numeros//
		
		listaCaos.add("tresdechoclo"); 
		listaCaos.add("unadecarne");
		listaCaos.add(102024);
		
		Scanner sc = new Scanner(System.in);
		
		//agregamos obj tipo scanner//
		
		listaCaos.add(sc);
		
		//1er. Problema> casteo obligatorio//
		// los hacemos conversiones obligatorias explicitas de dato, porque no estan especificados los mismos//
		
		String texto=(String) listaCaos.get(0);
		System.out.println(texto);
		
		//2do. Problema> error casteo//
		// Al no especificar datos, podemos tener errores con un tipo de dato que no sea "Casteable"//
		// Si intentamos recuperar un elemento con el tipo incorrecto, habrá un error//
	     
		//String scannerTipoString = (String) listaCaos.get(2);  // Esto lanzará ClassCastException
		
	}

}
