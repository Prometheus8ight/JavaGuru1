package students.julija_katukova.lesson_9.level_7.task_34;

class WinningRuleForDiagonalFromLeftCorner extends WinningRule {

    public WinningRuleForDiagonalFromLeftCorner(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isWin(char[][] field, char playerToCheck) {
        for(int row = 0; row < field.length - 3; row++){
            for(int col = 0; col < field[0].length - 3; col++){
                if (field[row][col] == playerToCheck   &&
                        field[row+1][col+1] == playerToCheck &&
                        field[row+2][col+2] == playerToCheck &&
                        field[row+3][col+3] == playerToCheck){
                    return true;
                }
            }
        }
        return false;
    }
}
