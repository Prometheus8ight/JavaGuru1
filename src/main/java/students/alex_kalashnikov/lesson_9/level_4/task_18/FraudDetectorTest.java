package students.alex_kalashnikov.lesson_9.level_4.task_18;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest newTest = new FraudDetectorTest();
        newTest.testIsExcessAmount();
        newTest.testIsExcessAmount1();
        newTest.testIsExcessAmount2();
        newTest.testIsExcessAmount3();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testIsExcessAmount() {
        Trader trader = new Trader("Alex", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isExcessAmount(transaction);
        test(true, realResult);
    }

    void testIsExcessAmount1() {
        Trader trader = new Trader("Pokemon", "New York");
        Transaction transaction = new Transaction(trader, 25000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isExcessAmount(transaction);
        test(true, realResult);
    }

    void testIsExcessAmount2() {
        Trader trader = new Trader("Alex", "Riga");
        Transaction transaction = new Transaction(trader, 250000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isExcessAmount(transaction);
        test(false, realResult);
    }

    void testIsExcessAmount3() {
        Trader trader = new Trader("Alex", "Riga");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isExcessAmount(transaction);
        test(false, realResult);
    }

}