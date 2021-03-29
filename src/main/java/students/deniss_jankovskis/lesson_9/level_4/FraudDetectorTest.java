package students.deniss_jankovskis.lesson_9.level_4;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.fraudTest1();
        test.fraudTest2();
        test.fraudTest3();
        test.fraudTest4();
        test.fraudTest5();
    }

    public void fraudTest1() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "London", "United Kingdom");
        Transaction transaction = new Transaction(trader, 500);
        checkTestsResult(true, fraudDetector.isFraud(transaction), "fraudTest1");
    }

    public void fraudTest2() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Serj", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1050);
        checkTestsResult2(false, fraudDetector.isFraud(transaction), "fraudTest2");
    }

    public void fraudTest3() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("derHacker", "Bremen", "Germany");
        Transaction transaction = new Transaction(trader, 110000);
        checkTestsResult(true, fraudDetector.isFraud(transaction), "fraudTest3");
    }

    public void fraudTest4() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Dean", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 150000);
        checkTestsResult(true, fraudDetector.isFraud(transaction), "fraudTest4");
    }

    public void fraudTest5() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Kevin", "Montego Bay", "Jamaica");
        Transaction transaction = new Transaction(trader, 500);
        checkTestsResult2(false, fraudDetector.isFraud(transaction), "fraudTest5");
    }

    public void checkTestsResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    public void checkTestsResult2(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

}
