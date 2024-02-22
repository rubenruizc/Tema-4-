package string;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 15 de Strings
 */

public class Ejercicio15 {

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del jugador 1
		String frase;

		// Variable donde guardaremos el intento del jugador 2
		String intento;

		// Variable donde guardaremos la frase desordenada
		String fraseDesordenada;

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

		} while (!intento.equalsIgnoreCase(frase));

		// Imprimimos que lo ha conseguido
		System.out.println("ENHORABUENA");

		// Cerramos el Scanner
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
		}

		// Devolvemos las letras desordenadas como una cadena
		return String.valueOf(letrasDesordenadas);

	} // Cierre de la función

} // Cierre de la clase
