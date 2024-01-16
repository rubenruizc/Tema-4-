package conarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Variable donde almacenamos el valorN que nos introducira el usuario
		int valorN;
		
		// Variable donde almacenamos el valorM que nos introducira el usuario
		int valorM;
		
		// Variable donde almacenamos la tabla/array donde irán introducidos los valores
		int tabla[];
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que nos introduzca un valor para N para saber la longiud de nuestra tabla
		System.out.println("Introduzca un valor:");
		
		// Leemos el número
		valorN = sc.nextInt();
		
		// Establecemos la longitud de la tabla 
		tabla = new int[valorN];

		// Le pedimos al usuario que nos introduzca un valor para M para saber que valores introducir en la tabla
		System.out.println("Introduzca otro valor: ");
		
		// Leemos el número
		valorM = sc.nextInt();

		// Rellenamos la tabla con la longiutd N con los valores M
		Arrays.fill(tabla,0,valorN,valorM);

		// Imprimimos la tabla
		System.out.println(Arrays.toString(tabla));
		
		// Cierre del Scanner
		sc.close();
	
	} // Cierre del main

} // Cierre de la clase 
