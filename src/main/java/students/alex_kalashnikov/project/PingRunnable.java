package students.alex_kalashnikov.project;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

class PingRunnable implements Runnable {

    private final User user;
    private final String serverAddressIP;

    public PingRunnable(User user, String serverAddressIP) {
        this.user = user;
        this.serverAddressIP = serverAddressIP;
    }

    @Override
    public void run() {
        while (true) {
            try {

                Socket socket = new Socket(serverAddressIP, 2500);
                OutputStream outputStream = socket.getOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(user);
                objectOutputStream.close();

            } catch (NotSerializableException e) {

            } catch (IOException e) {
                System.out.println("Server is down!");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}