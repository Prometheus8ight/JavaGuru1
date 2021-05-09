package students.nikita_bunevich.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private final DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        System.out.println("Please enter number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorIfVersion);
        dayOfTheWeekDetectorDemo.run();

        DayOfTheWeekDetector dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorSwitchVersion);
        dayOfTheWeekDetectorDemo.run();

        DayOfTheWeekDetector dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetectorArrayVersion);
        dayOfTheWeekDetectorDemo.run();

    }
}
