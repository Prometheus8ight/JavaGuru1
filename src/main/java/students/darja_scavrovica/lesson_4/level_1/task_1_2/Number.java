package students.darja_scavrovica.lesson_4.level_1.task_1_2;

import java.util.Scanner;

class Number {
  public static void main(String[] args) {


   System.out.println("Напишите любое целое число = ");

   Scanner scanner = new Scanner(System.in);
   int number = scanner.nextInt();

   if (number > 0) {
       System.out.println("Ваше число положительное");}

        else if (number < 0) {
           System.out.println("Ваше число отрицательное");
       }

       else {System.out.println("Ваше число равно 0");}
   }
}
