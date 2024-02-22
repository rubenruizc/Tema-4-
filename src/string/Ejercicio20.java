package string;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
        // Variable donde se almacenará la palabra
        String palabra = "";
        
        // Variable donde se almacenará la secuencia
        int sec;
        
        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);
        
        // Le pedimos al usuario la palabra
        System.out.println("Introduzca una palabra");
        palabra = sc.next();
        
        // Limpiamos el Scanner
        sc.nextLine();
        
        // Le pedimos al usuario la secuencia
        System.out.println("¿De cuánto será la secuencia?");
        sec = sc.nextInt();
        
        // Vuelve a pedir la secuencia si esta es más larga que la longitud de la palabra
        while (sec > palabra.length()) {
            System.out.println("¿De cuánto será la secuencia?");
            sec = sc.nextInt();
        }
        
        // Llamamos a la función
        System.out.println(Arrays.toString(palabraDividida(palabra, sec)));
        
        // Cerramos el Scanner
        sc.close();
    }
    
    
    /**
     * Funciónq que obtiene una palabra y devuelve una tabla con su secuencia
     * @param palabra Cadena que contiene la palabra
     * @param sec Secuencia de división
     * @return Tabla con las secuencias
     */
    static String[] palabraDividida(String palabra, int sec) {
        // Variable donde se almacena la longitud de la tabla
        int longitud = palabra.length()/sec;
        
        // Comprobamos si la longitud es diferente que 1 ya que habrá que sumarle 1
        if (longitud > 1)
            longitud++;
        
        // Tabla donde se almacenará la palabra dividida
        String[] dividida  = new String[longitud];
        
        // Variable donde se almacenará la subcadena
        String subcadena = "";
        
        // Variable donde se almacenará la subcadena restante
        String subRestante = palabra;
        
        // Contador
        int cont = 0;
        
        // Bucle que me divide la palabra mientras la longitud de la subcadena restante sea mayor que la secuencia
        do {
            // Obtenemos la subcadena
            subcadena = subRestante.substring(0, sec);
            
            // Obtenemos la subcadena Restante
            subRestante = subRestante.substring(sec);
            
            // Añadimos la subcadena a la tabla
            dividida[cont] = subcadena;
            
            // Incrementamos el contador
            cont++;
            
        } while (subRestante.length() > sec);
        
        // Si la subcadena restante no está vacía, la añadimos
        if (!subRestante.equals("")) {
            dividida[cont] = subRestante;
        }
        
        // Devolvemos la tabla
        return dividida;
    }
}
