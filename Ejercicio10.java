/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicios.guia.pkg6;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor limite que desea llegar");
        int numLim = leer.nextInt();
        int cont = 0;
       do{
        if (cont>numLim){
            System.out.println("Los numeros ingresados ya superaron el Limite");
        break;
        }else{
            System.out.println("Ingrese un nro para sumar");
            int num1 = leer.nextInt();
            cont=cont+num1;
        }
        }while (cont<=numLim);
        System.out.println("Se exedio y La suma de los nros es: " +cont);
       
       
       
}