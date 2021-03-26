package students.rodion_afanasjev.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorSwitchTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorSwitchTest testSwitch = new DayOfTheWeekDetectorSwitchTest();
        testSwitch.dayDetectorSwitchTest();
        testSwitch.dayDetectorSwitchFailTest();

    }

    public void dayDetectorSwitchTest(){
        DayOfTheWeekDetectorSwitchVersion testSwitch = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = testSwitch.detectDayName(5);
        check(realResult,"Friday","dayDetectorSwitchTest");
    }

    public void dayDetectorSwitchFailTest(){
        DayOfTheWeekDetectorSwitchVersion testSwitch = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = testSwitch.detectDayName(15);
        check(realResult,"Please input a valid number between 1 and 7","dayDetectorSwitchFailTest");
    }

    public void check(String realResult, String expectedResult, String testName){
        if (realResult.equals(expectedResult)){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
