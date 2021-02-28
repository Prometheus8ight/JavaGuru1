package students.kate_br.lesson_6.level_4.task_21;


import java.util.Random;

class TwoDimensionalArray {

    public void fillArray(int[][] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = random.nextInt(11);

        }

    }

    public int sumArray(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i];
        }

        return sum;
    }


}
