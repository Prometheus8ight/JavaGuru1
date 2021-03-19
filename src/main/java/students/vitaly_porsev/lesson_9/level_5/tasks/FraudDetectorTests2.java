package students.vitaly_porsev.lesson_9.level_5.tasks;

class FraudDetectorTests2 {

    public static void main(String[] args) {
        FraudDetectorTests2 fraudDetectorTests2 = new FraudDetectorTests2();
        fraudDetectorTests2.allTests();
    }

    void allTests() {
        fraudRule1Test();
        fraudRule2Test();
        fraudRule3Test();
        fraudRule4Test();
        fraudRule5Test();
        fraudRuleFalseTest();
    }

    void fraudRule1Test() {
        FraudRule[] fraudRules = {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsTrue(true, fraudDetector.isFraud(fraudRules, transaction), "fraudRule1Test");
    }

    void fraudRule2Test() {
        FraudRule[] fraudRules = {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Nikola", "Niznij-Novgorod", "Russia");
        Transaction transaction = new Transaction(trader, 1000001);
        checkTestsTrue(true, fraudDetector.isFraud(fraudRules, transaction), "fraudRule2Test");
    }

    void fraudRule3Test() {
        FraudRule[] fraudRules = {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 300);
        checkTestsTrue(true, fraudDetector.isFraud(fraudRules, transaction), "fraudRule3Test");
    }

    void fraudRule4Test() {
        FraudRule[] fraudRules = {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Adio", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsTrue(true, fraudDetector.isFraud(fraudRules, transaction), "fraudRule4Test");
    }

    void fraudRule5Test() {
        FraudRule[] fraudRules = {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        checkTestsTrue(true, fraudDetector.isFraud(fraudRules, transaction), "fraudRule5Test");
    }

    void fraudRuleFalseTest() {
        FraudRule[] fraudRules = {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")};
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        checkTestFalse(false, fraudDetector.isFraud(fraudRules, transaction), "fraudRuleFalseTest");
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
