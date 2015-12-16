/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24.jradiobuton;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author gerson
 */
public class Fonterizar extends JFrame implements ItemListener{
    private JTextField jtxt;
    private JRadioButton jrbtn_negrita,jrbtn_cursiva, jrbtn_ambos,jrbtn_plano;
    private ButtonGroup jbgbtn;
    
    
    public Fonterizar(){
        super("Fontetizar");
        this.setLayout(new FlowLayout());
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        definirVentana();
        this.setVisible(true);
    }
    public void definirVentana(){
        jtxt = new JTextField(20);
        jrbtn_negrita = new JRadioButton("Negrita");
        jrbtn_cursiva = new JRadioButton("Cursiva");
        jrbtn_ambos = new JRadioButton("Ambos");
        jrbtn_plano = new JRadioButton("Plano");
        jbgbtn = new ButtonGroup();
        
        add(jtxt);//Estamos agregando los componentes a la ventana
        add(jrbtn_negrita);
        add(jrbtn_cursiva);
        add(jrbtn_ambos);
        add(jrbtn_plano);
        
        jbgbtn.add(jrbtn_negrita);
        jbgbtn.add(jrbtn_cursiva);
        jbgbtn.add(jrbtn_ambos);
        jbgbtn.add(jrbtn_plano);
        
        jrbtn_negrita.addItemListener(this);
        jrbtn_cursiva.addItemListener(this);
        jrbtn_ambos.addItemListener(this);
        jrbtn_plano.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent ie) {
        
    }
    
}
