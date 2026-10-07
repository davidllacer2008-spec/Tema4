import java.util.Scanner;

public class Ejercicio9 {

    //Atributos

    public static void main(String[] args) {
        int cont1 = 0, contFilas = 0, contCols = 0;
        Scanner input = new Scanner(System.in);
        int[][] array;
        array = new int[10][10];
        System.out.println("dime 10 numeros");
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = 1;
            }
        }
        array[0][4] = 8;
        array[2][6] = 8;
        array[3][1] = 8;
        array[8][6] = 8;
        for (int fila = 0; fila < array.length; fila++) {
            for (int col = 0; col < array.length; col++) {
                System.out.print(array[fila][col] + " ");
            }
            System.out.println();
        }
        for (int fila = 0; fila <array.length;
        fila++){
            cont1 = 0;
            for (int col = 0; col < array.length; col++) {
                if (array[fila][col] == 1) {
                    cont1++;
                }
            }
            if (cont1 == array[0].length) {
                contFilas++;
            }
        }
        for (int col = 0; col < array.length; col++) {
            cont1 = 0;
            for (int fila = 0; fila < array.length; fila++) {
                if (array[fila][col] == 1) {
                    cont1++;
                }
            }
            if (cont1 == 10) {
                contCols++;
            }
        }
        System.out.println("Rows 1s = " + contFilas);
        System.out.println("Cols 1s = " + contCols);
    }
}