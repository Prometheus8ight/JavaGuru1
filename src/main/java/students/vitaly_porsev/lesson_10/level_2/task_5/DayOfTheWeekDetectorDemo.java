package students.vitaly_porsev.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo arrayMethod = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        arrayMethod.run();

        DayOfTheWeekDetectorDemo ifElseMethod = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifElseMethod.run();

        DayOfTheWeekDetectorDemo switchMethod = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        switchMethod.run();
    }

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int num = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(num));
    }
}
