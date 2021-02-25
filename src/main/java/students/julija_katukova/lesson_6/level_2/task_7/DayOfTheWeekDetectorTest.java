package students.julija_katukova.lesson_6.level_2.task_7;

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
        dayOfTheWeekDetectorTest.defaultTest(22);
    }

    public void mondayTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Monday", "Monday Test");
    }

    public void tuesdayTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Tuesday", "Tuesday Test");
    }

    public void wednesdayTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Wednesday", "Wednesday Test");
    }

    public void thursdayTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Thursday", "Thursday Test");
    }

    public void fridayTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Friday", "Friday Test");
    }

    public void saturdayTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Saturday", "Saturday Test");
    }

    public void sundayTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Sunday", "Sunday Test");
    }

    public void defaultTest (int dayNumber) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
        check(realResult, "Not correct day number", "Default Test");
    }

    public void check (String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

}
