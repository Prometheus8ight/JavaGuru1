package students.andrew_galashin.lesson_9.level_6.task_31;


class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test start = new FraudRule4Test();
        start.testCity1();
        start.testCity2();
    }

    void testCity1() {
        Trader trader = new Trader("abc", "Сидней");
        Transaction transaction = new Transaction(trader, 9999);
        FraudRule4 fraudDetectorCity = new FraudRule4("Rule Name");
        boolean result = fraudDetectorCity.isFraud(transaction);
        check(result, true, "testCity1");
    }

    void testCity2() {
        Trader trader = new Trader("abc", "New York");
        Transaction transaction = new Transaction(trader, 9999);
        FraudRule4 fraudDetectorCity = new FraudRule4("Rule Name");
        boolean result = fraudDetectorCity.isFraud(transaction);
        check(result, false, "testCity2");
    }

    void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
