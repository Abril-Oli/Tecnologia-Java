package utils;

public class AlternadorDeStrings {

	//ATRIBUTOS/
	
	private String primario;
	private String secundario;
	private boolean usarPrimario;
	
	//CONSTRUCTOR//
	public AlternadorDeStrings() {
		this.usarPrimario = true;
	}
	
	
	//METODOS//
	//su funcion es devolver el mensaje activo, que puede ser primario o secundario. cualquiera que este activo //
	public String getActivo() {
		return usarPrimario ?
				primario : secundario;
	}
	
	
	//ALTERNAR- alterna entre estado del msj primario y secundario//
	public void alternar() {
		
		this.usarPrimario = !this.usarPrimario;
	}
	
	
	//getters//
	
	public String getPrimario() {
		return primario;
	}
	
	public String getSecundario() {
		return secundario;
	}
	
	public boolean isUsarPrimario() {
		return usarPrimario;
	}
	
	
	
	//setters//
	

	public void setPrimario(String primario) {
		this.primario = primario;
	}
	
	public void setSecundario(String secundario) {
		this.secundario = secundario;
	}
	
	public void setUsarPrimario(boolean usarPrimario) {
		this.usarPrimario = usarPrimario;
	}
	
	
}
