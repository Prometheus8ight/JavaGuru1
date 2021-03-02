package students.arkadij.lesson_5.task_27;
import java.util.Arrays;

class RandomHighestArrayLength {

    public static void main(String[] args) {

        int [] value = {55,97,4,16,33,25,88};
        int high = value[0];
        for (int i = 0; i < value.length; i++){
            if (value[i] > high){
                high = value[i];
            }
        }
        System.out.println(Arrays.toString(value));
        System.out.println("High value is: " + high);
    }

}
