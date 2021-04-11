package students.andrew_galashin.lesson_10.level_2.task_5;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest start = new DayOfTheWeekDetectorTest();
        start.dayOfTheWeekDetectorTest1();
        start.dayOfTheWeekDetectorTest2();
        start.dayOfTheWeekDetectorTest3();
        start.dayOfTheWeekDetectorTest4();
        start.dayOfTheWeekDetectorTest5();
        start.dayOfTheWeekDetectorTest6();
        start.dayOfTheWeekDetectorTest7();
    }


    void dayOfTheWeekDetectorTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(1);
        check(result, "Monday", "MondayTest");
    }

    void dayOfTheWeekDetectorTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(2);
        check(result, "Tusday", "TusdayTest");
    }

    void dayOfTheWeekDetectorTest3() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(3);
        check(result, "Wednesday", "WednesdayTest");
    }

    void dayOfTheWeekDetectorTest4() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(4);
        check(result, "Thursday", "ThursdayTest");
    }

    void dayOfTheWeekDetectorTest5() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(5);
        check(result, "Friday", "FridayTest");
    }

    void dayOfTheWeekDetectorTest6() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(6);
        check(result, "Saturday", "SaturdayTest");
    }

    void dayOfTheWeekDetectorTest7() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String result = dayOfTheWeekDetector.detectDayName(7);
        check(result, "Sunday", "SundayTest");
    }


    void check(String result, String expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
