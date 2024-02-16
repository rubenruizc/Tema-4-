package string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Escriba una palabra:");
		palabra1 = sc.nextLine();
	
		System.out.print("Escriba otra palabra:");
		palabra2 = sc.nextLine();
		
		if (esAnagrama(palabra1, palabra2)) {
			System.out.println("Si son anagrama");
		} else {
			System.out.println("No son anagrama");
		}
		
		sc.close();

	}
	
	public static boolean esAnagrama (String palabra1, String palabra2) {

		palabra1.toLowerCase().replace(" ", "");
		palabra2.toLowerCase().replace(" ", "");
		
		char[] letras1 = palabra1.toCharArray();
		char[] letras2 = palabra2.toCharArray();
		
		Arrays.sort(letras1);
		Arrays.sort(letras2);
		
		
		return Arrays.equals(letras1, letras2);
	}

}
