package students.julija_katukova.lesson_9.level_7.task_34;

class ConnectFour { // 2 players: red and yellow
    private final char[][] field = new char[6][7]; // field with 6 rows and 7 columns

    public static void main(String[] args) {

        ConnectFour connectFour = new ConnectFour();
        GameLogic game = new GameLogic(connectFour.field);
        game.play();
    }
}
