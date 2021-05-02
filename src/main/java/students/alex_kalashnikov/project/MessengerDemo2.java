package students.alex_kalashnikov.project;

class MessengerDemo2 {

    public static void main(String[] args) {

        User user2 = new User("John", "127.0.0.1", 2002);
        Messenger messenger2 = new Messenger(user2, "127.0.0.1");
        Thread threadPing = new Thread(new PingRunnable(user2, messenger2.getServerAddressIP()));
        threadPing.start();

        messenger2.go();

    }

}