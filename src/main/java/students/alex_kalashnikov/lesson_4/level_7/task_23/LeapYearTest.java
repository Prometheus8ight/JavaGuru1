package students.alex_kalashnikov.lesson_4.level_7.task_23;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest test = new LeapYearTest();
        test.testLeapYear();
        test.testNotLeapYear();

    }

    public void testLeapYear() {                          // Високостные годы
        int year = 2008;
        Boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
                System.out.println("testDiv4 is OK");
            }
        else {
            System.out.println("testDiv4 is FAILED");
        }
    }

    public void testNotLeapYear() {                       // Обычные годы
        int year = 2009;
        Boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        Boolean realResult = leapYear.isLeapYear(year);
        if (realResult == expectedResult) {
            System.out.println("testDiv4 is OK");
        }
        else {
            System.out.println("testDiv4 is FAILED");
        }
    }
}