package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 17 de Strings
 */

public class Ejercicio17 {

	public static void main(String[] args) {

		// Variable donde se almacenará el código
		String codigo = "";

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el código
		System.out.println("Introduce el código en C");
		codigo = sc.nextLine();

		System.out.println(codigoSinComents(codigo));

		// Cerramos el Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Método que elimina los comentarios del código
	 * 
	 * @param codigo Codigo completo
	 * @return Codigo sin comentarios
	 */
	static String codigoSinComents(String codigo) {
		// Variable donde se almacenará el código sin comentarios
		String noComments = "";

		// Variable donde se almacenará si está en comentario
		boolean inComment = false;

		// Variable donde se almacenará el caracter actual
		char currentChar;

		// Bucle para recorrer la cadena
		for (int i = 0; i < codigo.length(); i++) {
			// Obtenemos el caracter actual
			currentChar = codigo.charAt(i);

			// Comprobamos si está en un comentario
			if (!inComment) {
				// Comprobamos si el caracter actual es / y el siguiente *
				if (currentChar == '/' && i + 1 < codigo.length() && codigo.charAt(i + 1) == '*') {
					// Cambiamos el valor a true de inComment
					inComment = true;

					// Nos saltamos el asterisco
					i++;
				} else {
					// Añadimos el char a la frase si no está comentado
					noComments += currentChar;
				}
			} else {
				// Si está en comentario, comprobamos si el caracter actual es * y el siguiente
				// /
				if (currentChar == '*' && i + 1 < codigo.length() && codigo.charAt(i + 1) == '/') {
					// Cambiamos el valor a false de inComment
					inComment = false;

					// Nos saltamos la barra
					i++;
				}
			}
		}

		// Devolvemos la cadena
		return noComments;

	} // Cierre de la función

} // Cierre de la clase
