/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package ejercicios.guia.pkg6;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el tamaño que desea el cuadro");
         int longitud = leer.nextInt();
        
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                  if (i==0||j==0||i==longitud-1||j==longitud-1){
                      System.out.print("* ");
                      }else{
                      System.out.print("  ");
                  }
                
            }
            System.out.println(" ");
        }
    }
    
}
