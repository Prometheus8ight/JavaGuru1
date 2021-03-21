package main.java.students.julija_katukova.lesson_9.level_5;

class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test fraudRule4Test = new FraudRule4Test();
        fraudRule4Test.traderCountryTest1();
        fraudRule4Test.traderCountryTest2();
        fraudRule4Test.traderCountryTest3();
    }

    public void traderCountryTest1() {
        Trader trader = new Trader("Anna", "Kingston", "Ямайка");
        Transaction t = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("Country Rule");
        boolean realResult = fraudRule4.isFraud(t);
        check(realResult, true, "Trader Country Test1");
    }

    public void traderCountryTest2() {
        Trader trader = new Trader("Anna", "Kingston", "Jamaica");
        Transaction t = new Transaction(trader, 300);
        FraudRule4 fraudRule4 = new FraudRule4("Country Rule");
        boolean realResult = fraudRule4.isFraud(t);
        check(realResult, true, "Trader Country Test2");
    }

    public void traderCountryTest3() {
        Trader trader = new Trader("Anna", "Moscow", "Russia");
        Transaction t = new Transaction(trader, 1000);
        FraudRule4 fraudRule4 = new FraudRule4("Country Rule");
        boolean realResult = fraudRule4.isFraud(t);
        check(realResult, false, "Trader Country Test3");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
