package students.alex_kalashnikov.lesson_3.level_7.task_31;

class BankAccount {

    String owner;
    String money;


    BankAccount(String owner, int money) {  // должны быть параметры String owner, int money
        this.owner = owner;
        String money1 = String.valueOf(money);
        this.money = money1; // не было строки
    }


    String getOwner() {
        return this.owner;
    }


    String getMoney() {
        return this.money;
    }


}
