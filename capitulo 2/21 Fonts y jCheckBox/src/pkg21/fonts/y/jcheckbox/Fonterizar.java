/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.fonts.y.jcheckbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author gerson
 */
public class Fonterizar extends JFrame implements ItemListener {

    private JTextField jtxt;
    private JCheckBox jchk_negrita, jchk_cursiva;
    private Font fuente;

    public Fonterizar() {
        super("Fonterizar - Aplicar tipo fuente");

        this.setLayout(new FlowLayout());
        this.definirVentana();
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        this.setVisible(true);
    }

    private void definirVentana() {
        jtxt = new JTextField(20);
        jchk_negrita = new JCheckBox("Negrita");
        jchk_cursiva = new JCheckBox("Cursiva");

        add(jtxt);
        add(jchk_negrita);
        add(jchk_cursiva);
        jchk_negrita.addItemListener(this);
        jchk_cursiva.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (jchk_negrita.isSelected() && jchk_cursiva.isSelected()) {// para que el if paresca un case, se tiene que hacer anidado
            fuente = new Font("Serief", Font.BOLD | Font.ITALIC, 14);
            jtxt.setFont(fuente);
        } else if (jchk_cursiva.isSelected()) {
            fuente = new Font("Serief", Font.ITALIC, 14);
            jtxt.setFont(fuente);
        } else if (jchk_negrita.isSelected()) {
            fuente = new Font("Serief", Font.BOLD, 14);
            jtxt.setFont(fuente);
        } else {
            fuente = new Font("Serief", Font.PLAIN, 14);
            jtxt.setFont(fuente);
        }

        
    }

}
