package students.andrew_galashin.lesson_6.level_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.mondayTest(1);
        dayOfTheWeekDetectorTest.tuesdayTest(2);
        dayOfTheWeekDetectorTest.wednesdayTest(3);
        dayOfTheWeekDetectorTest.thursdayTest(4);
        dayOfTheWeekDetectorTest.fridayTest(5);
        dayOfTheWeekDetectorTest.saturdayTest(6);
        dayOfTheWeekDetectorTest.sundayTest(7);
        dayOfTheWeekDetectorTest.defaultTest(8);

    }

    public void mondayTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Monday", "Monday test");
    }

    public void tuesdayTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Tuesday", "Tuesday test");
    }

    public void wednesdayTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Wednesday", "Wednesday test");
    }

    public void thursdayTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Thursday", "Thursday test");
    }

    public void fridayTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Friday", "Friday test");
    }

    public void saturdayTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Saturday", "Saturday test");
    }

    public void sundayTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Sunday", "Sunday test");
    }

    public void defaultTest(int day) {
        Task_7.DayOfTheWeekDetector detector = new Task_7.DayOfTheWeekDetector();
        String realResult = detector.findDayOfTheWeek(day);
        check(realResult, "Not correct day number", "Default test");
    }


    public void check(String realResult, String expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(": Ok");
        } else {
            System.out.println(": Fail");
        }
    }
}
