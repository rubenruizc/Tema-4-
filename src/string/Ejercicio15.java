package string;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		String frase;
		String intento;

		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1 escriba una frase/palabra:");
		frase = sc.nextLine();

		String fraseDesordenada = desordenacionTexto(frase);
		System.out.println("Frase desordenada: " + fraseDesordenada);

		do {
			System.out.println("Jugador 2 escriba su intento:");
			intento = sc.nextLine();

		} while (!intento.equalsIgnoreCase(frase));

		System.out.println("ENHORABUENA");
		
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
}
