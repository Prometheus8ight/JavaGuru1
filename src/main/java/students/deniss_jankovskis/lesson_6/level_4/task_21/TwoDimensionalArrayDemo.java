package students.deniss_jankovskis.lesson_6.level_4.task_21;

public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arr = new int[3][8];
        twoDimensionalArray.fillTwoDimArr(arr);
        int sum = twoDimensionalArray.sumTwoDimArr(arr);

        System.out.println("The sum of two Dimensional Arrays is: " + sum);

    }
}
