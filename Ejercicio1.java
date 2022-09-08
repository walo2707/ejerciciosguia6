/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.pkg6;
import java.util.Scanner;
        
/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese los 2 numero a sumar");
       int num1 = leer.nextInt();
        int num2 = leer.nextInt();
         System.out.println("la suma de los dos valores es: " +(num1+num2));
        // TODO code application logic here
    }
    
}
