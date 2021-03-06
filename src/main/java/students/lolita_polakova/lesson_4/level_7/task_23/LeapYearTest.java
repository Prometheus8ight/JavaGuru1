package students.lolita_polakova.lesson_4.level_7.task_23;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYearTest();
    }

    public void leapYearTest() {
        int year = 1997;
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Leap Year Test = OK");
        } else {
            System.out.println("Leap Year Test = FAIL");
        }

        year = 2020;
        expectedResult = true;
        realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Leap Year Test = OK");
        } else {
            System.out.println("Leap Year Test = FAIL");
        }

        year = 2000;
        expectedResult = true;
        realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("Leap Year Test = OK");
        } else {
            System.out.println("Leap Year Test = FAIL");
        }
    }
}
