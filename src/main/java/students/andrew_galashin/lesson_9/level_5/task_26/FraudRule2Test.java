package students.andrew_galashin.lesson_9.level_5.task_26;


class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test start = new FraudRule2Test();
        start.testAmount1();
        start.testAmount2();
    }

    void testAmount1() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudRule2 fraudDetectorAmount = new FraudRule2("Rule Name");
        boolean result = fraudDetectorAmount.isFraud(transaction);
        check(result, true, "testAmount1");
    }

    void testAmount2() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 9999);
        FraudRule2 fraudDetectorAmount = new FraudRule2("Rule Name");
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
