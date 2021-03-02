package students.kate_br.lesson_6.level_2.task_7;


class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.mondayTest(1);
        test.tuesdayTest(2);
        test.wednesdayTest(3);
        test.thursdayTest(4);
        test.fridayTest(5);
        test.saturdayTest(6);
        test.sundayTest(7);

    }

    public void mondayTest(int day) {

        String expectedResult = "Monday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void tuesdayTest(int day) {

        String expectedResult = "Tuesday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void wednesdayTest(int day) {

        String expectedResult = "Wednesday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void thursdayTest(int day) {

        String expectedResult = "Thursday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void fridayTest(int day) {

        String expectedResult = "Friday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void saturdayTest(int day) {

        String expectedResult = "Saturday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void sundayTest(int day) {

        String expectedResult = "Sunday";
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}
