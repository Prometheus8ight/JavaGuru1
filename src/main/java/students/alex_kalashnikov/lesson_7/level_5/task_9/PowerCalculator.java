package students.alex_kalashnikov.lesson_7.level_5.task_9;

class PowerCalculator {

    private double raiseToThePositivePower(double number, int power) {
        double result = number;
        while (power != 1) {
            result = result * number;
            power--;
        }
        return result;
    }

    private double raiseToTheNegativePower(double number, int power) {
        double result = number;
        while (power != -1) {
            result = (result * number);
            power++;
        }
        return 1 / result;
    }

    private double raiseToZeroPower() {
        return 1;
    }

    public double raiseToThePower(double number, int power) {
        if (power > 0) {
            return raiseToThePositivePower(number, power);
        }
        if (power < 0) {
            return raiseToTheNegativePower(number, power);
        } else {
            return raiseToZeroPower();
        }
    }

}