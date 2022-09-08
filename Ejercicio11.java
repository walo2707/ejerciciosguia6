/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicios.guia.pkg6;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        boolean bandera=true;
        int num1 = 0;
        int num2 = 0;
                
        do {
            
         System.out.println(" ----------------"); 
        System.out.println("| MENU           |"); 
        System.out.println("| 1. Sumar       |");
         System.out.println("| 2. Restar      |");
            System.out.println("| 3. Multiplicar | ");
           System.out.println("| 4. Dividir     |");
            System.out.println("| 5. Salir       |");
             System.out.println("| Elija opcion   |");
         System.out.println(" ----------------");
    
         
         
         int opc = leer.nextInt();
         switch (opc){
            case 1:
                 System.out.println("Ingeses los 2 nros a sumar");
                 num1 = leer.nextInt();
                 num2 = leer.nextInt();
                 System.out.println("El resultado de su operacion es: "+(num1+num2));
                 
                 continue;
            case 2:
                 System.out.println("Ingeses los 2 nros a restar");
                 num1 = leer.nextInt();
                 num2 = leer.nextInt();
                 System.out.println("El resultado de su operacion es: "+(num1-num2));
                 continue;
            case 3:
                 System.out.println("Ingeses los 2 nros a multiplicar");
                 num1 = leer.nextInt();
                 num2 = leer.nextInt();
                 System.out.println("El resultado de su operacion es: "+(num1*num2));
                  continue;
            case 4:
                 System.out.println("Ingeses los 2 nros a dividr");
                 num1 = leer.nextInt();
                 num2 = leer.nextInt();
                 System.out.println("El resultado de su operacion es: "+(num1/num2));
                  continue;
            case 5:
                 System.out.println(" ¿Está seguro que desea salir del programa (S/N)?");
                 String conf= leer.next();
                 if (conf.equalsIgnoreCase("S")) 
                         bandera=false;
                         break;
            default:
                    System.out.println(" Elija una opcion valida");
                    
         }
             }while (bandera == true);
         System.out.println(" Usted salio definitivamente");
    }
}
