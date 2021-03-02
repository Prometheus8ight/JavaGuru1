package students.vitaly_porsev.lesson_6.level_2.task_7;

import java.time.DayOfWeek;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest method = new DayOfTheWeekDetectorTest();
        method.allDayTests();
    }

    void allDayTests(){
        findDay1Test();
        findDay2Test();
        findDay3Test();
        findDay4Test();
        findDay5Test();
        findDay6Test();
        findDay7Test();
        findDefaultTest();
    }

    void NumberFromUserTest(){
        int expectedResult = 5;
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        int realResult = method.getDayNumberFromUser();
        if(expectedResult == realResult){
            System.out.println("NumberFromUserTest - OK");
        }else {
            System.out.println("NumberFromUserTest - FAIL");
        }
    }

    void findDay1Test(){
        String expectedResult = "Monday";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(1);
        if(expectedResult.equals(realResult)){
            System.out.println("findDay1Test - OK");
        }else{
            System.out.println("findDay1Test - FAIL");
        }
    }

    void findDay2Test(){
        String expectedResult = "Tuesday";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(2);
        if(expectedResult.equals(realResult)){
            System.out.println("findDay2Test - OK");
        }else{
            System.out.println("findDay2Test - FAIL");
        }
    }

    void findDay3Test(){
        String expectedResult = "Wednesday";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(3);
        if(expectedResult.equals(realResult)){
            System.out.println("findDay3Test - OK");
        }else{
            System.out.println("findDay3Test - FAIL");
        }
    }

    void findDay4Test(){
        String expectedResult = "Thursday";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(4);
        if(expectedResult.equals(realResult)){
            System.out.println("findDay4Test - OK");
        }else{
            System.out.println("findDay4Test - FAIL");
        }
    }

    void findDay5Test(){
        String expectedResult = "Friday";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(5);
        if(expectedResult.equals(realResult)){
            System.out.println("findDay5Test - OK");
        }else{
            System.out.println("findDay5Test - FAIL");
        }
    }

    void findDay6Test(){
        String expectedResult = "Saturday";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(6);
        if(expectedResult.equals(realResult)){
            System.out.println("findDay6Test - OK");
        }else{
            System.out.println("findDay6Test - FAIL");
        }
    }

    void findDay7Test(){
        String expectedResult = "Sunday";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(7);
        if(expectedResult.equals(realResult)){
            System.out.println("findDay7Test - OK");
        }else{
            System.out.println("findDay7Test - FAIL");
        }
    }

    void findDefaultTest(){
        String expectedResult = "Not correct day number";
        DayOfTheWeekDetector method = new DayOfTheWeekDetector();
        String realResult = method.findDayOfTheWeek(8);
        if(expectedResult.equals(realResult)){
            System.out.println("findDefaultTest- OK");
        }else{
            System.out.println("findDefaultTest - FAIL");
        }
    }
}
