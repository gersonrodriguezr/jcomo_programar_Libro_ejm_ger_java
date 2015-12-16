/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteMetodos;

/**
 *
 * @author gerson
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[] = new int[5];
        
        A[0] = 10;
        A[1] = 12;
        A[2] = 16;
        A[3] = 19;
        A[4] = 23;        
        obtenerNumero(A, 3);
    }
    
    public static void obtenerNumero( int vector[], int posicion){
        System.out.println(vector[posicion]);
    }
}
