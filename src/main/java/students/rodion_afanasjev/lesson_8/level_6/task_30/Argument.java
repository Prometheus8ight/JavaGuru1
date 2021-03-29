package students.rodion_afanasjev.lesson_8.level_6.task_30;

import java.util.Arrays;

class Argument {

    public static void main(String[] args) {

        Argument argument = new Argument();
        int sum = argument.sum(1,2,3,4,5,6);
        System.out.println(sum);

    }

    int sum(int... numbers){
        return Arrays.stream(numbers).sum();
    }

}
