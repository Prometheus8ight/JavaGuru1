package students.alex_kalashnikov.project;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

class Server implements Runnable {

    // 2500 port for ping
    // 2501 port for messages

    private static final List<User> activeUserArr = new ArrayList<>();

    // Thread for ping
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(2500);
            while (true) {

                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                User user = (User) objectInputStream.readObject();
                objectInputStream.close();

                if (!compareSender(user)) {
                    activeUserArr.add(user);
                    sendMessageToAllActiveUsers("<SERVER>: " + user.getUserName() + " has joined conversation");
                }

                respond();

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void go() {

        try {
            ServerSocket serverSocket = new ServerSocket(2501);
            while (true) {

                Socket socket = serverSocket.accept();
                InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                String message = reader.readLine();
                reader.close();

                sendMessageToAllActiveUsers(message);

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean compareSender(User newUser) {
        return activeUserArr.stream().anyMatch(user -> user.equals(newUser));
    }

    private void respond() {
        for (int i = 0; i < activeUserArr.size(); i++) {
            try {
                sendMessage(activeUserArr.get(i), "0");
            } catch (IOException e) {
                String userName = activeUserArr.get(i).getUserName();
                activeUserArr.remove(i);
                activeUserArr.forEach(user -> {
                    try {
                        sendMessage(user, "<SERVER>: " + userName + " has left conversation");
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                });
                i--;
            }
        }
    }

    private void sendMessageToAllActiveUsers(String message) {
        activeUserArr.forEach(user -> {
            try {
                sendMessage(user, message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void sendMessage(User user, String message) throws IOException {
        Socket socketSend = new Socket(user.getAddressIP(), user.getPort());
        PrintWriter printWriter = new PrintWriter(socketSend.getOutputStream());
        printWriter.println(message);
        printWriter.close();
    }

    public static void main(String[] args) {

        Server server = new Server();
        Thread serverPing = new Thread(new Server());
        serverPing.start();
        server.go();

    }

}