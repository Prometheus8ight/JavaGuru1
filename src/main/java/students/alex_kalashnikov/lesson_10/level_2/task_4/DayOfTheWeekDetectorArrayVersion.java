package students.alex_kalashnikov.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    public String[] createArray() {
        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return arr;
    }

    @Override
    public String detectDayName(int number) {
        for (int i = 0; i < createArray().length; i++) {
            if (i == number - 1) {
                return createArray()[i];
            }
        }
        return "Please input a valid number between 1 and 7";
    }

}