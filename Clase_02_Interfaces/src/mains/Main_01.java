package mains;
import interfaces.Pesable;
import models.BotellaDeAgua;
import models.Perro;
import utils.Balanza;

//TEMARIO: PESANDO CON BALANZA//
public class Main_01 {

	public static void main(String[] args) {
	
//creamos obj pesable tipo Perro//
		
Pesable pesable_1 = new Perro("Chichino",25);		


//creamos obj pesable tipo BotellaDeAgua//

Pesable pesable_2 = new BotellaDeAgua(3);


//creamos obj tipo Balanza//
Balanza bal = new Balanza();
	
//obtengo obj pesable + pesado con metodo balanza//

Pesable masPesado = bal.getMasPesado(pesable_1, pesable_2);

//muestro  el valor de obj + pesado//

System.out.println("El mas pesado es: " + masPesado.getPesoEnKg());


	}

}
