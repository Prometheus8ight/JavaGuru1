package students.alex_kalashnikov.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

class PingRunnable implements Runnable {

    private final int port;

    public PingRunnable(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        while (true) {
            try {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Socket socket = new Socket("127.0.0.1", 2500);
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println(port);
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}