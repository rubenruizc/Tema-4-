package string;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String cadena1;
		String cadena2;
		int longitud;
		int longitud2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase: ");
		cadena1 = sc.nextLine();

		System.out.println("Escriba otra frase: ");
		cadena2 = sc.nextLine();

		longitud = cadena1.length();
		longitud2 = cadena2.length();

		if (longitud > longitud2) {
			System.out.println("La primera frase es más larga que la segunda");
		} else {
			System.out.println("La segunda frase es más larga que la primera");
		}

		sc.close();
	}

}
