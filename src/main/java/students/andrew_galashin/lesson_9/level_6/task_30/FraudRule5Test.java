package students.andrew_galashin.lesson_9.level_6.task_30;


class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test start = new FraudRule5Test();
        start.testCountry1();
        start.testCountry2();
    }

    void testCountry1() {
        Trader trader = new Trader("abc", "Riga", "Ямайка");
        Transaction transaction = new Transaction(trader, 9999);
        FraudRule5 fraudRule5 = new FraudRule5("Rule Name");
        boolean result = fraudRule5.isFraud(transaction);
        check(result, true, "testCountry1");
    }

    void testCountry2() {
        Trader trader = new Trader("abc", "Riga", "USA");
        Transaction transaction = new Transaction(trader, 9999);
        FraudRule5 fraudRule5 = new FraudRule5("Rule Name");
        boolean result = fraudRule5.isFraud(transaction);
        check(result, false, "testCountry2");
    }

    void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

}
