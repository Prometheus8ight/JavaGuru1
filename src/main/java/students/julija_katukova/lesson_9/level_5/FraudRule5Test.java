package students.julija_katukova.lesson_9.level_5;

class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test fraudRule5Test = new FraudRule5Test();
        fraudRule5Test.traderCountryAndTransactionAmountTest1();
        fraudRule5Test.traderCountryAndTransactionAmountTest2();
        fraudRule5Test.traderCountryAndTransactionAmountTest3();
        fraudRule5Test.traderCountryAndTransactionAmountTest4();
    }

    public void traderCountryAndTransactionAmountTest1() {
        Trader trader = new Trader("Anna", "Bern", "Germany");
        Transaction t = new Transaction(trader, 1005);
        FraudRule5 fraudRule5 = new FraudRule5("Country and Amount Rule");
        boolean realResult = fraudRule5.isFraud(t);
        check(realResult, true, "Trader Country And Transaction Amount Test1");
    }

    public void traderCountryAndTransactionAmountTest2() {
        Trader trader = new Trader("Anna", "Bern", "Germany");
        Transaction t = new Transaction(trader, 100);
        FraudRule5 fraudRule5 = new FraudRule5("Country and Amount Rule");
        boolean realResult = fraudRule5.isFraud(t);
        check(realResult, false, "Trader Country And Transaction Amount Test2");
    }

    public void traderCountryAndTransactionAmountTest3() {
        Trader trader = new Trader("Anna", "Bern", "Германия");
        Transaction t = new Transaction(trader, 5000);
        FraudRule5 fraudRule5 = new FraudRule5("Country and Amount Rule");
        boolean realResult = fraudRule5.isFraud(t);
        check(realResult, true, "Trader Country And Transaction Amount Test3");
    }

    public void traderCountryAndTransactionAmountTest4() {
        Trader trader = new Trader("Anna", "Bern", "Германия");
        Transaction t = new Transaction(trader, 500);
        FraudRule5 fraudRule5 = new FraudRule5("Country and Amount Rule");
        boolean realResult = fraudRule5.isFraud(t);
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
