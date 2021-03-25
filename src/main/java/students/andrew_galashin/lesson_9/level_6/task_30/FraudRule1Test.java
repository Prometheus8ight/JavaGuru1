package students.andrew_galashin.lesson_9.level_6.task_30;


class FraudRule1Test {

    public static void main(String[] args) {
        FraudRule1Test start = new FraudRule1Test();
        start.testName1();
        start.testName2();
    }

    void testName1() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("Rule Name");
        boolean result = fraudRule1.isFraud(transaction);
        check(result, true, "testName1");
    }

    void testName2() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("Rule Name");
        boolean result = fraudRule1.isFraud(transaction);
        check(result, false, "testName2");
    }

    void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
