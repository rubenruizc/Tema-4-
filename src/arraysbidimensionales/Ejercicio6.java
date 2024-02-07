package arraysbidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase donde se realizara el ejercicio 6 que consite en jugar a la Bonoloto
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		// Tabla donde guardaremos los 6 números introducidos por el usuario
		int[] numerosUsuario = new int[6];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que nos escriba 6 números para jugar y los leemos
		System.out.println("Introduce 6 números para jugar a la Bonoloto (del 1 al 49):");
		for (int i = 0; i < 6; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numerosUsuario[i] = sc.nextInt();
		}

		// Genera la serie ganadora aleatoria
		int[] serieGanadora = generarSerieGanadora();

		// Imprime los números ingresados por el usuario y la serie ganadora
		System.out.println("\nNúmeros ingresados por el usuario: " + Arrays.toString(numerosUsuario));
		System.out.println("Serie ganadora: " + Arrays.toString(serieGanadora));

		// Cuenta los aciertos del usuario en la serie ganadora
		int aciertos = contarAciertos(numerosUsuario, serieGanadora);
		// Informa al usuario sobre sus aciertos
		if (aciertos > 0) {
			System.out.println("\n¡Felicidades! Has acertado " + aciertos + " número(s) en la serie ganadora.");
		} else {
			System.out.println("\nLo siento, no has acertado ningún número en la serie ganadora. ¡Inténtalo de nuevo!");
		}

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Método para generar una serie ganadora aleatoria de 6 números del 1 al 49
	 * 
	 * @return
	 */

	private static int[] generarSerieGanadora() {

		// Tabla donde guardaremos una serie de la Bonoloto aleatoria
		int[] serie = new int[6];
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			serie[i] = random.nextInt(49) + 1;
		}

		// Devolvemos la serie generada
		return serie;
	}

	/**
	 * Método para contar los aciertos del usuario en la serie ganadora
	 * 
	 * @param numerosUsuario
	 * @param serieGanadora
	 * @return
	 */

	private static int contarAciertos(int[] numerosUsuario, int[] serieGanadora) {

		// Variable donde guardaremos el número de aciertos
		int aciertos = 0;
		// Itera sobre los números del usuario
		for (int numeroUsuario : numerosUsuario) {
			// Itera sobre los números de la serie ganadora
			for (int numeroGanador : serieGanadora) {
				// Compara si hay aciertos
				if (numeroUsuario == numeroGanador) {
					aciertos++;
					// Si se encuentra una coincidencia, pasa al siguiente número del usuario
					break;
				}
			}
		}

		// Devuelve el número de aciertos
		return aciertos;

	} // Cierre de la función

} // Cierre del Scanner