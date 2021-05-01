package students.alex_kalashnikov.project;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class Messenger {

    private JTextArea text;
    private JTextArea chat;
    private String userName;
    private int port;

    public Messenger(int port, String userName) {
        this.port = port;
        this.userName = userName;
    }

    public int getPort() {
        return port;
    }

    void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel chatPanel = new JPanel();
        JLabel label = new JLabel(userName);
        JButton buttonSend = new JButton("SEND");
        buttonSend.addActionListener(new SendButton());
        chat = new JTextArea(23, 30);
        chat.setLineWrap(true);
        chat.setWrapStyleWord(true);
        chat.setEditable(false);
        DefaultCaret caret = (DefaultCaret) chat.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        text = new JTextArea(3, 30);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.addKeyListener(new Enter());

        JScrollPane scrollerChat = new JScrollPane(chat);
        scrollerChat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollerChat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JScrollPane scrollerText = new JScrollPane(text);
        scrollerText.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollerText.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        chatPanel.add(scrollerChat);
        chatPanel.add(scrollerText);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new SaveButton());
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, chatPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonSend);
        frame.setSize(350, 550);
        frame.setVisible(true);

        checkMessagesFromServer();

    }

    private class SaveButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            saveFile(new File("C:/save.txt"));
        }
    }

    private class SendButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sendMessage(text.getText());
            text.setText("");
        }
    }

    private class Enter implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER
                    && !text.getText().equals("")) {
                sendMessage(text.getText());
                text.setText("");
                e.consume();
            }
            if (e.getKeyCode() == KeyEvent.VK_ENTER
                    && text.getText().equals(""))
                e.consume();
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

    }

    private void checkMessagesFromServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket socket = serverSocket.accept();
                InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(streamReader);
                String message = reader.readLine();
                if (divideMessagesFromPing(message)) {
                    chat.append(message + "\n");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void saveFile(File file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(chat.getText());
            writer.close();
        } catch (IOException ex) {
            System.out.println("Can't save!");
            ex.printStackTrace();
        }
    }

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

    private boolean divideMessagesFromPing(String message) {
        return message.contains(":");
    }

}