package conarray;

import java.util.Scanner;

/**
 *Clase donde realizaremos el ejercicio 6 que consiste en buscar en una tabla el valor que quiera el usuario
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		// Variable donde guardaremos la tabla/array con una longitud de 1000
		int tabla[] = new int[1000];

		// Variable donde guardaremos el valor N que el jugador quiere encontrar
		int valorN;

		// Variable donde guardaremos la cantidad de veces que aparece el número del
		// usuario
		int contador = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		
		// Bucle para ir asignando a cada celda de la tabla un valor aleatorio entre 1 y 100 (sin incluir este último)
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		
		// Le preguntamos al usuario que número le gustaría saber si esta o no en la tabla
		System.out.println("Escriba un valor que quiera ver si existe en la tabla: ");
		
		// Leemos el número
		valorN = sc.nextInt();
		
		// Bucle para saber si el número del usuario se encuentra en algún lugar de la tabla
		for (int i = 0; i < tabla.length; i++) {
			
			// Condicional que suma uno al contador si ve que el número introducido esta en alguna posición de la tabla
			if (valorN == tabla[i]) {
				contador++;
			}
		}

		// Condicional que imprime algo distinto dependiendo de si ha encontrado o no el número del usuario en la tabla
		if (contador != 0) {
			System.out.println("El número " + valorN + " se ha encontrado un total de " + contador + " veces");
		} else {
			System.out.println("Su número no se encuentra");
		}

		// Cerramos el Scanner
		sc.close();
		
	} // Cierre del main

} // Cierre de clase
