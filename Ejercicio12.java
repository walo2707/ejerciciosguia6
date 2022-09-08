/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicios.guia.pkg6;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
          int correctas = 0;
        int incorrectas = -1;
        do {
         System.out.println("ingrese la secuencia de caracteres deseada hasta 5 caracteres ");
        frase = leer.nextLine();
        if ((frase.length() < 6) && (frase.substring(0, 1).equalsIgnoreCase("x")) && (frase.substring(frase.length()-1, frase.length()).equalsIgnoreCase("o"))) {
                 correctas++;
            } else {
                incorrectas++;
            }
         } while (!(frase.equals("&&&&&")));
            System.out.println("las correctas son: " + correctas);
        System.out.println("y las incorrectas son: " + incorrectas);
        
        
        
        
        
         
        
        
                
    }
    
} 
