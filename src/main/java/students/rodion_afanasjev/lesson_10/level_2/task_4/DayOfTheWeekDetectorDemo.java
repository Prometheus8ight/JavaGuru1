package students.rodion_afanasjev.lesson_10.level_2.task_4;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo demoIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        demoIf.run();

        DayOfTheWeekDetectorDemo demoSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demoSwitch.run();

        DayOfTheWeekDetectorDemo demoArray = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArray());
        demoArray.run();

    }

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number from 1 to 7: ");
        int number = scan.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }

}
