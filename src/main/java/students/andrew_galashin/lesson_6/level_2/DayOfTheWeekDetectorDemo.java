package students.andrew_galashin.lesson_6.level_2;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        int day = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(day);
        System.out.println(dayOfTheWeek);

    }
}
