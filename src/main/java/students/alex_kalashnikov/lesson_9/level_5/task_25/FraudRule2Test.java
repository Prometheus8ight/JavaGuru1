package students.alex_kalashnikov.lesson_9.level_5.task_25;

class FraudRule2Test {

    public static void main(String[] args) {

        FraudRule2Test newTest = new FraudRule2Test();
        newTest.testFraudRule2_();
        newTest.testFraudRule2_1();
        newTest.testFraudRule2_2();
        newTest.testFraudRule2_3();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFraudRule2_() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 25000000);
        FraudRule2 fraudRule2 = new FraudRule2("Max amount rule", 1000000);
        boolean realResult = fraudRule2.isFraud(transaction);
        test(true, realResult);
    }

    void testFraudRule2_1() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule2 fraudRule2 = new FraudRule2("Max amount rule", 1000000);
        boolean realResult = fraudRule2.isFraud(transaction);
        test(false, realResult);
    }

    void testFraudRule2_2() {
        Trader trader = new Trader("Alex", "New York", "USA");
        Transaction transaction = new Transaction(trader, 25000);
        FraudRule2 fraudRule2 = new FraudRule2("Max amount rule", 10000);
        boolean realResult = fraudRule2.isFraud(transaction);
        test(true, realResult);
    }

    void testFraudRule2_3() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 250000);
        FraudRule2 fraudRule2 = new FraudRule2("Max amount rule", 1000000);
        boolean realResult = fraudRule2.isFraud(transaction);
        test(false, realResult);
    }

}