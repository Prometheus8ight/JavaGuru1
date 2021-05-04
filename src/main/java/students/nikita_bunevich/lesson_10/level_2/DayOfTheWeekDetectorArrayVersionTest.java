package students.nikita_bunevich.lesson_10.level_2;

class DayOfTheWeekDetectorArrayVersionTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorArrayVersionTest DayOfTheWeekDetectorArrayVersionTest = new DayOfTheWeekDetectorArrayVersionTest();
        DayOfTheWeekDetectorArrayVersionTest.Test1();
        DayOfTheWeekDetectorArrayVersionTest.Test2();
        DayOfTheWeekDetectorArrayVersionTest.Test3();
        DayOfTheWeekDetectorArrayVersionTest.Test4();
        DayOfTheWeekDetectorArrayVersionTest.Test5();
        DayOfTheWeekDetectorArrayVersionTest.Test6();
        DayOfTheWeekDetectorArrayVersionTest.Test7();
    }

    public void Test1() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(1);
        check(realResult, "Monday", "Monday Test");
    }

    public void Test2() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(2);
        check(realResult, "Tuesday", "Tuesday Test");
    }

    public void Test3() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(3);
        check(realResult, "Wednesday", "Wednesday Test");
    }

    public void Test4() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(4);
        check(realResult, "Thursday", "Thursday Test");
    }

    public void Test5() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(5);
        check(realResult, "Friday", "Friday Test");
    }

    public void Test6() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(6);
        check(realResult, "Saturday", "Saturday Test");
    }

    public void Test7() {
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

