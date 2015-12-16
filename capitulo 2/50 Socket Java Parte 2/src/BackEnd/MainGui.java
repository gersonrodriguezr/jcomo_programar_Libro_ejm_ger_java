/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
    
/**
 *
 * @author gerson
 */
public class MainGui extends JFrame implements ActionListener{
    private JMenuBar jmbar;
    private JMenu jm;
    private JMenuItem jmi_crear, jmi_conectar, jmi_exit;
    
    private JTextArea jtxtA_areaChat;
    private JTextField jtxtF_texto;
    private JButton jbtn_enviar;
    private JScrollPane jsp;
    
    
    /**
     * @param args the command line arguments
     */
    
    public MainGui(){
        super("Chat de Gerson");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setComponetes();
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void setComponetes(){
        jmbar = new JMenuBar();
        jm = new JMenu("Accion");
        jmi_crear = new JMenuItem("Crear Servidor");
        jmi_conectar = new JMenuItem("Conectar");        
        jmi_exit = new JMenuItem("Salir");
        
        this.setJMenuBar(jmbar);
        jmbar.add(jm);
        jmi_crear.addActionListener(this);
        jmi_conectar.addActionListener(this);        
        jmi_exit.addActionListener(this);
        
        jm.add(jmi_crear);
        jm.add(jmi_conectar);
        jm.add(jmi_exit);
        
        this.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();// El GridBagLayaout, necesita de GridBagConstraints para usar los objetos de este.
        
        /*JPanel*/
        gbc.gridx = 0;//Posicion en el eje X, que se va a ubicar, las cuadriculas empiezan desde la posicion x=0,y=0
        gbc.gridy = 0;
        gbc.gridwidth = 2;//numero de cuadriculas en el eje x, o de ancho que va a ocupar
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;/*Es del mismo tamaño que se separa para su vizualizacion*/ 
        gbc.weightx = 1.0;//el valor varia de 0 a 1, y si es 1 quiere decir que se va agrandar en ancho en la proporción que se estire.
        gbc.weighty = 1.0;//quiere decir que tanto el ancho como el alto se van agrandar en la misma proporción
        jtxtA_areaChat = new JTextArea();
        jsp = new JScrollPane(jtxtA_areaChat);
        this.add(jsp,gbc);
        
        /*JTextField*/
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        jtxtF_texto = new JTextField(20);
        this.add(jtxtF_texto,gbc);
                
        /*JButton*/
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth =1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        jbtn_enviar = new JButton("Enviar");
        jbtn_enviar.addActionListener(this);//Para que se este escuchando el boton enviar.
        this.add(jbtn_enviar,gbc);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

    }
    
}
