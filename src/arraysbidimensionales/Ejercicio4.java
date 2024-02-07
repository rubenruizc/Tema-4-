package arraysbidimensionales;

/**
 * Clase donde se realizara el ejercicio 4 que consite en hacer las tablas de
 * multiplicar desde el 1 a el 10
 */

public class Ejercicio4 {

	/**
	 * Función que genera y devuelve una matriz con la tabla de multiplicar del 1 al
	 * 10
	 * 
	 * @return
	 */

	public static int[][] tablaMultiplcicar() {

		// Tabla donde guardaremos una matriz de 10x10 para almacenar la tabla de multiplicar
		int[][] tabla = new int[10][10];

		// Recorre las filas de la matriz
		for (int i = 0; i < tabla.length; i++) {

			// Recorre las columnas de la matriz
			for (int j = 0; j < tabla[0].length; j++) {

				// Calcula y asigna el producto de los índices más 1 (para obtener la tabla de
				// multiplicar del 1 al 10)
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}
		// Devuelve la matriz con la tabla de multiplicar generada
		return tabla;

	} // Cierre de la función

	public static void main(String[] args) {
		// Recorre las filas de la matriz devuelta por la función tablaMultiplcicar
		for (int i = 0; i < tablaMultiplcicar().length; i++) {

			// Recorre las columnas de la matriz devuelta por la función tablaMultiplcicar
			for (int j = 0; j < tablaMultiplcicar()[0].length; j++) {

				// Imprime el elemento de la matriz seguido de una tabulación
				System.out.print(tablaMultiplcicar()[i][j] + "\t");
			}
			// Imprime un salto de línea para pasar a la siguiente fila
			System.out.println();
		}
	} // Cierre del main

} // Cierre de la clase
