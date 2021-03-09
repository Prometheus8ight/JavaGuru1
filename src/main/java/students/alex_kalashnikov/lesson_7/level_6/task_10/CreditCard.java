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

    private boolean checkPin() {
        boolean attemptCheck = true;
        int indicatedPin = 0;
        int attemptCounter = 0;
        do {
            indicatedPin = enterPin();
            if (indicatedPin != pin) {
                System.out.println("Wrong PIN! Please, reenter!");
                attemptCounter++;
            }
            if (attemptCounter == 3) {
                attemptCheck = false;
                break;
            }
        }
        while (indicatedPin != pin);
        return attemptCheck;
    }

    private int enterPin() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please, enter your PIN! ");
        int indicatedPin = scanner.nextInt();
        return indicatedPin;
    }

    private int enterAmount() {
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
        int requestLimit = 0;
        do {
            System.out.println("Please enter limit you wish to set: ");
            requestLimit = enterAmount();
            if (requestLimit > 1000 || requestLimit < 0) {
                System.out.println("Maximum limit is 1000! Please, enter amount from 0 to 1000!");
            }
        }
        while (requestLimit > 1000 || requestLimit < 0);
        creditLimit = requestLimit;
    }

    void deposit() {
        if (checkPin()) {
            System.out.println("Please enter money amount you wish to deposit: ");
            int deposit = enterAmount();
            if (deposit >= indebtedness) {
                balance = balance + (deposit - indebtedness);
                indebtedness = 0;
            } else {
                indebtedness = indebtedness - deposit;
            }
        } else {
            System.out.println("You had three incorrect PIN attempts! You are not allowed to deposit money!");
        }
    }

    void withdrawal() {
        if (checkPin()) {
            System.out.println("Please enter money amount you wish to withdraw: ");
            int withdrawal = enterAmount();
            if (withdrawal < 0) {
                withdrawal = 0;
            } else if (withdrawal > balance + (creditLimit - indebtedness)) {
                System.out.println("Not enough money!");
                withdrawal = 0;
            } else if (/*withdrawal >= balance &&*/ withdrawal <= balance + (creditLimit - indebtedness)) {
                indebtedness = indebtedness + withdrawal - balance;
                balance = 0;
            } else {
                balance = balance - withdrawal;
            }
        } else {
            System.out.println("You had three incorrect PIN attempts! You are not allowed to withdraw money!");
        }
    }
}