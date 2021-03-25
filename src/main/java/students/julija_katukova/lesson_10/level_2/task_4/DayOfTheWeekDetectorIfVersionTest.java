package students.julija_katukova.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorIfVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersionTest dayOfTheWeekDetectorIfVersionTest = new DayOfTheWeekDetectorIfVersionTest();
        dayOfTheWeekDetectorIfVersionTest.dayOfWeekDetectorTest1();
        dayOfTheWeekDetectorIfVersionTest.dayOfWeekDetectorTest2();
        dayOfTheWeekDetectorIfVersionTest.dayOfWeekDetectorTest3();
        dayOfTheWeekDetectorIfVersionTest.dayOfWeekDetectorTest4();
        dayOfTheWeekDetectorIfVersionTest.dayOfWeekDetectorTest5();
        dayOfTheWeekDetectorIfVersionTest.dayOfWeekDetectorTest6();
        dayOfTheWeekDetectorIfVersionTest.dayOfWeekDetectorTest7();
    }

    public void dayOfWeekDetectorTest1() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(1);
        check(realResult, "Monday", "Monday Test");
    }

    public void dayOfWeekDetectorTest2() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(2);
        check(realResult, "Tuesday", "Tuesday Test");
    }

    public void dayOfWeekDetectorTest3() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(3);
        check(realResult, "Wednesday", "Wednesday Test");
    }

    public void dayOfWeekDetectorTest4() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(4);
        check(realResult, "Thursday", "Thursday Test");
    }

    public void dayOfWeekDetectorTest5() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(5);
        check(realResult, "Friday", "Friday Test");
    }

    public void dayOfWeekDetectorTest6() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(6);
        check(realResult, "Saturday", "Saturday Test");
    }

    public void dayOfWeekDetectorTest7() {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(7);
        check(realResult, "Sunday", "Sunday Test");
    }

    public void check(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
