package arraysbidimensionales;

import java.util.Random;

/**
 * Clase donde se realizara el ejercicio 7 que consite en hacer una tabla transpuesta de otra tabla
 */

public class Ejercicio7 {

	public static void main(String[] args) {

		// Tabla donde guardaremos la tabla original
		int tabla1[][] = new int[4][4];;
		
		// Tabla donde guardaremos la tabla transpuesta
		int tabla2[][] = new int[4][4];;

		// Objeto Random para generar números aleatorios
		Random r = new Random();

		// Rellena la primera matriz con números aleatorios
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				tabla1[i][j] = r.nextInt(10);
			}
		}

		// Imprime la primera matriz
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				System.out.print(tabla1[i][j] + "\t");
			}
			System.out.println();
		}

		// Calcula la transpuesta de la primera matriz
		tabla2 = Transpuesta(tabla1);
		System.out.println("-----------------------------------------");

		// Imprime la matriz transpuesta
		for (int i = 0; i < tabla2.length; i++) {
			for (int j = 0; j < tabla2[i].length; j++) {
				System.out.print(tabla2[i][j] + "\t");
			}
			System.out.println();
		}
		
	}// Cierre del main

	/**
	 * Función para calcular la transpuesta de una matriz
	 * 
	 * @param tabla
	 * @return
	 */
	public static int[][] Transpuesta(int[][] tabla) {
		
		// Tabla donde guardaremos la tabla transpuesta
		int[][] transpuesta = new int [4][4];

		// Calcula la transpuesta intercambiando filas y columnas
		for (int j = 0; j < tabla.length; j++) {
			for (int i = 0; i < tabla[j].length; i++) {
				transpuesta[i][j] = tabla[j][i];
			}
		}

		// Devuelve la matriz transpuesta
		return transpuesta;
	
	} // Cierre de la función

} // Cierre de la clase