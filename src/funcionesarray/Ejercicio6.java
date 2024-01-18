package funcionesarray;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] t = new int[6];
		int numElementos = 3;
		
		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 100 + 1);
		}
		int[] resultado = suma(t, numElementos);

		// Imprimir el resultado
		for (int i : resultado) {
			System.out.print(i + " ");
		}
	}

	public static int[] suma(int[] t, int numElementos) {
		int[] resultado = new int[t.length - numElementos + 1];

		for (int i = 0; i < resultado.length; i++) {
			int suma = 0;
			for (int j = 0; j < numElementos; j++) {
				suma += t[i + j];
			}
			resultado[i] = suma;
		}

		return resultado;
	}
}
