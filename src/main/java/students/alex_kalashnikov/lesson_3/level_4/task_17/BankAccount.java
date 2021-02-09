package students.alex_kalashnikov.lesson_3.level_4.task_17;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                int moneyAmount) {      // пропущена запятая.
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;            // неверное название параметра и значения - должно быть moneyAmount.
    }

    String getOwnerFirstName() {      // пропущены круглые скобки.
        return this.ownerFirstName;   // пропущена точка с запятой.
    }

    String getOwnerLastName() {        // пропущены круглые скобки.
        return this.ownerLastName;    // неверное название параметра - должно быть ownerLastName. Пропущена точка с запятой.
    }

    int getMoneyAmount() {          // неверный тип данных - должен быть int.
        return this.moneyAmount;
    }

}
