package Mains;

import java.util.Scanner;

import Menues.AuthMenu;
import Menues.JuegosMenu;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AuthMenu aMenu = new AuthMenu(sc);
		aMenu.start();
		
		JuegosMenu jMenu = new JuegosMenu(sc);
		jMenu.start();

	}

}
