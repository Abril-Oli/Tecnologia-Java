package Menues;

import java.util.Scanner;

import Models.Usuario;
import interfaces.MenuIniciable;

public class MenuPuntos implements MenuIniciable {
	
	private Usuario usu;
	private Scanner sc;
	
	// Constructor
	public MenuPuntos(Scanner sc, Usuario usu) {
		this.sc = sc;
		this.usu = usu;
	}
	
	
	public void start() {
		System.out.println("Tenes" + usu.getPuntos());
		System.out.println("Elegi");
		System.out.println("1- consejo GOAT");
		
		int opcion = sc.nextInt();
		if(opcion ==1) {
			usu.addPuntos(-30);
			System.out.println(" al que madruga dios lo ayuda");
		}
		
	}
}
