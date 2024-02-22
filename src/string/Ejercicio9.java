package string;

import java.util.Scanner;

/**
 * Clase donde realizaremos el Ejercicio 9 de Strings
 */

public class Ejercicio9 {

	public static void main(String[] args) {

		// Variable donde guardaremos la frase del usuario
		String frase;

		// Variable donde guardaremos la frase sin las muletillas
		String mensaje;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase y la leemos
		System.out.println("Introduzca la frase:");
		frase = sc.nextLine();

		// Bucle para verificar si la frase está en el idioma de Javalandia y traducirla si es necesario
		if (esIdiomaJavalandia(frase)) {
			
			// Traduce la frase si es del idioma de Javalandia
			mensaje = traducir(frase); 
			
			// Imprime el mensaje traducido
			System.out.println("Mensaje: " + mensaje); 
		
		} else {
			
			// Imprime si la frase no es del idioma de Javalandia
			System.out.println("La frase no está en el idioma de Javalandia."); 
		}
		
		// Cerramos el Scanner
		sc.close(); 
	
	} // Cierre del main

	/**
	 * Función para comprobar si la frase está en el idioma de Javalandia
	 * @param frase
	 * @return
	 */
	public static boolean esIdiomaJavalandia(String frase) {
		// Devuelve true si la frase empieza con la muletilla de inicio o termina con la
		// muletilla final del idioma de Javalandia
		return frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len");
	
	} // Cierre de la función
	

	/**
	 *  Función para traducir la frase del idioma de Javalandia al idioma común
	 * @param frase
	 * @return
	 */
	public static String traducir(String frase) {
		
		// Variable donde guardaremos la muletilla de inicio
		String muletillaInicio = "Javalín, javalón";
		
		// Variable donde guardaremos la muletilla final
		String muletillaFinal = "javalén, len, len";
		
		// Variable donde guardaremos el resultado de la frase
		String resultado;

		// Comprueba si la frase empieza con la muletilla de inicio
		if (frase.startsWith(muletillaInicio)) { 
			// Extrae la subcadena de la frase después de la muletilla de inicio
			resultado = frase.substring(muletillaInicio.length()).trim();
			
			// Comprueba si la frase termina con la muletilla final
		} else if (frase.endsWith(muletillaFinal)) { 
			// Extrae la subcadena de la frase antes de la muletilla final
			resultado = frase.substring(0, frase.length() - muletillaFinal.length()).trim();
		} else {
			
			// Si no contiene ninguna muletilla, la frase se mantiene igual
			resultado = frase; 
		}

		// Devuelve la frase traducida o la misma frase si no es necesario traducirla
		return resultado; 
		
	} // Cierre de la función

} // Cierre de la clase
