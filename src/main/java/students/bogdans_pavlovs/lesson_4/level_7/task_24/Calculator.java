package students.bogdans_pavlovs.lesson_4.level_7.task_24;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void expectedResult1(int result, int expectedResult){

        if (result == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void expectedResult2(boolean result, boolean expectedResult){

        if (result == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

}
