package sinarray;

import java.util.Random;

/**
 *Clase donde realizaremos el ejercicio 1 que consiste en ir almacenando en una tabla valores random 
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		// Tabla donde guardaremos los números random
		int tabla[] = new int[10];

		// Generador de números random
		Random r = new Random();

		// Bucle para ir metiendo los números random en la tabla
		for (int i = 0; i < tabla.length; i++) {
			int numr = r.nextInt(1, 101);
			tabla[i] = numr;
		}

	} // Cierre del main

} // Cierre de la clase
