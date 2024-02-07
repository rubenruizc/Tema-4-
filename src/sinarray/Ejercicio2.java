package sinarray;

import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 2 que consiste en ir pidiendo valores
 * al usuario e imprimiendolos
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número del usuario
		double numeroUsuario;

		// Tabla donde guardaremos los números del usuario
		double tabla[] = new double[5];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para ir pidiendo al usuario números e introducirlos a la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Escriba un número decimal: ");
			numeroUsuario = sc.nextDouble();
			tabla[i] = numeroUsuario;
		}

		// Bucle para ir imprimiendo los números de la tabla
		for (double numero : tabla) {
			System.out.println(numero);
		}

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
