package conarray;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos la tabla con longitud 30
		int tabla[] = new int[30];

		// Bucle para rellenar la tabla con valores random desde el 0 al 9
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}
		
		// Imprimimos la tabla sin ordenar
		System.out.println("Tabla antes de ordenar:" + Arrays.toString(tabla));
		
		// Ordenamos la tabla de manera creciente
		Arrays.sort(tabla);
		
		// Imprimimos la tabla ordenada 
		System.out.println("Tabla después de ordenar:" + Arrays.toString(tabla));

	} // Cierre del main

} // Cierre de la clase 
