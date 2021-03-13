package students.deniss_jankovskis.lesson_7.task_10;

class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest test = new CreditCardTest();
        test.depositMoneyTest();
        test.withdrawMoneyTest();
        test.loanDebtTest();

    }

    private void depositMoneyTest() {
        CreditCard creditCard = new CreditCard("4659 0356 1439 3073", 5032);
        int expectedResult = 5000;
        creditCard.setBalance(3000);
        creditCard.deposit(5032, 2000);
        checkTestResult(expectedResult, creditCard.getBalance(), "depositMoneyTest");
    }


    private void withdrawMoneyTest() {
        CreditCard creditCard = new CreditCard("4659 0356 1439 3073", 5032);
        int expectedResult = 1000;
        creditCard.setBalance(5000);
        creditCard.withdraw(5032, 4000);
        checkTestResult(expectedResult, creditCard.getBalance(), "withdrawMoneyTest");
    }


    private void loanDebtTest() {
        CreditCard creditCard = new CreditCard("4659 0356 1439 3073", 5032);
        int expectedResult = 100;
        creditCard.setBalance(1000);
        creditCard.setCreditLimit(100);
        creditCard.withdraw(5032, 1100);
        checkTestResult(expectedResult, creditCard.getLoanDebt(), "loanDebtTest");
    }


    public void checkTestResult(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}

