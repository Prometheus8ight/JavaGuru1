package students.vitaly_porsev.lesson_7.level_6.task_10;

class CreditCardUserInputTest {

    public static void main(String[] args) {
        CreditCardUserInputTest creditCardTest = new CreditCardUserInputTest();
        creditCardTest.depositTest();
        creditCardTest.withdrawTest();
        creditCardTest.loanDebtWithdrawTest();
        creditCardTest.loanDebtDepositTest();
    }

    void depositTest(){
        CreditCardUserInput creditCard = new CreditCardUserInput("1667 1234 5670 2345", 1212);
        int expectedResult = 1500;
        creditCard.deposit(); //+1500
        checkTest(expectedResult, creditCard.getBalance(), "depositTest");
    }

    void withdrawTest(){
        CreditCardUserInput creditCard = new CreditCardUserInput("1667 1234 5670 2345", 1212);
        int expectedResult = 500;
        creditCard.setBalance(1000);
        creditCard.withdraw(); //-500
        checkTest(expectedResult, creditCard.getBalance(), "withdrawTest");
    }

    void loanDebtWithdrawTest(){
        CreditCardUserInput creditCard = new CreditCardUserInput("1667 1234 5670 2345", 1212);
        int expectedResult = 200;
        creditCard.setCreditLimit(200);
        creditCard.setBalance(200);
        creditCard.withdraw(); //-400
        checkTest(expectedResult, creditCard.getLoanDebt(), "loanDebtWithdrawTest");
    }

    void loanDebtDepositTest(){
        CreditCardUserInput creditCard = new CreditCardUserInput("1667 1234 5670 2345", 1212);
        int expectedResult = 0;
        creditCard.setCreditLimit(200);
        creditCard.setLoanDebt(200);
        creditCard.setBalance(0);
        creditCard.deposit(); //+200
        checkTest(expectedResult, creditCard.getLoanDebt(), "loanDebtDepositTest");
    }

    void checkTest(int expectedResult, int realResult, String testName){
        if (expectedResult == realResult){
            System.out.println(testName + " - OK");
        }else {
            System.out.println(testName + " - FALSE");
        }
    }
}