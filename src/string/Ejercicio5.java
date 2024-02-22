package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 5 de String
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la frase del usuario
		String frase;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que escriba una frase y la leemos
		System.out.println("Escriba una frase:");
		frase = sc.nextLine();

		// Llamando a la función invertimos la frase introducida por el usuario
		System.out.println(fraseInvertida(frase));
		
		// Cerramos el Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Función que sirve para invertir la frase del usuario
	 * @param frase
	 * @return
	 */
	public static String fraseInvertida(String frase) {
		
		// Variable donde guardaaremos la frase del usuario pero invertida
		String cadenaInvertida = "";

		// Bucle para invertir las letras de la frase
		for (int i = frase.length() - 1; i >= 0; i--) {
			cadenaInvertida += frase.charAt(i);
		}

		// Devolvemos la frase invertida
		return cadenaInvertida;

	} // Cierre de la función

} // Cierre de la clase
