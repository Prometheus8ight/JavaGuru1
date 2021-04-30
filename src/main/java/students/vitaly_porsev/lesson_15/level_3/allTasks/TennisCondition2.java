package students.vitaly_porsev.lesson_15.level_3.allTasks;

public class TennisCondition2 implements TennisConditions {

    @Override
    public String gameCondition(Player player1, Player player2) {
        String print = "";

        if (player1.getScorePoints() >= 3 && player1.getScorePoints() == player2.getScorePoints()) {
            print = player1.getPlayersName();
        }
        return print;
    }

    @Override
    public String print(Player player1, Player player2) {
        return "Deuce";
    }
}
