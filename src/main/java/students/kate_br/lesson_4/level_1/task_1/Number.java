package students.kate_br.lesson_4.level_1.task_1;

import java.util.Scanner;

class Number {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input your number please:");
         int x = scanner.nextInt();

         if(x > 0){
             System.out.println("You number is positive!");
         }else{
             System.out.println("Your number is negative!");
         }

         System.out.println("Well done!");
     }
}
