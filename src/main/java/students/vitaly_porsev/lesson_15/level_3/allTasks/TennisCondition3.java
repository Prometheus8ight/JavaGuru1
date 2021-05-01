package students.vitaly_porsev.lesson_15.level_3.allTasks;

public class TennisCondition3 implements TennisConditions {

    @Override
    public String gameCondition(Player player1, Player player2) {
        String print = "";

        if (player1.getScorePoints() >= 3 && player2.getScorePoints() >= 3
                && player1.getScorePoints() == player2.getScorePoints() + 1) {
            print = player1.getPlayersName();
        }

        if (player1.getScorePoints() >= 3 && player2.getScorePoints() >= 3
                && player2.getScorePoints() == player1.getScorePoints() + 1) {
            print = player2.getPlayersName();
        }
        return print;
    }

    @Override
    public String print(Player player1, Player player2) {
        return "Advantage for " + gameCondition(player1, player2);
    }
}
