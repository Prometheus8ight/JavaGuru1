package students.rodion_afanasjev.lesson_8.level_7.task_32;

class MAthOperationDemo {

    public static void main(String[] args) {

        // build and calculate: 10 + 20
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        System.out.println("Left side Addition result = " + addition.calculate());

        // build and calculate: 50 - 20
        Argument arg3 = new Argument(50);
        Argument arg4 = new Argument(20);
        MathOperation subtraction = new Subtraction(arg3, arg4);
        System.out.println("Right side Subtraction result = " + addition.calculate());

        // build and calculate: (10 + 20) + (50 - 20)
        MathOperation addition1 = new Addition(addition, subtraction);
        System.out.println("Final Addition result = " + addition1.calculate());

        // build and calculate: 10 - 5
        Argument number1 = new Argument(10);
        Argument number2 = new Argument(5);
        MathOperation subtraction1 = new Subtraction(number1, number2);
        System.out.println("Left side Subtraction result = " + subtraction1.calculate());

        // build and calculate: 20 / 5
        Argument number3 = new Argument(20);
        Argument number4 = new Argument(5);
        MathOperation divide = new Divide(number3, number4);
        System.out.println("Right side Divide result = " + divide.calculate());

        // build and calculate: (10 - 5) * (20 / 5)
        MathOperation multiply = new Multiplication(subtraction1, divide);
        System.out.println("Final Addition result = " + multiply.calculate());
    }

}
