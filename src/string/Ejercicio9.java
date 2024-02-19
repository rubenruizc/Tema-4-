package string;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase;

		String mensaje;

		System.out.println("Introduzca la frase:");
		frase = sc.nextLine();

		if (esIdiomaJavalandia(frase)) {
			mensaje = traducir(frase);
			System.out.println("Mensaje: " + mensaje);
		} else {
			System.out.println("La frase no está en el idioma de Javalandia.");
		}
		sc.close();
	}

	public static boolean esIdiomaJavalandia(String frase) {
		return frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len");
	}

	public static String traducir(String frase) {
		String muletillaInicio = "Javalín, javalón";
		String muletillaFinal = "javalén, len, len";
		String resultado;
		if (frase.startsWith(muletillaInicio)) {
			// Extrae una subcadena de la variable frase, comenzando desde el índice después
			// de la longitud de la muletillamuletillaInicio. Esto significa que estamos
			// tomando todo el texto después de la muletilla "Javalín, javalón".
			resultado = frase.substring(muletillaInicio.length()).trim();
		} else if (frase.endsWith(muletillaFinal)) {
			resultado = frase.substring(0, frase.length() - muletillaFinal.length()).trim();
		} else {
			resultado = frase;
		}

		return resultado;
	}

}
