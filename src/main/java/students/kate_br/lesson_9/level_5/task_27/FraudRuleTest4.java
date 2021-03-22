package students.kate_br.lesson_9.level_5.task_27;

 class FraudRuleTest4 {

     public static void main(String[] args) {
         FraudRuleTest4 test4 = new FraudRuleTest4();
         test4.fraudRuleTest();
         test4.fraudRuleFailTest();
         test4.fraudRuleTest2();
         test4.fraudRuleFailTest2();
     }

     public void fraudRuleTest(){
         Trader trader = new Trader("Jamaica");
         Transaction transaction = new Transaction(trader);
         FraudRule4 rule4 = new FraudRule4("City fraud");
         checkTestResult(true, rule4.isFraud(transaction), "Fraud city test: ");
     }

     public void fraudRuleFailTest(){
         Trader trader = new Trader("London");
         Transaction transaction = new Transaction(trader);
         FraudRule4 rule4 = new FraudRule4("City fraud");
         checkTestResult(true, rule4.isFraud(transaction), "Fraud city fail test: ");
     }

     public void fraudRuleTest2(){
         Trader trader = new Trader("London");
         Transaction transaction = new Transaction(trader);
         FraudRule4 rule4 = new FraudRule4("City fraud");
         checkTestResult(false, rule4.isFraud(transaction), "Fraud city second test: ");
     }

     public void fraudRuleFailTest2(){
         Trader trader = new Trader("Jamaica");
         Transaction transaction = new Transaction(trader);
         FraudRule4 rule4 = new FraudRule4("City fraud");
         checkTestResult(false, rule4.isFraud(transaction), "Fraud city second fail test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (realResult == expectedResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
