package string;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String frase = sc.nextLine();
		char caracter;
		// Convertimos la frase a minúsculas para considerar mayúsculas y minúsculas
		// iguales
		frase = frase.toLowerCase();

		frase = frase.replace(" ", "");
		// Creamos un array para contar las ocurrencias de cada letra (incluso
		// caracteres especiales)
		int[] contador = new int[256]; // Tamaño suficiente para cubrir todos los posibles caracteres

		// Recorremos cada caracter de la frase
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			// Incrementamos el contador correspondiente al caracter
			contador[caracter]++;
		}

		// Mostramos el resultado
		System.out.println("Resultado:");
		for (int i = 0; i < contador.length; i++) {
			if (contador[i] > 0) {
				System.out.println((char) i + ": " + contador[i] + " veces");
			}
		}

		sc.close();
	}
}
