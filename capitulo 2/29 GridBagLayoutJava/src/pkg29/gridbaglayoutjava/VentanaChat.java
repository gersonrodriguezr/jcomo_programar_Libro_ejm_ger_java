/*
 * GridBagLayout, se reacomoda los contenidos en la ventna.
 * http://www.chuidiang.com/java/layout/GridBagLayout/GridBagLayout.php
 */
package pkg29.gridbaglayoutjava;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gerson
 */
public class VentanaChat extends JFrame implements ActionListener {

    private JTextArea jtxa;
    private JScrollPane jscrpn;
    private JTextField jtxf;
    private JButton jbtn;

    public VentanaChat(String string) {
        super(string);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());
        GridBagConstraints objGBC = new GridBagConstraints();

        jtxa = new JTextArea();//Instanciando componentes
        jscrpn = new JScrollPane(jtxa);//El componente que estara afectado por la barra de desplazamiento
        jtxf = new JTextField(20);
        jbtn = new JButton("Enviar");

        //Instrucciones al primer componente
        objGBC.gridx = 0;//la primera columna es "0", la columna en la que empiece a posicionarse mi primer elemento
        objGBC.gridy = 0;
        objGBC.gridwidth = 2;//Cantidad de columnas que quiero que ocupe
        objGBC.gridwidth = 1;//cantidad de filas
        objGBC.weightx = 1.0;//Tamaño de ancho que va a crecer el componente cuando crezca la ventana.
        objGBC.weighty = 1.0;//tamaño de alto que va a crecer sus componentes.

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

}
