/*
 *El motor, es el que organiza todo el programa.El que maneja a grandes rasgos lo que pasa en el mismo programa
 *El motor va a repintar el mapa
*/
package pkg42.animacionesjava;

import java.util.ArrayList;

/**
 *
 * @author gerson
 */
public class Motor extends Thread{
    private ArrayList explosiones;
    private Ventana objVentana;
    
    public Motor(){
        objVentana = new Ventana(this);
        explosiones = new ArrayList();
        this.start();
    }
    
    public void run(){
        while(true){//No es recomendable//Bucle infinito
            try {
                Thread.sleep(80);//Poner a dormir en cada cierto tiempo al juego//Es como un fps//Es como refrescar o escuchar al evento cada cierto tiempo
            } catch (Exception e) {
                e.printStackTrace();
            } finally{//Siempre se ejecuta esta sentencia, a si se presente un error
                objVentana.obtenerPanel().repaint();
            }
        }
    }
    
    public ArrayList getExplosiones(){
        return explosiones;
    }
}