package students.andrew_galashin.lesson_7.level_5.task_9;

class PowerCalculator {

    public int raise(int number, int power) {
        return calculate(number, power);
    }

    int calculate(int number, int power) {
        int result = calculate1(number, power);
        return result(number, power, result);
    }

    private int calculate1(int number, int power) {
        int x = 1;
        if (powerNegative(power)) {
            x = negativeNumber(number);
        }
        return x;
    }

    private boolean powerNegative(int power) {
        return power < 0;
    }

    private int negativeNumber(int number) {
        return (1 / number);
    }


    private int result(int number, int power, int x) {

        for (int i = 0; i < power; i++) {
            x = number * x;
        }
        return x;
    }


}
