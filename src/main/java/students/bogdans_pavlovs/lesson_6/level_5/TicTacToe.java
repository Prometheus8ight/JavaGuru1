package students.bogdans_pavlovs.lesson_6.level_5;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        for (int i = 0; i < field.length; i++) {
            int count = 0;

            for (int j = 0; j < field[i].length; j++) {

                if (field[i][j] == playerToCheck) {

                    count++;
                    if (count == 3) {

                        return true;

                    }
                }
            }
        }

        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        for (int i = 0; i < field.length; i++) {
            int count = 0;

            for (int j = 0; j < field[i].length; j++) {

                if (field[j][i] == playerToCheck) {

                    count++;
                    if (count == 3) {

                        return true;

                    }
                }
            }
        }

        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        int count = 0;

        for (int i = 0; i < field.length; i++) {

            if (field[i][i] == playerToCheck) {

                count++;
                if (count == 3) {

                    return true;

                }
            }

        }

        return field[0][2] == playerToCheck && field[1][1] == playerToCheck && field[2][0] == playerToCheck;
    }


    public boolean isWinPosition(int[][] field, int playerToCheck){

        return (isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck));

    }

    public boolean isDrawPosition(int[][] field){

        if (!isWinPosition(field, 0) && !isWinPosition(field, 1)) {

            return isFull(field);
        }

        return false;
    }

    public boolean isFull(int[][] field){

        for (int i = 0; i < field.length; i++){

            for (int j = 0; j < field.length; j++){

                if (field[i][j] == -1){
                    return false;
                }
            }


        }
        return true;

    }


}