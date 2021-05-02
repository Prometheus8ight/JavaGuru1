package students.alex_kalashnikov.project;

class MessengerDemo1 {

    public static void main(String[] args) {

        User user1 = new User("Alexander", "127.0.0.1", 2001);
        Messenger messenger1 = new Messenger(user1, "127.0.0.1");
        Thread threadPing = new Thread(new PingRunnable(user1, messenger1.getServerAddressIP()));
        threadPing.start();

        messenger1.go();

    }

}