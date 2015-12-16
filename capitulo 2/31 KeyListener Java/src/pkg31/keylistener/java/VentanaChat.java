/*
 * GridBagLayout, se reacomoda los contenidos en la ventna.
 * http://www.chuidiang.com/java/layout/GridBagLayout/GridBagLayout.php
 */
package pkg31.keylistener.java;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gerson
 */
public class VentanaChat extends JFrame implements ActionListener, KeyListener {

    private JTextArea jtxa;
    private JScrollPane jscrpn;
    private JTextField jtxf;
    private JButton jbtn;
    private Font jfuente;

    public VentanaChat(String string) {
        super("Usando KeyListener");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        GridBagConstraints objGBC = new GridBagConstraints();

        jtxa = new JTextArea();//Instanciando componentes
        jscrpn = new JScrollPane(jtxa);//El componente que estara afectado por la barra de desplazamiento
        jtxf = new JTextField(20);
        jbtn = new JButton("Enviar");
        jfuente = new Font("Serif",Font.BOLD, 15);
        
        jtxa.setFont(jfuente);
        jtxa.setForeground(Color.GREEN);
        jtxa.setBackground(Color.BLACK);
        //jtxa.setEnabled(false);// si lo ago no editable, se cambia a coleres por defecto
        
        //Instrucciones al primer componente
        objGBC.gridx = 0;//la primera columna es "0", la columna en la que empiece a posicionarse mi primer elemento
        objGBC.gridy = 0;
        objGBC.gridwidth = 2;//Cantidad de columnas que quiero que ocupe
        objGBC.gridheight = 1;//cantidad de filas
        objGBC.weightx = 1.0;//Tamaño de ancho que va a crecer el componente cuando crezca la ventana.
        objGBC.weighty = 1.0;//tamaño de alto que va a crecer sus componentes.
        objGBC.fill = GridBagConstraints.BOTH;// que crezca para ambos lados
        add(jscrpn, objGBC);

        objGBC.gridx = 0;//la primera columna es "0", la columna en la que empiece a posicionarse mi primer elemento
        objGBC.gridy = 1;
        objGBC.gridwidth = 1;//Cantidad de columnas que quiero que ocupe
        objGBC.gridheight = 1;//cantidad de filas
        objGBC.weightx = 1.0;//Tamaño de ancho que va a crecer el componente cuando crezca la ventana.//Alto
        objGBC.weighty = 0.0;//tamaño de alto que va a crecer sus componentes.//ancho
        objGBC.fill = GridBagConstraints.HORIZONTAL;// que crezca para ambos lados
        add(jtxf, objGBC);

        objGBC.gridx = 1;//la primera columna es "0", la columna en la que empiece a posicionarse mi primer elemento
        objGBC.gridy = 1;
        objGBC.gridwidth = 1;//Cantidad de columnas que quiero que ocupe
        objGBC.gridheight = 1;//cantidad de filas
        objGBC.weightx = 0.0;//Tamaño de ancho que va a crecer el componente cuando crezca la ventana.
        objGBC.weighty = 0.0;//tamaño de alto que va a crecer sus componentes.
        objGBC.fill = GridBagConstraints.NONE;// que crezca para ambos lados
        add(jbtn, objGBC);

        jbtn.addActionListener(this);
        jtxf.addKeyListener(this);// Si deseo que al teclear enter se ejecute, debo activar esta linea de codigo y sacar la condición if
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtn) {
            jtxa.append(jtxf.getText() + "\n");
            jtxf.setText("");
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {//se ejecuta solo la primera vez que ocurre, a si se mantenga presionada la tecla
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {//Cuando se preciona una tecla, y mientras se mantenga presionada, hacer una acción
        switch (ke.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                jtxa.append(jtxf.getText() + "\n");
                jtxf.setText("");
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {//cuando se suelta la tecla
        
    }

}
