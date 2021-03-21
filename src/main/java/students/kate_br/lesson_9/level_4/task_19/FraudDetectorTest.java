package students.kate_br.lesson_9.level_4.task_19;

 class FraudDetectorTest {

     public static void main(String[] args) {
         FraudDetectorTest test = new FraudDetectorTest();
         test.fraudCityTest();
         test.fraudCityFailTest();
     }

     public void fraudCityTest(){
         FraudDetector detector = new FraudDetector();
         Trader trader = new Trader("Mike", "Sydney");
         Transaction transaction = new Transaction(trader, 10000);
         checkTestResult(true, detector.isFraud(transaction), "Fraud city test: ");
     }

     public void fraudCityFailTest(){
         FraudDetector detector = new FraudDetector();
         Trader trader = new Trader("Mike", "Sydney");
         Transaction transaction = new Transaction(trader, 10000);
         checkTestResult(false, detector.isFraud(transaction), "Fraud city fail test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (expectedResult == realResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
