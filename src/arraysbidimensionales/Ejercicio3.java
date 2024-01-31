package arraysbidimensionales;

public class Ejercicio3 {
	
	public static void recibeTabla(int[][] tabla) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = 10 * (i + j);
			}
		}
	}

	public static void main(String[] args) {
		int tabla[][] = new int[4][5];
		recibeTabla(tabla);
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}

			// Espacio para saltar de línea
			System.out.println();
		}

	}

}
