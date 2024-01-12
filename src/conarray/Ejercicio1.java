package conarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int valorN;
		int valorM;
		int tabla[];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un valor:");
		valorN = sc.nextInt();

		tabla = new int[valorN];

		System.out.println("Introduzca otro valor: ");
		valorM = sc.nextInt();

		Arrays.fill(tabla,0,valorN,valorM);

		System.out.println(Arrays.toString(tabla));
		
		sc.close();
	}

}
