package main.java.students.julija_katukova.lesson_9.level_4;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.traderNameTest1();
        fraudDetectorTest.traderNameTest2();
        fraudDetectorTest.transactionAmountTest1();
        fraudDetectorTest.transactionAmountTest2();
        fraudDetectorTest.traderCityTest1();
        fraudDetectorTest.traderCityTest2();
        fraudDetectorTest.traderCityTest3();
        fraudDetectorTest.traderCountryTest1();
        fraudDetectorTest.traderCountryTest2();
        fraudDetectorTest.traderCountryTest3();
        fraudDetectorTest.traderCountryAndTransactionAmountTest1();
        fraudDetectorTest.traderCountryAndTransactionAmountTest2();
        fraudDetectorTest.traderCountryAndTransactionAmountTest3();
        fraudDetectorTest.traderCountryAndTransactionAmountTest4();
    }

    public void traderNameTest1() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Trader Name Test1");
    }

    public void traderNameTest2() {
        Trader trader = new Trader("Pokeroom", "Riga");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, false, "Trader Name Test2");
    }

    public void transactionAmountTest1() {
        Trader trader = new Trader("Anna", "Riga");
        Transaction t = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Transaction Amount Test1");
    }

    public void transactionAmountTest2() {
        Trader trader = new Trader("Anna", "Riga");
        Transaction t = new Transaction(trader, 1111);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, false, "Transaction Amount Test2");
    }

    public void traderCityTest1() {
        Trader trader = new Trader("Anna", "Sydney");
        Transaction t = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Trader City Test1");
    }

    public void traderCityTest2() {
        Trader trader = new Trader("Anna", "Сидней");
        Transaction t = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Trader City Test2");
    }

    public void traderCityTest3() {
        Trader trader = new Trader("Anna", "Moscow");
        Transaction t = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, false, "Trader City Test3");
    }

    public void traderCountryTest1() {
        Trader trader = new Trader("Anna", "Kingston", "Ямайка");
        Transaction t = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Trader Country Test1");
    }

    public void traderCountryTest2() {
        Trader trader = new Trader("Anna", "Kingston", "Jamaica");
        Transaction t = new Transaction(trader, 300);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Trader Country Test2");
    }

    public void traderCountryTest3() {
        Trader trader = new Trader("Anna", "Moscow", "Russia");
        Transaction t = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, false, "Trader Country Test3");
    }

    public void traderCountryAndTransactionAmountTest1() {
        Trader trader = new Trader("Anna", "Bern", "Germany");
        Transaction t = new Transaction(trader, 1005);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Trader Country And Transaction Amount Test1");
    }

    public void traderCountryAndTransactionAmountTest2() {
        Trader trader = new Trader("Anna", "Bern", "Germany");
        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, false, "Trader Country And Transaction Amount Test2");
    }

    public void traderCountryAndTransactionAmountTest3() {
        Trader trader = new Trader("Anna", "Bern", "Германия");
        Transaction t = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, true, "Trader Country And Transaction Amount Test3");
    }

    public void traderCountryAndTransactionAmountTest4() {
        Trader trader = new Trader("Anna", "Bern", "Германия");
        Transaction t = new Transaction(trader, 500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        check(realResult, false, "Trader Country And Transaction Amount Test4");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
