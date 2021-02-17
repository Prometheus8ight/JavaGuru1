package students.alex_kalashnikov.lesson_4.level_3.task_10;

class IntegerMax {

    // max(a, max(b, c)) //

    public int max1(int intSecond, int intThird) {   // сначала вычисляется Max(b, c)
        if (intSecond > intThird) {
            return intSecond;
        } else {
            return intThird;
        }
    }


    public int max(int intFirst, int x) {            // потом вычисляется Max(a, x) где x = Max(b, c)
        if (intFirst > x) {
            return intFirst;
        } else {
            return x;
        }
    }
}