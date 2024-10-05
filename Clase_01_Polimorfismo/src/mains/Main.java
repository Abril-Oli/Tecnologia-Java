package mains;

import utils.Comunicador;
import utils.ComunicadorPorConsola;

public class Main {

	public static void main(String[] args) {
		//CREACION PROGRAMA//

		//CREACION OBJ COMUNICADOR, aunque sea abstracto lo vinculamos a su clase hija//

		Comunicador comunicador = new ComunicadorPorConsola();

		//traemos al metodo concreto de saludo//

		comunicador.saludar();

		//traemos al metodo concreto de envio//
		comunicador.enviar("Como te llamas?");

		//traemos el metodo abstracto recibir() y lo guardamos en variable//

		String respuesta = comunicador.recibir();

		//ESTABLECEMOS CONDICION//
		if (respuesta.length() > 10) {

		// Si la respuesta es muy larga, utilzamos el metodo abstracto enviar() y que muestre un texto
			comunicador.enviar("ZZZzzzzzzzzz...");
		} else {

		// Caso contrario, utilzamos el metodo abstracto enviar() y que muestre un mensaje de bienvenida con el respuesta
			comunicador.enviar("Me alegro que vengas a ver Wicked " + respuesta);
		}

	}

}
