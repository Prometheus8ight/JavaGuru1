package students.nikita_bunevich.lesson_9.level_1.task_5;

class Safe {
    private int password;
    private double balance;

    public Safe(int password, double balance) {
        this.password = password;
        this.balance = balance;
    }

    public void getMoney(int password, double withdrawAmount) {
        if (this.password == password) {
            if (withdrawAmount <= this.balance) {
                this.balance = this.balance - withdrawAmount;
            } else {
                System.out.println("Your balance is too low");
            }
        } else {
            System.out.println("Incorrect password");
        }
    }

    public void putMoney(int password, double depositAmount) {
        if (this.password == password) {
            this.balance = this.balance + depositAmount;
        } else {
            System.out.println("Incorrect password");
        }
    }

    public void printAccountBalance() {
        System.out.println("Your current balance is " + balance);
    }
}

