package students.kate_br.lesson_9.level_5.task_26;

 class FraudRuleTest3 {

     public static void main(String[] args) {
         FraudRuleTest3 test3 = new FraudRuleTest3();
         test3.fraudRuleTest();
         test3.fraudRuleFailTest();
         test3.fraudRuleTest2();
         test3.fraudRuleFailTest2();
     }

     public void fraudRuleTest(){
         Trader trader = new Trader("Sydney");
         Transaction transaction = new Transaction(trader);
         FraudRule3 rule3 = new FraudRule3("City fraud");
         checkTestResult(true, rule3.isFraud(transaction), "Fraud city test: ");
     }

     public void fraudRuleFailTest(){
         Trader trader = new Trader("Sydney");
         Transaction transaction = new Transaction(trader);
         FraudRule3 rule3 = new FraudRule3("City fraud");
         checkTestResult(false, rule3.isFraud(transaction), "Fraud city fail test");
     }

     public void fraudRuleTest2(){
         Trader trader = new Trader("Berlin");
         Transaction transaction = new Transaction(trader);
         FraudRule3 rule3 = new FraudRule3("City fraud");
         checkTestResult(false, rule3.isFraud(transaction), "Fraud city second test: ");
     }

     public void fraudRuleFailTest2(){
         Trader trader = new Trader("Berlin");
         Transaction transaction = new Transaction(trader);
         FraudRule3 rule3 = new FraudRule3("City fraud");
         checkTestResult(true, rule3.isFraud(transaction), "Fraud city second fail test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (realResult == expectedResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
