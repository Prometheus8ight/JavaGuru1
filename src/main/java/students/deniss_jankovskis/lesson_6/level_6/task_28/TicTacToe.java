package students.deniss_jankovskis.lesson_6.level_6.task_28;

import java.util.Scanner;

class TicTacToe {

    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter X for your move: ");
        int x = scanner.nextInt();
        System.out.println("Please enter Y for your move: ");
        int y = scanner.nextInt();

        Move move = new Move(x, y);
        return move;
    }


}
