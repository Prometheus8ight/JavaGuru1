package students.kristine_paskevica.lesson_6.level_6;

import java.util.Arrays;

class TicTacToe29 {

    public void printFieldToConsole(int[][] field) {
        System.out.println("Spēles laukums ir šāds");
        for (int[] num : field) {

            System.out.println(Arrays.toString(num));
        }
    }
}
