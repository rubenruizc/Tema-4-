package funcionesarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int clave;
		int numr;
		int t[] = new int[20];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < t.length; i++) {
			numr =(int) (Math.random() * 20 + 1);
			t[i] = numr;
		}
		System.out.println(Arrays.toString(t));
		System.out.println("Introduzca el valor que le gustaría encontrar en la tabla: ");
		clave = sc.nextInt();

		System.out.println("El número: " + clave + " se encuentra en la posición " + buscar(t, clave));
		sc.close();
	}

	public static int buscar(int t[], int clave) {
		int indiceBusqueda = 0;
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			indiceBusqueda++;
		}

		if (indiceBusqueda >= t.length) {
			indiceBusqueda = -1;
		}
		return indiceBusqueda;
	}

}
