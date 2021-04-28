package students.alex_kalashnikov.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class Messenger implements ActionListener {

    JTextArea text;
    JTextArea chat;
    String userName;
    int port;

    public Messenger(int port, String userName) {
        this.port = port;
        this.userName = userName;
    }

    void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel textPanel = new JPanel();
        JLabel label = new JLabel(userName);
        JButton button = new JButton("SEND");
        button.addActionListener(this);
        chat = new JTextArea(23, 30);
        chat.setEditable(false);
        text = new JTextArea(3, 30);
        text.setLineWrap(true);

        JScrollPane scrollerChat = new JScrollPane(chat);
        scrollerChat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollerChat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JScrollPane scrollerText = new JScrollPane(text);
        scrollerText.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollerText.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textPanel.add(scrollerChat);
        textPanel.add(scrollerText);

        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, textPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350, 500);
        frame.setVisible(true);

        try {
        ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                String message = reader.readLine();
                chat.append(message + "\n");
            }
        }
        catch (Exception ex) {
                ex.printStackTrace();
            }
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        text.append("Hello World!\n");
//    }


//    private void saveFile(File file) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//            writer.write(String.valueOf(text.getText()));
//            writer.close();
//        } catch (IOException ex) {
//            System.out.println("Can't save!");
//            ex.printStackTrace();
//        }
//    }

    private void sendMessage(String text) {
        try {
            Socket socket = new Socket("127.0.0.1", 2500);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(userName + ": " + text);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        sendMessage(text.getText());
        text.setText("");
    }

}