package Menues;

import java.util.Scanner;

import Models.Usuario;
import interfaces.MenuIniciable;

//debe tener scanner ciclo y un metodo finalizar//
public class AuthMenu implements MenuIniciable{
	
	private Scanner sc;
		
	//constructor//
	public AuthMenu(Scanner sc) {
		super();
		this.sc = sc;
	}
	
public void start() {
	
	System.out.println("cual es tu nombre?");
	String nombre = sc.next();
	Usuario usu = Usuario.getInstance();
	
	//en vez de uardarlo en una variable efimera, lo guardamos en la variable us unico que creamos en usuario//
	usu.setNombre(nombre);
	
	//Usuario usuario = new Usuario(nombre,0);//
	
}

}
