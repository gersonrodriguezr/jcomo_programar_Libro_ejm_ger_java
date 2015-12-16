/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg41.threads.java;

/**
 *
 * @author gerson
 */
public class Th extends Thread {
    private int numero;
    
    public Th(int numero){
        this.numero = numero;
    } 
    
    
    @Override
    public void run() {//se le llama a cada momento que se llama al thread
     long aux = 0; 
        try {
            aux = (long)(Math.random()*5)*1000;
            Thread.sleep(aux);// entre 0 - 5, y como es milisegundos, es por  1000
        } catch (Exception e) {
        }
        System.out.println("Termino el hilo :" + numero + " - su random fue : " + aux );
    }
    

}
