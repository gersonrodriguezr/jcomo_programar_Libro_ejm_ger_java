/*
 * Leer una cadena y convertirla a entero 
 * Al metodo que tengo que llamar desde el main, tiene que se estatico, por que el main es un metodo estatico.
 * El estatico es como si fuera una variable que solo define, pero que no crea dicho objeto.
 */
package paqueteMetodos;

import java.util.Scanner;

/**
 *
 * @author gerson
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objEntrada = new Scanner(System.in);        
        String cadena;
        
        cadena = objEntrada.nextLine();        
        int num1 = Integer.parseInt(cadena);
        
        cadena = objEntrada.nextLine();
        int num2 = Integer.parseInt(cadena);
        
        System.out.println(sumar(num1, num2));
    }
    
    public static int sumar(int a, int b){
        return ( a + b );
    }
    
}
