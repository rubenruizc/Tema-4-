package arraysbidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese 6 números
		System.out.println("Introduce 6 números para jugar a la Bonoloto (del 1 al 49):");
		int[] numerosUsuario = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numerosUsuario[i] = scanner.nextInt();
		}

		// Generar una serie aleatoria de 6 números (la serie ganadora)
		int[] serieGanadora = generarSerieGanadora();

		// Mostrar los números ingresados por el usuario y la serie ganadora
		System.out.println("\nNúmeros ingresados por el usuario: " + Arrays.toString(numerosUsuario));
		System.out.println("Serie ganadora: " + Arrays.toString(serieGanadora));

		// Comprobar si el usuario ha acertado algún número
		int aciertos = contarAciertos(numerosUsuario, serieGanadora);
		if (aciertos > 0) {
			System.out.println("\n¡Felicidades! Has acertado " + aciertos + " número(s) en la serie ganadora.");
		} else {
			System.out.println("\nLo siento, no has acertado ningún número en la serie ganadora. ¡Inténtalo de nuevo!");
		}

		// Cerrar el objeto Scanner
		scanner.close();
	}

	// Método para generar una serie aleatoria de 6 números entre 1 y 49
	private static int[] generarSerieGanadora() {
		int[] serie = new int[6];
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			serie[i] = random.nextInt(49) + 1;
		}
		return serie;
	}

	// Método para contar cuántos números coinciden entre la serie del usuario y la
	// serie ganadora
	private static int contarAciertos(int[] numerosUsuario, int[] serieGanadora) {
		int aciertos = 0;
		for (int numeroUsuario : numerosUsuario) {
			for (int numeroGanador : serieGanadora) {
				if (numeroUsuario == numeroGanador) {
					aciertos++;
					break; // Si se encuentra una coincidencia, pasar al siguiente número del usuario
				}
			}
		}
		return aciertos;
	}
}
