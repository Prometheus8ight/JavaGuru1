package students.kate_br.lesson_4.level_1.task_4;

import java.util.Scanner;

class EvenOrOdd {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.print("Please input integer number: ");
         int num = scanner.nextInt();

         if(num % 2 == 0){
             System.out.println("Your number is even!");
         }else{
             System.out.println("Your number is odd!");
         }
     }

}
