/*
 *Si al momento de refrescar la ventan, se borran todos los puntos anteriores, por eso es que yo agrego un arraylist, para guardar las coordenas y asi lo dibuja todo nuevamente
 *
 */
package pkg38.arrays.mousemotionlistener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author gerson
 */
public class MiPanelJava extends JPanel implements MouseMotionListener{    
    
    private ArrayList puntos;
    
    public MiPanelJava() {
      setSize(400, 400);
      puntos = new ArrayList();
      this.addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {//Graphics g, es el objeto que nos va a permitir dibujar//PaintComponent, es un metodo que sobreescribimos, que es el que se va llamar cada vez, que se refresque la ventana y se llama cada ves que se muestre la ventana
        super.paintComponent(g);//Siempre llamar, para poder graficar, nos da todo lo de la superclase y para que la clase me brinde siertos elementos a graficar        
        g.setColor(Color.BLUE);//Color del fondo
        g.fillRect(0, 0, 400, 400);//posicionX,posicionY,TamañoX,TamañoY//Tamaño del area de dibujo
        dibujarPuntos(g);
        //g.setColor(Color.BLACK);
        //g.drawRect(X, Y, 40, 40);///posicionX,posicionY,TamañoX,TamañoY del cuadrado
    }
    
    public void dibujarPuntos(Graphics g){
        for (int i = 0; i < puntos.size(); i++) {
            g.setColor(Color.red);
            Point aux = (Point)puntos.get(i);
            g.drawRect(aux.x, aux.y, 10, 10);
        }
    }
    
    @Override
    public void mouseDragged(MouseEvent me) {
      //Point p = new Point(me.getX(),me.getY());
      puntos.add(new Point(me.getX(),me.getY()));// Cada vez que arraste el mouse, se va agregar esa posicion a la lista
      this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
      
    }
}
