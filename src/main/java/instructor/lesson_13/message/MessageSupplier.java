package instructor.lesson_13.message;

class MessageSupplier {

    private final Message[] messages = {
            new Message("Кличко", "не каждый может смотреть в завтрашний день"),
            new Message("Nike", "Just do it"),
            new Message("Констнатин", "Я программист, а не биолог"),
            new Message("Президент", "Не каждый встретит рождество"),
            new Message("Денис", "В жизни каждого человека есть основной соперник. И это - он сам.")
    };

    // Dependency
    private final RandomGenerator randomGenerator;

    // Dependency Injection
    public MessageSupplier(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public Message getRandom() {
        return messages[randomGenerator.next(0, messages.length)];
    }
}
