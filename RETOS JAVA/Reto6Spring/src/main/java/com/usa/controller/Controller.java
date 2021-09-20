package com.usa.controller;

import com.usa.modelo.Producto;
import com.usa.modelo.ProductoRepository;
import com.usa.vista.Interfaz;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.springframework.data.relational.core.conversion.DbActionExecutionException;

/**
 *
 * @author ramze
 */
public class Controller implements ActionListener {

    ProductoRepository repositorio;
    Interfaz interfaz;
    DefaultTableModel defaultTableModel;

    public Controller() {
        super();
    }

    public Controller(ProductoRepository repositorio, Interfaz interfaz) {
        super();
        this.repositorio = repositorio;
        this.interfaz = interfaz;
        interfaz.setVisible(true);
        agregarEventos();
    }

    private void agregarEventos() {
        interfaz.getBotonAgregar().addActionListener(this);
        interfaz.getBotonActualizar().addActionListener(this);
        interfaz.getBotonBorrar().addActionListener(this);
        interfaz.getBotonInformes().addActionListener(this);
        interfaz.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                llenarCampos(e);
            }
        });
    }

    private void actualizarTabla(){
        String[] titulos = new String[]{"id", "Nombre", "Precio", "Inventario"};
        defaultTableModel = new DefaultTableModel(titulos,0);
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        for (Producto producto : listaProductos) {
            defaultTableModel.addRow(new Object[]{producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getInventario()});
        }
        interfaz.getTablaProductos().setModel(defaultTableModel);
        interfaz.getTablaProductos().setPreferredSize(new Dimension(350, defaultTableModel.getRowCount() * 16));
        interfaz.getjScrollPane1().setViewportView(interfaz.getTablaProductos());
    }
    
    private void limpiarCampos(){
        interfaz.getTxtCodigo().setText("");
        interfaz.getTxtNombre().setText("");
        interfaz.getTxtPrecio().setText("");
        interfaz.getTxtInventario().setText("");
    }
    
    private boolean formularioValido(){
        if ("".equals(interfaz.getTxtNombre().getText()) || "".equals(interfaz.getTxtPrecio().getText()) || "".equals(interfaz.getTxtInventario().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden ser vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!esNumero(interfaz.getTxtPrecio().getText()) || !esNumero(interfaz.getTxtInventario().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos deben ser numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void llenarCampos(MouseEvent e){
        JTable target = (JTable) e.getSource();
        interfaz.getTxtCodigo().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        interfaz.getTxtNombre().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        interfaz.getTxtPrecio().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        interfaz.getTxtInventario().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 3).toString());
    }
    
    private boolean esNumero(String textoNumero){
        try {
            double numero = Double.parseDouble(textoNumero);
            
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == interfaz.getBotonAgregar() ){
            agregarProducto();
        }

    }
    public void agregarProducto(){
        try {
            if(formularioValido()){
                Producto producto = new Producto(interfaz.getTxtNombre().getText(), Double.parseDouble(interfaz.getTxtPrecio().getText()), Integer.parseInt(interfaz.getTxtInventario().getText()));
                repositorio.save(producto);
                JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
            }
        } catch (DbActionExecutionException e) {
            JOptionPane.showMessageDialog(null, "Producto ya existe en base de datos");
        }finally{
            limpiarCampos();
            actualizarTabla();
        }
    }

}
