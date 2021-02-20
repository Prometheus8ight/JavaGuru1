package students.pavels_steinbors._lesson_5._level_2._task_12;



public class ThreeNumbersLength2 {

    public static void main(String[] args) {

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 50);

            System.out.println(number[i]);

        }
    }
}