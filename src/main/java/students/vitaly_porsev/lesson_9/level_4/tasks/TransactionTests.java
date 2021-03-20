package students.vitaly_porsev.lesson_9.level_4.tasks;

public class TransactionTests {

    public static void main(String[] args) {
        TransactionTests transactionTests = new TransactionTests();
        transactionTests.allTests();
    }

    void allTests() {
        testTask17();
        testTask18();
        testTask19();
        testTask20();
        testTask21();
        testFalse();
    }

    void testTask17() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "testTask17");
    }

    void testTask18() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Nikola", "Niznij-Novgorod", "Russia");
        Transaction transaction = new Transaction(trader, 1000001);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "testTask18");
    }

    void testTask19() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Jhon", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 20000);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "testTask19");
    }

    void testTask20() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Adio", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 10);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "testTask20");
    }

    void testTask21() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 50000);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "testTask21");
    }

    void testFalse() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Karl", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        checkTestFalse(false, fraudDetector.isFraud(transaction), "testFalse");
    }

    void checkTestsTrue(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - False");
        }
    }

    void checkTestFalse(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - False");
        }
    }
}
