package students.vitaly_porsev.lesson_7.level_6.task_10;

class CreditCard {

    private String cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int loanDebt;


    public CreditCard(String cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    void checkCreditCard() {
        System.out.println("На вашем счету: " + this.balance + ". Ваша задолжность: " + this.loanDebt +
                ". Ваш кредитный лимит: " + this.creditLimit + ".");
    }


    void deposit(int pinCode, int depositMoney) {
        if (comparePinCode(pinCode)) {
            moneyToDeposit(depositMoney);
        }
    }

    private void moneyToDeposit(int deposit) {
        if (deposit <= this.loanDebt) {
            this.loanDebt -= deposit;
        } else if (loanDebt == 0) {
            this.balance += deposit;
        } else {
            this.balance += (deposit - this.loanDebt);
            this.loanDebt = 0;
        }
    }

     void withdraw(int pinCode, int withdrawMoney) {
        if (comparePinCode(pinCode)) {
            moneyToWithdraw(withdrawMoney);
        }
    }

    private void moneyToWithdraw(int withdraw) {
        if (withdraw > this.balance) {
            if (withdraw > this.balance + creditLimit) {
                System.out.println("Ваш кредитный лимит превышен! Операция отменена!");
            } else {
                this.loanDebt += (withdraw - this.balance);
                this.balance = 0;
            }
        } else {
            this.balance -= withdraw;
        }
    }

    private boolean comparePinCode(int pinCode) {
        if (pinCode == this.pinCode) {
            return true;
        } else {
            System.out.println("Вы ввели неправильный пин-код!");
            return false;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getBalance() {
        return balance;
    }

    public int getLoanDebt() {
        return loanDebt;
    }
}