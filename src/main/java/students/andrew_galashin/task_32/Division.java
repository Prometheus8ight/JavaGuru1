package main.java.students.andrew_galashin.task_32;

class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}