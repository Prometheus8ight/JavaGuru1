package students.alex_kalashnikov.lesson_9.level_4.task_19;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest newTest = new FraudDetectorTest();
        newTest.testIsBannedLocation();
        newTest.testIsBannedLocation1();
        newTest.testIsBannedLocation2();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testIsBannedLocation() {
        Trader trader = new Trader("Alex", "Sydney");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isBannedLocation(transaction);
        test(true, realResult);
    }

    void testIsBannedLocation1() {
        Trader trader = new Trader("Pokemon", "Sydney");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isBannedLocation(transaction);
        test(true, realResult);
    }

    void testIsBannedLocation2() {
        Trader trader = new Trader("Alex", "Riga");
        Transaction transaction = new Transaction(trader, 250000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isBannedLocation(transaction);
        test(false, realResult);
    }

}