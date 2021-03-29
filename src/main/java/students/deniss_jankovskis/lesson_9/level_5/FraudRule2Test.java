package students.deniss_jankovskis.lesson_9.level_5;

class FraudRule2Test {

    public static void main(String[] args) {

        FraudRule2Test test = new FraudRule2Test();
        test.rule2Test();
    }

    public void rule2Test() {
        FraudRule2 fraudRule2 = new FraudRule2("Rule 2");
        Trader trader = new Trader("Serj", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1050);
        boolean realResult = fraudRule2.isFraud(transaction);
        checkTestsResult(false, realResult, "fraudRuleTest2");
    }

    public void checkTestsResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }

    }
}
