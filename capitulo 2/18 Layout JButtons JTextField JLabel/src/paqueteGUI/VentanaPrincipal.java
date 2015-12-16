/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paqueteGUI;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author gerson
 */
public class VentanaPrincipal extends JFrame{
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
}
