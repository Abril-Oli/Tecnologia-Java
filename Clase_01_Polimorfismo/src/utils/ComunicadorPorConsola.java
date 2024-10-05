package utils;

import java.util.Scanner;

public class ComunicadorPorConsola extends Comunicador {

//Atributos de clase CPC//
	private Scanner sc;

//Constructor de la clase CPC //
	public ComunicadorPorConsola() {

// Cuando instanciamos la clase nos crea también un nuevo Scanner
		this.sc = new Scanner(System.in);
	}

// Le damos implementaciones a los métodos abstractos heredados//

@Override
	public void enviar(String msg) {
// La implementación será mostrar en pantalla el mensaje que recibe//
		System.out.println(msg);
	}

@Override
	public String recibir() {
// La implementación retorna lo que se escribió en el Scanner//
		return this.sc.next();
	}

}