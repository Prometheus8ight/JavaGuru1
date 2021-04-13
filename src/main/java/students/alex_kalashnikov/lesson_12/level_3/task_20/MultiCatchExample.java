package students.alex_kalashnikov.lesson_12.level_3.task_20;

class MultiCatchExample {

    public static void main(String[] args) {

        try {

        } catch (Exception e) { //
/*
этот блок включает в себя Exception и все его дочерние классы
(в том числе ArithmeticException). Поэтому отдельный блок catch для
ArithmeticException не нужен!

        } catch (ArithmeticException a) {

*/
        }
    }

}