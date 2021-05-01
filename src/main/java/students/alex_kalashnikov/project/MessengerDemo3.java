package students.alex_kalashnikov.project;

class MessengerDemo3 {

    public static void main(String[] args) {

        User user3 = new User("Mike", "127.0.0.1", 2003);
        Messenger messenger3 = new Messenger(user3);
        Thread threadPing = new Thread(new PingRunnable(user3));
        threadPing.start();

        messenger3.go();

    }

}