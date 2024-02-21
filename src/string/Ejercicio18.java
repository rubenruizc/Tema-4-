package string;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		String titulo;

		String htmlGenerado;

		String contenido;

		Scanner sc = new Scanner(System.in);

		System.out.println("Título de la página:");
		titulo = sc.nextLine();

		System.out.println("Contenido de la página:");
		contenido = sc.nextLine();
		htmlGenerado = generarHTML(titulo, contenido);
		System.out.println(htmlGenerado);

		sc.close();
	}

	public static String generarHTML(String titulo, String contenido) {
		// Construir el documento HTML con el título y el contenido proporcionados
		return "<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<title>" + titulo + "</title>\n" + "</head>\n"
				+ "<body>\n" + "<h1>" + titulo + "</h1>\n" + "<p>" + contenido + "</p>\n" + "</body>\n" + "</html>";
	}
}
