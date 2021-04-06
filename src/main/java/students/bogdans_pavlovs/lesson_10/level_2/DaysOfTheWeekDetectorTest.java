package students.bogdans_pavlovs.lesson_10.level_2;

public class DaysOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DaysOfTheWeekDetectorTest test = new DaysOfTheWeekDetectorTest();

        test.ifVersionTest();
        test.switchVersionTest();
        test.arrayVersionTest();

    }

    void ifVersionTest(){
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String realResult = ifVersion.detectDayName(1);
        checkResult("Monday", realResult, "If Version Test");
    }

    void switchVersionTest(){
        DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String realResult = switchVersion.detectDayName(3);
        checkResult("Wednesday", realResult, "Switch Version Test");
    }

    void arrayVersionTest(){
        DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String realResult = arrayVersion.detectDayName(7);
        checkResult("Sunday", realResult, "Array Version Test");
    }

    void checkResult(String expectedResult, String realResult, String testName){

        if (realResult.equals(expectedResult)){

            System.out.println(testName + " = OK!");

        } else {

            System.out.println(testName + " = FAIL!");

        }

    }


}
