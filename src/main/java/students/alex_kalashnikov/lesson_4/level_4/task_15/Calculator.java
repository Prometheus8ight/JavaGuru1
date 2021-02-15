package students.alex_kalashnikov.lesson_4.level_4.task_15;

class Calculator {

    public int sum1(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub1(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div1(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multi1(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven1(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers1(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        else if (firstNumber < secondNumber) {
            return secondNumber;
        }
        else {
            return firstNumber = secondNumber;
        }

    }

}
