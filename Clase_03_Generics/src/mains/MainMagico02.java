package mains;

import utils.AlternadorMagico;

public class MainMagico02 {

	public static void main(String[] args) {
		
	//INSTANCIA ALTERMAGICO//
		AlternadorMagico alternador = new AlternadorMagico();
	
		//seteamos un obj tipo gato//	
		
		alternador.setPrimario(new Gato ( "Tonki"), 10);
		
		//seteamos en segunda instancia mismo objeto tipo alter magico//
		alternador.setSecundario(alternador);
		
		//RULETA- su funcion sera alternar entre 2 objs//
		
		int numero = (int)(Math.random()* 10);
		
		for (int i = 0 ; i < numero ; i ++ ) {
			alternador.alternar();
			
		}
		
		
		//Cuando finaliza la ruleta, obtenemos nuestro Gato(pbjeto)//
		Gato g = (Gato) alternador.getActivo();
		
		//muestreo por pantalla//
		
		System.out.println(g.getNombre());
		
	}

}
