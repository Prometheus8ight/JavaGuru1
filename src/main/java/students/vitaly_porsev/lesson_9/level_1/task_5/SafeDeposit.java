package students.vitaly_porsev.lesson_9.level_1.task_5;

public class SafeDeposit {

    private int password;
    private int money;

    public SafeDeposit(int password, int money) {
        this.password = password;
        this.money = money;
    }

    private boolean comparePassword(int pass) {
        return pass == password;
    }

    void putMoney(int pass, int money) {
        if (comparePassword(pass)) {
            this.money += money;
        } else {
            System.out.println("Вы ввели неправильный пароль!");
        }
    }

    void getMoney(int pass, int money) {
        if (comparePassword(pass) && money <= this.money) {
            this.money -= money;
        } else if (comparePassword(pass) && money > this.money) {
            System.out.println("У вас недостаточно средств. Вам доступно: " + this.money);
        } else {
            System.out.println("Вы ввели неправильный пароль");
        }
    }

    @Override
    public String toString() {
        return "SafeDeposit{" +
                "money = " + money +
                ", password = " + password +
                '}';
    }
}