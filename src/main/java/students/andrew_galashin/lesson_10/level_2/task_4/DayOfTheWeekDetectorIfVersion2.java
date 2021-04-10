package students.andrew_galashin.lesson_10.level_2.task_4;

public class DayOfTheWeekDetectorIfVersion2 implements DayOfTheWeekDetector2 {

    @Override
    public String detectDayName(int number) {
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tusday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please input a valid number between 1 and 7";

        };
    }

}
