package students.rodion_afanasjev.lesson_7.level_6.task_10;

class CreditCard {

    private String cardNumber;
    private int pin;
    private int balance;
    private int creditLimit;
    private int debt;

    public CreditCard(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditLimit(int limit) {
        this.creditLimit = limit;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getBalance() {
        return balance;
    }

    boolean pinCheck(int pin) {
        if (pin == this.pin) {
            return true;
        } else {
            System.out.println("Wrong pin code.");
            return false;
        }
    }

    void deposit(int pin, int deposit) {
        if (pinCheck(pin)) {
            if (deposit <= this.debt) {
                this.debt -= deposit;
            } else if (debt == 0) {
                this.balance += deposit;
            } else {
                this.balance += (deposit - this.debt);
                this.debt = 0;
            }
        }
    }

    void withdraw(int pin, int withdraw) {
        if (pinCheck(pin)) {
            if (withdraw > this.balance) {
                if (withdraw > this.balance + creditLimit) {
                    System.out.println("Credit limit exceeded.");
                } else {
                    this.debt += (withdraw - this.balance);
                    this.balance = 0;
                }
            } else {
                this.balance -= withdraw;
            }
        }
    }
}