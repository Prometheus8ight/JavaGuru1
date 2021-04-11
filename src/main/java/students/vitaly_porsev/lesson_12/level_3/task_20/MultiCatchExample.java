package students.vitaly_porsev.lesson_12.level_3.task_20;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
        } catch (ArithmeticException a) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("All others exceptions");
        }
    }
}

   /*Мы можем поменять их местами, чтобы отловить ArithmeticException, и затем отловить все другие исключения.
    Либо убрать ArithmeticException, так как если Exception идёт первым в блоке, он уже отловит все ошибки
    Связанные с ArithmeticException. */