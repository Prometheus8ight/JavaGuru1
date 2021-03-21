package students.deniss_jankovskis.lesson_9.level_6;

class FraudDetectorTest {

    FraudRule[] fraudRules = {new FraudRule1("Trader Name Rule"), new FraudRule2("Trader City Rule"),
            new FraudRule3("Trader County Rule"), new FraudRule4("Trader Transaction Rule")};

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.showTraderName();
        test.showTraderCity();
        test.showTraderCountry();
        test.showTraderTransaction();
    }

    public void showTraderName() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokemon", "London", "United Kingdom");
        Transaction transaction = new Transaction(trader, 500);
        FraudDetectionResult realResult = fraudDetector.isFraud(transaction);
        checkTestResult(null, realResult, "Show Trader Name Test");
    }


    public void showTraderCity() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Serj", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1050);
        FraudDetectionResult realResult = fraudDetector.isFraud(transaction);
        checkTestResult(null, realResult, "Show Trader City Test");
    }

    public void showTraderCountry() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("derHacker", "Bremen", "Germany");
        Transaction transaction = new Transaction(trader, 110000);
        FraudDetectionResult realResult = fraudDetector.isFraud(transaction);
        checkTestResult(null, realResult, "Show Trader Country Test");
    }

    public void showTraderTransaction() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Dean", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 150000);
        FraudDetectionResult realResult = fraudDetector.isFraud(transaction);
        checkTestResult(null, realResult, "Show Trader Transaction Test");
    }


    public void checkTestResult(FraudDetectionResult expectedResult, FraudDetectionResult realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

}

