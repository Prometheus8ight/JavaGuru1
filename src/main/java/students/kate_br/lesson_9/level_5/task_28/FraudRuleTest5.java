package students.kate_br.lesson_9.level_5.task_28;

 class FraudRuleTest5 {

     public static void main(String[] args) {
         FraudRuleTest5 test5 = new FraudRuleTest5();
         test5.fraudRuleTest();
         test5.fraudRuleFailTest();
         test5.fraudRuleTest2();
         test5.fraudRuleFailTest2();
     }

     public void fraudRuleTest(){
         Trader trader = new Trader("Germany");
         Transaction transaction = new Transaction(trader, 10000);
         FraudRule5 rule5 = new FraudRule5("Country and amount fraud");
         checkTestResult(true, rule5.isFraud(transaction), "Fraud first test: ");
     }

     public void fraudRuleFailTest(){
         Trader trader = new Trader("Germany");
         Transaction transaction = new Transaction(trader, 10000);
         FraudRule5 rule5 = new FraudRule5("Country and amount fraud");
         checkTestResult(false, rule5.isFraud(transaction), "Fraud first fail test: ");
     }

     public void fraudRuleTest2(){
         Trader trader = new Trader("Spain");
         Transaction transaction = new Transaction(trader, 1000);
         FraudRule5 rule5 = new FraudRule5("Country and amount fraud");
         checkTestResult(false, rule5.isFraud(transaction), "Fraud second test: ");
     }

     public void fraudRuleFailTest2(){
         Trader trader = new Trader("Germany");
         Transaction transaction = new Transaction(trader, 900);
         FraudRule5 rule5 = new FraudRule5("Country and amount fraud");
         checkTestResult(true, rule5.isFraud(transaction), "Fraud second fail test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (expectedResult == realResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
