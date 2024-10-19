package factories;

import java.util.Scanner;

import Menues.AuthMenu;
import Menues.JuegosMenu;
import interfaces.MenuIniciable;

//Factory/Service Provider//
//el obj nos devuelve interfaces//
public class MenuFactory {
	
	//implementamos singletone//
	private Scanner sc;
	
	public Scanner getScanner() {
		if(sc == null) {
			sc = new Scanner(System.in);
		}
		return sc;
	}
	
	//retorna menues, sin obj//
	public MenuIniciable getMenuLogin() {
		return new AuthMenu(this.getScanner());
		
		
	}
	public MenuIniciable getMenuJuegos() {
		return new JuegosMenu(this.getScanner());
		
	}
	
	public MenuIniciable getMenuPuntos() {
		return new JuegosMenu(this.getScanner());
		
	}

}
