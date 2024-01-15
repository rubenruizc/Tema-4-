package conarray;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] tabla;
		int contador = 0;
		for (int i = 1; i <= 10; i++) {
			for (int y = 1; y <= i; y++) {
				contador++;
			}
		}
		tabla = new int[contador];
		int primero = 0;
		int ultimo = 0;
		for (int i = 1; i <= 10; i++) {
			primero += i - 1;
			ultimo += i;
			Arrays.fill(tabla, primero, ultimo, i);
		}
		System.out.println(Arrays.toString(tabla));

	}
}
