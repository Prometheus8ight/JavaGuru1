package students.alex_kalashnikov.lesson_10.level_7.task_25;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest newTest = new FraudDetectorTest();
        newTest.testAllFraudRules_();
        newTest.testAllFraudRules_1();
        newTest.testAllFraudRules_2();
        newTest.testAllFraudRules_3();
        newTest.testAllFraudRules_4();
        newTest.testAllFraudRules_5();
        newTest.testAllFraudRules_6();
        newTest.testAllFraudRules_7();
        newTest.testAllFraudRules_8();
        newTest.testAllFraudRules_9();

    }

    void test(boolean expectedResult, boolean realResult) {
        System.out.println("");
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAllFraudRules_() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 2500);
        Strategy strategy = new Strategy(new FraudRule1());
        test(true, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_1() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 2500);
        Strategy strategy = new Strategy(new FraudRule1());
        test(false, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_2() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 1000001);
        Strategy strategy = new Strategy(new FraudRule2());
        test(true, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_3() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 999999);
        Strategy strategy = new Strategy(new FraudRule2());
        test(false, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_4() {
        Trader trader = new Trader("Alex", "Sydney", "Australia");
        Transaction t = new Transaction(trader, 999999);
        Strategy strategy = new Strategy(new FraudRule3());
        test(true, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_5() {
        Trader trader = new Trader("Alex", "Melbourne", "Australia");
        Transaction t = new Transaction(trader, 999999);
        Strategy strategy = new Strategy(new FraudRule3());
        test(false, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_6() {
        Trader trader = new Trader("Alex", "Riga", "Jamaica");
        Transaction t = new Transaction(trader, 999999);
        Strategy strategy = new Strategy(new FraudRule4());
        test(true, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_7() {
        Trader trader = new Trader("Alex", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 999999);
        Strategy strategy = new Strategy(new FraudRule4());
        test(false, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_8() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 2500);
        Strategy strategy = new Strategy(new FraudRule5());
        test(false, strategy.executeFraudRule(t));
    }

    void testAllFraudRules_9() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction t = new Transaction(trader, 5001);
        Strategy strategy = new Strategy(new FraudRule5());
        test(true, strategy.executeFraudRule(t));
    }

}