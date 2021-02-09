package students.kate_br.lesson_3.level_4.task_17;

 class BankAccount {

     String ownerFirstName;
     String ownerLastName;
     String  moneyAmount;

     BankAccount(String ownerFirstName, String ownerLastName, String moneyAmount){
         this.ownerFirstName = ownerFirstName;
         this.ownerLastName = ownerLastName;
         this.moneyAmount = moneyAmount;
     }

     String getOwnerFirstName(){
         return this.ownerFirstName;
     }

     String getOwnerLastName(){
         return this.ownerLastName;
     }

     String getMoneyAmount(){
          int moneyAmount;
         return this.moneyAmount;
     }
}
