/**
*Autor: Ramses Camilo Torres N
*Version 1.5
*Reto 1 - Java - Mision Tic - Ciclo II
*Universidad Sergio Arboleda
*/
package retousa2;

import java.util.HashMap;
import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/

class Reto2 {
    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    public Scanner scanner = new Scanner(System.in);
    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read() {
        return this.scanner.nextLine();
    }
    /**
    * método principal
    */
    public void run() {

        String operacion = scanner.nextLine();
        String productoCadena = scanner.nextLine();
        String[] lista = productoCadena.split(" ");

        int codigo = Integer.parseInt(lista[0]);
        String nombre = lista[1];
        double precio = Double.parseDouble(lista[2]);
        int inventario = Integer.parseInt(lista[3]);
        //Instanciamos clase productos
        Producto producto = new Producto(codigo, nombre, precio, inventario);
        //instanciamos base de datos productos
        BaseDatosProductos bdProductos = new BaseDatosProductos();

        if (!bdProductos.verificarExistencias(producto)) {
            if (operacion.equals("AGREGAR")) {
                bdProductos.agregar(producto);
                bdProductos.generarInforme();
            }else {
                System.out.println("ERROR");
            }
        } else if (bdProductos.verificarExistencias(producto)) {
            if (operacion.equals("ACTUALIZAR")) {
                bdProductos.actualizar(producto);
                bdProductos.generarInforme();
            } else if (operacion.equals("BORRAR")) {
                bdProductos.borrar(producto);
                bdProductos.generarInforme();
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
    }

}// Fin Clase Reto2

class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int inventario;

    public Producto(){
        
    }
    /* public Producto(){
        
    }*/
    public Producto(int codigo, String nombre, double precio, int inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the inventario
     */
    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    /**
     * @param inventario the inventario to set
     */

    @Override
    public String toString() {
        return "\n Nombre Producto " + this.nombre
                + "\n Codigo " + this.codigo
                + "\n Inventario " + this.inventario
                + "\n Precio Producto " + this.precio;
    }
}// Fin Clase Producto

//Clase Base de datos
class BaseDatosProductos {

    HashMap<Integer, Producto> listaProductos = new HashMap<>();

    /*constructor para cargar datos de la base de datos*/
    public BaseDatosProductos() {
        listaProductos.put(1, new Producto(1, "Naranjas", 7000.0, 35));
        listaProductos.put(2, new Producto(2, "Limones", 2500.0, 15));
        listaProductos.put(3, new Producto(3, "Peras", 2700.0, 65));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300.0, 34));
        listaProductos.put(5, new Producto(5, "Tomates", 2100.0, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 9100.0, 20));
        listaProductos.put(7, new Producto(7, "Helado", 4500.0, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500.0, 8));
        listaProductos.put(9, new Producto(9, "Chocolates", 4500.0, 80));
        listaProductos.put(10, new Producto(10, "Jamon", 17000.0, 48));
        //cargarProductos();
    }

    //Metodo para verificar el inventario de productos
    public boolean verificarExistencias(Producto p) {
        return listaProductos.containsKey(p.getCodigo());//True o False
    }

    //Metodo para Agregar productos
    public void agregar(Producto p) {
        listaProductos.put(p.getCodigo(), p);
    }

    //Metodo para actualizar productos
    public void actualizar(Producto p) {
        listaProductos.replace(p.getCodigo(), p);
    }

    //Metodo para borrar productos
    public void borrar(Producto p) {
        listaProductos.remove(p.getCodigo());
    }

    public void generarInforme() {
        String nombrePrecioMayor = productoMayor();
        String nombrePrecioMenor = productoMenor();
        String promedio = promedio();
        String total = total();

        System.out.println(nombrePrecioMayor + " " + nombrePrecioMenor + " " + promedio + " " + total);

    }

    private String productoMayor() {
        String nombre = "";
        double precioAuxiliar = 0;
        for (Producto p : listaProductos.values()) {
            if (p.getPrecio() > precioAuxiliar) {
                nombre = p.getNombre();
                precioAuxiliar = p.getPrecio();
            }
        }
        return nombre;
    }

    private String productoMenor() {
        String nombre = "";
        double precioAuxiliar = listaProductos.values().iterator().next().getPrecio();
        for (Producto p : listaProductos.values()) {
            if (p.getPrecio() < precioAuxiliar) {
                nombre = p.getNombre();
                precioAuxiliar = p.getPrecio();
            }
        }
        return nombre;

    }

    private String promedio() {
        double suma = 0;
        double resultado = 0;
        for (Producto p : listaProductos.values()) {
            suma += p.getPrecio();

        }
        resultado = suma / listaProductos.size();
        return String.format("%.1f", resultado);
    }

    private String total() {
        double suma = 0;
        double resultado = 0;
        for (Producto p : listaProductos.values()) {
            suma = p.getPrecio() * p.getInventario();
            resultado += suma;

        }
        return String.format("%.1f", resultado);
    }
}//Fin Clase Base de Datos Productos
