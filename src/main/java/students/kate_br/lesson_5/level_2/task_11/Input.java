package students.kate_br.lesson_5.level_2.task_11;

import java.util.Scanner;

class Input {

     public static void main(String[] args) {
         int[] numbers = new int[3];

         Scanner scanner = new Scanner(System.in);
         System.out.println("Please input your numbers");
         System.out.println("Number One: ");
         int a = scanner.nextInt();
         System.out.println("Number Two: ");
         int b = scanner.nextInt();
         System.out.println("Number Three: ");
         int c = scanner.nextInt();

         numbers[0] = a;
         numbers[1] = b;
         numbers[2] = c;

         System.out.println("First number is " + numbers[0]);
         System.out.println("Second number is " + numbers[1]);
         System.out.println("Third number is " + numbers[2]);


     }
}
