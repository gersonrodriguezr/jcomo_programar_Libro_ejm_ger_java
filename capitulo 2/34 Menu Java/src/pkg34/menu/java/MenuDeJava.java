/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg34.menu.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author gerson
 */
public class MenuDeJava extends JFrame implements ActionListener{
    
    private JMenuBar jmnbar;
    private JMenu jmn_archivo, jmn_edicion;
    private JMenuItem jmnitm_abrir, jmnitm_copiar;

    public MenuDeJava() {
        super("Ventana de Menú");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        jmnbar = new JMenuBar();
        
        jmn_archivo = new JMenu("Archivo");
        jmn_edicion = new JMenu("Edición");
        
        jmnbar.add(jmn_archivo);
        jmnbar.add(jmn_edicion);
        
        
        jmnitm_abrir = new JMenuItem("Abrir");
        jmnitm_copiar = new JMenuItem("Copiar");
        
        jmn_archivo.add(jmnitm_abrir);
        jmn_edicion.add(jmnitm_copiar);
        
        this.setJMenuBar(jmnbar);
        jmnitm_abrir.addActionListener(this);
        
        setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == jmnitm_abrir)
            System.out.println("Hiciste clic en Abrir");
    }
    
}
