package students.deniss_jankovskis.lesson_9.level_5;

class FraudRule5Test {

    public static void main(String[] args) {

        FraudRule5Test test = new FraudRule5Test();
        test.rule5Test();
    }

    public void rule5Test() {
        FraudRule4 fraudRule5 = new FraudRule4("Rule 5");
        Trader trader = new Trader("derHacker", "Bremen", "Germany");
        Transaction transaction = new Transaction(trader, 110000);
        boolean realResult = fraudRule5.isFraud(transaction);
        checkTestsResult(false, realResult, "fraudRuleTest5");
    }

    public void checkTestsResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }

    }
}
