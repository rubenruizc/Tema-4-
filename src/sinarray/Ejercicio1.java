package sinarray;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < tabla.length; i++) {
			int numr = r.nextInt(1, 101);
			tabla[i] = numr;
		}

	}

}
