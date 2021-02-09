package students.kate_br.lesson_3.level_4.task_17;

 class BankAccountDemo {

     public static void main(String[] args) {

         BankAccount bankAccount = new BankAccount("Viktor", "Savonin", "100000");
         String ownerFirstName = bankAccount.getOwnerFirstName();
         String ownerLastName = bankAccount.getOwnerLastName();
         String moneyAmount = bankAccount.getMoneyAmount();

         System.out.println("Owner First Name = " + ownerFirstName);
         System.out.println("Owner Last Name = " + ownerLastName);
         System.out.println("Money Amount = " + moneyAmount);
     }
}
