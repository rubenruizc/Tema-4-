package string;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String contraseña;
		String intento;
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al juego 'Acierta la contraseña'!");
		System.out.println("Jugador 1, por favor introduce la contraseña:");
		contraseña = sc.nextLine();

		System.out.println("Excelente. Jugador 2, intenta adivinar la contraseña.");

		boolean adivinado = false;
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

		sc.close();
	}
}