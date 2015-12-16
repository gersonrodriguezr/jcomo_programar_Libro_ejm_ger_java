/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.gridbaglayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gerson
 */
public class Ventana1 extends JFrame{

    public Ventana1() throws HeadlessException {
     super ("Ejemplo 1 GridBagLayout");
         this.getContentPane().setLayout(new GridBagLayout());
         this.setLayout(new GridLayout());
         GridBagConstraints constraints = new GridBagConstraints();
         
	 // JTextArea en la fila 0, columna 0 y que ocupa dos filas y dos
	 // columnas de ancho.
         JTextArea cajaTexto = new JTextArea("Area texto");
         constraints.gridx = 0;
         constraints.gridy = 0;
         constraints.gridwidth = 2;
         constraints.gridheight = 2;
         this.getContentPane().add (cajaTexto, constraints);
         
         // JButton en la fila 0, columna 2 y que ocupa 1 celda de ancho por
	 // una de alto.
         JButton boton1 = new JButton ("Boton 1");
         constraints.gridx = 2;
         constraints.gridy = 0;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         this.getContentPane().add (boton1, constraints);
         
	 // JButton en la fila 1, columna 2 y que ocupa 1x1 celdas.
         JButton boton2 = new JButton ("Boton 2");
         constraints.gridx = 2;
         constraints.gridy = 1;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         this.getContentPane().add (boton2, constraints);
         
	 // JButton en la fila 2, columna 0 y que ocupa 1x1 celdas.
         JButton boton3 = new JButton ("Boton 3");
         constraints.gridx = 0;
         constraints.gridy = 2;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         this.getContentPane().add (boton3, constraints);
         
	 // JButton en la fila 2, columna 2 y que ocupa 1x1 celdas.
         JButton boton4 = new JButton ("Boton 4");
         constraints.gridx = 2;
         constraints.gridy = 2;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         this.getContentPane().add (boton4, constraints);
         
	 // JTextField en la fila 2, columna 1 y que ocupa 1x1 celdas.
         JTextField campoTexto = new JTextField ("Campo texto");
         constraints.gridx = 1;
         constraints.gridy = 2;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;
         this.getContentPane().add (campoTexto, constraints);
    }
    
}
