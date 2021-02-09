package students.deniss_jankovskis.lesson_3.lesson_3_level_7;

import org.w3c.dom.ls.LSOutput;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;


    }

    String getMoney() {
        return this.owner;
    }


}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
