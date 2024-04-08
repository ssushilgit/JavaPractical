package SocketTwoWay;

import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",6666);

        PrintWriter pr  = new PrintWriter(s.getOutputStream());
        pr.println("Is it working?");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf =new BufferedReader(in);

        String str= bf.readLine();
        System.out.println("Server: "+str);
    }
}