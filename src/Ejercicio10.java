import java.util.Scanner;

public class Ejercicio10 {

    //Atributos

    public static void main(String[] args) {
        final char[] LETTERS = {'A', 'B', 'C', 'A', 'C', 'A', 'B', 'A', 'C', 'B', 'A', 'B', 'C', 'A', 'B', 'A', 'B', 'A', 'C', 'B'};
        int counter;
        int moda = 0;
        int freq = 0;


        for (int i = 0; i < LETTERS.length; i++) {
            counter = 0;
            char candidata = LETTERS[i];
            for (int j = 0; j < LETTERS.length; j++) {
                if (LETTERS[j] == candidata) {
                    counter++;
                }
            }
            if (counter > freq) {
                moda = i;
                freq = counter;
            }

        }
        System.out.println(LETTERS[moda] + " aparece" + freq + "veces");

    }
}
