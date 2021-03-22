package students.alex_kalashnikov.lesson_9.level_5.task_24;

class FraudRule1Test {

    public static void main(String[] args) {

        FraudRule1Test newTest = new FraudRule1Test();
        newTest.FraudRule1_();
        newTest.FraudRule1_1();
        newTest.FraudRule1_2();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void FraudRule1_() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 250000);
        FraudRule1 fraudRule1 = new FraudRule1("Trader name rule");
        boolean realResult = fraudRule1.isFraud(transaction);
        test(true, realResult);
    }

    void FraudRule1_1() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 500);
        FraudRule1 fraudRule1 = new FraudRule1("Trader name rule");
        boolean realResult = fraudRule1.isFraud(transaction);
        test(true, realResult);
    }

    void FraudRule1_2() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 250000);
        FraudRule1 fraudRule1 = new FraudRule1("Trader name rule");
        boolean realResult = fraudRule1.isFraud(transaction);
        test(false, realResult);
    }

}