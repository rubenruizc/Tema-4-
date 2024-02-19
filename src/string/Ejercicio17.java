package string;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		String frase;

		String fraseSinComentarios;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escriba una frase:");

		frase = sc.nextLine();

		fraseSinComentarios = eliminarComentarios(frase);

		System.out.println(fraseSinComentarios);

		sc.close();
	}

	public static String eliminarComentarios(String frase) {
		// Eliminar comentarios de una línea
		frase = frase.replaceAll("//.*", "");
		// Eliminar comentarios de múltiples líneas
		frase = frase.replaceAll("/\\*.*?\\*/", "");
		return frase;
	}
}
