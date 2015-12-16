/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28.excepciones.y.streams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author gerson
 */
public class ExcepcionesJava {

    public ExcepcionesJava() {
        BufferedReader objBR = new BufferedReader(new InputStreamReader(System.in));
       String linea = null;
        try {
            linea = objBR.readLine();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        System.out.println(linea);
    }
    
}
