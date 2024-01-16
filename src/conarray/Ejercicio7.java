package conarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int tabla1[] = new int[6];
		int tabla2[] = new int[6];
		int numeroUsuario;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla2.length; i++) {
			System.out.println("Escriba el número ganador: ");
			numeroUsuario = sc.nextInt();
			tabla2[i] = numeroUsuario;
		}

		Arrays.sort(tabla2);

		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = (int) (Math.random() * 49 + 1);
		}

		int aciertos = 0;

		for (int numUsuario : tabla1) {
			if (Arrays.binarySearch(tabla2, numUsuario) >= 0) {
				aciertos++;
			}
		}

		System.out.println("Apuesta ganadora: " + Arrays.toString(tabla2));
		System.out.println("Apuesta random: " + Arrays.toString(tabla1));
		System.out.println();
		System.out.println("Número de aciertos: " + aciertos);

		sc.close();
	}
}