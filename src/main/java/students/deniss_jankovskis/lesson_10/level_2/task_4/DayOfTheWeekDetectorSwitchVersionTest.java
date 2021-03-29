package students.deniss_jankovskis.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorSwitchVersionTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
        test.DayOfTheWeekDetector1();
        test.DayOfTheWeekDetector2();
        test.DayOfTheWeekDetector3();
        test.DayOfTheWeekDetector4();
        test.DayOfTheWeekDetector5();
        test.DayOfTheWeekDetector6();
        test.DayOfTheWeekDetector7();
    }

    public void DayOfTheWeekDetector1() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(1);
        checkTestResult(realResult, "Monday", "Monday Test");
    }

    public void DayOfTheWeekDetector2() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(2);
        checkTestResult(realResult, "Tuesday", "Tuesday Test");
    }

    public void DayOfTheWeekDetector3() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(3);
        checkTestResult(realResult, "Wednesday", "Wednesday Test");
    }

    public void DayOfTheWeekDetector4() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(4);
        checkTestResult(realResult, "Thursday", "Thursday Test");
    }

    public void DayOfTheWeekDetector5() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(5);
        checkTestResult(realResult, "Friday", "Friday Test");
    }

    public void DayOfTheWeekDetector6() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(6);
        checkTestResult(realResult, "Saturday", "Saturday Test");
    }

    public void DayOfTheWeekDetector7() {
        DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(7);
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

