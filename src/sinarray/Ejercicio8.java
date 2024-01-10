package sinarray;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int tabla[] = new int[100];
		int elegirPosicion;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10 + 1);
		}

		do {
			System.out.println("Que posición de la tabla le gustaría ver: ");
			elegirPosicion = sc.nextInt();

			for (int i = 0; i < tabla.length; i++) {
				if (tabla[i] == elegirPosicion) {
					System.out.println(i);
				}

			}
		} while (elegirPosicion > 10);
		
		sc.close();
	}

}
