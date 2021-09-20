/**
*Autor: Ramses Camilo Torres N
*Version 1.0
*Reto 5 - Java - Mision Tic - Ciclo II
*Universidad Sergio Arboleda
*/
package com.usa.controlador;

import com.usa.modelo.Producto;
import com.usa.modelo.RepositorioProducto;
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
public class ControladorProducto implements ActionListener {

    RepositorioProducto repositorio; // llamar repositorio
    Interfaz interfaz; //llamar interfaz
    DefaultTableModel defaultTableModel; // invocar tabla

    public ControladorProducto() {
        super();
    }

    public ControladorProducto(RepositorioProducto repositorio, Interfaz interfaz) {
        super();
        this.repositorio = repositorio;
        this.interfaz = interfaz;
        interfaz.setVisible(true);
        agregarEventos();
        actualizarTabla();
    }

    private void agregarEventos() {
        interfaz.getBotonAgregar().addActionListener(this); //addListener para obtener el boton agregar
        interfaz.getBotonActualizar().addActionListener(this); //addListener para obtener el boton actualizar
        interfaz.getBotonBorrar().addActionListener(this); //addListener para obtener el boton borrar
        interfaz.getBotonInformes().addActionListener(this); //addListener para obtener el boton informes
        interfaz.getTablaProductos().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                llenarCampos(e);
            }
        });
    }

    private void actualizarTabla() {
        String[] titulos = new String[]{"id", "Nombre", "Precio", "Inventario"}; //creamos un layout con las variables de la tabla
        defaultTableModel = new DefaultTableModel(titulos, 0);
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll(); // se crea una lista con todos los productos
        for (Producto producto : listaProductos) {
            defaultTableModel.addRow(new Object[]{producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getInventario()});
        }
        interfaz.getTablaProductos().setModel(defaultTableModel); //creamos una tabla default
        interfaz.getTablaProductos().setPreferredSize(new Dimension(350, defaultTableModel.getRowCount() * 16)); // se establecen las caracteristicas de la tabla
        interfaz.getjScrollPane1().setViewportView(interfaz.getTablaProductos()); //se usa un scroll para que se pueda mover y visualizar todos los productos de la tabla
    }

    private void limpiarCampos() {
        interfaz.getTxtCodigo().setText(""); //metodo para limpiar la casilla codigo
        interfaz.getTxtNombre().setText(""); //metodo para limpiar la casilla nombre
        interfaz.getTxtPrecio().setText(""); //metodo para limpiar la casilla precio
        interfaz.getTxtInventario().setText(""); //metodo para limpiar la casilla inventario
    }

    private boolean formularioValido() {
        if ("".equals(interfaz.getTxtNombre().getText()) || "".equals(interfaz.getTxtPrecio().getText()) || "".equals(interfaz.getTxtInventario().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden ser vacios", "ERROR", JOptionPane.ERROR_MESSAGE); // mensaje de error para campos vacios
            return false;
        }
        if (!esNumero(interfaz.getTxtPrecio().getText()) || !esNumero(interfaz.getTxtInventario().getText())) {
            JOptionPane.showMessageDialog(null, "Los campos deben ser numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);// mensaje de error para campos numericos
            return false;
        }
        return true;
    }

    private void llenarCampos(MouseEvent e) {
        JTable target = (JTable) e.getSource();
        interfaz.getTxtCodigo().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 0).toString()); //metodo para llenar el campo codigo de la interfaz
        interfaz.getTxtNombre().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 1).toString()); //metodo para llenar el campo nombre de la interfaz
        interfaz.getTxtPrecio().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 2).toString()); //metodo para llenar el campo precio de la interfaz
        interfaz.getTxtInventario().setText(interfaz.getTablaProductos().getModel().getValueAt(target.getSelectedRow(), 3).toString()); //metodo para llenar el campo inventario de la interfaz
    }

    private boolean esNumero(String textoNumero) {
        try {
            double numero = Double.parseDouble(textoNumero); //un ciclo para verificar si es numero

        } catch (Exception e) {
            return false;
        }
        return true;
    }

//-------------- METODOS-------------------------------    
    public void agregarProducto() {
        try {
            if (formularioValido()) {
                Producto producto = new Producto(interfaz.getTxtNombre().getText(), Double.parseDouble(interfaz.getTxtPrecio().getText()), Integer.parseInt(interfaz.getTxtInventario().getText()));
                repositorio.save(producto); //metodo donde se agrega los valores asignados en la interfaz directamente en la base de datos
                JOptionPane.showMessageDialog(null, "Producto agregado correctamente"); // mensaje de producto agregado correctamente
            }
        } catch (DbActionExecutionException e) {
            JOptionPane.showMessageDialog(null, "Producto ya existe en base de datos"); // mensaje de error cuando el producto ya existe
        } finally {
            limpiarCampos(); //limpieza de campos
            actualizarTabla(); //actualizacion de la tabla
        }
    }

    public void actualizarProducto() {
        try {
            if (formularioValido()) {
                Producto producto = new Producto(Integer.parseInt(interfaz.getTxtCodigo().getText()), interfaz.getTxtNombre().getText(), Double.parseDouble(interfaz.getTxtPrecio().getText()), Integer.parseInt(interfaz.getTxtInventario().getText()));
                repositorio.save(producto); //metodo donde se actualizan los valores asignados en la interfaz directamente en la base de datos
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");// mensaje de producto actualizó correctamente
            }
        } catch (DbActionExecutionException e) {
            JOptionPane.showMessageDialog(null, "Producto ya existe en base de datos");// mensaje de error cuando el producto ya existe
        } finally {
            limpiarCampos(); //limpieza de campos
            actualizarTabla();//actualizacion de la tabla
        }
    }

    public void borrarProducto() {
        try {
            if (formularioValido()) {
                Producto producto = new Producto(Integer.parseInt(interfaz.getTxtCodigo().getText()), interfaz.getTxtNombre().getText(), Double.parseDouble(interfaz.getTxtPrecio().getText()), Integer.parseInt(interfaz.getTxtInventario().getText()));
                repositorio.delete(producto); //metodo para borrar los valores asignados en la interfaz directamente de la base de datos
                JOptionPane.showMessageDialog(null, "Producto Borrado correctamente");// mensaje de producto actualizó correctamente
            }
        } catch (DbActionExecutionException e) {
            JOptionPane.showMessageDialog(null, "Producto No existe en base de datos");// mensaje de error cuando el producto No existe
        } finally {
            limpiarCampos();//limpieza de campos
            actualizarTabla();//actualizacion de la tabla
        }
    }
//-----------------------------------------------------------------------------------------    

    private void generarInforme() {
        String nombreMayor = precioMayor(); //informacion de precio mayor
        String nombreMenor = precioMenor(); //informacion de precio menor
        String promedio = precioPromedio(); //informacion de promedio
        String total = totalInventario(); //informacion del total en inventario
        JOptionPane.showMessageDialog(null, nombreMayor + " " + nombreMenor + " " + promedio + " " + total); //mensaje con la informacion requerida

    }

    private String precioMayor() {
        String nombre = "";
        double precioAux = 0;
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        for (Producto producto : listaProductos) {
            if (producto.getPrecio() > precioAux) {
                nombre = producto.getNombre();
                precioAux = producto.getPrecio();
            }
        }
        return nombre;
    }

    private String precioMenor() {
        String nombre = "";
        double precioAux = 10000000;
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        for (Producto producto : listaProductos) {
            if (producto.getPrecio() < precioAux) {
                nombre = producto.getNombre();
                precioAux = producto.getPrecio();
            }
        }
        return nombre;
    }

    private String precioPromedio() {
        double suma = 0;
        double resultado = 0;
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        for (Producto producto : listaProductos) {
            suma += producto.getPrecio();
        }
        resultado = suma / listaProductos.size();
        return String.format("%.2f", resultado);

    }

    private String totalInventario() {
        double suma = 0;
        double resultado = 0;
        List<Producto> listaProductos = (List<Producto>) repositorio.findAll();
        for (Producto producto : listaProductos) {
            suma += producto.getPrecio() * producto.getInventario();
            resultado += suma;
        }

        return String.format("%.2f", resultado);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == interfaz.getBotonAgregar()) {
            agregarProducto(); //actionperformed para agregar productos
        }
        if (ae.getSource() == interfaz.getBotonBorrar()) {
            borrarProducto();//actionperformed para borrar productos
        }
        if (ae.getSource() == interfaz.getBotonActualizar()) {
            actualizarProducto();//actionperformed para actualizar productos
        }
        if (ae.getSource() == interfaz.getBotonInformes()) {
            generarInforme();//actionperformed para generar informe
        }
    }
}
