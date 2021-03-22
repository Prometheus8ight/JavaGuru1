package students.julija_katukova.lesson_9.level_7.task_34;

abstract class WinningRule {

    private String ruleName;

    public WinningRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isWin(char[][] field, char playerToCheck);

}
