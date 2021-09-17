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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int distancia = 0;
        int velocidad = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite la Distancia: ");
        distancia = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite la Velocidad: ");
        velocidad = entrada.nextInt();
        System.out.println("El tiempo que tarda es: " + (distancia/velocidad));
                 
          
        
    }
    
}
