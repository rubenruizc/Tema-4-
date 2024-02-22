package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 8 de Strings
 */

public class Ejercicio8 {

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del usuario
		String frase;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario la frase y la leemos
		System.out.println("Escriba una frase:  (SIN TILDES)");
		frase = sc.nextLine();

		// Llamamos a la función e imprimimos en base al resultado
		if (esPalíndroma(frase.replace(" ", ""))) {
			System.out.println("Su frase es palíndroma");
		} else {
			System.out.println("Su frase no es palíndroma");
		}
		// Cierre del Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Función que comprueba si la frase añadida es Palíndroma
	 * @param fraseNormal
	 * @return
	 */
	public static boolean esPalíndroma(String fraseNormal) {

		// Variable donde guardaremos el resultado
		boolean es = false;

		// Variable donde guardaremos la frase del usuario pero invertida
		String fraseInvertida;

		// Llamamos a la función del ejercicio 5 para leer la frase alreves
		fraseInvertida = Ejercicio5.fraseInvertida(fraseNormal);

		// Si la frase alreves y la frase normal son iguales cambiamos el resultado a
		// true
		if (fraseInvertida.equalsIgnoreCase(fraseNormal)) {
			es = true;
		}

		// Devolvemos si la frase es o no Palíndroma
		return es;

	} // Cierre de la función

} // Cierre de la clase
