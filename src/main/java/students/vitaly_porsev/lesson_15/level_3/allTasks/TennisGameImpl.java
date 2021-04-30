package students.vitaly_porsev.lesson_15.level_3.allTasks;

public class TennisGameImpl implements TennisGame {

    @Override
    public void wonPoint(Player player) {
        player.setScorePoints(player.getScorePoints() + 1);
    }

    @Override
    public String score(Player player1, Player player2) {
        TennisConditions[] conditions = {new TennisCondition1(), new TennisCondition2(),
                new TennisCondition3()};

        for (TennisConditions condition : conditions) {
            if (condition.gameCondition(player1, player2).equals(player1.getPlayersName()) ||
                    condition.gameCondition(player1, player2).equals(player2.getPlayersName())) {
                return condition.print(player1, player2);
            }
        }

        return returnScore(player1.getScorePoints()) + " - " + returnScore(player2.getScorePoints());

    }

    private String returnScore(int point) {
        return switch (point) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> String.valueOf(point);
        };
    }
}
