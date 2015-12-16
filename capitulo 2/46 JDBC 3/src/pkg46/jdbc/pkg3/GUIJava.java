/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg46.jdbc.pkg3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public GUIJava() {
        super("Capitulo 45");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(810, 460);
        this.addComponente();
        this.setVisible(true);
    }

    public void buscarTabla() {
        try {
            ResultSet aux = bdm.getStatement().executeQuery("SELECT * FROM agenda");
            while (aux.next()) {
                Object[] fila = {aux.getObject(1), aux.getObject(2), aux.getObject(3), aux.getObject(4)};
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
        jtbl_tabla.setEnabled(false);

        jscp = new JScrollPane(jtbl_tabla);
        jscp.setBounds(0, 0, 800, 400);

        this.add(jscp);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jmitm_agregar) {

        } else if (ae.getSource() == jmitm_remover) {

        } else if (ae.getSource() == jmitm_leer) {
            dtm_modeloTabla.setRowCount(0);
            this.buscarTabla();
        }
    }
}
