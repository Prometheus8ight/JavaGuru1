package students.kate_br.lesson_10.level_1.task_4;

 class DayOfTheWeekDetectorSwitchVersionTest {

     public static void main(String[] args) {
         DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
         test.dayOneTest();
         test.dayTwoTest();
         test.dayThreeTest();
         test.dayFourTest();
         test.dayFiveTest();
         test.daySixTest();
         test.daySevenTest();
         test.dayDefaultTest();
     }

     public void dayOneTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String realResult = switchVersion.detectDayName(1);
         checkTestResult(realResult, "Monday", "Monday test: ");
     }

     public void dayTwoTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String  realResult = switchVersion.detectDayName(2);
         checkTestResult(realResult, "Tuesday", "Tuesday test: ");
     }

     public void dayThreeTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String realResult = switchVersion.detectDayName(3);
         checkTestResult(realResult, "Wednesday", "Wednesday test: ");
     }

     public void dayFourTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String realResult = switchVersion.detectDayName(4);
         checkTestResult(realResult, "Thursday", "Thursday test: ");
     }

     public void dayFiveTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String realResult = switchVersion.detectDayName(5);
         checkTestResult(realResult, "Friday", "Friday test: ");
     }

     public void daySixTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String realResult = switchVersion.detectDayName(6);
         checkTestResult(realResult, "Saturday", "Saturday test: ");
     }

     public void daySevenTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String realResult = switchVersion.detectDayName(7);
         checkTestResult(realResult, "Sunday", "Sunday test: ");
     }

     public void  dayDefaultTest(){
         DayOfTheWeekDetectorSwitchVersion switchVersion = new DayOfTheWeekDetectorSwitchVersion();
         String realResult = switchVersion.detectDayName(8);
         checkTestResult(realResult, "Please input a valid number between 1 to 7", "Default test: ");
     }

     private void checkTestResult(String expectedResult, String realResult, String testName){
         if (expectedResult.equals(realResult)){
             System.out.println(testName + "[ OK ]");
         }else {
             System.out.println(testName + "[FAIL]");
         }
     }
}
