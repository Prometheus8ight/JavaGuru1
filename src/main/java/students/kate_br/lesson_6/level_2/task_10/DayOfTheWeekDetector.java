package students.kate_br.lesson_6.level_2.task_10;

public class DayOfTheWeekDetector {

    public String findDayOfTheWeek(int dayNumber){

        return switch (dayNumber){

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not correct day number!";
        };
    }
}
