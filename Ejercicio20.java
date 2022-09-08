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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                do {
                    System.out.println("ingrese el numero " + i + "," + j);
                    num = leer.nextInt();
                    matriz[i][j] = num;

                } while (num < 1 || num > 9);

            }

        }
        boolean comparacion = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        int suma = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = suma + matriz[i][j];
            }
        }
        int suma1;
        for (int i = 1; i < 3; i++) {
            suma1 = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma1 = suma1 + matriz[i][j];
            }
            if (suma != suma1) {
                comparacion = false;
                break;

            }
        }
        if (comparacion) {

        }
        for (int j = 0; j < matriz.length; j++) {
            suma1 = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma1 = suma1 + matriz[i][j];
            }
            if (suma != suma1) {
                comparacion = false;
                break;

            }
        }

        if (comparacion) {

        suma1 = 0;
        for (int i = 0; i < matriz.length; i++) {
           
            for (int j = 0; j < matriz.length; j++) {
                if (i==j){
                suma1 = suma1 + matriz[i][j];
                }
              }
           }
         if (suma != suma1) {
                comparacion = false;
                 }
        }
        suma1 = 0; 
        if (comparacion) {

        
        int j=2;
        for (int i = 0; i < 3; i++) {
             suma1 = suma1 + matriz[i][j];
                 j--;
               }
         if (suma != suma1) {
                comparacion = false;
                 }
        }
        if (comparacion) {
            System.out.println("La matriz es magica");
        }else {
            System.out.println("no es magica");
            
        }
    }
}
