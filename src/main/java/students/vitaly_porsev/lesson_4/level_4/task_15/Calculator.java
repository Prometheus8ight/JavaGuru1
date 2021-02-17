package students.vitaly_porsev.lesson_4.level_4.task_15;

public class Calculator {

    int findMaxNumber(int a, int b, int c) {
        if (a > b && a > c || a == b && a > c) {
            return a;
        } else if (b > a && b > c || b == c && b > a) {
            return b;
        }return c;
        }
    }




