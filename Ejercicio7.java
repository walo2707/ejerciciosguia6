/*
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejercicios.guia.pkg6;
import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la clave");
   String frase = leer.nextLine();
   String frase1="eureka";
   if (frase.equals(frase1)){
   System.out.println("La clave ingresada es correcta");
    }
   else{   
          System.out.println("La clave ingresada es incorrecta"); 
           }
    
    }
    
}
