package sinarray;

import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 8 que consiste en pedir al usuario una
 * posición y buscarla en la tabla
 * 
 */

public class Ejercicio8 {

	public static void main(String[] args) {

		// Tabla donde guardaremos 100 números para que el usuario elija uno de ellos
		int tabla[] = new int[100];

		// Variable donde guardaremos la posición elegida por el usuario
		int elegirPosicion;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para introducir números random a la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10 + 1);
		}

		// Bucle para pedirle la posición al usuario hasta que introduzca la correcta
		do {
			System.out.println("Que posición de la tabla le gustaría ver: ");
			elegirPosicion = sc.nextInt();

			// Bucle para imprimir la posición donde se encuentra el número elegido por el usuario
			for (int i = 0; i < tabla.length; i++) {
				if (tabla[i] == elegirPosicion) {
					System.out.println(i);
				}

			}
		} while (elegirPosicion > 10);

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
