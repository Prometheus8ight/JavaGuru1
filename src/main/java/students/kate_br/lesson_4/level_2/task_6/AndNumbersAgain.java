package students.kate_br.lesson_4.level_2.task_6;


import java.util.Scanner;

class AndNumbersAgain {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the first number:");
         int x = scanner.nextInt();
         System.out.println("Enter the second number:");
         int y = scanner.nextInt();

         if(x < y){
             System.out.println("Your number is " + x);
             System.out.println("Well done!");
         }else{
             System.out.println("Your number is too big!");
         }


     }
}
