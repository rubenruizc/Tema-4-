package arraysbidimensionales;

import java.util.Random;

/**
 * Clase donde se realizara el ejercicio 5 que consite en sumar filas y columnas
 * y colocar la suma total
 */

public class Ejercicio5 {

	/**
	 * Función que rellena una matriz de tamaño 4x5 con números aleatorios entre 100
	 * y 999
	 * 
	 * @return
	 */

	public static int[][] rellenaArray() {

		// Crea una matriz de 4x5 para almacenar los números aleatorios
		int[][] tabla = new int[4][5];

		// Objeto Random para generar números aleatorios
		Random rand = new Random();

		// Recorre las filas de la matriz
		for (int i = 0; i < tabla.length; i++) {
			// Recorre las columnas de cada fila
			for (int j = 0; j < tabla[i].length; j++) {
				// Asigna un número aleatorio entre 100 y 999 a cada elemento de la matriz
				tabla[i][j] = rand.nextInt(901) + 100; // Se suma 100 para que los números estén en el rango [100, 999]
			}
		}

		// Devuelve la matriz rellenada con números aleatorios
		return tabla;

	} // Cierre de la función

	public static void main(String[] args) {
		// Llama a la función rellenaArray para obtener una matriz rellena con números aleatorios
		int[][] sumatorios = rellenaArray();

		// Variable donde guardaremos la suma de cada fila
		int sumaFila = 0;

		// Variable donde guardaremos la suma de cada columna
		int sumaColumna = 0; 

		// Variable donde guardaremos la suma total de todos los elementos de la matriz 
		int total = 0; 

		// Imprime la matriz y calcula la suma de cada fila
		for (int[] fila : sumatorios) {
			sumaFila = 0; // Reinicia la suma de la fila

			// Recorre los elementos de la fila
			for (int valor : fila) {

				// Imprime el valor y una tabulación
				System.out.print(valor + "\t");

				// Suma el valor al acumulador de la suma de la fila
				sumaFila += valor;
			}

			// Imprime la suma de la fila al final de la fila
			System.out.println(sumaFila);
		}

		// Calcula la suma de cada columna y la suma total de la matriz
		for (int j = 0; j < sumatorios[0].length; j++) {
			sumaColumna = 0; // Reinicia la suma de la columna

			// Recorre las filas de la matriz
			for (int i = 0; i < sumatorios.length; i++) {

				// Suma el valor de la columna al acumulador de la suma de la columna
				sumaColumna += sumatorios[i][j];
			}
			// Suma la suma de la columna a la suma total de la matriz
			total += sumaColumna;

			// Imprime la suma de la columna y una tabulación
			System.out.print(sumaColumna + "\t");
		}
		
		// Imprime la suma total de la matriz
		System.out.println(total);

	} // Cierre del main

} // Cierre de la clase
