package students.andrew_galashin.lesson_4.level_7.task_23;

class LeapYearTest {
    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test1();
        leapYearTest.test2();
        leapYearTest.test3();
        leapYearTest.test4();
    }
    public void test1() {

        LeapYear leapYearTest = new LeapYear();
        boolean result = leapYearTest.isLeapYear(6);
        if (!result){
            System.out.println("Test 1 is OK");
        }
        else {
            System.out.println("Test 1 FAIL");
        }

    }
    public void test2(){
        LeapYear leapYearTest = new LeapYear();
        boolean result = leapYearTest.isLeapYear(4);
        if (result){
            System.out.println("Test 2 is OK");
        }
        else {
            System.out.println("Test 2 is FAIL");
        }
    }
    public void test3(){
        LeapYear leapYearTest = new LeapYear();
        boolean result = leapYearTest.isLeapYear(100);
        if (!result){
            System.out.println("Test 3 is OK");
        }
        else {
            System.out.println("Test 3 FAIL");
        }
    }
    public void test4(){
        LeapYear leapYearTest = new LeapYear();
        boolean result = leapYearTest.isLeapYear(400);
        if (result) {
            System.out.println("Test 4 is OK");
        }
        else {
            System.out.println("Test 4 FAIL");
        }
    }
}
