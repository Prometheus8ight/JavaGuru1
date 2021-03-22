package students.kate_br.lesson_9.level_5.task_24;

 class FraudRuleTest1 {

     public static void main(String[] args) {
         FraudRuleTest1 test1 = new FraudRuleTest1();
         test1.fraudCityTest();
         test1.fraudCityFailTest();
         test1.fraudCityTest2();
         test1.fraudCityFailTest2();
     }

     public void fraudCityTest(){

         Trader trader = new Trader("Pokemon", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City fraud");
         checkTestResult(true, rule1.isFraud(transaction), "Fraud city test: " );
     }

     public void fraudCityFailTest(){

         Trader trader = new Trader("Pokemon", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City fraud");
         checkTestResult(false, rule1.isFraud(transaction), "Fraud city fail test: " );
     }

     public void fraudCityTest2(){

         Trader trader = new Trader("Mike", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City Fraud");
         checkTestResult(false, rule1.isFraud(transaction), "Fraud city second test: ");
     }

     public void fraudCityFailTest2(){

         Trader trader = new Trader("Mike", "Moscow", "Russia");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule1 rule1 = new FraudRule1("City fraud");
         checkTestResult(true, rule1.isFraud(transaction), "Fraud city fail second test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (expectedResult == realResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
