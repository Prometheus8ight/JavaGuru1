package students.alex_kalashnikov.lesson_3.level_4.task_17;

class DemoBankAccount {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
        String ownerLastName = bankAccount.getOwnerLastName();  // исправлено на ownerLastName.
        int moneyAmount = bankAccount.getMoneyAmount();     // неверный тип данных - должно быть int.
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
