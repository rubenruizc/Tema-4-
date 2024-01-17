package conarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Variable donde guardaremos la tabla/array con una longitud de 8
		int tabla[] = new int[8];

		// Variable donde guardaremos la puntuación introducida por el usuario
		int puntuacion;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir al usuario la puntuación de cada jugador y almacenarla en la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Escriba una puntuación: ");
			puntuacion = sc.nextInt();
			tabla[i] = puntuacion;
		}

		// Ordenamos la tabla de manera creciente
		Arrays.sort(tabla);

		// Bucle para ir imprimiendo las puntuaciones de cada jugador 
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}

		// Cerrramos el Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
