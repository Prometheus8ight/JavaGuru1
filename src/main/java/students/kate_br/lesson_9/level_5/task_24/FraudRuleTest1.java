package students.kate_br.lesson_9.level_5.task_24;

 class FraudRuleTest1 {

     public static void main(String[] args) {
         FraudRuleTest1 test1 = new FraudRuleTest1();
         test1.fraudTest();
         test1.fraudFailTest();
         test1.fraudTest2();
         test1.fraudFailTest2();
     }

     public void fraudTest(){

         Trader trader = new Trader("Pokemon", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City fraud");
         checkTestResult(true, rule1.isFraud(transaction), "Fraud name test: " );
     }

     public void fraudFailTest(){

         Trader trader = new Trader("Pokemon", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City fraud");
         checkTestResult(false, rule1.isFraud(transaction), "Fraud city name test: " );
     }

     public void fraudTest2(){

         Trader trader = new Trader("Mike", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City Fraud");
         checkTestResult(false, rule1.isFraud(transaction), "Fraud name second test: ");
     }

     public void fraudFailTest2(){

         Trader trader = new Trader("Mike", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City fraud");
         checkTestResult(true, rule1.isFraud(transaction), "Fraud name fail second test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (expectedResult == realResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
