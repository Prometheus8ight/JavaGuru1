package students.julija_katukova.lesson_7.level_5.task_9;

class PowerCalculator {

    public int raiseNumberInPower(int number, int power) {
        return calculate(number, power);
    }

    private int calculate(int number, int power) {
        int result = initializeResult(number, power);
        return calculateResult(number, power, result);
    }

    private int initializeResult(int number, int power) {
        int result = 1;
        if (isPowerNegative(power)) {
            result = adjustmentForNegativePower(number);
        }
        return result;
    }

    private boolean isPowerNegative(int power) {
        return power < 0;
    }

    private int adjustmentForNegativePower(int number) {
        return (1 / number);
    }

    private int calculateResult(int number, int power, int result) {
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
