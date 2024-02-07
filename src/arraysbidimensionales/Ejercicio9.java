package arraysbidimensionales;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejemplo de uso
		int[][] matriz = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

		boolean esMagica = esMagica(matriz);
		System.out.println("¿Es la matriz mágica? " + esMagica);

	}

	public static boolean esMagica(int tabla[][]) {
		int n = tabla.length;

		// Calcular la suma de la primera fila
		int sumaFila = 0;
		for (int j = 0; j < n; j++) {
			sumaFila += tabla[0][j];
		}

		// Verificar la suma de las filas
		for (int i = 1; i < n; i++) {
			int sumaFilaActual = 0;
			for (int j = 0; j < n; j++) {
				sumaFilaActual += tabla[i][j];
			}
			if (sumaFilaActual != sumaFila) {
				return false;
			}
		}

		// Verificar la suma de las columnas
		for (int j = 0; j < n; j++) {
			int sumaColumnaActual = 0;
			for (int i = 0; i < n; i++) {
				sumaColumnaActual += tabla[i][j];
			}
			if (sumaColumnaActual != sumaFila) {
				return false;
			}
		}

		// Si todas las sumas son iguales, es una matriz mágica
		return true;
	}
}
