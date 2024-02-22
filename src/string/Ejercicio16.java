package string;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 16 de Strings
 */

public class Ejercicio16 {

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del jugador 1
		String frase;

		// Variable donde guardaremos la frase del jugador 2
		String intento;

		// Variable donde guardaremos la frase desordenada
		String fraseDesordenada;

		// Variable para contar el número de aciertos
		int intentos = 0;

		// Variable donde guardaremos la cantidad de letras acertadas
		int coincidencias;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al jugador 1 la frase y la leemos
		System.out.println("Jugador 1 escriba una frase/palabra:");
		frase = sc.nextLine();

		// Llamando a la función desordenamos la frase del jugador 1
		fraseDesordenada = desordenacionTexto(frase);
		System.out.println("Frase desordenada: " + fraseDesordenada);

		// Le preguntamos al jugador 2 hasta que acierte
		do {
			System.out.println("Jugador 2 escriba su intento:");
			intento = sc.nextLine();
			intentos++;

			coincidencias = contarCoincidencias(frase, intento);
			System.out.println("Coincidencias con la frase original: " + coincidencias);
		} while (!intento.equalsIgnoreCase(frase));

		System.out.println("ENHORABUENA, has acertado en " + intentos + " intentos.");

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Función para desordenar el texto
	 * 
	 * @param frase
	 * @return
	 */
	public static String desordenacionTexto(String frase) {

		// Creamos un array para guardar las letras de la frase introducidas por el
		// jugador 1
		char[] letras = frase.toCharArray();

		// Creamos un array para almacenar las letras desordenadas
		char[] letrasDesordenadas = new char[frase.length()];

		// Variable donde guardaremo el número random
		int numeroLetra;

		// Generador de números random
		Random random = new Random();

		// Bucle para ir escogiendo letras para añadir en la tabla de letras
		// desordenadas
		for (int i = 0; i < frase.length(); i++) {

			// Generamos un número random mientras la letra no haya sido seleccionada
			do {
				numeroLetra = random.nextInt(frase.length());

				// Verificamos si la letra ya ha sido seleccionada
			} while (letras[numeroLetra] == 0);

			// Asignamos una letra aleatoria de 'letras' a 'letrasDesordenadas'
			letrasDesordenadas[i] = letras[numeroLetra];

			// Marcamos la letra como ya seleccionada
			letras[numeroLetra] = 0;

		} // Cierre de la función

// Devolvemos las letras desordenadas como una cadena
		return String.valueOf(letrasDesordenadas);
	}

	/**
	 * Función para contar las letras acertadas
	 * 
	 * @param fraseOriginal
	 * @param intento
	 * @return
	 */
	public static int contarCoincidencias(String fraseOriginal, String intento) {

		// Variable donde guardaremos la cantidad de letras acertadas
		int coincidencias = 0;

		// Bucle para saber cuantas letras hay acertadas
		for (int i = 0; i < fraseOriginal.length() && i < intento.length(); i++) {
			if (fraseOriginal.charAt(i) == intento.charAt(i)) {
				coincidencias++;
			}
		}

		// Devolvemos el número de letras acertadas
		return coincidencias;

	} // Cierre de la función

} // Cierre de la clase
