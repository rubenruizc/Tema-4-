package arraysbidimensionales;

public class Ejercicio4 {

	public static int[][] tablaMultiplcicar() {
		int[][] tabla = new int[10][10];
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = (i + 1) * (j + 1);
			}
		}
		return tabla;

	}

	public static void main(String[] args) {

		for (int i = 0; i < tablaMultiplcicar().length; i++) {

			for (int j = 0; j < tablaMultiplcicar()[0].length; j++) {
				System.out.print(tablaMultiplcicar()[i][j] + "\t");
			}
			System.out.println();

		}

	}

}