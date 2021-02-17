package students.rodion_afanasjev.lesson_4.level_7.task_23;

public class LeapYearDemo {

    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(2021));

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapYearTest();
        leapYearTest.isNotLeapYearTest();

    }
}
