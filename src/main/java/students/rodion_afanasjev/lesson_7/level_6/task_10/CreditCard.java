package students.rodion_afanasjev.lesson_7.level_6.task_10;

class CreditCard {

    private String cardNumber;
    private int pin;
    private int balance = 100;
    private int creditLimit = 50;
    private int debt = 50;

    public CreditCard(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public void setCreditLimit(int limit) {
        this.creditLimit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getDebt() {
        return debt;
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
        if (!pinCheck(pin)) {
            return;
        }
        if (deposit <= this.debt) {
            this.debt -= deposit;
        } else if (debt == 0) {
            this.balance += deposit;
        } else {
            this.balance += (deposit - this.debt);
            this.debt = 0;
        }
    }


    void withdraw(int pin, int withdraw) {
        if (!pinCheck(pin)) {
            return;
        }
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