package arraysbidimensionales;

/**
 * Clase donde se realizara el ejercicio 3 que consite en hacer una serie de
 * calculos dentro de los índices de una tabla
 */

public class Ejercicio3 {

	/**
	 * Función que recibe una matriz bidimensional de enteros y asigna valores
	 * calculados a cada elemento
	 * 
	 * @param tabla
	 */

	public static void recibeTabla(int[][] tabla) {

		// Recorre las filas de la matriz
		for (int i = 0; i < tabla.length; i++) {

			// Recorre las columnas de la matriz
			for (int j = 0; j < tabla[0].length; j++) {

				// Asigna a cada elemento el valor calculado en función de la suma de los índices de fila y columna
				tabla[i][j] = 10 * (i + j);
			}
		}
	} // Cierre de la función

	public static void main(String[] args) {
		// Tabla donde guardaremos una matriz de enteros de tamaño 4x5
		int tabla[][] = new int[4][5];

		// Llama al método recibeTabla pasando la matriz creada
		recibeTabla(tabla);

		// Recorre la matriz actualizada y la imprime en la consola
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {

				// Imprime el elemento de la matriz seguido de una tabulación
				System.out.print(tabla[i][j] + "\t");
			}

			// Imprime un salto de línea para pasar a la siguiente fila
			System.out.println();
		}

	} // Cierre del main

} // Cierre de la clase
