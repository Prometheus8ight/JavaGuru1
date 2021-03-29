package students.vitaly_porsev.lesson_7.level_6.task_10;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.testWithdraw();
        creditCardTest.testDeposit();
        creditCardTest.testLoanDebt();
        creditCardTest.testLoanDebtZero();
    }

    void testWithdraw(){
        CreditCard creditCard = new CreditCard("1667 1234 5670 2345",1212);
        int expectedResult = 200;
        creditCard.setBalance(400);
        creditCard.withdraw(1212, 200);
        checkTest(expectedResult, creditCard.getBalance(), "testWithdraw");
    }

    void testDeposit(){
        CreditCard creditCard = new CreditCard("1667 1234 5670 2345",1212);
        int expectedResult = 1500;
        creditCard.setBalance(1000);
        creditCard.deposit(1212, 500);
        checkTest(expectedResult, creditCard.getBalance(), "testDeposit");
    }

    void testLoanDebt(){
        CreditCard creditCard = new CreditCard("1667 1234 5670 2345",1212);
        int expectedResult = 200;
        creditCard.setBalance(1000);
        creditCard.setCreditLimit(200);
        creditCard.withdraw(1212, 1200);
        checkTest(expectedResult, creditCard.getLoanDebt(), "testLoanDebt");
    }

    void testLoanDebtZero(){
        CreditCard creditCard = new CreditCard("1667 1234 5670 2345",1212);
        int expectedResult = 0;
        creditCard.setBalance(1000);
        creditCard.setCreditLimit(200);
        creditCard.withdraw(1212, 1200);
        creditCard.deposit(1212,200);
        checkTest(expectedResult, creditCard.getLoanDebt(), "testLoanDebt");
    }

    void checkTest(int expectedResult, int realResult, String testName){
       if(realResult == expectedResult){
           System.out.println(testName + " - OK");
       }else {
           System.out.println(testName + " - FALSE");
       }
    }
}