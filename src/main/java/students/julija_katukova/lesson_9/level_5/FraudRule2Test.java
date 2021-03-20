package main.java.students.julija_katukova.lesson_9.level_5;

class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test fraudRule2Test = new FraudRule2Test();
        fraudRule2Test.transactionAmountTest1();
        fraudRule2Test.transactionAmountTest2();
    }

    public void transactionAmountTest1() {
        Trader trader = new Trader("Anna", "Riga");
        Transaction t = new Transaction(trader, 1000001);
        FraudRule2 fraudRule2 = new FraudRule2("Amount Rule");
        boolean realResult = fraudRule2.isFraud(t);
        check(realResult, true, "Transaction Amount Test1");
    }

    public void transactionAmountTest2() {
        Trader trader = new Trader("Anna", "Riga");
        Transaction t = new Transaction(trader, 1111);
        FraudRule2 fraudRule2 = new FraudRule2("Amount Rule");
        boolean realResult = fraudRule2.isFraud(t);
        check(realResult, false, "Transaction Amount Test2");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
