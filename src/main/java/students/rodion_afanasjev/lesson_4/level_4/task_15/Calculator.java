package students.rodion_afanasjev.lesson_4.level_4.task_15;

class Calculator {

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (firstNumber == secondNumber && firstNumber < thirdNumber) {
            return thirdNumber;
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber == thirdNumber && firstNumber < secondNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && firstNumber < secondNumber) {
            return secondNumber;
        } else if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            return firstNumber;
        } else {
            return firstNumber;
        }
    }

}
