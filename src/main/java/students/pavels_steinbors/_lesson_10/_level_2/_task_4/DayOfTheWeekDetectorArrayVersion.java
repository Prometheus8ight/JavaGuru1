package students.pavels_steinbors._lesson_10._level_2._task_4;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
        return number >= 1 && number <= 7 ? days[number - 1] : "Please input a valid number between 1 and 7";
    }
}
