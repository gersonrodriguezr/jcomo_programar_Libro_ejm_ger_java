/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg42.animacionesjava;

import java.util.ArrayList;

/**
 *
 * @author gerson
 */
public class Explosion extends Thread {//Hilo, por que va a cambiar de cuadros a traves del tiempo y va a ver paralelamente varias explociones

    private int cuadro;
    public int x, y;
    private Motor motor;

    public Explosion(int x, int y, Motor motor) {
        cuadro = 0;
        this.x = x;
        this.y = y;
        this.motor = motor;
        this.start();
    }

    public int getCuadro() {//Para poder graficar
        return cuadro;
    }

    @Override
    public void run() {//Recorre cada cuadro de la animacion
        while (cuadro < 4) {
            //4, por que son 5 imagenes 0,1..4
            try {
                Thread.sleep(80);//Velocidad con la que se va a mover la animacion, o trancision de imagen a imagen
            } catch (Exception e) {
                System.out.println("no se durmio");
            }
            cuadro++;
        }

        ArrayList ve = motor.getExplosiones();//obtener la lista de explosiones
        for (int i = 0; i < ve.size(); i++) {
            if (ve.get(i) == this) {//Por cada elemento que recorro, obtengo la explosion correspondiente al elemento de la lista//lo comparo con este mismo objeto de tipo explosion 
                ve.remove(i);//Una vez que termina el explosion, se retira de la lista
                System.out.println("Eliminar explosion");
            }
        }
    }
}


