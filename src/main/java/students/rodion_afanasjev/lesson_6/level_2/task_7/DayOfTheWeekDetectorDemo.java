package students.rodion_afanasjev.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser(); // Считать число с консоли сканером
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber); // Пропустить число пользователя через метод
        System.out.println(dayOfTheWeek); // Распечатать результат
    }

}
