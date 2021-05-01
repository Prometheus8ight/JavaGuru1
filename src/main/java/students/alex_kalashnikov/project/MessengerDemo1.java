package students.alex_kalashnikov.project;

class MessengerDemo1 {

    public static void main(String[] args) {

        User user1 = new User("Alex", "127.0.0.1", 2001);
        Messenger messenger1 = new Messenger(user1);
        Thread threadPing = new Thread(new PingRunnable(user1));
        threadPing.start();

        messenger1.go();

    }

}