package students.alex_kalashnikov.lesson_9.level_6.task_32;

import java.util.Arrays;

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

    void test(FraudDetectionResult[] expectedResult, FraudDetectionResult[] realResult) {
        System.out.println("Expe: " + Arrays.toString(expectedResult));
        System.out.println("Real: " + Arrays.toString(realResult));
        ;
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAllFraudRules_() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 2500);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {new FraudDetectionResult(true, "Trader name rule")};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }


    void testAllFraudRules_1() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {new FraudDetectionResult(true, "Trader name rule"),
                new FraudDetectionResult(true, "Max amount rule")};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }


    void testAllFraudRules_2() {
        Trader trader = new Trader("Pokemon", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 1500000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {new FraudDetectionResult(true, "Trader name rule"),
                new FraudDetectionResult(true, "Max amount rule"),
                new FraudDetectionResult(true, "Prohibited cities rule")};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }


    void testAllFraudRules_3() {
        Trader trader = new Trader("Alex", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 5000000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {new FraudDetectionResult(true, "Max amount rule"),
                new FraudDetectionResult(true, "Prohibited countries rule")};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }


    void testAllFraudRules_4() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 6500);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {new FraudDetectionResult(true, "Trader name rule"),
                new FraudDetectionResult(true, "Country transaction amount limit rule")};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }

    void testAllFraudRules_5() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }

    void testAllFraudRules_6() {
        Trader trader = new Trader("Pokemon", "Sydney", "Jamaica");
        Transaction transaction = new Transaction(trader, 15000000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {new FraudDetectionResult(true, "Trader name rule"),
                new FraudDetectionResult(true, "Max amount rule"),
                new FraudDetectionResult(true, "Prohibited cities rule"),
                new FraudDetectionResult(true, "Prohibited countries rule")};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }

    void testAllFraudRules_7() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 750000);
        FraudDetector fraudDetector = new FraudDetector();
        FraudDetectionResult[] expectedResult = {};
        FraudDetectionResult[] realResult = fraudDetector.isFraud2(transaction);
        test(expectedResult, realResult);
    }

}