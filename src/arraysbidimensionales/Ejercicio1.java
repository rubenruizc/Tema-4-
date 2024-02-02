package arraysbidimensionales;

/**
 * Clase donde recogeremos el ejercicio 1
 */
public class Ejercicio1 {

	/**
	 * Método main
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		// Creamos un array bidimensional
		final int num[][] = new int[3][6];

		// Introducimos los valores deseados a cada índice de la tabla/array
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Bucle para ir imprimiendo las filas
		for (int filas = 0; filas < num.length; filas++) {

			// Bucle para ir imprimiendo las columnas
			for (int columnas = 0; columnas < num[0].length; columnas++) {
				System.out.print(num[filas][columnas] + "\t");
			}

			// Espacio para saltar de línea
			System.out.println();
		}

	}

}
