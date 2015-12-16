/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg48.jdbc.pkg5;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author gerson
 */
public class FrameAgregarPersona extends JFrame{

    private JTextField jtxt_NomApell, jtxt_Dir, jtxt_Loc, jtxt_Telf;
    private JLabel jlbl_NomApell, jlbl_Dir, jlbl_Loc, jlbl_Telf;
    private JButton jbtn_Agrega;
    private GUIJava gui;
    
    public FrameAgregarPersona(GUIJava gui){
        super("Agregar Persona");
        this.gui = gui;
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Por que cuando cierre esta ventana no quiero que se cierre la aplicación
        this.setLayout(new FlowLayout());//Para que los componentes se pongan uno al costado del otro
        this.setSize(400, 200);
        
        this.setComponentes();
        this.setVisible(true);
    }
    
    public void setComponentes(){
        
        jlbl_NomApell = new JLabel("Ingrese su nombre");
        jlbl_Dir = new JLabel("Ingrese su Direccion");
        jlbl_Loc = new JLabel("Ingrese su Localidad");
        jlbl_Telf = new JLabel("Ingrese su Teléfono");
        
        jtxt_NomApell = new JTextField(15);
        jtxt_Dir = new JTextField(15);
        jtxt_Loc = new JTextField(15);
        jtxt_Telf = new JTextField(15);
        
        
        this.add(jlbl_NomApell);
        this.add(jtxt_NomApell);
        this.add(jlbl_Dir);
        this.add(jtxt_Dir);
        this.add(jlbl_Loc);
        this.add(jtxt_Loc);
        this.add(jlbl_Telf);
        this.add(jtxt_Telf);
        
        
        //setJbtn_Agrega(new JButton("Guardar"));
        jbtn_Agrega = new JButton("Agregar");
        jbtn_Agrega.addActionListener(gui);//ya no this, por que es un objeto que referencia al tipo de clse gui, la cual ya implementa un actionListener y para que todos los elementos se procecen el actionPerformed
        
        this.add(jbtn_Agrega);
    }

    public JTextField getJtxt_NomApell() {
        return jtxt_NomApell;
    }

    public void setJtxt_NomApell(JTextField jtxt_NomApell) {
        this.jtxt_NomApell = jtxt_NomApell;
    }

    public JTextField getJtxt_Dir() {
        return jtxt_Dir;
    }

    public void setJtxt_Dir(JTextField jtxt_Dir) {
        this.jtxt_Dir = jtxt_Dir;
    }

    public JTextField getJtxt_Loc() {
        return jtxt_Loc;
    }

    public void setJtxt_Loc(JTextField jtxt_Loc) {
        this.jtxt_Loc = jtxt_Loc;
    }

    public JTextField getJtxt_Telf() {
        return jtxt_Telf;
    }

    public void setJtxt_Telf(JTextField jtxt_Telf) {
        this.jtxt_Telf = jtxt_Telf;
    }

    public JButton getJbtn_Agrega() {
        return jbtn_Agrega;
    }

    public void setJbtn_Agrega(JButton jbtn_Agrega) {
        this.jbtn_Agrega = jbtn_Agrega;
    }

    public GUIJava getGui() {
        return gui;
    }

    public void setGui(GUIJava gui) {
        this.gui = gui;
    }


    
    
}
