package students.bogdans_pavlovs.lesson_10.level_2;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {

        String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return week[number-1];

    }

}
