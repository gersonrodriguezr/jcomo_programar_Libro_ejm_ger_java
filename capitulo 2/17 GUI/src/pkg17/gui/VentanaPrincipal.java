/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg17.gui;
import javax.swing.*;

/**
 *
 * @author gerson
 */
public class VentanaPrincipal extends JFrame{
    public VentanaPrincipal(){
        super("Mi primera GUI");
        this.setSize( 400, 400 );        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el proceso o ejecución cuando la ventana se a cerrado.
        this.setVisible(true);
        
    }
}
