package students.kate_br.lesson_4.level_2.task_7;

import java.util.Scanner;

class EqualsAndDifferentNumbers {

       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first integer number:");
        int x = scanner.nextInt();
        System.out.println("Input your second integer number:");
        int y = scanner.nextInt();

        if(x == y){
         System.out.println("Numbers are equals!");
        }else{
         System.out.println("Numbers are different!");
        }

  }
 }
