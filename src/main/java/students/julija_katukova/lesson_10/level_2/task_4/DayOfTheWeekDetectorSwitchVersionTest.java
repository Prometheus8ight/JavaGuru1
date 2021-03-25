package students.julija_katukova.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorSwitchVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchVersionTest DayOfTheWeekDetectorSwitchVersionTest = new DayOfTheWeekDetectorSwitchVersionTest();
        DayOfTheWeekDetectorSwitchVersionTest.dayOfWeekDetectorTest1();
        DayOfTheWeekDetectorSwitchVersionTest.dayOfWeekDetectorTest2();
        DayOfTheWeekDetectorSwitchVersionTest.dayOfWeekDetectorTest3();
        DayOfTheWeekDetectorSwitchVersionTest.dayOfWeekDetectorTest4();
        DayOfTheWeekDetectorSwitchVersionTest.dayOfWeekDetectorTest5();
        DayOfTheWeekDetectorSwitchVersionTest.dayOfWeekDetectorTest6();
        DayOfTheWeekDetectorSwitchVersionTest.dayOfWeekDetectorTest7();
    }
    
    public void dayOfWeekDetectorTest1() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(1);
        check(realResult, "Monday", "Monday Test");
    }

    public void dayOfWeekDetectorTest2() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(2);
        check(realResult, "Tuesday", "Tuesday Test");
    }

    public void dayOfWeekDetectorTest3() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(3);
        check(realResult, "Wednesday", "Wednesday Test");
    }

    public void dayOfWeekDetectorTest4() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(4);
        check(realResult, "Thursday", "Thursday Test");
    }

    public void dayOfWeekDetectorTest5() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(5);
        check(realResult, "Friday", "Friday Test");
    }

    public void dayOfWeekDetectorTest6() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(6);
        check(realResult, "Saturday", "Saturday Test");
    }

    public void dayOfWeekDetectorTest7() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(7);
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
