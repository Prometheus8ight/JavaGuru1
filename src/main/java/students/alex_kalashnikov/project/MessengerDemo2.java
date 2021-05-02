package students.alex_kalashnikov.project;

class MessengerDemo2 {

    public static void main(String[] args) {

        User user2 = new User("John", "127.0.0.1", 2002);
        Messenger messenger2 = new Messenger(user2, "127.0.0.1");
        Thread messengerPing = new Thread(messenger2);
        messengerPing.start();
        messenger2.go();

    }

}