package students.alex_kalashnikov.project;

class MessengerDemo3 {

    public static void main(String[] args) {

        Messenger messenger3 = new Messenger(2003, "Mike");
        Thread threadPing = new Thread(new PingRunnable(messenger3.getPort()));
        threadPing.start();

        messenger3.go();

    }

}