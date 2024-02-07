package arraysbidimensionales;

import java.util.Random;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// Declaramos una matriz bidimensional
		int tabla[][];
		
		// Declaramos otra matriz bidimensional
		int tablita[][];
		
		// Inicializamos tablita como una matriz de 4x4
		tablita = new int[4][4];
		
		// Inicializamos tabla como una matriz de 4x4
		tabla = new int[4][4];
		
		// Creamos un objeto de la clase Random para generar números aleatorios
		Random r = new Random();

		// Bucle para rellenar la tabla bidimensional con números aleatorios entre 0 y 9
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = r.nextInt(10);
			}
		}

		// Imprime la matriz original (tabla)
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			// Imprime una nueva línea después de imprimir cada fila
			System.out.println();
		}

		// Calcula la transpuesta de la matriz original (tabla) llamando a la función
		// Transpuesta y la almacena en tablita
		tablita = Transpuesta(tabla);
		System.out.println("-----------------------------------------");

		// Imprime la matriz transpuesta
		for (int i = 0; i < tablita.length; i++) {
			for (int j = 0; j < tablita[i].length; j++) {
				System.out.print(tablita[i][j] + "\t");
			}
			// Imprime una nueva línea después de imprimir cada fila
			System.out.println();
		}
	}

	/*
	 * Función para calcular la transpuesta de una matriz
	 */
	public static int[][] Transpuesta(int[][] tabla) {
		// Declaramos una nueva matriz para almacenar la transpuesta
		int[][] transpuesta;
		// Inicializamos la matriz transpuesta como una matriz de 4x4
		transpuesta = new int[4][4];

		for (int j = 0; j < tabla.length; j++) {
			for (int i = 0; i < tabla[j].length; i++) {
				transpuesta[i][j] = tabla[j][i];

			}
		}
		// Devuelve la matriz transpuesta
		return transpuesta;
	}
}