package students.alex_kalashnikov.lesson_12.level_1.task_5;

class ExceptionDemo extends Exception {

    public ExceptionDemo() {
        super("NoFirstNameException.");
    }


    private String setFirstName(String name) throws Exception {
        if (name.equals("")) {
            throw new ExceptionDemo();
        }
        return name;
    }

    private String setLastName(String lastName) throws Exception {
        if (lastName.equals("")) {
            throw new Exception("NoLastNameException");
        }
        return lastName;
    }


    public static void main(String[] args) throws Exception {

        ExceptionDemo newDemo = new ExceptionDemo();
        newDemo.setFirstName("1");
        newDemo.setLastName("");

    }

}