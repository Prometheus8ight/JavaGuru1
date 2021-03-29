package students.rodion_afanasjev.lesson_9.level_1.task_5;

class Safe {

    private int pinCode;
    private int moneyAmount;

    Safe(int pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public boolean pinCheck(int pin) { // Если пин совпадает с этим пином
        return pin == pinCode;
    }

    void putMoney(int pin, int moneyAmount) {
        if (pinCheck(pin)) { // проверка на пин
            this.moneyAmount += moneyAmount; // добавить на счет
        } else {
            System.out.println("Wrong pin");
        }
    }

    void getMoney(int pin, int moneyAmount) {
        if (pinCheck(pin) && moneyAmount <= this.moneyAmount) { // Если хватает денег
            this.moneyAmount -= moneyAmount; // списывает деньги со счета
        } else if (pinCheck(pin) && moneyAmount > this.moneyAmount) { // Ксли денег не хватает
            System.out.println("Not enough money");
        } else {
            System.out.println("Wrong pin");
        }
    }

    @Override
    public String toString() {
        return "Pin Code " + pinCode + ", Money amount " + moneyAmount + ".";
    }

}
