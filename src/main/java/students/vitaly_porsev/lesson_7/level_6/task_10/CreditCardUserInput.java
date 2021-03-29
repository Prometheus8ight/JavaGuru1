package students.vitaly_porsev.lesson_7.level_6.task_10;

import java.util.Scanner;

class CreditCardUserInput {

    private String cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int loanDebt;


    public CreditCardUserInput(String cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    void checkCreditCard() {
        System.out.println("На вашем счету: " + this.balance + ". Ваша задолжность: " + this.loanDebt +
                ". Ваш кредитный лимит: " + this.creditLimit + ".");
    }

    void deposit() {
        int moneyToDeposit = moneyToDeposit();
        if (moneyToDeposit <= this.loanDebt) {
            this.loanDebt -= moneyToDeposit;
        } else if (loanDebt == 0) {
            this.balance += moneyToDeposit;
        } else {
            this.balance += (moneyToDeposit - this.loanDebt);
            this.loanDebt = 0;
        }
    }

    void withdraw() {
        int moneyToWithdraw = moneyToWithdraw();
        if (moneyToWithdraw > this.balance) {
            if (moneyToWithdraw > this.balance + creditLimit) {
                System.out.println("Ваш кредитный лимит превышен! Операция отменена!");
            } else {
                this.loanDebt += (moneyToWithdraw - this.balance);
                this.balance = 0;
            }
        } else {
            this.balance -= moneyToWithdraw;
        }
    }

    private int moneyToWithdraw() {
        int money = 0;
        if (comparePinCode()) {
            money = enterWithdrawMoney();
        }
        return money;
    }

    private int enterWithdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        int withdraw = 0;
        boolean trueOrNot = false;
        do {
            System.out.println("На вашем счету: " + this.balance + ". Введите сумму для снятия денег: ");
            withdraw = scanner.nextInt();
            if (withdraw > 0) {
                trueOrNot = true;
            }
        } while (!trueOrNot);
        return withdraw;
    }

    private int moneyToDeposit() {
        int money = 0;
        if (comparePinCode()) {
            money = enterDepositMoney();
        }
        return money;
    }

    private int enterDepositMoney() {
        Scanner scanner = new Scanner(System.in);
        int deposit = 0;
        boolean trueOrNot = false;
        do {
            System.out.println("На вашем счету: " + this.balance + ". Введите сумму для зачисления: ");
            deposit = scanner.nextInt();
            if (deposit > 0) {
                trueOrNot = true;
            }
        } while (!trueOrNot);
        return deposit;
    }

    private boolean comparePinCode() {
        if (enterPinCode() == this.pinCode) {
            return true;
        } else {
            System.out.println("Вы ввели неправильный пин-код!");
            return false;
        }
    }

    private int enterPinCode() {
        Scanner scanner = new Scanner(System.in);
        int pinCode = 0;
        boolean pin = false;
        do {
            System.out.println("Введите пин-код: ");
            pinCode = scanner.nextInt();
            if (pinCode > 999 && pinCode <= 9999) {
                pin = true;
            }
        } while (!pin);
        return pinCode;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setLoanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
    }

    public int getBalance() {
        return balance;
    }

    public int getLoanDebt() {
        return loanDebt;
    }
}