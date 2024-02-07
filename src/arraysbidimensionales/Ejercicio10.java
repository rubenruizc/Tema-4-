package arraysbidimensionales;

/**
 * Clase donde se realizara el ejercicio 10 que consite en dar una vuelta de 90
 * grados a una tabla introducida
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// Tabla de prueba donde guardaremos los valores que queremos probar
		int tabla[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// Tabla que llama a la función para girarla 90º
		int tablaFin[][] = gira90(tabla);

		// Vamos añadiendo los valores a la tabla final
		for (int[] fila : tablaFin) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

	} // Cierre del main

	/**
	 * Función que hará que la tabla que le introduzcamos la gire 90 grados
	 * 
	 * @param tablaInicio
	 * @return
	 */
	public static int[][] gira90(int tablaInicio[][]) {

		// Variable donde guardaremos la tabla final para girarla
		int tablaFinal[][] = null;
		if (tablaInicio != null) {
			if (tablaInicio.length == tablaInicio[0].length) {
				tablaFinal = new int[tablaInicio.length][tablaInicio.length];

				for (int i = 0; i < tablaInicio.length; i++) {
					for (int j = 0; j < tablaInicio[0].length; j++) {
						tablaFinal[j][tablaInicio.length - i - 1] = tablaInicio[i][j];

					}
				}
			}
		}

		// Devolvemos la tabla final
		return tablaFinal;
		
	} // Cierre de la función
	
} // Cierre de la clase