package conarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Clase donde realizaremos el ejercicio 3 que consiste en comparar si dos tablas son iguales
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el valor introducido por el usuario
		int valorUsuario;
		
		// Variable donde guardaremos la primera tabla de longitud 20
		int tabla[] = new int[20];
		
		// Variable donde guardaremos la segunda tabla de longitud 10 para añadir los 10 primeros valores de la primera tabla
		int tabla1[] = new int[10];
		
		// Variable donde guardaremos la segunda tabla de longitud 10 para añadir los 10 últimos valores de la primera tabla
		int tabla2[] = new int[10];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir al usuario 20 número e introducirlos a la tabla primera/principal
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un valor");
			valorUsuario = sc.nextInt();
			tabla[i] = valorUsuario;
		}
		
		// Copiamos los 10 primeros valores de la tabla principal
		tabla1 = Arrays.copyOfRange(tabla, 0, 10);
		
		// Copiamos los 10 últimos valores de la tabla principal
		tabla2 = Arrays.copyOfRange(tabla, 10, 20);

		// Imprimimos la tabla1
		System.out.println(Arrays.toString(tabla1));
		
		// Imprimimos la tabla2
		System.out.println(Arrays.toString(tabla2));

		// Condicional para saber si las dos tablas son iguales
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales");
		} else {
			System.out.println("Las tablas no son iguales");
		}
		
		// Cerramos el Scanner 
		sc.close();
	
	} // Cierre del main
	
} // Cierre de la clase
