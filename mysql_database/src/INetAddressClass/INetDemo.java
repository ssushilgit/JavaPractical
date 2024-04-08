package INetAddressClass;
import java.io.*;
import java.net.*;


public class INetDemo {
    public static void main(String[] args){
        try{
            InetAddress ip = InetAddress.getByName("www.asm.edu.np");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        }
        catch (Exception e) {
            System.out.println("Some error: " + e);
        }
    }
}
