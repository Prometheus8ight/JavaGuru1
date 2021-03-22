package students.kate_br.lesson_9.level_4.task_18;

 class FraudDetectorTest {

     public static void main(String[] args) {
         FraudDetectorTest test = new FraudDetectorTest();
         test.fraudAmountTest();
         test.fraudAmountFailTest();
     }

     public void fraudAmountTest(){
         FraudDetector detector = new FraudDetector();
         Trader trader = new Trader("Mike", "Moscow");
         Transaction transaction = new Transaction(trader, 1200000);
         checkTestResult(true, detector.isFraud(transaction), "Fraud amount test: ");
     }

     public void fraudAmountFailTest(){

         FraudDetector detector = new FraudDetector();
         Trader trader = new Trader("Mike", "Moscow");
         Transaction transaction = new Transaction(trader, 120000);
         checkTestResult(true, detector.isFraud(transaction), "Fraud amount fail test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (realResult == expectedResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
