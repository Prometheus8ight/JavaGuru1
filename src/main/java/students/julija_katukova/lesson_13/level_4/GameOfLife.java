package students.julija_katukova.lesson_13.level_4;

import java.util.concurrent.TimeUnit;

class GameOfLife {
    private final GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private final GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private final GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generate(10, 10);
        while(true) {
            ui.show(field);
            sleepForSeconds(5);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

}