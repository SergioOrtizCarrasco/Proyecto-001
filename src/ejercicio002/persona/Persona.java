/**
 * 
 */
package ejercicio002.persona;

/**
 * @author 1
 *
 */
public class Persona {
	private String rut;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String sexo;
	
	public Persona(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.sexo = sexo;
	}

	public Persona(String rut) {
		this.rut = rut;
	}
	

	public Persona() {
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
}
