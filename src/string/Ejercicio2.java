package string;

import java.util.Scanner;

/**
 * Clase donde realziaremos el Ejercicio 2 de Strings
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		// Variable donde guardaremos la contraseña del usuario
		String contraseña;

		// Variable donde guardaremos el intento del segundo usuario
		String intento;

		// Variable donde guardaremos si el usuario 2 ha adivinado o no la contraseña
		boolean adivinado = false;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le explicamos al usuario el juego
		System.out.println("Bienvenido al juego 'Acierta la contraseña'!");

		// Leemos la contraseña del jugador 1
		System.out.println("Jugador 1, por favor introduce la contraseña:");
		contraseña = sc.nextLine();

		// Le vamos a pedir al usuario 2 que intente adivinar la contraseña
		System.out.println("Excelente. Jugador 2, intenta adivinar la contraseña.");

		// Bucle para ir preguntando al usuario hasta que acierte la contraseña
		while (!adivinado) {
			System.out.println("Introduce una palabra:");
			intento = sc.nextLine();

			if (intento.equals(contraseña)) {
				System.out.println("¡Felicidades! Has adivinado la contraseña.");
				adivinado = true;
			} else {
				if (intento.compareToIgnoreCase(contraseña) < 0) {
					System.out.println("La palabra introducida es menor alfabéticamente que la contraseña.");
				} else {
					System.out.println("La palabra introducida es mayor alfabéticamente que la contraseña.");
				}
			}
		}

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
