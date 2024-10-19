package Models;
//el proposito dl programa es que exista un solo usuario//
public class Usuario {
	
	private String nombre;

	private int puntos;
	
	//Metodo estaticos//
	private static Usuario unico;
	
	//necesito la unica instancia del obj//
	public static Usuario getInstance() {
		if(unico  == null) {
		unico = new Usuario();
		}
		return  unico;		
		
	}
	
	//en vez de rearlo fuera, lo creamos dentro del metodo estatico, se crea a si mismo y cada vez que lo llamo se crea//
	public static void crearUsuario() {
		//Condicional si el usuario es nulo, osea no existe, lo crea//
		if(unico  == null) {
		unico = new Usuario();
	}
	}


//constructor vacio por singleton//

public Usuario() {
		
	}

//getters y setters//

public int getPuntos() {
	return puntos;
}
public void setPuntos(int puntos) {
	this.puntos = puntos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


//DELTA es un var que incrementa o disminuye numeros//puntos en este caso//
public void addPuntos(int delta) {
		
	this.puntos += delta;
}





}
