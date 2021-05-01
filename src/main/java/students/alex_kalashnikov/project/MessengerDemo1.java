package students.alex_kalashnikov.project;

class MessengerDemo1 {

    public static void main(String[] args) {

        Messenger messenger1 = new Messenger(2001, "Alex");
        Thread threadPing = new Thread(new PingRunnable(messenger1.getPort()));
        threadPing.start();

        messenger1.go();

    }

}