package Menues;

import java.util.Scanner;

import Models.Usuario;
import interfaces.MenuIniciable;

public class JuegosMenu implements MenuIniciable {

	private Scanner sc;
	private boolean continuar = true;
	
	//constructor//
	public JuegosMenu(Scanner sc) {
		super();
		this.sc = sc;
	}
//METODO START//	
	
public void start() {
	while(continuar)
	
	System.out.println("Elija");
	int opcion= sc.nextInt();
	
	//swtitch//
	
	switch (option) {
	case 1 -> this.adivinarLetra();
	case 2 -> this.adivinarSuma();
	case 0 -> this.continuar = false;
	
	
	
	default -> System.out.println("Invalida");
	

	}
	
}

private Object adivinarSuma() {
	
	return null;
	
}
//METODO- adivinar letra//

private void adivinarLetra() {
	System.out.println("Con que letra empieza Jorge?");
	String letra = sc.next();
	
if(letra.equalsIgnoreCase("J")) {
	System.out.println("bien");
	
//metodo "sucio" trabajo en estatico//
//Usuario.unico.addPuntos(100);
	
//metodo correcto, mas organizado trabajo sobre una variable//
	Usuario tonki = Usuario.getInstance();
	tonki.addPuntos(100);
	
	
	}
}
}


