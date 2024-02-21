package string;

import java.util.Scanner;

public class Ejercicio17 {

	public static final String FIN = "*/";
	public static final String INICIO = "/*";

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

	public static String eliminarComentarios(String codigoC) {
		String cadSinComentarios = "";
		int inicio;
		int fin;
		inicio = codigoC.indexOf(INICIO);
		fin = codigoC.indexOf(FIN);
		
		while (inicio!=-1) {
			cadSinComentarios += codigoC.substring(fin,inicio);
			fin = codigoC.indexOf(INICIO,fin);
			inicio = codigoC.indexOf(INICIO,fin);
		}
		
		cadSinComentarios += codigoC.substring(0, inicio) + codigoC.substring(fin + FIN.length());
		return cadSinComentarios;
	}
}
