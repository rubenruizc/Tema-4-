package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 1 de Strings
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		// Variable donde guardaremos la primera frase
		String cadena1;

		// Variable donde guardaremos la segunda fase
		String cadena2;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos la primera frase al usuario
		System.out.println("Escriba una frase: ");
		cadena1 = sc.nextLine();

		// Le pedimos a la segunda frase al usuario
		System.out.println("Escriba otra frase: ");
		cadena2 = sc.nextLine();

		// Condicional para imprimir un mensaje dependiendo del resultado
		if (cadena1.length() > cadena2.length()) {
			System.out.println("La primera frase es más larga que la segunda");
		} else if (cadena1.length() == cadena2.length()) {
			System.out.println("Las dos frases tienen la misma longitud");
		} else {
			System.out.println("La segunda frase es más larga que la primera");
		}

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
