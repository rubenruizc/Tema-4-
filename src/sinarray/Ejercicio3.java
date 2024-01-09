package sinarray;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeroUsuario;
		int tabla[] = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int y = 0; y < tabla.length; y++) {
			System.out.println("Escriba un número: ");
			numeroUsuario = sc.nextInt();
			tabla[y] = numeroUsuario;
		}
		for (int i = tabla.length; i > 0; i--) {
			System.out.println(tabla[i - 1]);
		}

		sc.close();
	}

}
