package students.alex_kalashnikov.lesson_4.level_4.task_15;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfThreeNumbers(int x, int thirdNumber) {
        if (x > thirdNumber) {
            return x;
        }
        else if (x < thirdNumber) {
            return thirdNumber;
        }
        else {
            return thirdNumber;
        }
    }

}