package students.bogdans_pavlovs.lesson_7.level_6.task_10;

class CreditCardTest {

    public static void main(String[] args) {

        //Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
        //Все тестовые сценарии должны отрабатывать без ошибок.

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.pinNumberTest();
        creditCardTest.changeCreditLimitTest();
        creditCardTest.depositTest();
        creditCardTest.withdrawalTest();



    }

    void depositTest(){
        CreditCard creditCard = new CreditCard("1234 1234 1234 1234", 1234);

        int expectedResult = 300;
        creditCard.deposit(1234, 300);
        int realResult = creditCard.getBalance();

        checkResult(expectedResult, realResult, "Deposit Test");


    }

    void withdrawalTest(){
        CreditCard creditCard = new CreditCard("1234 1234 1234 1234", 1234);

        int expectedResult = 30;
        creditCard.deposit(1234, 300);
        creditCard.withdraw(1234, 270);
        int realResult = creditCard.getBalance();

        checkResult(expectedResult, realResult, "Withdrawal Test");

    }

    void changeCreditLimitTest(){
        CreditCard creditCard = new CreditCard("1234 1234 1234 1234", 1234);
        int expectedResult = 400;
        creditCard.changeCreditLimit(400);
        int realResult = creditCard.getCreditLimit();
        checkResult(expectedResult, realResult, "Credit Limit Change Test");


    }

    void pinNumberTest(){
        CreditCard creditCard = new CreditCard("1234 1234 1234 1234", 1234);
        boolean realResult = creditCard.pinNumberCheck(1222);

        if (realResult){
            System.out.println("Pin Test = FAIL!");
        } else {
            System.out.println("Pin Test = OK!");
        }

    }

    void checkResult (int expectedResult, int realResult, String testName){
        if(expectedResult == realResult){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

}
