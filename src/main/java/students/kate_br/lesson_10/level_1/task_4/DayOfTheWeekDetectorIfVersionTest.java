package students.kate_br.lesson_10.level_1.task_4;

 class DayOfTheWeekDetectorIfVersionTest {

     public static void main(String[] args) {
         DayOfTheWeekDetectorIfVersionTest test = new DayOfTheWeekDetectorIfVersionTest();
         test.dayOneTest();
         test.dayTwoTest();
         test.dayThreeTest();
         test.dayFourTest();
         test.dayFiveTest();
         test.daySixTest();
         test.daySevenTest();
         test.dayElseTest();

     }

     public void dayOneTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(1);
         checkTestResult(realResult, "Monday", "Monday test: ");
     }

     public void dayTwoTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(2);
         checkTestResult(realResult, "Tuesday", "Tuesday test: ");
     }

     public void dayThreeTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(3);
         checkTestResult(realResult, "Wednesday", "Wednesday test: ");
     }

     public void dayFourTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(4);
         checkTestResult(realResult, "Thursday", "Thursday test: ");
     }

     public void  dayFiveTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(5);
         checkTestResult(realResult, "Friday", "Friday test: ");
     }

     public void daySixTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(6);
         checkTestResult(realResult, "Saturday", "Saturday test: ");
     }

     public void daySevenTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(7);
         checkTestResult(realResult, "Sunday", "Sunday test: ");
     }

     public void dayElseTest(){
         DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
         String realResult = ifVersion.detectDayName(8);
         checkTestResult(realResult, "Please input a valid number between 1 to 7", "Else test: ");
     }

     private void checkTestResult(String realResult, String expectedResult, String testName){

         if (realResult.equals(expectedResult)){
             System.out.println(testName + "[ OK ]");
         }else {
             System.out.println(testName + "[FAIL]");
         }
     }
}
