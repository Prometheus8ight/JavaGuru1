package students.julija_katukova.lesson_9.level_5;

class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test fraudRule3Test = new FraudRule3Test();
        fraudRule3Test.traderCityTest1();
        fraudRule3Test.traderCityTest2();
        fraudRule3Test.traderCityTest3();
    }

    public void traderCityTest1() {
        Trader trader = new Trader("Anna", "Sydney");
        Transaction t = new Transaction(trader, 500);
        FraudRule3 fraudRule3 = new FraudRule3("City Rule");
        boolean realResult = fraudRule3.isFraud(t);
        check(realResult, true, "Trader City Test1");
    }

    public void traderCityTest2() {
        Trader trader = new Trader("Anna", "Сидней");
        Transaction t = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("City Rule");
        boolean realResult = fraudRule3.isFraud(t);
        check(realResult, true, "Trader City Test2");
    }

    public void traderCityTest3() {
        Trader trader = new Trader("Anna", "Moscow");
        Transaction t = new Transaction(trader, 1000);
        FraudRule3 fraudRule3 = new FraudRule3("City Rule");
        boolean realResult = fraudRule3.isFraud(t);
        check(realResult, false, "Trader City Test3");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
