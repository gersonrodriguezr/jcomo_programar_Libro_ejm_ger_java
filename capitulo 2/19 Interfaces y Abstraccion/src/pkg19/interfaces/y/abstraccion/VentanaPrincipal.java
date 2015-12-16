/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg19.interfaces.y.abstraccion;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author gerson
 */
public class VentanaPrincipal extends JFrame implements ActionListener{//Me salia error por que tengo que reimplemtar el metodo.
    private JButton jbtn;
    private JTextField jtxt;
    private JLabel jlbl;
    
    
    public VentanaPrincipal(){
        super("Mi segunda GUI");
        this.definirVentana();
        this.setSize( 400, 400 );        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar el proceso o ejecución cuando la ventana se a cerrado.
        this.setVisible(true);
        
    }
    
    public void definirVentana(){
        this.setLayout(new FlowLayout());// orden de los componentes, //flowLayaout, sirve para ordenar los objetos//FlowLayout() Lo creo directo, porq eu no voy a necesitar nunca mas este objeto, situa uno al lado del otro
        jbtn = new JButton("Enviar");
        jtxt = new JTextField(20);
        jlbl = new JLabel();
        
        this.add(jtxt);
        this.add(jbtn);
        this.add(jlbl);
        
    }

    @Override// Es obligatorio implementar el metodo actionPerformed, por que es un metodo de una interface
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
