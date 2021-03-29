package students.kate_br.lesson_6.level_4.task_21;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        TwoDimensionalArray array = new TwoDimensionalArray();
        int[][] arr = new int[5][7];
        array.fillArray(arr);
        int sum = array.sumArray(arr);

        System.out.println("Array sum = " + sum);

    }


}
