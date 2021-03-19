package students.vitaly_porsev.lesson_9.level_5.tasks;

class FraudDetectorTests {

    public static void main(String[] args) {
        FraudDetectorTests fraudDetectorTests = new FraudDetectorTests();
        fraudDetectorTests.allTests();
    }

    void allTests() {
        fraudDetector1();
        fraudDetector2();
        fraudDetector3();
        fraudDetector4();
        fraudDetector5();
        testFalse();
    }

    void fraudDetector1() {
        FraudRule fraudDetector1 = new FraudRule1("noPokemon");
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsTrue(true, fraudDetector1.isFraud(transaction), "noPokemon");
    }

    void fraudDetector2() {
        FraudRule fraudDetector2 = new FraudRule2("maxAmount");
        Trader trader = new Trader("Nikola", "Niznij-Novgorod", "Russia");
        Transaction transaction = new Transaction(trader, 1000001);
        checkTestsTrue(true, fraudDetector2.isFraud(transaction), "maxAmount");
    }

    void fraudDetector3() {
        FraudRule fraudDetector3 = new FraudRule3("noSidney");
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 300);
        checkTestsTrue(true, fraudDetector3.isFraud(transaction), "noSidney");
    }

    void fraudDetector4() {
        FraudRule fraudDetector4 = new FraudRule4("noJamaica");
        Trader trader = new Trader("Adio", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsTrue(true, fraudDetector4.isFraud(transaction), "noJamaica");
    }

    void fraudDetector5() {
        FraudRule fraudDetector5 = new FraudRule5("noGermany&max1000");
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        checkTestsTrue(true, fraudDetector5.isFraud(transaction), "noGermany&max1000");
    }

    void testFalse() {
        FraudRule fraudDetector5 = new FraudRule5("False");
        Trader trader = new Trader("Karl", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 50);
        checkTestFalse(false, fraudDetector5.isFraud(transaction), "testFalse");
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