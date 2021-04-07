package instructor.lesson_12.debit;

class DebitCardApplication {

    public static void main(String[] args) {

        DebitCard card = new DebitCard(1234);
        card.deposit(1234, 50);
        card.deposit(2345, 10000);
        card.withdraw(1234, 70);

    }
}

class DebitCardTest {

    public static void main(String[] args) {
        DebitCardTest runner = new DebitCardTest();
        runner.incorrectPinOnDeposit();
    }

    void incorrectPinOnDeposit() {
        DebitCard subject = new DebitCard(1234);

        try {
            subject.deposit(2345, 1000);
            System.out.println("FAIL");
        } catch (IncorrectPinException ex) {
            System.out.println("OK");
        }
    }
}
