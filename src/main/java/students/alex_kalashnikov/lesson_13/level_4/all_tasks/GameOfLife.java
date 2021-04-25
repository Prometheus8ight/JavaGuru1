package students.alex_kalashnikov.lesson_13.level_4.all_tasks;

import java.util.concurrent.TimeUnit;

class GameOfLife {

    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generate(10);
        while (true) {
            ui.show(field);
            sleepForSeconds(700);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

}