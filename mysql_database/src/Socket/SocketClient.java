package Socket;
import java.io.*;
import java.net.*;
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello");
        dout.flush();
        dout.close();
        s.close();
    }
}
