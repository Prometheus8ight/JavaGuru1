package students.darja_scavrovica.lesson_4.level_4.task_15;

class Calculator {
    public int ComperingNumbers(int firstNumber, int secondNumber,int thirdNumber) {


        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (secondNumber == firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber;
        } else if (firstNumber == thirdNumber && thirdNumber == secondNumber) {
            return firstNumber;
        } else {
            return firstNumber;
        }
    }
}
