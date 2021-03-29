package students.kristine_paskevica.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();     //izsauc izveidoto metodi, kur tiek nolasīts dienas nr no konsoles
        int dayNumber = detector.getDayNumberFromUser();                //metode pārbauda ievadīto skaitli


        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);     //izsauc izveidoto metodi, kura izvada dienas nosaukumu
        System.out.println(dayOfTheWeek);
    }
}
