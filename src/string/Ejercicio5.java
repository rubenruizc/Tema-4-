package string;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String frase;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase:");
		frase = sc.nextLine();

		System.out.println(fraseInvertida(frase));
		sc.close();

	}

	public static String fraseInvertida(String frase) {
		String cadenaInvertida = "";

		for (int i = frase.length() - 1; i >= 0; i--) {
			cadenaInvertida += frase.charAt(i);
		}

		return cadenaInvertida;

	}
}
