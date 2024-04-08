package Socket;

import java.net.*;
import java.io.*;
public class SocketClient{
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",6666);

        PrintWriter pr  = new PrintWriter(s.getOutputStream());
        pr.println("Hello");
        pr.flush();
    }
}