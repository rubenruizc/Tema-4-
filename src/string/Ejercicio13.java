package string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 13 de Strings
 */

public class Ejercicio13 {

	public static void main(String[] args) {
		// Variable donde guardaremos la primera palabra
		String palabra1;

		// Variable donde guardaremos la segunda palabra
		String palabra2;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que escriba una palabra y la leemos
		System.out.print("Escriba una palabra:");
		palabra1 = sc.nextLine();

		// Le pedimos al usuario que escriba otra palabra y la leemos
		System.out.print("Escriba otra palabra:");
		palabra2 = sc.nextLine();

		// Comprobamos si las palabras introducidas son anagramas
		if (esAnagrama(palabra1, palabra2)) {

			// Imprimir si las palabras son anagramas
			System.out.println("Si son anagrama");

		} else {

			// Imprimir si las palabras no son anagramas
			System.out.println("No son anagrama");
		}

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Función para comprobar si dos palabras son anagramas
	 * 
	 * @param palabra1
	 * @param palabra2
	 * @return
	 */
	public static boolean esAnagrama(String palabra1, String palabra2) {
		// Convertir ambas palabras a minúsculas y eliminar espacios en blanco
		palabra1 = palabra1.toLowerCase().replace(" ", "");
		palabra2 = palabra2.toLowerCase().replace(" ", "");

		// Convertir las palabras en arrays de caracteres
		char[] letras1 = palabra1.toCharArray();
		char[] letras2 = palabra2.toCharArray();

		// Ordenar los arrays de caracteres
		Arrays.sort(letras1);
		Arrays.sort(letras2);

		// Comprobar si los arrays de caracteres resultantes son iguales, lo que
		// indica que las palabras son anagramas
		return Arrays.equals(letras1, letras2);

	} // Cierre de la función

} // Cierre de la función
