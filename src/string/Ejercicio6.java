package string;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		String palabras;
		String frase = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba una palabra: ");
		palabras = sc.next();

		while (!palabras.equalsIgnoreCase("fin")) {
			sc.nextLine();

			frase += palabras + " ";
			System.out.print("Bien, siga escribiendo palabras: ");
			palabras = sc.next();

		}

		System.out.println(frase);

		sc.close();
	}

}
