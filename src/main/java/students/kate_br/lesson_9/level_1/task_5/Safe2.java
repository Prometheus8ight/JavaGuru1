package students.kate_br.lesson_9.level_1.task_5;

import java.util.Scanner;

public class Safe2 {

    public String password;
    public double moneyAmount;

    public Safe2(String password, double moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

   public boolean passCheck(String pass){
       return pass == password;
   }

   public void setMoney(String pass, double money){
        if (passCheck(pass)){
            this.moneyAmount += money;
        }else {
            System.out.println("Password is wrong!");
        }
    }

    public void getMoney(String pass, double money){
        if (passCheck(pass) && money <= this.moneyAmount){
            this.moneyAmount -= money;
        }else if (passCheck(pass) && money > this.moneyAmount){
            System.out.println("Not enough money!");
        }else {
            System.out.println("Password is wrong!");
        }

    }

    @Override
    public String toString() {
        return "Your money amount is: " + moneyAmount;
    }
}
