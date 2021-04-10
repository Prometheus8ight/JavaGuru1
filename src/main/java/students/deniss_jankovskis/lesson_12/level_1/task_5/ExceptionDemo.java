package students.deniss_jankovskis.lesson_12.level_1.task_5;

class ExceptionDemo extends Exception {

    public static void main(String args[]) {
        Product obj = new Product();
        try {
            obj.productCheck(60);
        } catch (ExceptionDemo ex) {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }

    public ExceptionDemo(String message) {
        super(message);
    }
}




