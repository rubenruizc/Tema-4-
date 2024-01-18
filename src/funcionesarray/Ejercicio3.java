package funcionesarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int longitud;
		int fin;
		Scanner sc = new Scanner(System.in);

		System.out.println("ELIJA LA LONGITUD DE LA TABLA: ");
		longitud = sc.nextInt();
		System.out.println("ELIJA HASTA QUE NÚMERO QUIERE QUE SE GENEREN LOS RANDOM: ");
		fin = sc.nextInt();
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		sc.close();
	}

	public static int[] rellenaPares(int longitud, int fin) {
		int tabla[] = new int[longitud];
		Random r = new Random();
		int numr;

		for (int i = 0; i < tabla.length; i++) {
			numr = r.nextInt(2, fin + 1);
			while (numr % 2 != 0) {
				numr = r.nextInt(2, fin + 1);
			}
			tabla[i] = numr;
		}

		Arrays.sort(tabla);

		return tabla;
	}

}
