/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class PooPrincip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Datos del objeto
        System.out.println("Ingrese el ID del producto: ");
        int idProducto = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el nombre del producto: ");
        String descripcion = entrada.nextLine();
        System.out.println("Ingrese el stock del producto: ");
        int stock = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese el estado del producto: ");
        String estado = entrada.nextLine();
        System.out.println("Ingrese la categoria del producto: ");
        String categoria = entrada.nextLine();
        
        Poo objProducto = new Poo(idProducto, descripcion, stock, precio, estado, categoria);
        objProducto.mostrarProducto();
        objProducto.venderProducto();
      
    }
    
}
