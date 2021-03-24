package students.julija_katukova.lesson_9.level_1.task_5;

class Safe {

    private int pin;
    private int balance;

    public Safe(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void getMoney(int pin, int withdrawAmount) {
        if (this.pin == pin) {
            if (withdrawAmount <= this.balance) {
                this.balance = this.balance - withdrawAmount;
            } else {
                System.out.println("Sorry, your balance is too low");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void putMoney(int pin, int depositAmount) {
        if (this.pin == pin) {
            this.balance = this.balance + depositAmount;
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void printAccountBalance() {
        System.out.println("Your current balance is " + balance);
    }
}
