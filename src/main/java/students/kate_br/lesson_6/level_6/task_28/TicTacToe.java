package students.kate_br.lesson_6.level_6.task_28;

import java.util.Scanner;

class TicTacToe {

     public Move getNextMove(){

         Scanner scanner = new Scanner(System.in);
         System.out.println("Please input coordinates: ");
         int x = scanner.nextInt();
         int y = scanner.nextInt();
         return new Move(x, y);


     }
}
