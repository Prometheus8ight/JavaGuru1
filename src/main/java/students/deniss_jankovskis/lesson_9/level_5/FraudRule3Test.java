package students.deniss_jankovskis.lesson_9.level_5;

class FraudRule3Test {

    public static void main(String[] args) {

        FraudRule3Test test = new FraudRule3Test();
        test.rule3Test();
    }

    public void rule3Test() {
        FraudRule3 fraudRule3 = new FraudRule3("Rule 3");
        Trader trader = new Trader("Dean", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 150000);
        boolean realResult = fraudRule3.isFraud(transaction);
        checkTestsResult(true, realResult, "fraudRuleTest3");
    }

    public void checkTestsResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }

    }
}
