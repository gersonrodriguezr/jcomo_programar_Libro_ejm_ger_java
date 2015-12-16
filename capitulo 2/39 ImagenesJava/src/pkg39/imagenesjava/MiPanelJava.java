/*
 *Si al momento de refrescar la ventan, se borran todos los puntos anteriores, por eso es que yo agrego un arraylist, para guardar las coordenas y asi lo dibuja todo nuevamente
 *
 */
package pkg39.imagenesjava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**
 *
 * @author gerson
 */
public class MiPanelJava extends JPanel implements MouseListener{    
    
    private BufferedImage logo;
    private Point punto;    
    
    
    public MiPanelJava() {
      setSize(800, 800);     
      punto = new Point(0, 0);
      this.addMouseListener(this);
      cargarImagen();
    }
    
    public void cargarImagen(){
        try {
            logo = ImageIO.read(getClass().getClassLoader().getResource("imagenes/forense2.jpg"));//Si la imagen es muy pesada no la carga// por algun motivo, no puede con la imagen sonker, pero si puedo con forense
        } catch (Exception e) {
            System.out.println("No se encontro la imagen");
        }
    }

    @Override
    public void paintComponent(Graphics g) {//Graphics g, es el objeto que nos va a permitir dibujar//PaintComponent, es un metodo que sobreescribimos, que es el que se va llamar cada vez, que se refresque la ventana y se llama cada ves que se muestre la ventana
        super.paintComponent(g);//Siempre llamar, para poder graficar, nos da todo lo de la superclase y para que la clase me brinde siertos elementos a graficar        
        g.setColor(Color.BLUE);//Color del fondo
        g.fillRect(0, 0, 800, 800);//posicionX,posicionY,TamañoX,TamañoY//Tamaño del area de dibujo
        g.drawImage(logo, punto.x, punto.y, null);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        punto.x = me.getX();
        punto.y = me.getY();
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
