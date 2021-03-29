package students.darja_scavrovica.lesson_4.level_1.task_4;

import java.util.Scanner;

class EvenNumbers {
     public static void main(String[] args) {
         System.out.println("Напишите любое целое число = ");

         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();

         if (number % 2==0 ) {
             System.out.println("Ваше число четное");}

         else {System.out.println("Ваше число не четное");}

     }
}
