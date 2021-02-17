package students.vitaly_porsev.lesson_4.level_7.task_23;

class LeapYearDemo {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(2008));

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapYearTestTrue();
        leapYearTest.leapYearTestFalse();
    }
}
