package com.usa.controller;

import com.usa.modelo.Producto;
import com.usa.modelo.ProductoRepository;
import com.usa.vista.Interfaz;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.data.relational.core.conversion.DbActionExecutionException;

public class Controller implements ActionListener {

    ProductoRepository repositorio;
    Interfaz vista;
    DefaultTableModel defaultTableModel;

    public Controller() {
        super();

    }

    public Controller(ProductoRepository repositorio, Interfaz vista) {
        this.repositorio = repositorio;
        this.vista = vista;
    }

    private void agregarEventos() {
        vista.getBotonAgregar().addActionListener(this);
        vista.getBotonActualizar().addActionListener(this);
        vista.getBotonBorrar().addActionListener(this);
        vista.getBotonInformes().addActionListener(this);
    }

    public void agregarProducto() {
        try {
            if (formularioValido()) {
                Producto producto = new Producto(vista.getTxtNombre().getText(), Double.parseDouble(vista.getTxtPrecio().getText()), Integer.parseInt(vista.getTxtInventario().getText()));
                repositorio.save(producto);
                JOptionPane.showMessageDialog(null, "Guardado con exito");
            }
        } catch (DbActionExecutionException e) {
            JOptionPane.showMessageDialog(null, "El Producto ya existe");
        } finally {
            actualizarTabla();
        }
    }

    public void actualizarTabla() {
        String[] titulos = new String[]{"id", "Nombre", "Precio", "Inventario"};
        defaultTableModel = new DefaultTableModel(titulos, 0);
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        for (Producto producto : listaProductos) {
            defaultTableModel.addRow(new Object[]{producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getInventario()});
        }
        vista.getTablaProductos().setModel(defaultTableModel);
        vista.getTablaProductos().setPreferredSize(new Dimension(350, defaultTableModel.getRowCount() * 16));
        vista.getjScrollPane1().setViewportView(vista.getTablaProductos());
    }

    public boolean formularioValido() {
        if ("".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtPrecio().getText()) || "".equals(vista.getTxtInventario().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden ser vacios", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!esNumero(vista.getTxtPrecio().getText()) || !esNumero(vista.getTxtInventario().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos deben ser numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean esNumero(String numero) {
        try {
            double retorno = Double.parseDouble(numero);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.getBotonAgregar()) {

        }
        if (ae.getSource() == vista.getBotonActualizar()) {

        }
        if (ae.getSource() == vista.getBotonBorrar()) {

        }
        if (ae.getSource() == vista.getBotonInformes()) {

        }
    }

}
