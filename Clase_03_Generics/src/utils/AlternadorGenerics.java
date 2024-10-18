package utils;

public class AlternadorGenerics<T> {

	//ATRIBUTOS- seran del tipo de dato dentro de nuestro generic: T//
	private T primario;
	private T secundario;
	private boolean usarPrimario;
	
	//CONSTRUCTOR//
	public AlternadorGenerics() {
		this.usarPrimario = true;
	}
	
	//METODOS//
	public T getActivo() {
	return usarPrimario ?
			primario:secundario;
	}
	public void alternar() {
		this.usarPrimario =!this.usarPrimario;
	}
	
	//GETTERS Y SETTERS//
	//primario//
	public T getPrimario() {
		return primario;
	}

	public void setPrimario(T primario) {
		this.primario = primario;
	}
	//secundario//
	public T getSecundario() {
		return secundario;
	}

	public void setSecundario(T secundario) {
		this.secundario = secundario;
	}

}