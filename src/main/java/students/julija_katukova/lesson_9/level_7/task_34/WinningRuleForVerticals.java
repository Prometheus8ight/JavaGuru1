package students.julija_katukova.lesson_9.level_7.task_34;

class WinningRuleForVerticals extends WinningRule {

    public WinningRuleForVerticals(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isWin(char[][] field, char playerToCheck) {
        for(int row = 0; row < field.length - 3; row++){
            for(int col = 0; col < field[0].length; col++){
                if (field[row][col] == playerToCheck   &&
                        field[row+1][col] == playerToCheck &&
                        field[row+2][col] == playerToCheck &&
                        field[row+3][col] == playerToCheck){
                    return true;
                }
            }
        }
        return false;
    }
}
