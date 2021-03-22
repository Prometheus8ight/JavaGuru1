package students.julija_katukova.lesson_9.level_6;

class FraudDetectorTest {

    FraudRule[] fraudRules = {
            new FraudRule1("Trader Name Rule"),
            new FraudRule2("Transaction Amount Rule"),
            new FraudRule3("Trader City Rule")
    };

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.traderNameTest1();
        fraudDetectorTest.traderNameTest2();
        fraudDetectorTest.transactionAmountTest1();
        fraudDetectorTest.transactionAmountTest2();
        fraudDetectorTest.traderCityTest1();
        fraudDetectorTest.traderCityTest2();
        fraudDetectorTest.traderCityTest3();
    }

    public void traderNameTest1() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult realResult = fraudDetector.isFraud(t);
        check1(realResult, null, "Trader Name Test1");
    }

    public void traderNameTest2() {
        Trader trader = new Trader("Pokeroom", "Riga");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult realResult = fraudDetector.isFraud(t);
        check2(realResult, null, "Trader Name Test2");
    }

    public void transactionAmountTest1() {
        Trader trader = new Trader("Anna", "Riga");
        Transaction t = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult realResult = fraudDetector.isFraud(t);
        check1(realResult, null, "Transaction Amount Test1");
    }

    public void transactionAmountTest2() {
        Trader trader = new Trader("Anna", "Riga");
        Transaction t = new Transaction(trader, 1111);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult realResult = fraudDetector.isFraud(t);
        check2(realResult, null, "Transaction Amount Test2");
    }

    public void traderCityTest1() {
        Trader trader = new Trader("Anna", "Sydney");
        Transaction t = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult realResult = fraudDetector.isFraud(t);
        check1(realResult, null, "Trader City Test1");
    }

    public void traderCityTest2() {
        Trader trader = new Trader("Anna", "Сидней");
        Transaction t = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult realResult = fraudDetector.isFraud(t);
        check1(realResult, null, "Trader City Test2");
    }

    public void traderCityTest3() {
        Trader trader = new Trader("Anna", "Moscow");
        Transaction t = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult realResult = fraudDetector.isFraud(t);
        check2(realResult, null, "Trader City Test3");
    }

    public void check1(FraudDetectionResult realResult, FraudDetectionResult expectedResult, String testName) {
        if (realResult != expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void check2(FraudDetectionResult realResult, FraudDetectionResult expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
