package students.julija_katukova.lesson_9.level_7.task_34;

class DrawDetector {

    private final WinningRule[] winningRules;

    DrawDetector(WinningRule[] winningRules) {
        this.winningRules = winningRules;
    }

    public boolean isDraw(char[][] field) {
        WinningDetector winningDetector = new WinningDetector(winningRules);
        return !winningDetector.isWin(field) && !isEmptySpots(field);
    }

    private boolean isEmptySpots(char[][] field) {
        char emptyToCheck = '.';
        for (char[] chars : field) {
            for (int aChar : chars) {
                if (aChar == emptyToCheck) {
                    return true;
                }
            }
        }
        return false;
    }


}
