package students.alex_kalashnikov.lesson_4.level_3.task_10;

class IntegerMax {

    // max(a, max(b, c)) //

    public int max(int intFirst, int x) {
        if (intFirst > x) {
            return intFirst;
        } else {
            return x;
        }
    }
}