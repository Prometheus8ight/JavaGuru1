package students.julija_katukova.lesson_9.level_7.task_34;

class WinningRuleForHorizontals extends WinningRule {

    public WinningRuleForHorizontals() {
        super("Winning Rule For Horizontals");
    }

    @Override
    public boolean isWin(char[][] field, char playerToCheck) {
        for (char[] chars : field) {
            for (int col = 0; col < chars.length - 3; col++) {
                if (chars[col] == playerToCheck &&
                        chars[col + 1] == playerToCheck &&
                        chars[col + 2] == playerToCheck &&
                        chars[col + 3] == playerToCheck) {
                    return true;
                }
            }
        }
        return false;
    }
}
