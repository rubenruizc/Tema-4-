package string;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del usuario
		String frase;

		// Variable donde guardaremos la palabra del usuario
		String palabra;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la frase y la leemos
		System.out.println("Escriba una frase: ");
		frase = sc.nextLine();

		// Le preguntamos al usuario la palabra que quiere buscar y la leemos
		System.out.println("Escriba la palabra que quieras buscar en la frase: ");
		palabra = sc.next();

		if (contarPalabra(frase, palabra) > 1) {
			// Llamando a la función sabemos la cantidad de veces que aparece la palabra
			// deseada
			System.out.println(
					"La palabra \"" + palabra + "\" aparece " + contarPalabra(frase, palabra) + " veces en la frase.");
		
		}else if (contarPalabra(frase, palabra) == 1) {
			System.out.println(
					"La palabra \"" + palabra + "\" aparece " + contarPalabra(frase, palabra) + " vez en la frase.");
		} else {
			System.out.println(
					"La palabra \"" + palabra + "\" no aparece en la frase");
		}

		// Cierre del Scanner
		sc.close();
		
	} // Cierre del main

	// Función para contar las veces que sale la palabra que buscamos
	public static int contarPalabra(String frase, String palabra) {
		// Variable donde guardaremos la cantidad de veces que esta la palabra en la
		// frase
		int contador = 0;

		// Convertir la frase y la palabra a minúsculas para que no influyan las
		// mayúsculas
		frase = frase.toLowerCase();
		palabra = palabra.toLowerCase();

		// Dividir la frase en palabras
		String[] palabras = frase.split(" ");

		// Recorrer cada palabra y comparar con la palabra buscada
		for (String p : palabras) {
			if (p.equals(palabra)) {
				contador++;
			}
		}

		// Devolvemos la cantidad de veces que se ha encontrado la palabra
		return contador;

	} // Cierre de la función

} // Cierre de la clase
