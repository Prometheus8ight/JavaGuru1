package students.Dmitry_Gr.lesson_10.level_2.Task_4;

public class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number){
        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday",
                          "Friday", "Saturday", "Sunday"};
        return number >= 1 && number <= 7 ? array[number - 1]
                : "Please input a valid number between 1 and 7";
    }
}
