package students.pavels_steinbors._lesson_10._level_2._task_4;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector versionIf = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector versionSwitch = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector versionArray = new DayOfTheWeekDetectorArrayVersion();

        System.out.println(versionIf.detectDayName(3));
        System.out.println(versionSwitch.detectDayName(5));
        System.out.println(versionArray.detectDayName(7));
    }
}
