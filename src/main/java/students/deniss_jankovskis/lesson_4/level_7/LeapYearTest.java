package students.deniss_jankovskis.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.yearTest1();
        leapYearTest.yearTest2();
        leapYearTest.yearTest3();
        leapYearTest.yearTest4();

    }


    public void yearTest1() {
        boolean expectedResult = false;
        LeapYear leapYearTest = new LeapYear();
        boolean realResult = leapYearTest.leapYear(100);

        if (expectedResult == realResult) {
            System.out.println("Test has passed");
        }
        else {
            System.out.println("Test has failed");
        }
    }


    public void yearTest2() {
        boolean expectedResult = true;
        LeapYear leapYearTest = new LeapYear();
        boolean realResult = leapYearTest.leapYear(4);

        if (expectedResult == realResult) {
            System.out.println("Test has passed");
        }
        else {
            System.out.println("Test has failed");
        }
    }


    public void yearTest3() {
        boolean expectedResult = true;
        LeapYear leapYearTest = new LeapYear();
        boolean realResult = leapYearTest.leapYear(400);

        if (expectedResult == realResult) {
            System.out.println("Test has passed");
        }
        else {
            System.out.println("Test has failed");
        }
    }


    public void yearTest4() {
        boolean expectedResult = false;
        LeapYear leapYearTest = new LeapYear();
        boolean realResult = leapYearTest.leapYear(2021);

        if (expectedResult == realResult) {
            System.out.println("Test has passed");
        }
        else {
            System.out.println("Test has failed");
        }
    }


}
