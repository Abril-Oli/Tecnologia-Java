package mains;

import utils.AlternadorDeStrings;

public class Main01 {

	public static void main(String[] args) {
		//creamos el obj alternadordestrings//
		AlternadorDeStrings alternador = new AlternadorDeStrings();

		//seteamos el primer y segundo valor//
		alternador.setPrimario("Argentina");
		alternador.setSecundario("Francia");
		
		//alternamos al que sea activo//
		alternador.alternar();
		//obtenemos el valor activo del alternador//
		
		String valor = alternador.getActivo();
	
	
		//muestreo del valor activo//
		System.out.println(valor);
		
		
	
	
	}
	
	

}
