package students.rodion_afanasjev.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mondayTest();
        dayOfTheWeekDetectorTest.tuesdayTest();
        dayOfTheWeekDetectorTest.wednesdayTest();
        dayOfTheWeekDetectorTest.thursdayTest();
        dayOfTheWeekDetectorTest.fridayTest();
        dayOfTheWeekDetectorTest.saturdayTest();
        dayOfTheWeekDetectorTest.sundayTest();
        dayOfTheWeekDetectorTest.notCorrectTest();

    }

    private void equalCheck(boolean condition,String testName) { // условие, имя теста
        if (condition) { // если условие true
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    public void mondayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1); // dayOfTheWeek реальный резултат
        equalCheck("Monday".equals(dayOfTheWeek),"mondayTest"); // Monday ожидаемый результат
    }

    public void tuesdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        equalCheck("Tuesday".equals(dayOfTheWeek),"tuesdayTest");
    }

    public void wednesdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        equalCheck("Wednesday".equals(dayOfTheWeek),"wednesdayTest");
    }

    public void thursdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        equalCheck("Thursday".equals(dayOfTheWeek),"thursdayTest");
    }

    public void fridayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        equalCheck("Friday".equals(dayOfTheWeek),"fridayTest");
    }

    public void saturdayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        equalCheck("Saturday".equals(dayOfTheWeek),"saturdayTest");
    }

    public void sundayTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        equalCheck("Sunday".equals(dayOfTheWeek),"sundayTest");
    }

    public void notCorrectTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(8);
        equalCheck("Not correct day number".equals(dayOfTheWeek),"notCorrectTest");
    }

}
