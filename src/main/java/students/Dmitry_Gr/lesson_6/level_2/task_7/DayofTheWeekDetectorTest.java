package students.Dmitry_Gr.lesson_6.level_2.task_7;

import java.time.DayOfWeek;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest checkDayWeek = new DayOfTheWeekDetectorTest();

        checkDayWeek.findDayTest("Monday", 1);
        checkDayWeek.findDayTest("Tuesday", 2);
        checkDayWeek.findDayTest("Wednesday", 3);
        checkDayWeek.findDayTest("Thursday", 4);
        checkDayWeek.findDayTest("Friday", 5);
        checkDayWeek.findDayTest("Satuday", 6);
        checkDayWeek.findDayTest("Sunday", 7);
        checkDayWeek.findDayTest("DayOff", 8);
    }

    void findDayTest( String expectedResult,int numberWeek){
        DayOfTheWeekDetector checkDayWeek = new DayOfTheWeekDetector();
        String realResult = checkDayWeek.findDayOfTheWeek(numberWeek);
        if(expectedResult.equals(realResult)){
            System.out.println("Excepted day of week="+expectedResult +"Real day off week"
                    +realResult + "findDayTest + - OK");
        }else{
            System.out.println("Excepted day of week="+expectedResult +"Real day off week"
                    +realResult+"findDayTest - FAIL");
        }
    }


}

