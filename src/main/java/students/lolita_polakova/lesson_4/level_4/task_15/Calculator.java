package students.lolita_polakova.lesson_4.level_4.task_15;

class Calculator {

    public int maxNumber(int a, int b, int c) {
        if (a >= b & a > c) {
            return a;
        } else if (b > a & b > c) {
            return b;
        } else {
            return c;
        }
    }
}