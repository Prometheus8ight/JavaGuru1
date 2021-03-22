package students.kate_br.lesson_9.level_1.task_4;

import java.util.Scanner;

class SafeDemo {

     public static void main(String[] args) {
         Safe safe = new Safe();

         Scanner scanner = new Scanner(System.in);
         System.out.print("Please enter pin: ");
         safe.pinCode = scanner.nextInt();
         System.out.println("Your account balance: " + safe.money);


     }
}
