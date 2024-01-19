package funcionesarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Variable donde guardaremos la longitud de la tabla
		int longitud;

		// Variable donde guardaremos hasta que número queremos que se generen los
		// números de la tabla
		int fin;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la longitud de la tabla
		System.out.println("ELIJA LA LONGITUD DE LA TABLA: ");

		// Leemos el número
		longitud = sc.nextInt();

		// Le preguntamos al usuario hasta que número quiere que se generen los randoms
		System.out.println("ELIJA HASTA QUE NÚMERO QUIERE QUE SE GENEREN LOS RANDOM: ");

		// Leemos el número
		fin = sc.nextInt();

		// Imprimimos la tabla llamando a la función
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));

		// Cierre del Scanner
		sc.close();
	}

	// Función para rellenar la función con números pares
	public static int[] rellenaPares(int longitud, int fin) {

		// Variable donde guardaremos la tabla/ array con longitud introducida por el
		// usuario
		int tabla[] = new int[longitud];

		// Operador para poder generar números randoms
		Random r = new Random();

		// Variable donde guardaremos los números randoms
		int numr;

		// Bucle para ir almacenando los números random que se van generando en la tabla
		for (int i = 0; i < tabla.length; i++) {
			numr = r.nextInt(2, fin + 1);

			// Bucle para generar otro número random si el anterior generado no es par
			while (numr % 2 != 0) {
				numr = r.nextInt(2, fin + 1);
			}

			// Introducimos el número a la tabla
			tabla[i] = numr;
		}

		// Ordenamos la tabla
		Arrays.sort(tabla);

		// Devolvemos la tabla con números pares ordenados
		return tabla;
	}

}
