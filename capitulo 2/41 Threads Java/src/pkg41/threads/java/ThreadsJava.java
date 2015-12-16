/*
 *los hilos se ejecutan casi simultaneamente, pero el termino del hilo, es aleatorio, por eso casa uno termina en diferente momento
 */
package pkg41.threads.java;

/**
 *
 * @author gerson
 */
public class ThreadsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Th objTh1 = new Th(1);
        Th objTh2 = new Th(2);
        Th objTh3 = new Th(3);
        
        objTh1.start();
        objTh2.start();
        objTh3.start();
    
    }
    
    
    
}
