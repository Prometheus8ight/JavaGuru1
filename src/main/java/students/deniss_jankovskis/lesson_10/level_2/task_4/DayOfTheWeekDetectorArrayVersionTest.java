package students.deniss_jankovskis.lesson_10.level_2.task_4;

public class DayOfTheWeekDetectorArrayVersionTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorArrayVersionTest test = new DayOfTheWeekDetectorArrayVersionTest();
        test.DayOfTheWeekDetector1();
        test.DayOfTheWeekDetector2();
        test.DayOfTheWeekDetector3();
        test.DayOfTheWeekDetector4();
        test.DayOfTheWeekDetector5();
        test.DayOfTheWeekDetector6();
        test.DayOfTheWeekDetector7();
    }

    public void DayOfTheWeekDetector1() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(1);
        checkTestResult(realResult, "Monday", "Monday Test");
    }


    public void DayOfTheWeekDetector2() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(2);
        checkTestResult(realResult, "Tuesday", "Tuesday Test");
    }

    public void DayOfTheWeekDetector3() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(3);
        checkTestResult(realResult, "Wednesday", "Wednesday Test");
    }

    public void DayOfTheWeekDetector4() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(4);
        checkTestResult(realResult, "Thursday", "Thursday Test");
    }

    public void DayOfTheWeekDetector5() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(5);
        checkTestResult(realResult, "Friday", "Friday Test");
    }

    public void DayOfTheWeekDetector6() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(6);
        checkTestResult(realResult, "Saturday", "Saturday Test");
    }

    public void DayOfTheWeekDetector7() {
        DayOfTheWeekDetectorArrayVersion dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(7);
        checkTestResult(realResult, "Sunday", "Sunday Test");
    }

    public void checkTestResult(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
