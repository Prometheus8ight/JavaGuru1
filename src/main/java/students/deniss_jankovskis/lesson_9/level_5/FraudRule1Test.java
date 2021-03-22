package students.deniss_jankovskis.lesson_9.level_5;

class FraudRule1Test {

    public static void main(String[] args) {

        FraudRule1Test test = new FraudRule1Test();
        test.rule1Test();
    }

    public void rule1Test() {
        FraudRule1 fraudRule1 = new FraudRule1("Rule 1");
        Trader trader = new Trader("Pokemon", "London", "United Kingdom");
        Transaction transaction = new Transaction(trader, 500);
        boolean realResult = fraudRule1.isFraud(transaction);
        checkTestsResult(true, realResult, "fraudRuleTest1");
    }


    public void checkTestsResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
