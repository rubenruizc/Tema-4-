package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 18 de Srings
 */

public class Ejercicio18 {

	public static void main(String[] args) {
		// Variable donde guardaremos el título de la página
		String titulo;

		// Variable donde guardaremos el contenido de la página
		String contenido;

		// Variable donde guardaremos el html
		String htmlGenerado;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que ingrese el título de la página
		System.out.println("Título de la página:");
		titulo = sc.nextLine();

		// Le pedimos al usuario que ingrese el contenido de la página
		System.out.println("Contenido de la página:");
		contenido = sc.nextLine();

		// Generar el HTML combinando el título y el contenido proporcionados
		htmlGenerado = generarHTML(titulo, contenido);

		// Imprimir el HTML generado
		System.out.println(htmlGenerado);

		// Cerramos el Scanner
		sc.close();

	} // Cierre del main

	/**
	 * Función para generar un documento HTML con el título y el contenido
	 * especificados
	 * 
	 * @param titulo
	 * @param contenido
	 * @return
	 */
	public static String generarHTML(String titulo, String contenido) {
		// Construir el documento HTML con el título y el contenido proporcionados
		return "<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<title>" + titulo + "</title>\n" + "</head>\n"
				+ "<body>\n" + "<h1>" + titulo + "</h1>\n" + "<p>" + contenido + "</p>\n" + "</body>\n" + "</html>";

	} // Cierre de la función

} // Cierre de la clase
