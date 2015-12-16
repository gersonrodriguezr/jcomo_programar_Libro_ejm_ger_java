/*
 * Los clic tengo que hacerlo lento, por que si no no lo detecta.
 */
package pkg37.mouselistener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;


/**
 *
 * @author gerson
 */
public class MiPanelJava extends JPanel implements java.awt.event.MouseListener{
    
    private int X, Y;
    
    public MiPanelJava() {
        setSize(400, 400);
        this.addMouseListener(this);//para que escuche los eventos del mouse
    }

    @Override
    public void paintComponent(Graphics g) {//Graphics g, es el objeto que nos va a permitir dibujar//PaintComponent, es un metodo que sobreescribimos, que es el que se va llamar cada vez, que se refresque la ventana y se llama cada ves que se muestre la ventana
        super.paintComponent(g);//Siempre llamar, para poder graficar, nos da todo lo de la superclase y para que la clase me brinde siertos elementos a graficar        
        g.setColor(Color.BLUE);//Color del fondo
        g.fillRect(0, 0, 400, 400);//posicionX,posicionY,TamañoX,TamañoY//Tamaño del area de dibujo
        
        g.setColor(Color.BLACK);
        g.drawRect(X, Y, 40, 40);///posicionX,posicionY,TamañoX,TamañoY del cuadrado
    }

    @Override
    public void mouseClicked(MouseEvent me) {//Si preciono y libero el mouse, no se ejecuta, ya que se ejecuta cuando se presiona y se libera de manera rapida// pero cuando ago muchos clik, el programa funciona lento//Es como si me diera una opcion a rectificarme
        /*X = me.getX();
        Y = me.getY();
        this.repaint();*/
    }

    @Override
    public void mousePressed(MouseEvent me) {//Al hacer un cli simplemente se produce el evento
        X = me.getX();
        Y = me.getY();
        this.repaint();
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
