package students.vitaly_porsev.lesson_4.level_7.task_23;

class LeapYearTest {

    public void leapYearTestTrue(){
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(2012);
        if(expectedResult == realResult){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }

    public void leapYearTestFalse(){
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(2011);
        if(expectedResult == realResult){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }
}
