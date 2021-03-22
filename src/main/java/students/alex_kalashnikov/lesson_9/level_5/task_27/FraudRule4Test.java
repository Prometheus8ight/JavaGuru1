package students.alex_kalashnikov.lesson_9.level_5.task_27;

class FraudRule4Test {

    public static void main(String[] args) {

        FraudRule4Test newTest = new FraudRule4Test();
        newTest.testFraudRule4_();
        newTest.testFraudRule4_1();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFraudRule4_() {
        Trader trader = new Trader("Pokemon", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 25000000);
        FraudRule4 fraudRule4 = new FraudRule4("Prohibited countries rule");
        boolean realResult = fraudRule4.isFraud(transaction);
        test(true, realResult);
    }

    void testFraudRule4_1() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule4 fraudRule4 = new FraudRule4("Prohibited countries rule");
        boolean realResult = fraudRule4.isFraud(transaction);
        test(false, realResult);
    }

}