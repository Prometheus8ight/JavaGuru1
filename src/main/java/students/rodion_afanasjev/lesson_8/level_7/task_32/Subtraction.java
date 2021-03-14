package students.rodion_afanasjev.lesson_8.level_7.task_32;

class Subtraction extends TwoArgumentMathOperation { // операция на вычитание

    public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() - calculateRightSide();
    }
}
