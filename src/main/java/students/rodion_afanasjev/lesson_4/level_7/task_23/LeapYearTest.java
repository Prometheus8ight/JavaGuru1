package students.rodion_afanasjev.lesson_4.level_7.task_23;

public class LeapYearTest {

    public void isLeapYearTest(){
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(2020);
        if (realResult == expectedResult){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void isNotLeapYearTest(){
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(2021);
        if (realResult == expectedResult){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

}
