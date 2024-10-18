package utils;

public class AlternadorMagico {
//ATRIBUTOS//
	
	private Object primario;
	private Object secundario;
	private boolean usarPrimario;
	
	
	
//CONSTRUCTOR//
	public AlternadorMagico() {
		this.usarPrimario = true;
	}


//METODOS//
	
public Object getActivo() {
	
	return usarPrimario ?
			primario : secundario;
	
}	

public void alternar() {
	
	this.usarPrimario = !this.usarPrimario;
}
//GETTERS Y SETTERS//
//primario///

public Object getPrimario() {
	return primario;
}

public void setPrimario(Object primario) {
	this.primario = primario;
}

//secundario//

public Object getSecundario() {
	return secundario;
}


public void setSecundario(Object secundario) {
	this.secundario = secundario;
}

//usar primario//

public boolean isUsarPrimario() {
	return usarPrimario;
}


public void setUsarPrimario(boolean usarPrimario) {
	this.usarPrimario = usarPrimario;
}


}
