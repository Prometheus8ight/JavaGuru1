package students.kate_br.lesson_4.level_1.task_2;

import java.util.Scanner;

class OneMoreNumberClass {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input your number please:");
         int x = scanner.nextInt();

         if(x > 0) {
             System.out.println("Your number is positive!");
         }
             if(x < 0){
                 System.out.println("Your number is negative!");
             }

             if(x == 0){
                 System.out.println("Your number is 0!");
             }


         System.out.println("Well done!");
     }
}
