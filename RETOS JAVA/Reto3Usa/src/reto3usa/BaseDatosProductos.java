
package reto3usa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class BaseDatosProductos {
    HashMap<Integer,Producto> listaProductos = new HashMap<>();
    
    /*constructor para cargar datos de la base de datos*/
    public BaseDatosProductos(){
        listaProductos.put(1, new Producto(1,"Naranjas",7000.0,35));
        listaProductos.put(2, new Producto(2,"Limones",2500.0,15));
        listaProductos.put(3, new Producto(3,"Peras",2700.0,65));
        listaProductos.put(4, new Producto(4,"Arandanos",9300.0,34));
        listaProductos.put(5, new Producto(5,"Tomates",2100.0,42));
        listaProductos.put(6, new Producto(6,"Fresas",9100.0,20));
        listaProductos.put(7, new Producto(7,"Helado",4500.0,41));
        listaProductos.put(8, new Producto(8,"Galletas",500.0,8));
        listaProductos.put(9, new Producto(9,"Chocolates",4500.0,80));
        listaProductos.put(10, new Producto(10,"Jamon",17000.0,48));
        //cargarProductos();
    }
    public List<Producto>getListaProductos(){
        return new ArrayList<>(this.listaProductos.values());
    }
    
    public void setListaProductos(HashMap<Integer,Producto> listaProductos){
        this.listaProductos = listaProductos;
    }
    
    public boolean verificarExistencias(Producto p){
        return listaProductos.containsKey(p.getCodigo());//True o False
    }
    public boolean verificarExistencias(String nombre){
        for (Producto p : this.listaProductos.values()) {
            if(nombre.toLowerCase().equals(p.getNombre().toLowerCase())){
                return true;
            }
        }return false;
    }// fin clase verificar existencias
    
    public int codigoFinal(){
        int codigo = 0;
        for (Producto p : listaProductos.values()) {
            codigo = p.getCodigo();
        }return codigo;
    }
    
    public void agregar(Producto p){
        this.listaProductos.put(p.getCodigo(), p);
        
    }
    
    public void actualizar(Producto p){
        this.listaProductos.replace(p.getCodigo(), p);
    }
    
    public void borrar(Producto p){
        this.listaProductos.remove(p.getCodigo());
    }
    
    public String generarInforme(){
        List<Producto> listaM = obtenerMayores();
        return listaM.get(0).getNombre()+" "+listaM.get(1).getNombre()+" "+listaM.get(2).getNombre();
    }
    
    private List<Producto> obtenerMayores(){
        List<Producto> lista = new ArrayList<>(this.listaProductos.values());
        List<Producto> listaMayores = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Producto p = new Producto();
            for (Producto pTemp : lista) {
                if(pTemp.getPrecio()>p.getPrecio()){
                    p = pTemp;
                }
            }
            listaMayores.add(p);
            lista.remove(p);
        }
        return listaMayores;
    }
    
}// final clase base de datos

