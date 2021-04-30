package students.alex_kalashnikov.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

class MyRunnable implements Runnable {

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
                writer.println("0");
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}