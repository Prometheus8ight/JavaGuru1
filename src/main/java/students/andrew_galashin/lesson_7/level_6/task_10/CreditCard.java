package students.andrew_galashin.lesson_7.level_6.task_10;

class CreditCard {

    private String cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int debt;

    public CreditCard(String cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    void deposite(int pinCode, int deposit) {
        if (comparePinCode(pinCode)) {
            moneyToDeposite(deposit);
        }
    }

    private void moneyToDeposite(int deposite) {
        if (deposite <= this.debt) {
            this.debt = deposite - this.debt;
        } else if (debt == 0) {
            this.balance = deposite + this.balance;
        } else {
            this.balance = this.balance + deposite - this.debt;
            this.debt = 0;
        }
    }

    void moneyWithdraw(int withdraw) {
        if (withdraw > this.balance) {
            if (withdraw > this.balance + creditLimit) {
                System.out.println("Лимит превышен!");
            } else {
                this.debt = this.debt + (withdraw - this.balance);
                this.balance = 0;
            }
        } else {
            this.balance = this.balance - withdraw;
        }
    }

    void withdraw(int pinCode, int withdraw) {
        if (comparePinCode(pinCode)) {
            moneyWithdraw(withdraw);
        }
    }

    private boolean comparePinCode(int pinCode) {
        if (pinCode == this.pinCode) {
            return true;
        } else {
            System.out.println("Пин код неверный!");
            return false;
        }
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    int getBalance() {
        return balance;
    }

    int getLoanDebt() {
        return debt;
    }
}

