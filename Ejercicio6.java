/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicios.guia.pkg6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nro para verificar si es par o impar");
        double num = leer.nextDouble();
        if (num % 2 == 0) {
            System.out.println("El numero que ingreso es par");
        } else {
            System.out.println("El numero que ingreso es impar");
        }
    }
}