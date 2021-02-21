package students.kate_br.lesson_4.level_3.task_10;

import java.util.Scanner;

class MaxNum {

     public static void main(String[] args) {
         System.out.println("Please input numbers");
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input 1st number: ");
         int num1 = scanner.nextInt();
         System.out.println("Input 2nd number: ");
         int num2 = scanner.nextInt();
         System.out.println("Input 3rd number: ");
         int num3 = scanner.nextInt();

         if (num1 > num2 && num1 > num3){
             System.out.println("Max number: " + num1);
         }else if (num2 > num1 && num2 > num3){
             System.out.println("Max number: " + num2);
         }else{
             System.out.println("Max number: " + num3);
         }


     }
}
