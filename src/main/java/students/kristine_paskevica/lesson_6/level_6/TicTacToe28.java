package students.kristine_paskevica.lesson_6.level_6;

import java.util.Scanner;

class TicTacToe28 {

     public Move getNextMove() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ievadiet 2 koordinātes: ");
         int pirmaKoord = scanner.nextInt();
         int otraKoord = scanner.nextInt();
         return new Move(pirmaKoord, otraKoord);
     }
}
