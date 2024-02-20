package string;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la frase del usuario
		String frase;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Escriba una frase para convertirla en variable:");
		frase = sc.nextLine();

		// Imprimir el resultado de convertir la frase a CamelCase
		System.out.println(convertirACamelCase(frase));

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

	// Función para convertir una frase en CamelCase
	public static String convertirACamelCase(String frase) {

		// Dividir la frase en palabras utilizando el espacio como delimitador
		String[] palabras = frase.split(" ");

		// Variable donde guardaremos el resultado de la frase pasada a CamelCase
		String resultado = "";

		// Variable para controlar si es la primera palabra de la frase
		boolean primeraPalabra = true;

		// Bucle sobre cada palabra en el arreglo de palabras
		for (String palabra : palabras) {

			// Convertir la palabra a CamelCase
			if (primeraPalabra) {

				// Si es la primera palabra, convertir la primera letra a minúscula
				resultado += palabra.substring(0, 1).toLowerCase();

				// Cambiar la variable para indicar que ya no es la primera palabra
				primeraPalabra = false;

			} else {
				// Si no es la primera palabra, convertir la primera letra a mayúscula
				resultado += palabra.substring(0, 1).toUpperCase();
			}

			// Convertir el resto de la palabra a minúsculas y agregarla al resultado
			resultado += palabra.substring(1).toLowerCase();
//            
		}

		// Devolver la cadena resultado con la frase convertida a CamelCase
		return resultado;
	}
}