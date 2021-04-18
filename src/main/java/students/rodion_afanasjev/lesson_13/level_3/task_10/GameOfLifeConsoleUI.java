package students.rodion_afanasjev.lesson_13.level_3.task_10;

class GameOfLifeConsoleUI {
    public void show(boolean[][] field){

        for (boolean[] booleans : field) {
            for (boolean aBoolean : booleans) {
                if (!aBoolean)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
