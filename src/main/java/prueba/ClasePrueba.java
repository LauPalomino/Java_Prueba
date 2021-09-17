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
public class ClasePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 0;
        int numero2 = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        numero1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el segundo número: ");
        numero2 = entrada.nextInt();
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        System.out.println("División: " + (numero1 / numero2));        
    }
    
}
