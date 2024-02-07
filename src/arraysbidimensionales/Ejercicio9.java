package arraysbidimensionales;

/**
 * Clase donde se realizara el ejercicio 9 que consite en saber si una matriz es
 * mágina o no
 */

public class Ejercicio9 {

	public static void main(String[] args) {

		// Tabla donde guardaremos una matriz predefinida
		int[][] matriz = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

		// Verificamos si la matriz es mágica
		boolean esMagica = esMagica(matriz);
		System.out.println("¿Es la matriz mágica? " + esMagica);

	} // Cierre del main

	/**
	 * Función para determinar si una matriz es mágica
	 * 
	 * @param tabla
	 * @return
	 */
	public static boolean esMagica(int tabla[][]) {

		// Variable donde guardaremos el tamaño de la matriz
		int n = tabla.length;

		// Calculamos la suma de la primera fila
		int sumaFila = 0;
		for (int j = 0; j < n; j++) {
			sumaFila += tabla[0][j];
		}

		// Verificamos que todas las filas tengan la misma suma
		for (int i = 1; i < n; i++) {
			int sumaFilaActual = 0;
			for (int j = 0; j < n; j++) {
				sumaFilaActual += tabla[i][j];
			}
			if (sumaFilaActual != sumaFila) {
				return false; // Si alguna fila no tiene la misma suma, la matriz no es mágica
			}
		}

		// Verificamos que todas las columnas tengan la misma suma
		for (int j = 0; j < n; j++) {
			int sumaColumnaActual = 0;
			for (int i = 0; i < n; i++) {
				sumaColumnaActual += tabla[i][j];
			}
			if (sumaColumnaActual != sumaFila) {
				return false; // Si alguna columna no tiene la misma suma, la matriz no es mágica
			}
		}

		// Si todas las filas y columnas tienen la misma suma, la matriz es mágica
		return true;

	} // Cierre de la función

} // Cierre de la clase
