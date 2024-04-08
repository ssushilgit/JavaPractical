package SocketSwing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Clients {

    private static JTextArea chatArea;
    private static PrintWriter clientWriter;

    public static void main(String[] args) {
        JFrame clientFrame = new JFrame("Client Chat");
        clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientFrame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JTextField messageField = new JTextField();
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(e -> {
            String message = messageField.getText();
            clientWriter.println("Client: " + message);
            messageField.setText("");
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(messageField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        panel.add(inputPanel, BorderLayout.SOUTH);

        clientFrame.setContentPane(panel);
        clientFrame.setVisible(true);

        try {
            // Connect to the server on the specified address and port
            Socket socket = new Socket("localhost", 5555);

            // Get output stream from the socket
            clientWriter = new PrintWriter(socket.getOutputStream(), true);

            // Get input stream from the socket
            Scanner scanner = new Scanner(socket.getInputStream());

            // Start reading messages
            while (true) {
                String receivedMessage = scanner.nextLine();
                appendToChatArea(receivedMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendToChatArea(String message) {
        SwingUtilities.invokeLater(() -> chatArea.append(message + "\n"));
    }
}