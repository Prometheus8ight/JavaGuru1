package students.arkadij.lesson_4.task_23;

class LeapYearDemo {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.theLeapYear(2020));

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isTheLeapYearTest();
        leapYearTest.isNotTheLeapYearTest();

    }

}
