package SocketSwing;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servers {

    private static JTextArea chatArea;
    private static PrintWriter serverWriter;

    public static void main(String[] args) {
        JFrame serverFrame = new JFrame("Server Chat");
        serverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        serverFrame.setSize(400, 300);

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
            serverWriter.println("Server: " + message);
            messageField.setText("");
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(messageField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        panel.add(inputPanel, BorderLayout.SOUTH);

        serverFrame.setContentPane(panel);
        serverFrame.setVisible(true);

        try {
            // Create a server socket and bind it to a specific port
            ServerSocket serverSocket = new ServerSocket(5555);
            appendToChatArea("Server is waiting for clients...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            appendToChatArea("Client connected");

            // Get output stream from the socket
            serverWriter = new PrintWriter(clientSocket.getOutputStream(), true);

            // Get input stream from the socket
            Scanner scanner = new Scanner(clientSocket.getInputStream());

            // Start reading messages from the client
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