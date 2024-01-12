package conarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int valorUsuario;
		int tabla[] = new int[20];
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un valor");
			valorUsuario = sc.nextInt();
			tabla[i] = valorUsuario;
		}

		tabla1 = Arrays.copyOfRange(tabla, 0, 10);
		tabla2 = Arrays.copyOfRange(tabla, 10, 20);

		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));

		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales");
		} else {
			System.out.println("Las tablas no son iguales");
		}
		sc.close();
	}

}
