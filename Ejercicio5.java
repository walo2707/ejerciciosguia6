/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt()..
 */
package ejercicios.guia.pkg6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese un nro entero a su eleccion");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        System.out.println("el doble del nro que ingreso es: " +(num*2));
        System.out.println("el Tripe del nro que ingreso es: " +(num*3));
         System.out.println("La Raiz cuadrada es: " +(Math.sqrt(num)));
                
                
               
        
        
    }
    
}
