package students.alex_kalashnikov.project;

class MessengerDemo3 {

    public static void main(String[] args) {

        User user3 = new User("Marina", "127.0.0.1", 2003);
        Messenger messenger3 = new Messenger(user3, "127.0.0.1");
        Thread messengerPing = new Thread(messenger3);
        messengerPing.start();
        messenger3.go();

    }

}