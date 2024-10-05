package utils;

//especificamos abstraccion de la clase comunicador agregandole abstract//

public abstract class Comunicador {

//metodos abstractos- ENVIAR y RECIBIR//

	public abstract void enviar(String msg);

	public abstract String recibir();

//metodos concretos- SUMA y SALUDO//

	public int sumar(int a, int b) {
		return a + b;
	};

	public void saludar() {

		System.out.println("Ariana, what are you doing here?");
	}

	 {
		
		
	};

}
