package students.alex_kalashnikov.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        boolean x = true;

        while (x) {

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter day of the week (number 1 - 7): ");
            int dayNumber = scanner.nextInt();

            DayOfTheWeekDetectorIfVersion version1 = new DayOfTheWeekDetectorIfVersion();
            System.out.println("IF version: " + version1.detectDayName(dayNumber));

            DayOfTheWeekDetectorSwitchVersion version2 = new DayOfTheWeekDetectorSwitchVersion();
            System.out.println("SWITCH version: " + version2.detectDayName(dayNumber));

            DayOfTheWeekDetectorArrayVersion version3 = new DayOfTheWeekDetectorArrayVersion();
            System.out.println("ARRAY version: " + version3.detectDayName(dayNumber));

            if (dayNumber >= 1 && dayNumber <= 7) {
                x = false;
            }
        }
    }

}