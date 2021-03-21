package students.deniss_jankovskis.lesson_9.level_5;

public class FraudRule4Test {

    public static void main(String[] args) {

        FraudRule4Test test = new FraudRule4Test();
        test.rule4Test();
    }

    public void rule4Test() {
        FraudRule4 fraudRule4 = new FraudRule4("Rule 4");
        Trader trader = new Trader("Kevin", "Montego Bay", "Jamaica");
        Transaction transaction = new Transaction(trader, 500);
        boolean realResult = fraudRule4.isFraud(transaction);
        checkTestsResult(false, realResult, "fraudRuleTest4");
    }

    public void checkTestsResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }

    }
}
