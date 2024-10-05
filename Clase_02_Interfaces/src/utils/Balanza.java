package utils;

import interfaces.Pesable;

public class Balanza {

//metodo clase balanza//

public Pesable getMasPesado(Pesable pesable_1, Pesable pesable_2) {
	
//obtener pesos de los pesables//

	double peso_1 = pesable_1.getPesoEnKg();
	double peso_2 = pesable_2.getPesoEnKg();


//uso de operadores ternarios para condicion//

	return peso_1 > peso_2 ? pesable_1 : pesable_2;
	
	}	

	
}
