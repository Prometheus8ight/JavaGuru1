package students.Dmitry_Gr.lesson_10.level_2.Task_4;

public class DayOfTheWeekDetectorArrayTest {
    public static void main(String[] args)
    {
        DayOfTheWeekDetectorArrayTest testArray = new DayOfTheWeekDetectorArrayTest();
        testArray.dayDetectorArrayTest();
        testArray.dayDetectorArrayFailTest();

    }

    public void dayDetectorArrayTest(){
        DayOfTheWeekDetectorArray testArray = new DayOfTheWeekDetectorArray();
        String realResult = testArray.detectDayName(5);
        check(realResult,"Friday","dayDetectorArrayTest");
    }

    public void dayDetectorArrayFailTest(){
        DayOfTheWeekDetectorArray testArray = new DayOfTheWeekDetectorArray();
        String realResult = testArray.detectDayName(10);
        check(realResult,"Please input a valid number between 1 and 7","dayDetectorArrayFailTest");
    }

    public void check(String realResult, String expectedResult, String testName){
        if (realResult.equals(expectedResult)){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
