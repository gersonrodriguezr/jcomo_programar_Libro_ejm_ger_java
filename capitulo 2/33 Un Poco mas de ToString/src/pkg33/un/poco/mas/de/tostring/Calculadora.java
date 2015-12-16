/*
 *Si quiero usar la calculadora pra suma, resta y multiplicacion, me conviene usar una pila, para trabajarla como calculadora.
 */
package pkg33.un.poco.mas.de.tostring;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author gerson
 */
public class Calculadora extends JFrame implements KeyListener{
    
    private JTextField jtxt;
    private JLabel jlbl;
    
    
    public Calculadora() {
    super("Calculadora: suma dos numeros");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        
        jtxt = new JTextField(20);
        jlbl = new JLabel();
        
        add(jtxt);
        add(jlbl);
        
        jtxt.addKeyListener(this);
        setVisible(true);
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
    
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if( ke.getKeyCode() == KeyEvent.VK_ENTER){
            String linea = jtxt.getText();
            
            int numeroA = Integer.parseInt(linea.substring(0, linea.indexOf("+")));
            int numeroB = Integer.parseInt(linea.substring(linea.indexOf("+"), linea.length() ));
            jlbl.setText(String.valueOf(numeroA + numeroB));
            jtxt.setText("");
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    
    }
    
}
