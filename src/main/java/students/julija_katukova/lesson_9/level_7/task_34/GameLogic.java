package students.julija_katukova.lesson_9.level_7.task_34;

class GameLogic {

    private char[][] field;

    public GameLogic(char[][] field) {
        this.field = field;
    }

    void play() {
        EndOfGameDetector endOfGameDetector = new EndOfGameDetector();
        GetNextMove getNextMove = new GetNextMove();
        FieldPreparation fieldPreparation = new FieldPreparation();
        DisplayField displayField = new DisplayField();

        char[][] field = fieldPreparation.createField(this.field);
        while (true) {

            displayField.printFieldToConsole(field);
            Move moveR = getNextMove.getNextMove();
            field[moveR.getRow()][moveR.getColumn()] = 'R';
            displayField.printFieldToConsole(field);

            if(endOfGameDetector.isEndOfTheGame(field)) {
                break;
            }

            displayField.printFieldToConsole(field);
            Move moveY = getNextMove.getNextMove();
            field[moveY.getRow()][moveY.getColumn()] = 'Y';
            displayField.printFieldToConsole(field);

            if(endOfGameDetector.isEndOfTheGame(field)) {
                break;
            }
        }
    }
}
