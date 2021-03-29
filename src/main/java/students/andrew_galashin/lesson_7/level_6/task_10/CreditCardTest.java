package students.andrew_galashin.lesson_7.level_6.task_10;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest start = new CreditCardTest();
        start.testWithdraw();
        start.testDeposite();
        start.testDebt();
        start.testDebtZero();
    }


    void testWithdraw() {
        CreditCard start = new CreditCard("8474 1235 5647 9390", 1122);
        int expected = 50;
        start.setBalance(100);
        start.withdraw(1122, 50);
        check(expected, start.getBalance(), "takeOffTest");
    }

    void testDeposite() {
        CreditCard start = new CreditCard("8474 1235 5647 9390", 1122);
        int expected = 100;
        start.setBalance(50);
        start.deposite(1122, 50);
        check(expected, start.getBalance(), "depositeTest");
    }

    void testDebt() {
        CreditCard start = new CreditCard("8474 1235 5647 9390", 1122);
        int expected = 100;
        start.setBalance(200);
        start.setCreditLimit(100);
        start.withdraw(1122, 300);
        check(expected, start.getLoanDebt(), "debTest");
    }

    void testDebtZero() {
        CreditCard start = new CreditCard("8474 1235 5647 9390", 1122);
        int expected = 0;
        start.setBalance(200);
        start.setCreditLimit(100);
        start.withdraw(1122, 300);
        start.deposite(1122, 100);
        check(expected, start.getLoanDebt(), "debtZeroTest");
    }

    void check(int result, int expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
