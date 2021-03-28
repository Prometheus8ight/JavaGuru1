package students.rodion_afanasjev.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorArray implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number){
        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return number >= 1 && number <= 7 ? array[number - 1] : "Please input a valid number between 1 and 7";
    }

}
