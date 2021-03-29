package students.alex_kalashnikov.lesson_10.level_2.task_5;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo demoIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        demoIf.run();

        DayOfTheWeekDetectorDemo demoSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demoSwitch.run();

        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        demoArray.run();

    }

    void run() {
        boolean x = true;
        while (x) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter day of the week (number 1 - 7): ");
            int dayNumber = scanner.nextInt();
            System.out.println(detector.detectDayName(dayNumber));
            if (dayNumber >= 1 && dayNumber <= 7) {
                x = false;
            }
        }
    }

}