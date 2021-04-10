package students.deniss_jankovskis.lesson_12.level_3.task_20;

class MultiCatchExample {

    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {
            System.out.println("Arithmetic exception");

        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    /*
    Нет, не правильно. Компилятор будет ругаться. Нам надо поменять их местами или убрать ArithmeticException.
    Если Exception будет первым в блоке, то он первый словит ошибки связанные с ArithmeticException.
    */
}
