package students.alex_kalashnikov.lesson_13.level_4.all_tasks;

class GameOfLifeConsoleUI {

    public void show(boolean[][] field) {
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                counter++;
                if (counter % 11 == 0) {
                    counter = 1;
                    System.out.println("");
                }
                if (!field[i][j]) {
                    System.out.print("." + "  ");
                } else {
                    System.out.print("X" + "  ");
                }
            }
        }
        System.out.println("");
        System.out.println("");
    }

}