/*
 *getClass(), sirve para ir a mi carpeta donde estan mis clases
 *getResource(), sirve para obtener el archivo
 */
package pkg27.jcomoboboxfinal;

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
public class Ventana extends JFrame implements ItemListener {

    private JComboBox jcbx;
    private JLabel jlbl;
    private String[] archivos = {"/imagen/forense1.png", "/imagen/forense2.png"};
    private String[] opcImagen = {"imagen1", "imagen2"};
    private Icon[] iconos = {new ImageIcon(getClass().getResource(archivos[0])),
        new ImageIcon(getClass().getResource(archivos[1]))};

    public Ventana() {
        super("JComboBox");
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        

        jcbx = new JComboBox(opcImagen);
        jlbl = new JLabel();

        jlbl.setIcon(iconos[0]);//Seleccionado por defecto
        jcbx.addItemListener(this);
        
        add(jcbx);
        add(jlbl);
        
        this.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        jlbl.setIcon(iconos[jcbx.getSelectedIndex()]);//obtengo el seleccionado del combobox, el getSelectdIndex me da la numeracion del que se selecciono y luego con ese numero veo en el vector de iconos, para fijar la figura.
    }
}
