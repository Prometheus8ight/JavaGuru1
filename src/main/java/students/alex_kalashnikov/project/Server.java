package students.alex_kalashnikov.project;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

class Server {

    List<String> arr = new ArrayList<>();

    void go() {

        try {
            ServerSocket serverSocket = new ServerSocket(2500);
            while (true) {

                Socket socket = serverSocket.accept();
                InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                String message = reader.readLine();
                reader.close();

                if (!compareSender(arr, message) && !divideMessagesFromPing(message)) {
                    arr.add(message);
                }

                respond(arr, socket, message);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean compareSender(List<String> arr, String message) {
        return arr.stream().anyMatch(arr1 -> arr1.equals(message));
    }

    private void respond(List<String> arr, Socket socket, String message) {
        for (String s : arr) {
            try {
                Socket socket2 = new Socket(socket.getInetAddress(), Integer.parseInt(s));
                PrintWriter writer2 = new PrintWriter(socket2.getOutputStream());
                writer2.println(message);
                writer2.close();
            } catch (IOException e) {
                continue;
            }
        }
    }

    private boolean divideMessagesFromPing(String message) {
        return message.contains(":");
    }

    public static void main(String[] args) {

        Server server = new Server();
        server.go();

    }

}