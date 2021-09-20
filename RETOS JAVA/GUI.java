package com.usa.vista;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class GUI extends JFrame {

    public GUI() {
        initGUI();
        //this.setVisible(true);
    }

    private JLabel labelCodigo;
    private JTextField txtCodigo;
    private JLabel labelNombre;
    private JTextField txtNombre;
    private JLabel labelPrecio;
    private JTextField txtPrecio;
    private JLabel labelInventario;
    private JTextField txtInventario;
    private JTable tablaProductos;
    private JScrollPane jScrollPane1;
    private JButton botonAgregar;
    private JButton botonBorrar;
    private JButton botonActualizar;
    private JButton botonInformes;
    private DefaultTableModel defaultTableModel;
    private JPanel panelCampos;

    private void initGUI() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Test JFrame");
        setSize(400, 600);
        this.setLayout(null);

        {
            panelCampos = new JPanel();
            panelCampos.setBorder(new TitledBorder("Bienvenido"));
            panelCampos.setBounds(10, 40, 200, 140);
            add(panelCampos);
        }
        {
            labelNombre = new JLabel("Nombre");
            labelNombre.setPreferredSize(new Dimension(70, 25));
            panelCampos.add(labelNombre);
            txtNombre = new JTextField("");
            txtNombre.setPreferredSize(new Dimension(110, 25));
            panelCampos.add(txtNombre);
        }
        {
            txtCodigo = new JTextField("");
            txtCodigo.setBounds(0, 0, 0, 0);
            add(txtCodigo);
        }

        {
            labelPrecio = new JLabel("Precio");
            labelPrecio.setPreferredSize(new Dimension(70, 25));
            panelCampos.add(labelPrecio);
            txtPrecio = new JTextField("");
            txtPrecio.setPreferredSize(new Dimension(110, 25));
            panelCampos.add(txtPrecio);
        }
        {
            labelInventario = new JLabel("Inventario");
            labelInventario.setPreferredSize(new Dimension(70, 25));
            panelCampos.add(labelInventario);
            txtInventario = new JTextField("");
            txtInventario.setPreferredSize(new Dimension(110, 25));
            panelCampos.add(txtInventario);
        }
        {
            botonAgregar = new JButton("Agregar Producto");
            botonAgregar.setBounds(230, 30, 135, 25);
            add(botonAgregar);
        }
        {
            botonActualizar = new JButton("Actualizar Producto");
            botonActualizar.setBounds(230, 30, 135, 25);
            add(botonActualizar);
        }
        {
            botonBorrar = new JButton("Borrar Producto");
            botonBorrar.setBounds(230, 30, 135, 25);
            add(botonBorrar);
        }
        {
            botonInformes = new JButton("Informes");
            botonInformes.setBounds(230, 30, 135, 25);
            add(botonInformes);
        }
        {
            jScrollPane1 = new JScrollPane();
            getContentPane().add(jScrollPane1);
            jScrollPane1.setBounds(40, 200, 320, 300);
        }
        {
            tablaProductos = new JTable();
        }

    }
        public JLabel getLabelCodigo() {
        return labelCodigo;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JLabel getLabelPrecio() {
        return labelPrecio;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public JLabel getLabelInventario() {
        return labelInventario;
    }

    public JTextField getTxtInventario() {
        return txtInventario;
    }

    public JTable getTablaProductos() {
        return tablaProductos;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JButton getBotonAgregar() {
        return botonAgregar;
    }

    public JButton getBotonBorrar() {
        return botonBorrar;
    }

    public JButton getBotonActualizar() {
        return botonActualizar;
    }

    public JButton getBotonInformes() {
        return botonInformes;
    }

    public DefaultTableModel getDefaultTableModel() {
        return defaultTableModel;
    }

    public JPanel getPanelCampos() {
        return panelCampos;
    }

}
