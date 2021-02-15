package students.julija_katukova.lesson_4.level_7.task_23;

import java.util.Objects;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapYearTest();
    }
    public void isLeapYearTest () {
        int year = 1973;
        boolean expectedResult = false;
        LeapYearTest leapYearTest = new LeapYearTest();
        boolean realResult = LeapYear.isLeapYear(year);
        check(realResult, expectedResult, "First");

        year = 1996;
        expectedResult = true;
        realResult = LeapYear.isLeapYear(year);
        check(realResult, expectedResult, "Second");

        year = 1600;
        expectedResult = true;
        realResult = LeapYear.isLeapYear(year);
        check(realResult, expectedResult, "Third");

    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println(testName + " test = OK");
        }
        else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
