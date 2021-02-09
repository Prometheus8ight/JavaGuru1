package students.alex_kalashnikov.lesson_3.level_7.task_31;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {  // должны быть параметры String owner, int money
        this.owner = owner;
        this.money = money; // не было строки
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
