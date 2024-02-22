package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 6 de Strings
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos las palabras introducidas por el usuario
		String palabras;
		
		// Variable donde guardaremos la frase con las palabras del usuario
		String frase = "";

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que escriba una palabra y la leemos
		System.out.print("Escriba una palabra: ");
		palabras = sc.next();

		// Mientras que la palabra del usuario no sea "fin" seguimos preguntando
		while (!palabras.equalsIgnoreCase("fin")) {
			
			// Limpiamos
			sc.nextLine();

			// Añadimos la palabra a la frase
			frase += palabras + " ";
			
			// Le pedimos al usuario que siga añadiendo palabras y las leemos
			System.out.print("Bien, siga escribiendo palabras: ");
			palabras = sc.next();

		}

		// Impirmimos la frase con las palabras del usuario
		System.out.println(frase);

		// Cerramos el Scanner
		sc.close();
	
	} // Cierre del main

}
