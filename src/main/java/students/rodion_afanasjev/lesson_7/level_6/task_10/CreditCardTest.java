package students.rodion_afanasjev.lesson_7.level_6.task_10;

class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositTest();
        creditCardTest.withdrawTest();
        creditCardTest.pinTrueTest();
        creditCardTest.pinFalseTest();
        creditCardTest.creditLimitTrueTest();
        creditCardTest.creditLimitFalseTest();
        creditCardTest.debtTrueTest();
        creditCardTest.debtFalseTest();

    }

    void depositTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1234);
        int expectedResult = 150;
        int debt = creditCard.getDebt();
        int creditLimit = creditCard.getCreditLimit();
        creditCard.deposit(1234, 100);
        int realResult = creditCard.getBalance();
        equalCheck(realResult,expectedResult,"depositTest");
        System.out.println("Balance: " + realResult + ", " + "Debt: " + debt + ", " + "Credit limit : " + creditLimit + ".");
    }

    void withdrawTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1234);
        int expectedResult = 50;
        int debt = creditCard.getDebt();
        int creditLimit = creditCard.getCreditLimit();
        creditCard.withdraw(1234,50);
        int realResult = creditCard.getBalance();
        equalCheck(realResult,expectedResult,"withdrawTest");
        System.out.println("Balance: " + realResult + ", " + "Debt: " + debt + ", " + "Credit limit : " + creditLimit + ".");
    }

    void debtTrueTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1234);
        int expectedResult = 550;
        creditCard.deposit(1234, 500); // депозит
        int realResult = creditCard.getBalance();
        equalCheck(realResult,expectedResult,"debtTrueTest");
    }

    void debtFalseTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1234);
        int expectedResult = 150;
        creditCard.deposit(1234, 500); // депозит
        int realResult = creditCard.getBalance();
        notEqualCheck(realResult,expectedResult,"debtFalseTest");
    }

    void creditLimitTrueTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1234);
        int expectedResult = 0;
        creditCard.withdraw(1234,150);
        int realResult = creditCard.getBalance();
        equalCheck(realResult,expectedResult,"creditLimitTrueTest");
    }

    void creditLimitFalseTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1234);
        int expectedResult = 50;
        creditCard.withdraw(1234,150);
        int realResult = creditCard.getBalance();
        notEqualCheck(realResult,expectedResult,"creditLimitFalseTest");
    }

    void pinTrueTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1234);
        int expectedResult = 150;
        creditCard.deposit(1234, 100);
        int realResult = creditCard.getBalance();
        equalCheck(realResult,expectedResult,"pinTrueTest");
    }

    void pinFalseTest(){
        CreditCard creditCard = new CreditCard("123 456 789",1244);
        int expectedResult = 150;
        creditCard.deposit(1234, 100);
        int realResult = creditCard.getBalance();
        notEqualCheck(realResult,expectedResult,"pinFalseTest");
    }

    void equalCheck(int realResult, int expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    void notEqualCheck(int realResult, int expectedResult, String testName){
        if (realResult != expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
