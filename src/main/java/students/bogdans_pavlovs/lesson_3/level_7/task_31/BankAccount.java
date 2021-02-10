package students.bogdans_pavlovs.lesson_3.level_7.task_31;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() { return this.owner;
    }

    String getMoney() {
        return String.valueOf(money); //Подсказка: число можно преобразовать в строку 😉
    }


}
