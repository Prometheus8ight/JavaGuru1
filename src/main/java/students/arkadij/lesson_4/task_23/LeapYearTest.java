package students.arkadij.lesson_4.task_23;

class LeapYearTest {

    public void isTheLeapYearTest(){
        boolean supposedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.theLeapYear(2020);
        if (realResult == supposedResult){
            System.out.println("The leap year test - OK!");
        } else {
            System.out.println("The leap year test - FAIL!");
        }
    }

    public void isNotTheLeapYearTest(){
        boolean supposedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.theLeapYear(2011);
        if (realResult == supposedResult){
            System.out.println("The not leap year test - OK!");
        } else {
            System.out.println("The not leap year test - FAIL!");
        }
    }

}
