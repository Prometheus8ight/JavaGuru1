package students.deniss_jankovskis.lesson_7.level_5;

class PowerCalculator {

    public int power(int num, int powerOfNum) {
        int result = num;
        for (int i = 1; i < powerOfNum; i++) {
            result *= num;
        }
        return result;
    }

}
