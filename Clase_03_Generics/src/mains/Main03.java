package mains;

public class Main03 {

	public static void main(String[] args) {
	
		//el alternador recibira un comunicador- clase asbtracta padre//
		Alternador<Comunicador> alter = Alternador<Comunicador>();
		
		//seteamos nuestros comunicadores hijos, com Mayus y com Minus//		
		alter.setPrimario(new ComunicadorMayus());
		alter.setSecundario(new ComunicadorMinus());
		
		//logica para obtener un comunicador activo, mayus o minus//
		while(true) {
			alter.getActivo().enviar("Bratiana");
		//scanner- busca que el com activo, deje ingresar algo y ese algo se guarda en string op//
			String op = alter.getActivo().recibir();
		// si lo ingresado fue 1, busca el com activo y que el mismoe envie algo//
			
			if(op.equals("1")) {
				alter.getActivo().enviar("la simpatia es un cuchillo");
								
			}else if(op.equals("2")) {
				alter.alternar();
			}else {
				alter.getActivo().enviar("Opcion invalida mi ciela");
			}
			
		}
		
		
	}

}
