package students.andrew_galashin.lesson_10.level_2.task_5;


class DayOfTheWeekDetector implements DayOfTheWeekDetector2 {

    @Override
    public String detectDayName(int numer) {
        String[] detectDay = {"Monday", "Tusday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
        return detectDay[numer - 1];
    }
}

