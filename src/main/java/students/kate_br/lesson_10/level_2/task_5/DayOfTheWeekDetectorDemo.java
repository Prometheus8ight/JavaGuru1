package students.kate_br.lesson_10.level_2.task_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

     DayOfTheWeekDetector detector;

     public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
         this.detector = detector;
     }

     void run(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please input a valid number between  1 to 7: ");
         int num = scanner.nextInt();
         System.out.println(detector.detectDayName(num));
     }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo demo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        demo1.run();

        DayOfTheWeekDetectorDemo demo2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demo2.run();

        DayOfTheWeekDetectorDemo demo3 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        demo3.run();
    }

 }
