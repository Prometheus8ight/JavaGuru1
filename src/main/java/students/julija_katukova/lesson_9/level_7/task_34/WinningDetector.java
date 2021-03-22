package students.julija_katukova.lesson_9.level_7.task_34;

class WinningDetector {

    private final WinningRule[] winningRules;

    public WinningDetector(WinningRule[] winningRules) {
        this.winningRules = winningRules;
    }

    public boolean isWin(char[][] field) {
        return isWinForPlayer(field, 'R') ||
                isWinForPlayer(field, 'Y');
    }

    public boolean isWinForPlayer(char[][] field, char playerToCheck) {
        for (WinningRule winningRule : winningRules) {
            if (winningRule.isWin(field, playerToCheck)) {
                return true;
            }
        }
        return false;
    }
}
