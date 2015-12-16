/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36.graficos.pkg2.java;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author gerson
 */
public class MiPanelJava extends JPanel{

    public MiPanelJava() {
        setSize(400, 400);
        
    }

    @Override
    public void paintComponent(Graphics g) {//Graphics g, es el objeto que nos va a permitir dibujar//PaintComponent, es un metodo que sobreescribimos, que es el que se va llamar cada vez, que se refresque la ventana y se llama cada ves que se muestre la ventana
        super.paintComponent(g);//Siempre llamar, para poder graficar, nos da todo lo de la superclase y para que la clase me brinde siertos elementos a graficar        
        g.setColor(Color.BLUE);//Color del fondo
        g.fillRect(0, 0, 400, 400);//posicionX,posicionY,TamañoX,TamañoY//Tamaño del area de dibujo
        
        g.setColor(Color.BLACK);
        g.drawRect(100, 100, 40, 40);///posicionX,posicionY,TamañoX,TamañoY del cuadrado
    }
    
    
    
    
}
