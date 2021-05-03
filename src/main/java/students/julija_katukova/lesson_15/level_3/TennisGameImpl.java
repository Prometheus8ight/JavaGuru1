package students.julija_katukova.lesson_15.level_3;

class TennisGameImpl implements TennisGame {

    private String gameScore = "Love - Love";

    public void setGameScore(String gameScore) {
        this.gameScore = gameScore;
    }

    @Override
    public void wonPoint(String playerName) {
        switch (score()) {
            case "Love - Love" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Fifteen - Love";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Love - Fifteen";
                }
            }
            case "Fifteen - Love" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Thirty - Love";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Fifteen - Fifteen";
                }
            }
            case "Love - Fifteen" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Fifteen - Fifteen";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Love - Thirty";
                }
            }
            case "Thirty - Love" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Forty - Love";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Thirty - Fifteen";
                }
            }
            case "Fifteen - Fifteen" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Thirty - Fifteen";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Fifteen - Thirty";
                }
            }
            case "Love - Thirty" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Fifteen - Thirty";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Love - Forty";
                }
            }
            case "Forty - Love" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Win player1";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Forty - Fifteen";
                }
            }
            case "Thirty - Fifteen" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Forty - Fifteen";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Thirty - Thirty";
                }
            }
            case "Fifteen - Thirty" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Thirty - Thirty";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Fifteen - Forty";
                }
            }
            case "Love - Forty" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Fifteen - Forty";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Win player2";
                }
            }
            case "Forty - Fifteen" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Win player1";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Forty - Thirty";
                }
            }
            case "Thirty - Thirty" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Forty - Thirty";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Thirty - Forty";
                }
            }
            case "Fifteen - Forty" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Thirty - Forty";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Win player2";
                }
            }
            case "Forty - Thirty", "Advantage player1" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Win player1";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Deuce";
                }
            }
            case "Thirty - Forty", "Advantage player2" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Deuce";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Win player2";
                }
            }
            case "Deuce" -> {
                if (playerName.equals("player1")) {
                    gameScore = "Advantage player1";
                }
                if (playerName.equals("player2")) {
                    gameScore = "Advantage player2";
                }
            }
        }
    }


    @Override
        public String score() {
            return gameScore;
        }
}
