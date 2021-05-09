package students.pavels_steinbors._lesson_10._level_2._task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number between 1 and 7: ");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));

    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo versionIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        versionIf.run();
        DayOfTheWeekDetectorDemo versionSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekSwitchVersion());
        versionSwitch.run();
        DayOfTheWeekDetectorDemo versionArray = new DayOfTheWeekDetectorDemo(new DayOfTheWeekArrayVersion());
        versionArray.run();
    }
}
