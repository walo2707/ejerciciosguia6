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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
    System.out.println("ingrese los grados centrigrados que desea calcular");
    int grados = leer.nextInt();
    System.out.println("Sus grados centrigraso en Fahrenheit es: "+(32 + ((9*grados)/5)));
    
    
    
    }
    
}
