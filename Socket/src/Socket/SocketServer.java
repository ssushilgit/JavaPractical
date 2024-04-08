package Socket;

import java.net.*;
import java.io.*;
public class SocketServer{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();

        System.out.println("Client Connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf =new BufferedReader(in);

        String str= bf.readLine();
        System.out.println("Client: "+str);
    }
}