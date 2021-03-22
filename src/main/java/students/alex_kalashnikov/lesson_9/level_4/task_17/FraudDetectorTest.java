package students.alex_kalashnikov.lesson_9.level_4.task_17;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest newTest = new FraudDetectorTest();
        newTest.testIsFraud();
        newTest.testIsFraud1();
        newTest.testIsFraud2();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testIsFraud() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 250000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        test(true, realResult);
    }

    void testIsFraud1() {
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        test(true, realResult);
    }

    void testIsFraud2() {
        Trader trader = new Trader("Alex", "Riga");
        Transaction transaction = new Transaction(trader, 250000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        test(false, realResult);
    }

}