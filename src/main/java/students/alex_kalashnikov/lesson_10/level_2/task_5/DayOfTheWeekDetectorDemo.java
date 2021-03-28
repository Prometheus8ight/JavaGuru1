package students.alex_kalashnikov.lesson_10.level_2.task_5;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector versionArray;

    public DayOfTheWeekDetectorDemo() {
        versionArray = new DayOfTheWeekDetectorArrayVersion();
    }

    void run() {
        boolean x = true;
        while (x) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter day of the week (number 1 - 7): ");
            int dayNumber = scanner.nextInt();
            System.out.println(versionArray.detectDayName(dayNumber));
            if (dayNumber >= 1 && dayNumber <= 7) {
                x = false;
            }
        }
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo();
        demoArray.run();

    }

}