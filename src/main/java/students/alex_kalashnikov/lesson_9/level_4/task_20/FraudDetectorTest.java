package students.alex_kalashnikov.lesson_9.level_4.task_20;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest newTest = new FraudDetectorTest();
        newTest.testIsBannedCountry();
        newTest.testIsBannedCountry1();
        newTest.testIsBannedCountry2();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testIsBannedCountry() {
        Trader trader = new Trader("Alex", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isBannedCountry(transaction);
        test(true, realResult);
    }

    void testIsBannedCountry1() {
        Trader trader = new Trader("Pokemon", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isBannedCountry(transaction);
        test(true, realResult);
    }

    void testIsBannedCountry2() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 250000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isBannedCountry(transaction);
        test(false, realResult);
    }

}