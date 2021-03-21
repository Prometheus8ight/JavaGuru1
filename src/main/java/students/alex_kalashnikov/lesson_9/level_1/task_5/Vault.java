package students.alex_kalashnikov.lesson_9.level_1.task_5;

class Vault {

    private String password;
    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double amountMoney) {
        if (passwordCheck(this.password) && getMoney() + amountMoney >= 0) {
            money = money + amountMoney;
        }
    }

    private boolean passwordCheck(String password) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter password: ");
        String attempt = scanner.next();
        return attempt.equals(password);
    }

    public Vault(String password, double money) {
        this.password = password;
        this.money = money;
    }

}