/**
 * 
 */
package ejecicio001.animales;

import java.util.Scanner;

/**
 * @author 1
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nombre;
		String frase;
		String ferocidad;
		String hablar;
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("Usuario, ingrese el nombre de su perro");
		nombre=teclado.next();
		System.out.println("Ingrese la ferocidad del perro");
		ferocidad=teclado.next();
		
		Perro cain;
		
		cain=new Perro(nombre, ferocidad);
		System.out.println("El Perro fiero ladra: "+cain.ladrar());
		
		
		
		System.out.println("Que frase quieres que diga el Loro?");
		frase=teclado.next();
		
		Loro lorito;
		
		lorito= new Loro();
		System.out.println("El loro dice: "+lorito.hablar(""));

		Pinguino pingui= new Pinguino ("Aldela");
		System.out.println(pingui.toString());

	}

}
