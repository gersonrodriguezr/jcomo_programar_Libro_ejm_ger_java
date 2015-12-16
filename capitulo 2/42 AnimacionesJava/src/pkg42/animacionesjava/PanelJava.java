/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * referencia http://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html
 */
package pkg42.animacionesjava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author gerson
 */
public class PanelJava extends JPanel implements MouseListener{
    private BufferedImage exploImagen;
    private Motor motor;
    
    public PanelJava(Motor motor){
        this.motor = motor;
        this.setSize(600, 600);
        this.cargarExplosion();
    }
    
    public void cargarExplosion(){
        try {
            exploImagen = ImageIO.read(getClass().getClassLoader().getResource("imagenjava1/bomba.png"));
        } catch (Exception e) {
            System.out.println("No se cargo la imagen");
        }
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//para redifiniar el paintComponent
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 600, 600);
        dibujarExplosion(g);
    }
    
    
    
    public void dibujarExplosion(Graphics g){
        System.out.println("motor = " + motor.getExplosiones().size());
        if(motor.getExplosiones().size() != 0){
            ArrayList aux = motor.getExplosiones();
            for (int i = 0; i < aux.size(); i++) {//Casi no es necesario, por que paro borrando de mi vector los objetos, a si que siempre voy a tener solo 1 objeto
                System.out.println("dibujar Explosion i = " + i);
                System.out.println("dibujar Explosion size = " + aux.size());
                Explosion objExplo = (Explosion)aux.get(i);                
                //g.drawImage(exploImagen, objExplo.x, objExplo.y, objExplo.x + 32, objExplo.y + 32,objExplo.getCuadro()*32, 0, objExplo.getCuadro() * 32 + 32, 32, null);
                g.drawImage(exploImagen, objExplo.x - 20, objExplo.y - 44, objExplo.x + 12, objExplo.y - 12,objExplo.getCuadro()*32, 0, objExplo.getCuadro() * 32 + 32, 32, null);
            }   
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        motor.getExplosiones().add(new Explosion(me.getX(), me.getY(), motor));
        //Una vez que tengo mi lista de explosion, llamo al metodo "add", para agregar un elemento, con una referencia del motor, para luego poder eliminarlo de la lista
    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }
}
