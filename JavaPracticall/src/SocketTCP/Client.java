package SocketTCP;

import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        try {
            // 1. Open socket connection to server
            Socket socket = new Socket("localhost", 6969);

            // 2. Make input and output handles
            Scanner ins = new Scanner(socket.getInputStream());
            PrintWriter outs = new PrintWriter(socket.getOutputStream(), true);

            // 3. Send a message to server
            outs.println(5); // Send number 5 to the server

            // 4. Receive a message from server
            int fact = ins.nextInt(); // Receive factorial from the server

            // 5. Display result from server
            System.out.println("Sent number: 5");
            System.out.println("Factorial from server: " + fact);

            // 6. Close all connections
            ins.close();
            outs.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
