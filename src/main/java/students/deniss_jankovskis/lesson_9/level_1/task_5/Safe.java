package students.deniss_jankovskis.lesson_9.level_1.task_5;

public class Safe {

    private int password;
    private int money;

    public Safe(int password, int money) {
        this.password = password;
        this.money = money;
    }

    public boolean checkPassword(int password) {
        if (password == this.password) {
            return true;
        } else {
            System.out.println("Incorrect PIN number! Please try again");
            return false;
        }
    }

    public void putMoney(int password, int money) {
        if (checkPassword(password)) {
            this.money += money;
        } else {
            System.out.println("Incorrect PIN number! Please try again");
        }
    }

    public void getMoney(int password, int money) {
        if (checkPassword(password) && money <= this.money) {
            this.money -= money;
        } else if (checkPassword(password) && money > this.money) {
            System.out.println("There is not enough money");
        } else {
            System.out.println("Incorrect PIN number! Please try again");
        }
    }

    @Override
    public String toString() {
        return "Safe{" +
                "money = " + money +
                ", password = " + password +
                '}';
    }
}
