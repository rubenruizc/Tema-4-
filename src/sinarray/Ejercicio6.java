package sinarray;

import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 6 que consiste en ir pidiendole números
 * al usuario, después los almacenaremos en una tabla y después diremos cual de
 * ellos es par y cual es impar
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número del usuario
		int numeroUsuario;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Tabla donde guardaremos el número del usuario
		int tabla[] = new int[8];

		// Bucle para ir pidiendo al usuario números e introducirlos a la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Escriba un número: ");
			numeroUsuario = sc.nextInt();
			tabla[i] = numeroUsuario;
		}

		// Bucle para ir viendo en la tabla que número es par y cual es impar
		for (int numeros : tabla) {
			if (numeros % 2 == 0) {
				System.out.println(numeros + ": par");
			} else {
				System.out.println(numeros + ":impar");
			}
		}

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
