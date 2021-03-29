package students.alex_kalashnikov.lesson_9.level_6.task_30;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest newTest = new FraudDetectorTest();
        newTest.testAllFraudRules_();
        newTest.testAllFraudRules_1();
        newTest.testAllFraudRules_2();
        newTest.testAllFraudRules_3();
        newTest.testAllFraudRules_4();
        newTest.testAllFraudRules_5();
        newTest.testAllFraudRules_6();
        newTest.testAllFraudRules_7();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAllFraudRules_() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 2500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(true, realResult);
    }

    void testAllFraudRules_1() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(true, realResult);
    }

    void testAllFraudRules_2() {
        Trader trader = new Trader("Alex", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(true, realResult);
    }

    void testAllFraudRules_3() {
        Trader trader = new Trader("Alex", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 4500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(true, realResult);
    }

    void testAllFraudRules_4() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(true, realResult);
    }

    void testAllFraudRules_5() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(false, realResult);
    }

    void testAllFraudRules_6() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 15000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(true, realResult);
    }

    void testAllFraudRules_7() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 750000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud2(transaction);
        test(false, realResult);
    }

}