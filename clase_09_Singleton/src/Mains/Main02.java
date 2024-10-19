package Mains;

import Models.Usuario;
import factories.MenuFactory;
import interfaces.MenuIniciable;

public class Main02 {

	//brinda lo que necesito y se ocupa de construirlas//
	public static void main(String[] args) {
	MenuFactory factory = new MenuFactory();
	
	MenuIniciable menuLogin = factory.getMenuLogin();
	menuLogin.start();
	
	MenuIniciable menuJuego = factory.getMenuJuegos();
	menuJuego.start();

	var menuPuntos = factory.getMenuPuntos();
	menuPuntos.start();
	
		}
	}
