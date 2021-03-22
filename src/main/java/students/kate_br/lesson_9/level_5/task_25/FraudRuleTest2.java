package students.kate_br.lesson_9.level_5.task_25;

 class FraudRuleTest2 {

     public static void main(String[] args) {
         FraudRuleTest2 test2 = new FraudRuleTest2();
         test2.fraudRuleTest();
         test2.fraudRuleFailTest();

     }

     public void fraudRuleTest(){
         Trader trader = new Trader("Mike", "Moscow");
         Transaction transaction = new Transaction(trader, 1200000);
         FraudRule2 rule2 = new FraudRule2("Amount fraud");
         checkTestResult(true, rule2.isFraud(transaction), "Fraud amount test: ");
     }

     public void fraudRuleFailTest(){
         Trader trader = new Trader("Mike", "Moscow");
         Transaction transaction = new Transaction(trader, 2000);
         FraudRule2 rule2 = new FraudRule2("Amount fraud");
         checkTestResult(true, rule2.isFraud(transaction), "Fraud amount fail test: ");
     }

     private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

         if (realResult == expectedResult){
             System.out.println(testName + "OK");
         }else {
             System.out.println(testName + "FAIL");
         }
     }
}
