/*
 *getClass(), sirve para ir a mi carpeta donde estan mis clases
 *getResource(), sirve para obtener el archivo
 */
package pkg26.jcombobox;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gerson
 */
public class Ventana extends JFrame implements ItemListener{
    private JComboBox jcbx;
    private JLabel jlbl;
    private String[] archivos = {"/imagen/forense1.png","/imagen/forense2.png"};
    private Icon[] iconos = {new ImageIcon(getClass().getResource(archivos[0])),
                                   new ImageIcon(getClass().getResource(archivos[0]))};
    public Ventana(){
        super("JComboBox");
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
        
        jcbx = new JComboBox(archivos);
        jlbl = new JLabel();
        
        jlbl.setIcon(iconos[0]);
        jcbx.addItemListener(this);
                
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        
    }
}
