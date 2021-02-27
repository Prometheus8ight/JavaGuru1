package students.arkadij.lesson_6.level_2;

class DayOfTheWeekDetectorTest {

    public void allWeekTest(){
        weekDayMonday();
        weekDayTuesday();
        weekDayWednesday();
        weekDayThursday();
        weekDayFriday();
        weekDaySaturday();
        weekDaySunday();
        weekDayNotCorrect();
    }

    private void equalsCheck(boolean condition, String nameTest) {
        if (condition){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void weekDayMonday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        equalsCheck("Monday".equals(dayOfTheWeek),"Monday Test");
    }

    public void weekDayTuesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        equalsCheck("Tuesday".equals(dayOfTheWeek),"Tuesday Test");
    }

    public void weekDayWednesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        equalsCheck("Wednesday".equals(dayOfTheWeek),"Wednesday Test");
    }

    public void weekDayThursday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        equalsCheck("Thursday".equals(dayOfTheWeek),"Thursday Test");
    }

    public void weekDayFriday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        equalsCheck("Friday".equals(dayOfTheWeek), "Friday Test");
    }

    public void weekDaySaturday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        equalsCheck("Saturday".equals(dayOfTheWeek),"Saturday Test");
    }

    public void weekDaySunday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        equalsCheck("Sunday".equals(dayOfTheWeek),"Sunday Test");
    }

    public void weekDayNotCorrect(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(8);
        equalsCheck("Not correct day number!".equals(dayOfTheWeek),"Not Correct Test");
    }


}