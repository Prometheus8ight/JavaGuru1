package students.kate_br.lesson_4.level_3.task_8;

import java.util.Scanner;

class ThreeNumbers {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the 1st number:");
         int num = scanner.nextInt();
         System.out.println("Enter the 2nd number:");
         int num2 = scanner.nextInt();
         System.out.println("Enter the 3rd number:");
         int num3 = scanner.nextInt();

         if(num == num2 && num2 == num3 && num3 == num){
             System.out.println("All numbers are equal!");
         }else if(num != num2 && num2 != num3 && num != num3){
             System.out.println("All numbers are different!");
         }else{
             System.out.println("Neither all are equal of different!");
         }


     }
}
