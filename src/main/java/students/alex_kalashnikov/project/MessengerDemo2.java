package students.alex_kalashnikov.project;

class MessengerDemo2 {

    public static void main(String[] args) {

        Messenger messenger2 = new Messenger(2002, "John");
        Thread threadPing = new Thread(new PingRunnable(messenger2.getPort()));
        threadPing.start();

        messenger2.go();

    }

}