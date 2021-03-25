package students.julija_katukova.lesson_10.level_2;

class DayOfTheWeekDetectorArrayVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorArrayVersionTest DayOfTheWeekDetectorArrayVersionTest = new DayOfTheWeekDetectorArrayVersionTest();
        DayOfTheWeekDetectorArrayVersionTest.dayOfWeekDetectorTest1();
        DayOfTheWeekDetectorArrayVersionTest.dayOfWeekDetectorTest2();
        DayOfTheWeekDetectorArrayVersionTest.dayOfWeekDetectorTest3();
        DayOfTheWeekDetectorArrayVersionTest.dayOfWeekDetectorTest4();
        DayOfTheWeekDetectorArrayVersionTest.dayOfWeekDetectorTest5();
        DayOfTheWeekDetectorArrayVersionTest.dayOfWeekDetectorTest6();
        DayOfTheWeekDetectorArrayVersionTest.dayOfWeekDetectorTest7();
    }
    
    public void dayOfWeekDetectorTest1() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(1);
        check(realResult, "Monday", "Monday Test");
    }

    public void dayOfWeekDetectorTest2() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(2);
        check(realResult, "Tuesday", "Tuesday Test");
    }

    public void dayOfWeekDetectorTest3() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(3);
        check(realResult, "Wednesday", "Wednesday Test");
    }

    public void dayOfWeekDetectorTest4() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(4);
        check(realResult, "Thursday", "Thursday Test");
    }

    public void dayOfWeekDetectorTest5() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(5);
        check(realResult, "Friday", "Friday Test");
    }

    public void dayOfWeekDetectorTest6() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(6);
        check(realResult, "Saturday", "Saturday Test");
    }

    public void dayOfWeekDetectorTest7() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(7);
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
