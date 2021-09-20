/*
Autor: Ramses Camilo Torres N
Version 1.5
Reto 1 - Java - Mision Tic - Ciclo II
Universidad Sergio Arboleda
*/

import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/

class Reto1{

    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    
    private final Scanner scanner = new Scanner(System.in);

    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read(){
        return this.scanner.nextLine();
    }

    /**
    * método principal
    */
    public void run(){
        /*
        solución propuesta
        */
    }
}





public boolean verificar (double pesoPac, double alturaPac, double edadPac)
{
    boolean valida = true;
    if(pesoPac < 0 || pesoPac > 150 || alturaPac < 0.1 || alturaPac > 2.5 || edadPac < 0 || edadPac > 110){
        valida = false;
    }
    return valida;
}