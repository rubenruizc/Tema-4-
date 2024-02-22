package string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 4 de Strings
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del usuario
		String frase;

		// Tabla donde guardaremos cada palabra de la frase
		String palabras[];

		int contadorPalabras = 1;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario una frasse y la leemos
		System.out.println("Escriba una frase: ");
		frase = sc.nextLine();

		// Dividimos la frase por palabras
		palabras = frase.split(" ");

		// Ordenamos la cadena
		Arrays.sort(palabras);

		// Vamos imprimendo las palabras ya ordenadas
		for (String resultado : palabras) {

			// Le decimos al usuario cual es el orden de las palabras
			System.out.println("La palabra " + contadorPalabras + " sería: " + resultado);

			// Le sumamos uno al contador 
			contadorPalabras++;
		}
		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
