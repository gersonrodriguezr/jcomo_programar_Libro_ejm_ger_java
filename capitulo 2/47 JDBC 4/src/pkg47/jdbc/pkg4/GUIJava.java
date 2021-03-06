/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg47.jdbc.pkg4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;//importar de java.util, no de java.awt
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gerson
 */
public class GUIJava extends JFrame implements ActionListener {

    private final String[] titulos = {"Nombre", "Dirección", "Teléfono", "Localiad"};
    private DefaultTableModel dtm_modeloTabla = new DefaultTableModel();//obtengo los titulos query//Algo principal
    private JTable jtbl_tabla = new JTable(dtm_modeloTabla);// 
    private BDManagement bdm = new BDManagement();

    private JMenuBar jmb;
    private JMenu jm;
    private JMenuItem jmitm_agregar, jmitm_remover, jmitm_leer;
    private JScrollPane jscp;
    
    private List<Integer> ids = new ArrayList<Integer>();

    public GUIJava() {
        super("Capitulo 45");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(810, 460);
        this.addComponente();
        this.setVisible(true);
    }

    public void llenarTabla() {
        dtm_modeloTabla.setRowCount(0);//Cantidad de filas que tiene que aparecer
        dtm_modeloTabla.setColumnCount(0);//cantidad de columnas que tiene que aparecer
        dtm_modeloTabla.setColumnIdentifiers(titulos);//Fijar nuevamente los encabezados
        ids.clear();//Limpiar los ids de una lista.
        try {
            ResultSet aux = bdm.getStatement().executeQuery("SELECT * FROM agenda");
            while (aux.next()) {
                Object[] fila = {aux.getObject(1), aux.getObject(2), aux.getObject(3), aux.getObject(4)};
               ids.add((Integer)aux.getObject(1));
                dtm_modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void addComponente() {
        jmb = new JMenuBar();
        this.setJMenuBar(jmb);
        jm = new JMenu("Acciones");
        jmb.add(jm);
        jmitm_agregar = new JMenuItem("Agregar Registro");
        jmitm_remover = new JMenuItem("Eliminar Registo");
        jmitm_leer = new JMenuItem("Leer Registro");

        jm.add(jmitm_agregar);
        jm.add(jmitm_remover);
        jm.add(jmitm_leer);

        jmitm_leer.addActionListener(this);
        jmitm_agregar.addActionListener(this);
        jmitm_remover.addActionListener(this);

        dtm_modeloTabla.setColumnIdentifiers(titulos);
        //jtbl_tabla.setEnabled(false);//false para que no pueda seleccionar una fila

        jscp = new JScrollPane(jtbl_tabla);
        jscp.setBounds(0, 0, 800, 400);

        this.add(jscp);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmitm_agregar) {

        } else if (ae.getSource() == jmitm_remover) {
            this.eliminarFilas(jtbl_tabla.getSelectedRows());
        } else if (ae.getSource() == jmitm_leer) {
            this.llenarTabla();
        }
    }
    
    public void eliminarFilas(int[] filasSeleccionados){
        for (int i = 0; i < filasSeleccionados.length; i++) {
            String query = "DELETE FROM agenda WHERE idAgenda=" + ids.get(filasSeleccionados[i]);
            try {
                bdm.getStatement().executeUpdate(query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        this.llenarTabla();
        
    }
}
