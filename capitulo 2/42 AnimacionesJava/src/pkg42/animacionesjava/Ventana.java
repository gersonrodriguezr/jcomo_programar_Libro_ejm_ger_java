/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg42.animacionesjava;

//import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author gerson
 */
public class Ventana extends JFrame{
    private Motor motor;
    private PanelJava panel;
    
    public Ventana(Motor motor){
        super("Explociones");
        this.motor = motor;
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        
        panel = new PanelJava(motor);
        this.add(panel);
        this.addMouseListener(panel);
        this.setVisible(true);
    }
    
    public PanelJava obtenerPanel(){
        return panel;
    }
}
