package funcionesarray;

import java.util.Arrays;

/**
 * Clase donde realizaremos el ejercicio 2 que consiste en calcular cual es el
 * número máximo que se encuentra en una tabla
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		// Variable donde guardaremos la tabla/array con longitud 10
		int tabla[] = new int[10];

		// Variable donde guardaremos los números random para introducirlos en la tabla
		int numerosRandom;

		// Bucle para introducir en la tabla numeros randoms
		for (int i = 0; i < tabla.length; i++) {
			numerosRandom = (int) (Math.random() * 20 + 1);

			// Introducimos el número a la tabla
			tabla[i] = numerosRandom;
		}

		// Imprimimos la tabla
		System.out.println(Arrays.toString(tabla));

		// Imprimimos el valor máximo de la tabla y llamamos a la función
		System.out.println("El valor máximo de la tabla es: " + numeroMaximo(tabla));

	} // Cierre del main

	/**
	 * Función para calcular cual es el número máximo que se encuentra en la tabla
	 * 
	 * @param tabla
	 * @return
	 */

	public static int numeroMaximo(int[] tabla) {

		// Variable donde guardaremos el valor máximo
		int max = 0;

		// Bucle para ir atribuyendo a la variable número los valores de la tabla
		for (int numero : tabla) {

			// Condicional para establecer el valor máximo
			if (max < numero) {
				max = numero;
			}
		}

		// Devolvemos el valor máximo
		return max;
	}

} // Cierre de la clase
