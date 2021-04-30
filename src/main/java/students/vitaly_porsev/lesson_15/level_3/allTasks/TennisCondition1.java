package students.vitaly_porsev.lesson_15.level_3.allTasks;

public class TennisCondition1 implements TennisConditions {

    @Override
    public String gameCondition(Player player1, Player player2) {
        String print = "";

        if (player1.getScorePoints() >= 4 && player2.getScorePoints() == player1.getScorePoints() - 2) {
            print = player1.getPlayersName();
        }

        if (player2.getScorePoints() >= 4 && player1.getScorePoints() == player2.getScorePoints() - 2) {
            print = player2.getPlayersName();
        }
        return print;
    }

    public String print(Player player1, Player player2) {
        return "Win for " + gameCondition(player1, player2);
    }
}
