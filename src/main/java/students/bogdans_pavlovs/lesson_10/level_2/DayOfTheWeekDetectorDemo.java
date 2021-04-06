package students.bogdans_pavlovs.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        DayOfTheWeekDetectorDemo switchVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        DayOfTheWeekDetectorDemo arrayVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());


        ifVersion.run();
        switchVersion.run();
        arrayVersion.run();


    }

    void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7: ");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));

    }

}
