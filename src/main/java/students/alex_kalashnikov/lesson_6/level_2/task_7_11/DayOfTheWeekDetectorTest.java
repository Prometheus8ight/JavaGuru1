package students.alex_kalashnikov.lesson_6.level_2.task_7_11;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.testMonday();
        test.testTuesday();
        test.testWednesday();
        test.testThursday();
        test.testFriday();
        test.testSaturday();
        test.testSunday();
    }

    public void test(String expectedResult, int dayNumber) {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();
        String realResult = test.findDayOfTheWeek(dayNumber);
        if (expectedResult == realResult) {
            System.out.println(expectedResult + " test is OK!");
        } else {
            System.out.println(expectedResult + " test is FAILED!");
        }
    }


    public void testMonday() {
        int dayNumber = 1;
        String expectedResult = "Monday";
        test(expectedResult, dayNumber);
    }

    public void testTuesday() {
        int dayNumber = 2;
        String expectedResult = "Tuesday";
        test(expectedResult, dayNumber);
    }

    public void testWednesday() {
        int dayNumber = 3;
        String expectedResult = "Wednesday";
        test(expectedResult, dayNumber);
    }

    public void testThursday() {
        int dayNumber = 4;
        String expectedResult = "Thursday";
        test(expectedResult, dayNumber);
    }

    public void testFriday() {
        int dayNumber = 5;
        String expectedResult = "Friday";
        test(expectedResult, dayNumber);
    }

    public void testSaturday() {
        int dayNumber = 6;
        String expectedResult = "Saturday";
        test(expectedResult, dayNumber);
    }

    public void testSunday() {
        int dayNumber = 7;
        String expectedResult = "Sunday";
        test(expectedResult, dayNumber);
    }

}

