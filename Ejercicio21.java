/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejercicios.guia.pkg6;

/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int M[][] = new int[10][10];

        int[][] P = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = (int) (Math.random() * 100);

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                M[i][j] = P[i][j - 3];
            }
        }
       // M[2][5] = 0;
        System.out.println("Matriz M");
        imprimir(M, 10);
        System.out.println("Matriz P");
        imprimir(P, 3);

        boolean resultado = verificar(M, P);
        if (resultado) {
            System.out.println("");
        } else {
            System.out.println("La Matriz P no esta dentro de la Matriz M");
        }

    }

    public static void imprimir(int matriz[][], int D) {
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < D; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }

    }

    public static boolean verificar(int matriz[][], int matriz1[][]) {
        boolean bandera = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == matriz1[0][0]) {
                    bandera = verificar1(matriz, matriz1, i, j);

                }
                if (bandera) {
                    System.out.println(" la matriz P se encontro en la matriz M en los indices");
                    for (int k = i; k < i + 3; k++) {
                        for (int h = j; h < j+3; h++) {
                            System.out.print("[ " +k + "," +h + " ] ");
                        }

                    }
                    break;
                }

            }
            if (bandera) {

                break;
            }
        }

        return bandera;

    }

    public static boolean verificar1(int matriz[][], int matriz1[][], int pos, int pos1) {
        // i=4 ; j=4

        boolean ban = true;
        for (int i = pos; i < pos + 3; i++) {
            for (int j = pos1; j < pos1 + 3; j++) {
                if (matriz[i][j] == matriz1[i - pos][j - pos1]) {
                    ban = true;
                } else {
                    ban = false;
                    break;
                }
            }
            if (ban == false) {
                break;
            }
        }
        return ban;
    }
}
