
package modelo;


import controlador.ControladorProducto;

/**
 *
 * @author ramze
 */
public class pruebaCon {
    public static void main(String[] args) {
        ControladorProducto db = new ControladorProducto();
        db.getConnection();
        
    }
}
