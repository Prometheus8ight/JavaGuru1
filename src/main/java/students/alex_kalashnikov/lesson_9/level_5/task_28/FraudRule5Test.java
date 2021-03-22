package students.alex_kalashnikov.lesson_9.level_5.task_28;

class FraudRule5Test {

    public static void main(String[] args) {

        FraudRule5Test newTest = new FraudRule5Test();
        newTest.testFraudRule5_();
        newTest.testFraudRule5_1();
        newTest.testFraudRule5_2();
        newTest.testFraudRule5_3();
        newTest.testFraudRule5_4();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFraudRule5_() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 25000000);
        FraudRule5 fraudRule5 = new FraudRule5("Country transaction amount limit rule", 5000);
        boolean realResult = fraudRule5.isFraud(transaction);
        test(true, realResult);
    }

    void testFraudRule5_1() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudRule5 fraudRule5 = new FraudRule5("Country transaction amount limit rule", 5000);
        boolean realResult = fraudRule5.isFraud(transaction);
        test(false, realResult);
    }

    void testFraudRule5_2() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 750);
        FraudRule5 fraudRule5 = new FraudRule5("Country transaction amount limit rule", 5000);
        boolean realResult = fraudRule5.isFraud(transaction);
        test(false, realResult);
    }

    void testFraudRule5_3() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 750000);
        FraudRule5 fraudRule5 = new FraudRule5("Country transaction amount limit rule", 1000000);
        boolean realResult = fraudRule5.isFraud(transaction);
        test(false, realResult);
    }

    void testFraudRule5_4() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule5 FraudRule5 = new FraudRule5("Country transaction amount limit rule", 5000);
        boolean realResult = FraudRule5.isFraud(transaction);
        test(false, realResult);
    }

}