package students.kate_br.lesson_10.level_1.task_4;


 class DayOfTheWeekDetectorArrayVersionTest {
     public static void main(String[] args) {
         DayOfTheWeekDetectorArrayVersionTest test = new DayOfTheWeekDetectorArrayVersionTest();
         test.dayOneTest();
         test.dayTwoTest();
         test.dayThreeTest();
         test.dayFourTest();
         test.dayFiveTest();
         test.daySixTest();
         test.daySevenTest();
         test.dayFailTest();
     }

     public void dayOneTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(1);
         checkTestResult(realResult, "Monday", "Monday test: ");
     }

     public void dayTwoTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(2);
         checkTestResult(realResult, "Tuesday", "Tuesday test: ");
     }

     public void dayThreeTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(3);
         checkTestResult(realResult, "Wednesday", "Wednesday test: ");
     }

     public void dayFourTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(4);
         checkTestResult(realResult, "Thursday", "Thursday test: ");
     }

     public void dayFiveTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(5);
         checkTestResult(realResult, "Friday", "Friday test: ");
     }

     public void daySixTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(6);
         checkTestResult(realResult, "Saturday", "Saturday test: ");
     }

     public void daySevenTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(7);
         checkTestResult(realResult, "Sunday", "Sunday test: ");
     }

     public void dayFailTest(){
         DayOfTheWeekDetectorArrayVersion arrayVersion = new DayOfTheWeekDetectorArrayVersion();
         String realResult = arrayVersion.detectDayName(5);
         checkTestResult(realResult, "Monday", "Fail test: ");
     }

     private void checkTestResult(String realResult, String expectedResult, String testName){
         if (realResult.equals(expectedResult)){
             System.out.println(testName + "[ OK ]");
         }else {
             System.out.println(testName + "[FAIL]");
         }
     }


}
