package students.alex_kalashnikov.lesson_10.level_2.task_5;

import java.util.Objects;

class DayOfTheWeekDetectorTest {

    String versionIf;
    String versionSwitch;
    String versionArray;

    public DayOfTheWeekDetectorTest() {
        this.versionIf = "";
        this.versionSwitch = "";
        this.versionArray = "";
    }

    @Override
    public String toString() {
        return "TEST{" +
                "IF='" + versionIf + '\'' +
                ", SWITCH='" + versionSwitch + '\'' +
                ", ARRAY='" + versionArray + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayOfTheWeekDetectorTest test = (DayOfTheWeekDetectorTest) o;
        return Objects.equals(versionIf, test.versionIf)
                && Objects.equals(versionSwitch, test.versionSwitch)
                && Objects.equals(versionArray, test.versionArray);
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest victim = new DayOfTheWeekDetectorTest();
        victim.testDayOfTheWeekDetector();
        victim.testDayOfTheWeekDetector1();
        victim.testDayOfTheWeekDetector2();
        victim.testDayOfTheWeekDetector3();
        victim.testDayOfTheWeekDetector4();

    }

    void test(DayOfTheWeekDetectorTest expectedResult, DayOfTheWeekDetectorTest realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testDayOfTheWeekDetector() {
        DayOfTheWeekDetectorTest expectedResult = new DayOfTheWeekDetectorTest();
        expectedResult.versionIf = expectedResult.versionSwitch = expectedResult.versionArray = "Wednesday";
        DayOfTheWeekDetectorTest realResult = new DayOfTheWeekDetectorTest();
        realResult.versionIf = new DayOfTheWeekDetectorIfVersion().detectDayName(3);
        realResult.versionSwitch = new DayOfTheWeekDetectorSwitchVersion().detectDayName(3);
        realResult.versionArray = new DayOfTheWeekDetectorArrayVersion().detectDayName(3);
        test(expectedResult, realResult);
        System.out.println("EXPE: " + expectedResult);
        System.out.println("REAL: " + realResult);
    }

    void testDayOfTheWeekDetector1() {
        DayOfTheWeekDetectorTest expectedResult = new DayOfTheWeekDetectorTest();
        expectedResult.versionIf = expectedResult.versionSwitch = expectedResult.versionArray = "Sunday";
        DayOfTheWeekDetectorTest realResult = new DayOfTheWeekDetectorTest();
        realResult.versionIf = new DayOfTheWeekDetectorIfVersion().detectDayName(7);
        realResult.versionSwitch = new DayOfTheWeekDetectorSwitchVersion().detectDayName(7);
        realResult.versionArray = new DayOfTheWeekDetectorArrayVersion().detectDayName(7);
        test(expectedResult, realResult);
        System.out.println("EXPE: " + expectedResult);
        System.out.println("REAL: " + realResult);
    }

    void testDayOfTheWeekDetector2() {
        DayOfTheWeekDetectorTest expectedResult = new DayOfTheWeekDetectorTest();
        expectedResult.versionIf = expectedResult.versionSwitch = expectedResult.versionArray = "Monday";
        DayOfTheWeekDetectorTest realResult = new DayOfTheWeekDetectorTest();
        realResult.versionIf = new DayOfTheWeekDetectorIfVersion().detectDayName(1);
        realResult.versionSwitch = new DayOfTheWeekDetectorSwitchVersion().detectDayName(1);
        realResult.versionArray = new DayOfTheWeekDetectorArrayVersion().detectDayName(1);
        test(expectedResult, realResult);
        System.out.println("EXPE: " + expectedResult);
        System.out.println("REAL: " + realResult);
    }

    void testDayOfTheWeekDetector3() {
        DayOfTheWeekDetectorTest expectedResult = new DayOfTheWeekDetectorTest();
        expectedResult.versionIf = expectedResult.versionSwitch = expectedResult.versionArray = "Please input a valid number between 1 and 7";
        DayOfTheWeekDetectorTest realResult = new DayOfTheWeekDetectorTest();
        realResult.versionIf = new DayOfTheWeekDetectorIfVersion().detectDayName(9);
        realResult.versionSwitch = new DayOfTheWeekDetectorSwitchVersion().detectDayName(0);
        realResult.versionArray = new DayOfTheWeekDetectorArrayVersion().detectDayName(-5);
        test(expectedResult, realResult);
        System.out.println("EXPE: " + expectedResult);
        System.out.println("REAL: " + realResult);
    }

    void testDayOfTheWeekDetector4() {
        DayOfTheWeekDetectorTest expectedResult = new DayOfTheWeekDetectorTest();
        expectedResult.versionIf = "Monday";
        expectedResult.versionSwitch = "Sunday";
        expectedResult.versionArray = "Please input a valid number between 1 and 7";
        DayOfTheWeekDetectorTest realResult = new DayOfTheWeekDetectorTest();
        realResult.versionIf = new DayOfTheWeekDetectorIfVersion().detectDayName(1);
        realResult.versionSwitch = new DayOfTheWeekDetectorSwitchVersion().detectDayName(7);
        realResult.versionArray = new DayOfTheWeekDetectorArrayVersion().detectDayName(0);
        test(expectedResult, realResult);
        System.out.println("EXPE: " + expectedResult);
        System.out.println("REAL: " + realResult);
    }

}