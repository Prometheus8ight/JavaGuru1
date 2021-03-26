package students.rodion_afanasjev.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorIfTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorIfTest testIf = new DayOfTheWeekDetectorIfTest();
        testIf.dayDetectorIfTest();
        testIf.dayDetectorIfFailTest();

    }

    public void dayDetectorIfTest(){
        DayOfTheWeekDetectorIfVersion testIf = new DayOfTheWeekDetectorIfVersion();
        String realResult = testIf.detectDayName(5);
        check(realResult,"Friday","dayDetectorIfTest");
    }

    public void dayDetectorIfFailTest(){
        DayOfTheWeekDetectorIfVersion testIf = new DayOfTheWeekDetectorIfVersion();
        String realResult = testIf.detectDayName(9);
        check(realResult,"Please input a valid number between 1 and 7","dayDetectorIfFailTest");
    }

    public void check(String realResult, String expectedResult, String testName){
        if (realResult.equals(expectedResult)){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}


