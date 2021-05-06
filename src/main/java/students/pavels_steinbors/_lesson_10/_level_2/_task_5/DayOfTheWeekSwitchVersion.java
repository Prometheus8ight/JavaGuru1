package students.pavels_steinbors._lesson_10._level_2._task_5;

class DayOfTheWeekSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please input a valid number between 1 and 7";
        };
    }
}