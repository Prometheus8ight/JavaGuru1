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
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[] {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")});
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "fraudRule1Test");
    }

    void fraudRule2Test() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[] {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")});

        Trader trader = new Trader("Nikola", "Niznij-Novgorod", "Russia");
        Transaction transaction = new Transaction(trader, 1000001);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "fraudRule2Test");
    }

    void fraudRule3Test() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[] {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")});
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 300);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "fraudRule3Test");
    }

    void fraudRule4Test() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[] {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")});
        Trader trader = new Trader("Adio", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "fraudRule4Test");
    }

    void fraudRule5Test() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[] {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")});
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        checkTestsTrue(true, fraudDetector.isFraud(transaction), "fraudRule5Test");
    }

    void fraudRuleFalseTest() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[] {new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&max1000")});
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        checkTestFalse(false, fraudDetector.isFraud(transaction), "fraudRuleFalseTest");
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
