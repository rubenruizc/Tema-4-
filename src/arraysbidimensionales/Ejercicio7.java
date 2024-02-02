package arraysbidimensionales;

import java.util.Random;

public class Ejercicio7 {

	// Jugar con la J y la longitud 
	public static int[][] transPosicion(int[][] tabla1) {
		int tabla2[][] = new int[4][4];

		return tabla2;
	}

	public static void main(String[] args) {
		int tabla1[][] = new int[4][4];
		Random r = new Random();
		int random = r.nextInt(1, 101);

		for (int fila = 0; fila < tabla1.length; fila++) {
			for (int columna = 0; columna < tabla1[0].length; columna++) {
				tabla1[fila][columna] = random;
			}
		}

		transPosicion(tabla1);
		

	}

}
