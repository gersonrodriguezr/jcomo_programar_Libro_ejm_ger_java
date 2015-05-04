/*
 * Comparación, usando if
 */
package comparacion;

import java.util.Scanner;

/**
 *
 * @author gerson
 */
public class Comparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("Escriba el primer entero:");
        numero1 = entrada.nextInt();
        
        System.out.println("Escriba el segundo entero");
        numero2 = entrada.nextInt();
        
        if( numero1 == numero2 )
            System.out.println("numero1 == numero2");
        
        if( numero1 != numero2 )
            System.out.println("numero1 != numero2");
        
        if( numero1 < numero2 )
            System.out.println("numero1 < numero2");
        
        if( numero1 > numero2 )
            System.out.println("numero1 > numero2");
        
        if( numero1 <= numero2 )
            System.out.println("numero1 <= numero2");
        
        if( numero1 >= numero2 )
            System.out.println("numero1 >= numero2");
        
        
        
        
    }
    
}
