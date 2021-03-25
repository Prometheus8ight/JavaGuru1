package students.andrew_galashin.lesson_9.level_5.task_22;

public class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest start = new FraudDetectorTest();
        start.testName1();
        start.testName2();
        start.testAmount1();
        start.testAmount2();
        start.testCity1();
        start.testCity2();
        start.testCountry1();
        start.testCountry2();
        start.testAll1();
        start.testAll2();
        start.testAll3();
    }

    void testName1() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectorName fraudDetectorName = new FraudDetectorName();
        boolean result = fraudDetectorName.fraud(transaction);
        check(result, true, "testName1");
    }

    void testName2() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectorName fraudDetectorName = new FraudDetectorName();
        boolean result = fraudDetectorName.fraud(transaction);
        check(result, false, "testName2");
    }

    void testAmount1() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectorAmount fraudDetectorAmount = new FraudDetectorAmount();
        boolean result = fraudDetectorAmount.fraud(transaction);
        check(result, true, "testAmount1");
    }

    void testAmount2() {
        Trader trader = new Trader("abc", "Riga");
        Transaction transaction = new Transaction(trader, 9999);
        FraudDetectorAmount fraudDetectorAmount = new FraudDetectorAmount();
        boolean result = fraudDetectorAmount.fraud(transaction);
        check(result, false, "testAmount2");
    }

    void testCity1() {
        Trader trader = new Trader("abc", "Сидней");
        Transaction transaction = new Transaction(trader, 9999);
        FraudDetectorCity fraudDetectorCity = new FraudDetectorCity();
        boolean result = fraudDetectorCity.fraud(transaction);
        check(result, true, "testCity1");
    }

    void testCity2() {
        Trader trader = new Trader("abc", "New York");
        Transaction transaction = new Transaction(trader, 9999);
        FraudDetectorCity fraudDetectorCity = new FraudDetectorCity();
        boolean result = fraudDetectorCity.fraud(transaction);
        check(result, false, "testCity2");
    }

    void testCountry1() {
        Trader trader = new Trader("abc", "Riga", "Ямайка");
        Transaction transaction = new Transaction(trader, 9999);
        FraudDetectorCountry fraudDetectorCountry = new FraudDetectorCountry();
        boolean result = fraudDetectorCountry.fraud(transaction);
        check(result, true, "testCountry1");
    }

    void testCountry2() {
        Trader trader = new Trader("abc", "Riga", "USA");
        Transaction transaction = new Transaction(trader, 9999);
        FraudDetectorCountry fraudDetectorCountry = new FraudDetectorCountry();
        boolean result = fraudDetectorCountry.fraud(transaction);
        check(result, false, "testCountry2");
    }

    void testAll1() {
        Trader trader = new Trader("abc", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectorCountryAndAmount fraudDetectorCountryAndAmount = new FraudDetectorCountryAndAmount();
        boolean result = fraudDetectorCountryAndAmount.fraud(transaction);
        check(result, true, "testAll1");
    }

    void testAll2() {
        Trader trader = new Trader("abc", "Berlin", "USA");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectorCountryAndAmount fraudDetectorCountryAndAmount = new FraudDetectorCountryAndAmount();
        boolean result = fraudDetectorCountryAndAmount.fraud(transaction);
        check(result, false, "testAll2");
    }

    void testAll3() {
        Trader trader = new Trader("abc", "Berlin", "Германия");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectorCountryAndAmount fraudDetectorCountryAndAmount = new FraudDetectorCountryAndAmount();
        boolean result = fraudDetectorCountryAndAmount.fraud(transaction);
        check(result, false, "testAll3");
    }


    void check(boolean result, boolean expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
