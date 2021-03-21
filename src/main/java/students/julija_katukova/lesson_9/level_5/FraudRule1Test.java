package main.java.students.julija_katukova.lesson_9.level_5;

class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.traderNameTest1();
        fraudRule1Test.traderNameTest2();
    }

    public void traderNameTest1() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction t = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("Name Rule");
        boolean realResult = fraudRule1.isFraud(t);
        check(realResult, true, "Trader Name Test1");
    }

    public void traderNameTest2() {
        Trader trader = new Trader("Pokeroom", "Riga");
        Transaction t = new Transaction(trader, 100);
        FraudRule1 fraudRule1 = new FraudRule1("Name Rule");
        boolean realResult = fraudRule1.isFraud(t);
        check(realResult, false, "Trader Name Test2");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
