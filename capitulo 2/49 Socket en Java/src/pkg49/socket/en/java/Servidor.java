/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg49.socket.en.java;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gerson
 */
public class Servidor {
    private ServerSocket ss;
    private Socket s;/*Punto de conexion de parte del servidor*/
    private ObjectOutputStream oos;/*Enviar objetos, escribir un dato, */
    
    public Servidor(){
        try {
            ss = new ServerSocket(9999);//puerto del socket
            System.out.println("Comienzo a esperar la coneccion del cliente");
            s = ss.accept();//hasta que un cliente no se conecte, no va avanzar a la siguiente linea - instanica un objeto socket, con otro objeto socket, la instancia viene a ser la conexion(los dos van a tener una misma cosa, es decir una conexion).- es recomendable que nuestro socket corra en un hilo, aparte de nuestro programa, para que cuando llegue al accept(), no se pare el programa
            System.out.println("El Cliente ya se conecto");
            oos = new ObjectOutputStream(s.getOutputStream());//s.getOutputStream(), cuando la conexion a sigo aceptada, - le pasamos nuestro socket
            oos.writeObject("Bienvenido Cliente");//escribo un dato en ese puerto, o mando un objeto con un dato.- usamos este objeto para escribir un mensaje
            
            oos.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
