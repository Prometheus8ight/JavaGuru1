package students.vitaly_porsev.lesson_6.level_4.task_21;

class TwoDimensionalArray {

    int sumOf2DArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
