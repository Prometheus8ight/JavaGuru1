package students.alex_kalashnikov.lesson_13.level_4.all_tasks;

class GameOfLifeRandomFieldGenerator {

    public boolean[][] generate(int length) {
        int random = 1 + (int) (Math.random() * 0);
        switch (random) {
            case 1:
                return generateGlider(length);
            case 2:
                return generateBeacon(length);
            default:
                return generateBlock(length);
        }
    }

    private boolean[][] generateBlock(int length) {
        boolean[][] field = new boolean[length][length];
        int a = (int) (Math.random() * (field.length - 1));
        int b = (int) (Math.random() * (field.length - 1));
        field[a][b] = true;
        field[a][b + 1] = true;
        field[a + 1][b] = true;
        field[a + 1][b + 1] = true;
        System.out.println("PATTERN: BLOCK");
        return field;
    }

    private boolean[][] generateGlider(int length) {
        boolean[][] field = new boolean[length][length];
        int a = (int) (Math.random() * (field.length - 2));
        int b = 2 + (int) (Math.random() * (field.length - 2));
        field[a][b] = true;
        field[a + 1][b - 2] = true;
        field[a + 1][b] = true;
        field[a + 2][b - 1] = true;
        field[a + 2][b] = true;
        System.out.println("PATTERN: GLIDER");
        return field;
    }

    private boolean[][] generateBeacon(int length) {
        boolean[][] field = new boolean[length][length];
        int a = (int) (Math.random() * (field.length - 3));
        int b = (int) (Math.random() * (field.length - 3));
        field[a][b] = true;
        field[a][b + 1] = true;
        field[a + 1][b] = true;
        field[a + 1][b + 1] = true;
        field[a + 2][b + 2] = true;
        field[a + 2][b + 3] = true;
        field[a + 3][b + 2] = true;
        field[a + 3][b + 3] = true;
        System.out.println("PATTERN: BEACON");
        return field;
    }

}