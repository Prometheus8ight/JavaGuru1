package students.alex_kalashnikov.project;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
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

                System.out.println(Arrays.toString(arr.toArray()));

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
        for (int i = 0; i < arr.size(); i++) {
            try {
                sendMessage(socket, arr.get(i), message);
            } catch (IOException e) {
                arr.remove(i);
                arr.forEach(arr1 -> {
                    try {
                        sendMessage(socket, arr1, "<SERVER>: User left!");
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                });
                i--;
            }
        }
    }

    private boolean divideMessagesFromPing(String message) {
        return message.contains(":");
    }

    private void sendMessage(Socket socket, String arr, String message) throws IOException {
        Socket socketSend = new Socket(socket.getInetAddress(), Integer.parseInt(arr));
        PrintWriter writer2 = new PrintWriter(socketSend.getOutputStream());
        writer2.println(message);
        writer2.close();
    }

    public static void main(String[] args) {

        Server server = new Server();
        server.go();

    }

}