package students.alex_kalashnikov.project;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.List;
import java.util.stream.Collectors;

class Messenger implements Runnable {

    private JTextArea text;
    private JTextArea chat;
    private JTextArea activeUsers;
    private JTextArea searchField;
    private Highlighter highlighter;
    private DefaultHighlighter.DefaultHighlightPainter painter;

    private final User user;
    private final String serverAddressIP;

    public Messenger(User user, String serverAddressIP) {
        this.user = user;
        this.serverAddressIP = serverAddressIP;
    }

    public User getUser() {
        return user;
    }

    //Thread for ping
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
                activeUsers.setText("Server is not connected!");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel chatPanel = new JPanel();
        JLabel label = new JLabel(user.getUserName());
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        label1.setText("enter text to find");
        label2.setText("users online");

        JButton buttonSend = new JButton("SEND");
        buttonSend.addActionListener(new SendButton());

        activeUsers = new JTextArea(1, 25);
        activeUsers.setLineWrap(true);
        activeUsers.setWrapStyleWord(true);
        activeUsers.setEditable(false);
        activeUsers.setText("Server is not connected!");

        searchField = new JTextArea(1, 20);
        searchField.addKeyListener(new Search());

        chat = new JTextArea(23, 35);
        chat.setLineWrap(true);
        chat.setWrapStyleWord(true);
        chat.setEditable(false);
        DefaultCaret caret = (DefaultCaret) chat.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        text = new JTextArea(3, 35);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.addKeyListener(new Enter());

        JScrollPane scrollerChat = new JScrollPane(chat);
        scrollerChat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollerChat.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JScrollPane scrollerText = new JScrollPane(text);
        scrollerText.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollerText.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        chatPanel.add(activeUsers);
        chatPanel.add(label2);
        chatPanel.add(searchField);
        chatPanel.add(label1);
        chatPanel.add(scrollerChat);
        chatPanel.add(scrollerText);

        highlighter = new DefaultHighlighter();
        painter = new DefaultHighlighter.DefaultHighlightPainter(Color.lightGray);
        chat.setHighlighter(highlighter);

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
        frame.setSize(350, 600);
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

    private class Search implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            String wordOrLetters = searchField.getText();
            String text = chat.getText();
            int x = text.indexOf(wordOrLetters);
            int y = searchField.getText().length();
            highlighter.removeAllHighlights();
            if (x != -1) {
                try {
                    highlighter.addHighlight(x, x + y, painter);
                    chat.setCaretPosition(x);
                } catch (BadLocationException badLocationException) {
                    badLocationException.printStackTrace();
                }
            }
        }

    }

    private void checkMessagesFromServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(user.getPort());
            while (true) {
                Socket socket = serverSocket.accept();
                socket.setSoTimeout(3000);

                try {
                    InputStream inputStream = socket.getInputStream();
                    ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                    List<User> arr = (List<User>) objectInputStream.readObject();
                    String string = arr.stream()
                            .map(User::getUserName)
                            .collect(Collectors.joining(", "));
                    activeUsers.setText(string);
                } catch (StreamCorruptedException e) {
                }

                try {
                    InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                    BufferedReader reader = new BufferedReader(streamReader);
                    String message = reader.readLine();
                    reader.close();
                    if (divideMessagesFromPing(message)) {
                        chat.append(message + "\n");
                    }
                } catch (NullPointerException e) {
                    continue;
                }
            }
        } catch (SocketTimeoutException e) {
            activeUsers.setText("Server is not connected!");
        } catch (Exception ex) {
            activeUsers.setText("Server is not connected!");
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
            Socket socket = new Socket(serverAddressIP, 2501);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println("    <" + user.getUserName() + ">: " + text);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            activeUsers.setText("Server is not connected!");
        }
    }

    private boolean divideMessagesFromPing(String message) {
        return message.contains(":");
    }

}