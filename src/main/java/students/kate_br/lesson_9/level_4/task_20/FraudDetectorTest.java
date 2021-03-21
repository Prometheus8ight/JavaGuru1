package students.kate_br.lesson_9.level_4.task_20;

import students.vitaly_porsev.lesson_9.level_4.tasks.TransactionTests;

class FraudDetectorTest {

     public static void main(String[] args) {
         FraudDetectorTest test = new FraudDetectorTest();
         test.fraudCityTest1();
         test.fraudCityTest2();
     }

     public void fraudCityTest1(){
         FraudDetector detector = new FraudDetector();
         Trader trader = new Trader("Soul", "Sydney");
         Transaction transaction = new Transaction(trader, 1000);
         checkTestResult(true, detector.isFraud(transaction), "Fraud city first test: ");
     }

     public void fraudCityTest2(){
         FraudDetector detector = new FraudDetector();
         Trader trader = new Trader("Mike", "Jamaica");
         Transaction transaction = new Transaction(trader, 1000);
         checkTestResult(true, detector.isFraud(transaction), "Fraud city second test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){
         if (realResult == expectedResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
