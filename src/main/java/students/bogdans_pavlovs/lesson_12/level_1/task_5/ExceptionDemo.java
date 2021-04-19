package students.bogdans_pavlovs.lesson_12.level_1.task_5;

class ExceptionDemo extends Exception {

    public ExceptionDemo() {
        super("ID Field cannot be left empty");
    }

    public static void main(String[] args) throws Exception {

        ExceptionDemo demo = new ExceptionDemo();

        demo.setID("");
    }


    public void setID (String id) throws Exception {
        if (id.equals("")) {
            throw new ExceptionDemo();
        }
    }

    
}
