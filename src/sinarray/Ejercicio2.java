package sinarray;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double numeroUsuario;
		double tabla[] = new double[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Escriba un número decimal: ");
			numeroUsuario = sc.nextDouble();
			tabla[i] = numeroUsuario;
		}
		for (double numero : tabla) {
			System.out.println(numero);
		}
		sc.close();
	}

}
