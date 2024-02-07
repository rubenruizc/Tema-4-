package sinarray;

import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 3 que consiste en pidiendo valores al
 * usuario e imrpimirlos en el orden inverso al introducido
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número del usuario
		int numeroUsuario;

		// Tabla donde guardaremos los números del usuario
		int tabla[] = new int[10];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para ir pidiendo al usuario números e introducirlos a la tabla
		for (int y = 0; y < tabla.length; y++) {
			System.out.println("Escriba un número: ");
			numeroUsuario = sc.nextInt();
			tabla[y] = numeroUsuario;
		}

		// Bucle para ordenar los números en el orden inverso
		for (int i = tabla.length; i > 0; i--) {
			System.out.println(tabla[i - 1]);
		}

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
