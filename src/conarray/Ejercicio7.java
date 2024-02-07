package conarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Clase donde realizaremos el ejercicio 7 que consiste jugar a la primitiva
 */

public class Ejercicio7 {

	public static void main(String[] args) {

		// Variable donde guardaremos la tabla de la apuesta random
		int tabla1[] = new int[6];

		// Variable donde guardaremos la tabla de la apuesta ganadora
		int tabla2[] = { 2, 15, 23, 33, 37, 42 };

		// Variable donde guardaremos el número de aciertos
		int aciertos = 0;

		// Variable donde generaremos números random desde el 1 al 49
		int numero;

		// Variable donde guardaremos la búsqueda de números repetidos
		int busqueda = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para generar números random e introducirlos en la tabla random y generar uno nuevo si ha salido repetido
		while (busqueda < tabla1.length) {
			numero = (int) (Math.random() * 49 + 1);
			if (busquedaSecuencial(tabla1, numero) < 0) {
				tabla1[busqueda] = numero;
				busqueda++;
			}

		}

		// Bucle para saber el número de aciertos que hemos conseguido
		for (int valor : tabla1) {
			if (Arrays.binarySearch(tabla2, valor) >= 0) {
				aciertos++;
			}
		}
		// Imprimimos la apuesta ganadora
		System.out.println("Apuesta ganadora: " + Arrays.toString(tabla2));

		// Imprimimos la apuesta random generada por la máquina
		System.out.println("Apuesta random: " + Arrays.toString(tabla1));

		// Imprimimos un espacio
		System.out.println();

		// Imprimimos el número de aciertos conseguidos
		System.out.println("Número de aciertos: " + aciertos);

		// Cerramos el Scanner
		sc.close();

	}// Cierre del main

	/**
	 * Funcion para buscar si en la apuesta random hay números repetidos
	 * @param tabla
	 * @param valor
	 * @return
	 */
	public static int busquedaSecuencial(int[] tabla, int valor) {
		int indice = 0;

		while (indice < tabla.length && valor != tabla[indice]) {
			indice++;
		}
		if (indice == tabla.length) {
			indice = -1;
		}
		return indice;
	}
} // Cierre de la clase
