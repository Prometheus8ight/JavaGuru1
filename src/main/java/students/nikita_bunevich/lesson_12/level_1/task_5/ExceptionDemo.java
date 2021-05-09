package students.nikita_bunevich.lesson_12.level_1.task_5;


class ExceptionDemo extends Exception {
    public static void main(String args[]) {
        Product product = new Product();
    try {
        product.productCheck(10);
    } catch (ExceptionDemo ex) {
        System.out.println("Caught the exception");
        System.out.println(ex.getMessage());
        }
    }
    public ExceptionDemo(String message) { super(message); }
}