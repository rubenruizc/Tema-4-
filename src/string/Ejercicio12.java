package string;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la frase
		String frase;
		
		// Array para ir introduciendo las palabras
		String[] palabras;
		
		// Variable donde guardaremos la palabra más larga
		String palabraMasLarga = "";
		
		// Variable donde guardaremos cual es la longitud máxima de la palabra
		int longitudMaxima = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la frase y la leemos
		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();

		// Dividir la frase en palabras usando espacios como separadores
		palabras = frase.split(" ");
		
		// Bucle para ir estableciendo la palabra más larga
		for (String palabra : palabras) {
			if (palabra.length() > longitudMaxima) {
				longitudMaxima = palabra.length();
				palabraMasLarga = palabra;
			}
		}

		// Indicamos cual es la palabra más larga
		System.out.println("La palabra más larga es: " + palabraMasLarga);
		
		// Indicamos cuantos carácteres tiene la palabra más larga
		System.out.println("Número de caracteres: " + longitudMaxima);
		
		// Cierre del Scanner
		sc.close();
	
	} // Cierre del main

} // Cierre de la clase
