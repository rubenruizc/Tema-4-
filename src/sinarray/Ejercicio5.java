package sinarray;

import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 5 que consiste en ir pidiendole números
 * al usuario, después los sumaremos además de establecer el mayor y el menor
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número del usuario
		double numeroUsuario;

		// Variable donde guardaremos la suma de los números del usuario
		double suma = 0;

		// El mayor número de los int es el mín
		double min = Double.MAX_VALUE;

		// El menor número de los int (0) es el máximo
		double max = Double.MIN_VALUE;

		// Tabla donde guardaremos los números del usuario
		double tabla[] = new double[10];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para ir pidiendo al usuario números e introducirlos a la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Escriba un número: ");
			numeroUsuario = sc.nextDouble();
			tabla[i] = numeroUsuario;
		}

		// Bucle para ir sumando los números de la tabla
		for (double resultado : tabla) {
			suma += resultado;

			// Condición para establecer el número mayor
			if (resultado > max) {
				max = resultado;
			}

			// Condición para establecer el número menor
			if (resultado < min) {
				min = resultado;
			}
		}

		// Imprimimos la suma de los números
		System.out.println("La suma de sus números es: " + suma);

		// Imprimimos el número más grande
		System.out.println("El número más grande es: " + max);

		// Imprimimos el número más chico
		System.out.println("El número más pequeño es: " + min);

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
