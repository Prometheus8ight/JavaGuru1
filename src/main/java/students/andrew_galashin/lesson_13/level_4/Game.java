package students.andrew_galashin.lesson_13.level_4;

import java.util.concurrent.TimeUnit;

class Game {
    private UI ui = new UI();
    private RandomBoard randomBoard = new RandomBoard();
    private GameOfLifeNextGenerationCalculator play = new GameOfLifeNextGenerationCalculator();

    public void start() {
        boolean[][] board = randomBoard.generate(10, 10);
        while (true) {
            ui.show(board);
            sleep(5);
            board = play.calculate(board);
        }
    }

    private void sleep(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException x) {
            System.out.println("Exception occurred");
            System.out.println(1);
        }

    }

}
