package string;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String frase;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba una frase: ");
		frase = sc.nextLine();
		
		int espacios = contarEspaciosEnBlanco(frase);
		System.out.println("La frase tiene " + espacios + " espacios en blanco.");

		sc.close();
	}

	public static int contarEspaciosEnBlanco(String frase) {
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		return contador;
	}
}
