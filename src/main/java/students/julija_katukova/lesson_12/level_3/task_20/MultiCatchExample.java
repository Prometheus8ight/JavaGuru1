package students.julija_katukova.lesson_12.level_3.task_20;

class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {
//сначала ловим арифметические ошибки
        } catch (Exception e) {
//потом все остальные
        }
    }
}
