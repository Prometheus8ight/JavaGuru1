package students.kristine_paskevica.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.neparIevSkTest();
    }

    private void equalCheck(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - pārbaude ir precīza");
        } else {
            System.out.println(testName + " - pārbaudes nav precīza");
        }
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(1);
        equalCheck("Monday".equals(dayOfTheWeek), "Monday");

    }

    public void shouldReturnTuesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(2);
        equalCheck("Tuesday".equals(dayOfTheWeek), "Tuesday");
    }

    public void shouldReturnWednesday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(3);
        equalCheck("Wednesday".equals(dayOfTheWeek), "Wednesday");
    }

    public void shouldReturnThursday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(4);
        equalCheck("Thursday".equals(dayOfTheWeek), "Thursday");
    }

    public void shouldReturnFriday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(5);
        equalCheck("Friday".equals(dayOfTheWeek), "Friday");
    }

    public void shouldReturnSaturday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(6);
        equalCheck("Saturday".equals(dayOfTheWeek), "Saturday");
    }

    public void shouldReturnSunday() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(7);
        equalCheck("Sunday".equals(dayOfTheWeek), "Sunday");
    }

    public void neparIevSkTest() {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String dayOfTheWeek = detector.findDayOfTheWeek(9);
        equalCheck("Nav pareiza dienu numerācija".equals(dayOfTheWeek),"notCorrectTest");
        }
    }

