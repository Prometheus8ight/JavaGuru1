package students.arkadij.lesson_5.task_28;
import java.util.Arrays;

class RandomLowestArray {

    public static void main(String[] args) {
        int[] value = {7,22,65,41,3};
        int min = value[0];
        for (int i = 0; i < value.length; i++){
            if (value[i] < min){
                min = value[i];
            }
        }
        System.out.println(Arrays.toString(value));
        System.out.println("Lowest array number is: " + min);
    }

}
