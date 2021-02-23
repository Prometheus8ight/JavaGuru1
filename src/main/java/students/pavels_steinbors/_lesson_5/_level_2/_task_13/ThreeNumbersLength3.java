package students.pavels_steinbors._lesson_5._level_2._task_13;

import java.util.stream.IntStream;

class ThreeNumbersLength3 {

    public static void main(String[] args) {

        int[] number = {3, 5, 7};

        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random());

        //    int sum = IntStream.of(number).sum();
            System.out.println(number[i]);
         //   System.out.println("summa: " + sum);

        }

    }
}