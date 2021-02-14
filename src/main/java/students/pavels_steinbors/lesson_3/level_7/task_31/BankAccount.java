package students.pavels_steinbors.lesson_3.level_7.task_31;

class BankAccount {
    String owner;
    int money;

    BankAccount(String ownerFirstName, int moneyAmount) {
        this.owner = ownerFirstName;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return String.valueOf(this.money);
    }
}

