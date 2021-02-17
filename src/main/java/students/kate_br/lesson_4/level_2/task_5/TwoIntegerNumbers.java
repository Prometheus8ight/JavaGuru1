package students.kate_br.lesson_4.level_2.task_5;

import java.util.Scanner;

class TwoIntegerNumbers {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input your first number:");
         int x = scanner.nextInt();
         System.out.println("Input your second number:");
         int y = scanner.nextInt();

         if(x > y){
             System.out.println("Your number is " + x);
         }else{
             System.out.println("Your number is too small");
         }

         System.out.println("Good job!");
     }
}
