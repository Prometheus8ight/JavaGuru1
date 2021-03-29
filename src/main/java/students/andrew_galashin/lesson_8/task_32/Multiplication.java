package students.andrew_galashin.lesson_8.task_32;

class Multiplication extends TwoArgumentMathOperation {

    public Multiplication(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
