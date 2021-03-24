package instructor.lesson_10.message;

class MessageSupplierTest {

    public static void main(String[] args) {
        MessageSupplierTest runner = new MessageSupplierTest();
        runner.always_0_message();
        runner.always_1_message();
    }

    void always_0_message() {
        RandomGenerator randomGenerator = new MockRandomGenerator(0);
        MessageSupplier subject = new MessageSupplier(randomGenerator);

        Message expected = new Message("Кличко", "не каждый может смотреть в завтрашний день");
        Message actual = subject.getRandom();

        assertEqual(expected, actual);
    }

    void always_1_message() {
        RandomGenerator randomGenerator = new MockRandomGenerator(1);
        MessageSupplier subject = new MessageSupplier(randomGenerator);

        Message expected = new Message("Nike", "Just do it");
        Message actual = subject.getRandom();

        assertEqual(expected, actual);
    }

    private void assertEqual(Message expected, Message actual) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[FAIL]");
        }
    }
}
