package students.alex_kalashnikov.lesson_12.level_3.task_20;

class MultiCatchExample {

    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {
    /*
    Более вместительный класс исключений
    (в данном случае Exception включает в
    себя ArithmeticException) должен
     находится внизу иерархии catch, иначе
    при арифметической ошибке всегда будет
    выдавать ошибку Exception.
     */

        }
    }

}