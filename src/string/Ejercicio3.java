package string;

import java.util.Scanner;

public class Ejercicio3 {

	/**
	 * Clase donde realizaremos el Ejercicio 3 de Strings
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del usuario
		String frase;

		// Variable donde guardaremos el número de espacios
		int espacios;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos la frase al usuario
		System.out.println("Escriba una frase: ");
		frase = sc.nextLine();

		// Llamamos a la función
		espacios = contarEspaciosEnBlanco(frase);

		// Indicamos cuantos espacios tiene la frase
		System.out.println("La frase tiene " + espacios + " espacios en blanco.");

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Función para contar el número de espacios en blanco
	 * 
	 * @param frase
	 * @return
	 */
	public static int contarEspaciosEnBlanco(String frase) {

		// Variable donde guardaremos el contador de espacios
		int contador = 0;

		// Bucle para saber la cantidad de espacios que contiene la frase
		for (int i = 0; i < frase.length(); i++) {

			// Condición para que el contador de espacios vaya incrementando
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}

		// Devuelve la cantidad de espacios
		return contador;

	} // Cierre de la función

} // Cierre de la clase
