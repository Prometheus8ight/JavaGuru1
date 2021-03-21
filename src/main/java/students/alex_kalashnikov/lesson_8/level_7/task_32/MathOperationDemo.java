package students.alex_kalashnikov.lesson_8.level_7.task_32;

class MathOperationDemo {

    public static void main(String[] args) {

        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        System.out.println("Left side Subtraction result = " + subtraction.calculate());

        Argument arg3 = new Argument(20);
        Argument arg4 = new Argument(5);
        MathOperation division = new Division(arg3, arg4);
        System.out.println("Right side Division result = " + division.calculate());

        MathOperation multiplication = new Multiplication(subtraction, division);
        System.out.println("Final Multiplication result = " + multiplication.calculate());

    }

}