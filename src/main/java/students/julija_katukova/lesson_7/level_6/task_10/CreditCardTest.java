package students.julija_katukova.lesson_7.level_6.task_10;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.test1();
        creditCardTest.test2();
        creditCardTest.test3();
        creditCardTest.test4();
        creditCardTest.test5();
        creditCardTest.test6();
        creditCardTest.test7();
        creditCardTest.test8();
    }

    public void test1() {
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        creditCard.setCreditLimit(100);
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 100, Loan Debt = 0. ", "Set Credit Limit Test");
    }

    public void test2() {
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        creditCard.deposit("0000", 100);
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 100, Credit Limit = 0, Loan Debt = 0. ", "Deposit Test1");
    }

    public void test3() {
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        creditCard.setCreditLimit(100);
        creditCard.withdraw("0000", 70);
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 100, Loan Debt = 70. ", "Withdraw Test1");
    }

    public void test4() {
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        creditCard.setCreditLimit(100);
        creditCard.withdraw("0000", 170);
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 100, Loan Debt = 0. ", "Withdraw Test2");
    }

    public void test5() {
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        creditCard.setCreditLimit(100);
        creditCard.withdraw("0000", 70);
        creditCard.deposit("0000", 100);
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 30, Credit Limit = 100, Loan Debt = 0. ", "Deposit Test2");
    }

    public void test6() {
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        creditCard.deposit("1111", 100);
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 0, Loan Debt = 0. ", "Incorrect PIN Test1");
    }

    public void test7() {
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        creditCard.withdraw("1111", 100);
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 0, Loan Debt = 0. ", "Incorrect PIN Test2");
    }

    public void test8() {
        System.out.println("Complex Test includes all possible actions with one credit card. Please see results below.");
        CreditCard creditCard = new CreditCard("1212313114145151", "0000");
        String realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 0, Loan Debt = 0. ", "Complex Test1");
        creditCard.setCreditLimit(1000);
        realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 1000, Loan Debt = 0. ", "Complex Test2");
        creditCard.deposit("0000", 300);
        realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 300, Credit Limit = 1000, Loan Debt = 0. ", "Complex Test3");
        creditCard.withdraw("0000", 170);
        realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 130, Credit Limit = 1000, Loan Debt = 0. ", "Complex Test4");
        creditCard.withdraw("0000", 500);
        realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 1000, Loan Debt = 370. ", "Complex Test5");
        creditCard.withdraw("0000", 700);
        realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 0, Credit Limit = 1000, Loan Debt = 370. ", "Complex Test6");
        creditCard.deposit("0000", 600);
        realResult = creditCard.getInformation("1212313114145151", "0000");
        check(realResult, "Card number = 1212313114145151, PIN = 0000, Balance = 230, Credit Limit = 1000, Loan Debt = 0. ", "Complex Test7");
    }

    public void check(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
