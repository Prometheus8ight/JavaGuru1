package students.alex_kalashnikov.lesson_9.level_4.task_21;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest newTest = new FraudDetectorTest();
        newTest.isMaxAmountFromCountry();
        newTest.isMaxAmountFromCountry1();
        newTest.isMaxAmountFromCountry2();

    }

    void isMaxAmountFromCountry() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = false;
        if (fraudDetector.isBannedCountry(transaction) && fraudDetector.isExcessAmount(transaction, 1000)) {
            realResult = true;
        }
        test(true, realResult);
    }

    void isMaxAmountFromCountry1() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = false;
        if (fraudDetector.isBannedCountry(transaction) && fraudDetector.isExcessAmount(transaction, 5000)) {
            realResult = true;
        }
        test(false, realResult);
    }

    void isMaxAmountFromCountry2() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 50000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = false;
        if (fraudDetector.isBannedCountry(transaction) && fraudDetector.isExcessAmount(transaction, 1000)) {
            realResult = true;
        }
        test(false, realResult);
    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

}