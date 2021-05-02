package students.rodion_afanasjev.lesson_15.level_3.task_10;

class TennisGameImp implements TennisGame {

    @Override
    public void wonPoint(Player player) {
        player.setScorePoints(player.getScorePoints() + 1);
    }

    @Override
    public String score(Player player1, Player player2) {
        if (player1.getScorePoints() == player2.getScorePoints() && player1.getScorePoints() >= 3) {
            return "Deuce";
        } else if (player1.getScorePoints() >= 4 && player2.getScorePoints() == player1.getScorePoints() - 2) {
            return winPrint(player1.getPlayerName());
        } else if (player2.getScorePoints() >= 4 && player1.getScorePoints() == player2.getScorePoints() - 2) {
            return winPrint(player2.getPlayerName());
        } else if (player1.getScorePoints() >= 3 && player2.getScorePoints() >= 3 && player1.getScorePoints() == player2.getScorePoints() + 1) {
            return advantagePrint(player1.getPlayerName());
        } else if (player2.getScorePoints() >= 3 && player1.getScorePoints() >= 3 && player2.getScorePoints() == player1.getScorePoints() + 1) {
            return advantagePrint(player2.getPlayerName());
        }
        return scorePrint(player1, player2);
    }

    private String winPrint(String player) {
        return "Win for " + player;
    }

    private String advantagePrint(String player) {
        return "Advantage for " + player;
    }

    private String scorePrint(Player player1, Player player2) {
        return scoreConvert(player1.getScorePoints()) + " - " + scoreConvert(player2.getScorePoints());
    }

    private String scoreConvert(int scorePoints) {
        return switch (scorePoints) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> String.valueOf(scorePoints);
        };
    }

}
