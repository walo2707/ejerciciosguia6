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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       System.out.println("ingrese una frese a su eleccion ");
        String frase = leer.nextLine();
        
        System.out.println("su frase es:  " +frase.toLowerCase( ) );
        System.out.println("su frase es:  " +frase.toUpperCase( ) );
    
    }
    
}
