/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg38.arrays.mousemotionlistener;

import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author gerson
 */
public class Ventana extends JFrame{

    public Ventana() {
    super("Graficos");
        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MiPanelJava objPanel = new MiPanelJava();
        
        add(objPanel);
        
        
        
        setVisible(true);
    }
    
}
