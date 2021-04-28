package students.alex_kalashnikov.project;

import java.io.*;
import java.net.*;

class Server {

    void go() {

        try {

            ServerSocket serverSocket = new ServerSocket(2500);

            while (true) {
                Socket socket = serverSocket.accept();
                InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                String message = reader.readLine();
                reader.close();

                Socket socket1 = new Socket(socket.getInetAddress(), 2001);
                PrintWriter writer = new PrintWriter(socket1.getOutputStream());
                writer.println(message);
                writer.close();

                Socket socket2 = new Socket(socket.getInetAddress(), 2002);
                PrintWriter writer2 = new PrintWriter(socket2.getOutputStream());
                writer2.println(message);
                writer2.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Server server = new Server();
        server.go();

    }

}