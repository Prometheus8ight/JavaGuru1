package students.rodion_afanasjev.lesson_15.level_3.task_10;

class Player {

    private String playerName;
    private int scorePoints;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScorePoints() {
        return scorePoints;
    }

    public void setScorePoints(int scorePoints) {
        this.scorePoints = scorePoints;
    }
}
