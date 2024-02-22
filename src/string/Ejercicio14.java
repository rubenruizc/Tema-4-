package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 14 de Strings
 */

public class Ejercicio14 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos las letras de la frase
		char caracter;
		
		// Variable donde guardaremos la frase del usuario
		String frase;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Leemos la frase y la leemos
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();
		
		// Convertimos la frase a minúsculas para considerar mayúsculas y minúsculas
		// iguales
		frase = frase.toLowerCase();

		// Quitamos los espacios
		frase = frase.replace(" ", "");
		
		// Creamos un array para contar las ocurrencias de cada letra (incluso
		// caracteres especiales)
		int[] contador = new int[256]; // Tamaño suficiente para cubrir todos los posibles caracteres

		// Recorremos cada caracter de la frase
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			// Incrementamos el contador correspondiente al caracter
			contador[caracter]++;
		}

		// Mostramos el resultado
		System.out.println("Resultado:");
		for (int i = 0; i < contador.length; i++) {
			if (contador[i] > 0) {
				System.out.println((char) i + ": " + contador[i] + " veces");
			}
		}

		
		// Cerramos el Scanner
		sc.close();
	
	} // Cierre del main

} // Cierre de la clase
