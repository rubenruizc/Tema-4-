package sinarray;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numeroUsuario;
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[8];

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Escriba un número: ");
			numeroUsuario = sc.nextInt();
			tabla[i] = numeroUsuario;
		}

		for (int numeros : tabla) {
			if (numeros % 2 == 0) {
				System.out.println(numeros + ": par");
			} else {
				System.out.println(numeros + ":impar");
			}
		}
		sc.close();
	}

}
