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

    public int maxOfThreeNumbers1(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
          return firstNumber;
        }
        else if (firstNumber > secondNumber && firstNumber == thirdNumber) {
            return firstNumber = thirdNumber;
        }
        else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber = secondNumber;
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        }
        else if (secondNumber > firstNumber && secondNumber == thirdNumber) {
            return secondNumber = thirdNumber;
        }
        else if (secondNumber == firstNumber && secondNumber > thirdNumber) {
            return secondNumber = firstNumber;
        }
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        }
        else if (thirdNumber > firstNumber && thirdNumber == secondNumber) {
            return thirdNumber = secondNumber;
        }
        else if (thirdNumber == firstNumber && thirdNumber > secondNumber) {
            return thirdNumber = firstNumber;
        }
        else {
            return firstNumber = secondNumber = thirdNumber;
        }

    }

}
