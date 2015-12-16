/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg49.socket.en.java;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author gerson
 */
public class Cliente {
    private Socket s;
    private ObjectInputStream ois;
    private boolean error = false;
    
    public Cliente(){
        
        try {
            s = new Socket("localhost",9999);
            System.out.println("Soy el cliente");
            ois = new ObjectInputStream(s.getInputStream());
            System.out.println("Este esl mensaje que me manda el servidor, desde un puerto:");
            System.out.println((String)ois.readObject());
            
            ois.close();
            s.close();
        } catch (Exception e) {
            error = true;
            System.out.println("No se ejecuto El cliente, el cliente necesita que el servidor este ejecutado");            
            //e.printStackTrace();
        }        
    }

    public boolean getError() {
        return error;
    }
    
    
    
}
