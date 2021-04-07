package instructor.lesson_12.debit;

class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(int balance, int amount) {
        super("Cannot withdraw '" + amount + "' from '" + balance + "' balance");
    }
}

class IncorrectPinException extends RuntimeException {

    public IncorrectPinException() {
        super("Entered PIN code is incorrect!");
    }
}

class DebitCard {

    private int pin;
    private int balance;

    public DebitCard(int pin) {
        this.pin = pin;
    }

    void deposit(int pin, int amount) {
        if (pin != this.pin) {
            throw new IncorrectPinException();
        }

        balance += amount;
    }

    void withdraw(int pin, int amount) {
        if (pin != this.pin) {
            throw new IncorrectPinException();
        }

        if (balance < amount) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
    }
}
