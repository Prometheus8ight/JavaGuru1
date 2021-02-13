package students.bogdans_pavlovs.lesson_4.level_4.task_11;

class Calculator {

    public int addition (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction (int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber){
            return firstNumber - secondNumber;
        } else {
            return secondNumber - firstNumber;
        }

    }

    public int division (int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber){
            return firstNumber / secondNumber;
        } else {
            return secondNumber / firstNumber;
        }
    }

    public int multiplication (int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
