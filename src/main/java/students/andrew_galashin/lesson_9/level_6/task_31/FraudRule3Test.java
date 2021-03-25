package students.andrew_galashin.lesson_9.level_6.task_31;


class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test start = new FraudRule3Test();
        start.testAmount1();
        start.testAmount2();
    }

    void testAmount1() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudRule3 fraudDetectorAmount = new FraudRule3("Rule Name");
        boolean result = fraudDetectorAmount.isFraud(transaction);
        check(result, true, "testAmount1");
    }

    void testAmount2() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 9999);
        FraudRule3 fraudDetectorAmount = new FraudRule3("Rule Name");
        boolean result = fraudDetectorAmount.isFraud(transaction);
        check(result, false, "testAmount2");
    }

    void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
