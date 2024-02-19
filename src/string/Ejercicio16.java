package string;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		String frase;
		String intento;

		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1 escriba una frase/palabra:");
		frase = sc.nextLine();

		String fraseDesordenada = desordenacionTexto(frase);
		System.out.println("Frase desordenada: " + fraseDesordenada);

		int intentos = 0;
		do {
			System.out.println("Jugador 2 escriba su intento:");
			intento = sc.nextLine();
			intentos++;

			int coincidencias = contarCoincidencias(frase, intento);
			System.out.println("Coincidencias con la frase original: " + coincidencias);
		} while (!intento.equalsIgnoreCase(frase));

		System.out.println("ENHORABUENA, has acertado en " + intentos + " intentos.");

		sc.close();
	}

	public static String desordenacionTexto(String frase) {
		char[] letras = frase.toCharArray();

// Creamos un array para almacenar las letras desordenadas
		char[] letrasDesordenadas = new char[frase.length()];
		Random random = new Random();
		int numeroLetra;

		for (int i = 0; i < frase.length(); i++) {
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
	}

	public static int contarCoincidencias(String fraseOriginal, String intento) {
		int coincidencias = 0;
		for (int i = 0; i < fraseOriginal.length() && i < intento.length(); i++) {
			if (fraseOriginal.charAt(i) == intento.charAt(i)) {
				coincidencias++;
			}
		}
		return coincidencias;
	}
}
