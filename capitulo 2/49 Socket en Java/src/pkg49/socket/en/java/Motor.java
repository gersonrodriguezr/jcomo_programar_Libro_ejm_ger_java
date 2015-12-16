/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg49.socket.en.java;

import java.util.Scanner;

/**
 *
 * @author gerson
 */
public class Motor {

    public Motor() {
        boolean incorrecto = true;
        
        do{
            System.out.println("Escoja la opcion que desea ejecutar(1ero Servidor)\n1.Servidor 2.Cliente");
            Scanner S = new Scanner(System.in);
            Integer i = (Integer) S.nextInt();
            Servidor objServ = null;

            if (S != null) {
                if (i.equals(1)) {
                    System.out.println("Iniciando el Servidor");
                    objServ = new Servidor();
                    incorrecto = false;
                    
                } else if (i.equals(2)) {
                    System.out.println("Se procedera a iniciar el Cliente");                
                    Cliente c = new Cliente();                                
                    if( c.getError() == true){
                        System.out.println("No se ejecuto el cliente,Ejecute primero el Servidor");
                    }
                    else {
                        incorrecto = false;
                    }                    
                }
            }        
        }while(incorrecto == true);
    }
}
