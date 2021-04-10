package students.deniss_jankovskis.lesson_12.level_1.task_5;

class Product {

    public void productCheck(int weight) throws ExceptionDemo {
        if (weight < 80) {
            throw new ExceptionDemo("Product Invalid");
        }
    }
}
