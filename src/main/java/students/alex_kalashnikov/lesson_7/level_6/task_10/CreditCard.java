package students.alex_kalashnikov.lesson_7.level_6.task_10;

class CreditCard {

    private long cardNumber;
    private int pin;
    private int balance;
    private int creditLimit;
    private int indebtedness;

    public CreditCard(long cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    boolean checkPin() {
        boolean x = true;
        while (x) {
            int indicatedPin = enterPin();
            if (indicatedPin != pin) {
                System.out.println("Wrong PIN! Please, reenter!");
            } else {
                x = false;
            }
        }
        return true;
    }

    int enterPin() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please, enter your PIN! ");
        int indicatedPin = scanner.nextInt();
        return indicatedPin;
    }

    int enterAmount() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please, enter money amount! ");
        int money = scanner.nextInt();
        return money;
    }

    void showBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    void showCreditLimit() {
        System.out.println("Your current credit limit is: " + creditLimit);
    }

    void showIndebtedness() {
        System.out.println("Your current indebtedness is: " + indebtedness);
    }

    void setCreditLimit() {
        boolean x = true;
        while (x) {
            System.out.println("Please enter limit you wish to set: ");
            int requestLimit = enterAmount();
            if (requestLimit > 1000 || requestLimit < 0) {
                System.out.println("Maximum limit is 1000! Please, enter amount from 0 to 1000!");
            } else {
                creditLimit = requestLimit;
                x = false;
            }
        }
    }

    void deposit() {
        boolean x = true;
        checkPin();
        System.out.println("Please enter money amount you wish to deposit: ");
        int deposit = enterAmount();
        int netDeposit = deposit - indebtedness;
        if (netDeposit < 0) {
            netDeposit = 0;
        }
        balance = balance + netDeposit;
    }

    void withdrawal() {
        checkPin();
        System.out.println("Please enter money amount you wish to withdraw: ");
        int withdrawal = enterAmount();
        if (withdrawal < 0) {
            withdrawal = 0;
        } else if (withdrawal > balance + (creditLimit - indebtedness)) {
            System.out.println("Not enough money!");
            withdrawal = 0;
        } else if (withdrawal > balance && withdrawal < balance + (creditLimit - indebtedness)) {
            indebtedness = withdrawal - balance;
            balance = 0;
        } else {
            balance = balance - withdrawal;
        }
    }

}