/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia.pkg6;



/**
 *
 * @author Usuario
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        boolean ban = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] != 0) {
                    ban = true;
                    break;
                }
            }
            if (ban == true) {
                break;
            }

        }
        if(ban==true){
            System.out.println("La Matriz no es antisimetrica");
       }else{
            System.out.println("La Matriz es antisimetrica");
            }
    
    }

}


