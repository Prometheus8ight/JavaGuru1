package students.vitaly_porsev.lesson_15.level_3.allTasks;

public class Player {

    private int scorePoints;
    private String playersName;

    public Player(String playersName) {
        this.playersName = playersName;
    }

    public int getScorePoints() {
        return scorePoints;
    }

    public String getPlayersName() {
        return playersName;
    }

    public void setScorePoints(int scorePoints) {
        this.scorePoints = scorePoints;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }
}
