/*
 *Muestra la suma de dos numeros
 *Usa el objeto "Scanner"
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author gerson
 */
public class Suma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1,
            numero2,
            suma;
        
        System.out.println("Escriba el primer entero:");
        numero1 = entrada.nextInt();
        
        System.out.println("\nEscriba el segundo numero:");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.printf("La suma es:%d\n",suma);
        
        
    }
    
}
