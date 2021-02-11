package students.rodion_afanasjev.lesson_4.level_4.task_13;

class Calculator {

    public int sumPlus(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int sumMinus(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int sumMultiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int sumDivide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;

    }
}
