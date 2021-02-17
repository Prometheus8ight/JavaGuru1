package students.julija_katukova.lesson_4.level_7.task_22;

import javax.management.StringValueExp;

class FizzBuzz {
    public static String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) { //поменяла очередность условий, чтобы сначало проверялось более комплексное
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        else
            return Integer.toString(number);

    }

}
