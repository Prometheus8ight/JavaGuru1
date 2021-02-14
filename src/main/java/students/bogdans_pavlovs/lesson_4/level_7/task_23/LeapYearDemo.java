package students.bogdans_pavlovs.lesson_4.level_7.task_23;

class LeapYearDemo {

    public static void main(String[] args) {

        LeapYear leapYear = new LeapYear();

        Boolean result1 = leapYear.isLeapYear(100);
        System.out.println(result1);
        Boolean result2 =leapYear.isLeapYear(4);
        System.out.println(result2);
        Boolean result3 =leapYear.isLeapYear(400);
        System.out.println(result3);
        Boolean result4 =leapYear.isLeapYear(23);
        System.out.println(result4);
        Boolean result5 =leapYear.isLeapYear(95);
        System.out.println(result5);

    }

}
