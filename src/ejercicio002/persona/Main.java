/**
 * 
 */
package ejercicio002.persona;

/**
 * @author 1
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p1;
		Persona p2;
		Persona p3;
		
		p1=new Persona("111-1","juan","perez","perez","masculino");
		p2=new Persona("222-2");
		p3=new Persona();
		
		p1.setNombre("pepe");
		p2.setApellidoPaterno("fernandez");
		p3.setRut("333-3");
		
		System.out.println(p1);

	}

}
