package students.arkadij.lesson_6.level_4.task_21;

class TwoDimensionalArray {

   int twoSumArray(int[][] arr) {
        int sum = 0;
        for (int[] a : arr){
            for (int b : a){
                sum += b;  
            }
        }
        return sum;
    }

    public void twoSumArray() {
        int[][] ints = {{1,3,5},{2,4,6}};
        System.out.println("Answer: " + twoSumArray(ints));
    }
}
