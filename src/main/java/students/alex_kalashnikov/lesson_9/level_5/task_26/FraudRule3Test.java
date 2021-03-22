package students.alex_kalashnikov.lesson_9.level_5.task_26;

class FraudRule3Test {

    public static void main(String[] args) {

        FraudRule3Test newTest = new FraudRule3Test();
        newTest.testFraudRule3_();
        newTest.testFraudRule3_1();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFraudRule3_() {
        Trader trader = new Trader("Pokemon", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 25000000);
        FraudRule3 fraudRule3 = new FraudRule3("Prohibited cities rule");
        boolean realResult = fraudRule3.isFraud(transaction);
        test(true, realResult);
    }

    void testFraudRule3_1() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule3 fraudRule3 = new FraudRule3("Prohibited cities rule");
        boolean realResult = fraudRule3.isFraud(transaction);
        test(false, realResult);
    }

}