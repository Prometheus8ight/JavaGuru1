package students.alex_kalashnikov.lesson_8.level_2.task_9;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

    public static void main(String[] args) {

        ComputerPlayer newPlayer = new ComputerPlayer("Player 1");

    }

}