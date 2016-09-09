/**
 * 
 */
package ejercicio003.pais;

import java.util.Date;

/**
 * Clase que representa paises de la realidad
 * @author 1
 * version 1.0 08/09/2016
 */
public class Pais {
	
	private String nombre;
	private Integer habitantes;
	private Integer metrosCuadrados;
	private Date fechaIndependencia;
	/**
	 * @param nombre
	 * @param habitantes
	 * @param metrosCuadrados
	 * @param fechaIndependencia
	 */
	public Pais(String nombre, Integer habitantes, Integer metrosCuadrados, Date fechaIndependencia) {
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.metrosCuadrados = metrosCuadrados;
		this.fechaIndependencia = fechaIndependencia;
	}
	/**
	 * 
	 */
	public Pais() {
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the habitantes
	 */
	public Integer getHabitantes() {
		return habitantes;
	}
	/**
	 * @param habitantes the habitantes to set
	 */
	public void setHabitantes(Integer habitantes) {
		this.habitantes = habitantes;
	}
	/**
	 * @return the metrosCuadrados
	 */
	public Integer getMetrosCuadrados() {
		return metrosCuadrados;
	}
	/**
	 * @param metrosCuadrados the metrosCuadrados to set
	 */
	public void setMetrosCuadrados(Integer metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	/**
	 * @return the fechaIndependencia
	 */
	public Date getFechaIndependencia() {
		return fechaIndependencia;
	}
	/**
	 * @param fechaIndependencia the fechaIndependencia to set
	 */
	public void setFechaIndependencia(Date fechaIndependencia) {
		this.fechaIndependencia = fechaIndependencia;
	}
	
	public String impresion(){
		return "El pais tiene: "+this.nombre+" con la cantidad de habitantes: "+ this.habitantes+
				"los metros cuadrados: "+this.metrosCuadrados+" la fecha de independencia: "+this.fechaIndependencia;
	}

}
