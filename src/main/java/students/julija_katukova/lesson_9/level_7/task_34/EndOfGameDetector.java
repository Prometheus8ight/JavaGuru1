package students.julija_katukova.lesson_9.level_7.task_34;

class EndOfGameDetector {

    public boolean isEndOfTheGame(char[][] field) {
        WinningRule[] winningRules = initializeArray();
        WinningDetector winningDetector = new WinningDetector(winningRules);
        DrawDetector drawDetector = new DrawDetector(winningRules);
        if (winningDetector.isWinForPlayer(field, 'R')) {
            System.out.println("Red player WIN!");
            return true;
        }
        if (winningDetector.isWinForPlayer(field, 'Y')) {
            System.out.println("Yellow player WIN!");
            return true;
        }
        if (drawDetector.isDraw(field)) {
            System.out.println("DRAW!");
            return true;
        }
        return false;
    }

    private WinningRule[] initializeArray() {
        return new WinningRule[]{
                new WinningRuleForVerticals("Winning Rule For Verticals"),
                new WinningRuleForHorizontals("Winning Rule For Horizontals"),
                new WinningRuleForDiagonalFromLeftCorner("Winning Rule For Diagonal From Left Corner"),
                new WinningRuleForDiagonalFromRightCorner("Winning Rule For Diagonals From Right Corner")
        };
    }
}
