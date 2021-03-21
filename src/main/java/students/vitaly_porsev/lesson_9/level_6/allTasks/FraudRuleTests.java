package students.vitaly_porsev.lesson_9.level_6.allTasks;

class FraudRuleTests {
    public static void main(String[] args) {
        FraudRuleTests fraudRuleTests = new FraudRuleTests();
        fraudRuleTests.allTests();
    }


    void allTests() {
        testNoPokemon();
        testMaxAmount();
        testNoSidney();
        testNoJamaica();
        testNoGermanyMaxAmount1000();
        testNull();
    }

    void testNoPokemon() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&&maxAmount1000")});
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsNullOrNot(fraudDetector.isFraud(transaction), "testNoPokemon");
    }

    void testMaxAmount() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&&maxAmount1000")});
        Trader trader = new Trader("Nikola", "Niznij-Novgorod", "Russia");
        Transaction transaction = new Transaction(trader, 1000001);
        checkTestsNullOrNot(fraudDetector.isFraud(transaction), "testMaxAmount");
    }

    void testNoSidney() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&&maxAmount1000")});
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 300);
        checkTestsNullOrNot(fraudDetector.isFraud(transaction), "testNoSidney");
    }

    void testNoJamaica() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&&maxAmount1000")});
        Trader trader = new Trader("Adio", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        checkTestsNullOrNot(fraudDetector.isFraud(transaction), "testNoJamaica");
    }

    void testNoGermanyMaxAmount1000() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&&maxAmount1000")});
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        checkTestsNullOrNot(fraudDetector.isFraud(transaction), "testNoGermanyMaxAmount1000");
    }

    void testNull() {
        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{new FraudRule1("noPokemon"), new FraudRule2("maxAmount"),
                new FraudRule3("noSidney"), new FraudRule4("noJamaica"), new FraudRule5("noGermany&&maxAmount1000")});
        Trader trader = new Trader("Justus", "Chemnitz", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        checkTestForNull(fraudDetector.isFraud(transaction), "testNoGermanyMaxAmount1000");
    }


    void checkTestsNullOrNot(Object realResult, String testName) {
        if (realResult != null) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - False");
        }
    }

    void checkTestForNull(Object realResult, String testName) {
        if (realResult == null) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - False");
        }
    }
}
