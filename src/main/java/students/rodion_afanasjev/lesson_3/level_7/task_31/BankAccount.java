package students.rodion_afanasjev.lesson_3.level_7.task_31;

class BankAccount {


    static int money;
    static String owner;

    BankAccount(String owner,int money) {
        BankAccount.owner = owner;
        BankAccount.money = money;
    }

    String getOwner() {
        return owner;
    }

    String getMoney() {
        return Integer.toString(money);
    }

    static class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", 100000);
            String ownerFirstName = bankAccount.getOwner();
            String moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " + owner);
            System.out.println("Money = " + money);
        }
    }
}
