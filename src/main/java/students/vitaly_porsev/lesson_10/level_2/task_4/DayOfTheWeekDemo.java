package students.vitaly_porsev.lesson_10.level_2.task_4;

public class DayOfTheWeekDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector ifElseMethod = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector switchMethod = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector arrayMethod = new DayOfTheWeekDetectorArrayVersion();
        System.out.println(ifElseMethod.detectDayName(5));
        System.out.println(switchMethod.detectDayName(7));
        System.out.println(arrayMethod.detectDayName(1));
    }
}
