package students.kate_br.lesson_4.level_3.task_9;

import java.util.Scanner;


class IncDecNumbers {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input a 1st number:");
         int num = scanner.nextInt();
         System.out.println("Input a 2nd number:");
         int num2 = scanner.nextInt();
         System.out.println("Input a 3rd number:");
         int num3 = scanner.nextInt();

         if(num < num2 && num2 < num3 && num3 > num){
             System.out.println("Increasing");
         }else if(num > num2 && num2 > num3 && num3 < num){
             System.out.println("Decreasing");
         }else{
             System.out.println("Neither increasing or decreasing order");
         }

     }
}
