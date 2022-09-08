/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicios.guia.pkg6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int euros;
        String moneda;

        System.out.println("Ingrese la cantidad de Euros a convertir");
        euros = leer.nextInt();
        System.out.println("Ingrese la monedad que desea convertir: dólares, yenes o libras.");
        moneda = leer.next().toLowerCase();
        convertir(euros, moneda);

    }

    public static void convertir(int euros, String moneda) {
        switch (moneda) {
            case "dolares":
                System.out.println("Su cambio es: " + euros * 1.28611 + "en Dolares");
                    break;
            case "yenes":
                System.out.println("Su cambio es: " + euros * 129.852 +"en Yenes");
                break;
            case "libras":
                System.out.println("Su cambio es: " + euros * 0.86 +"en Libras");
                break;
            default:
                System.out.println("no valido");
        }
    
    }
}
