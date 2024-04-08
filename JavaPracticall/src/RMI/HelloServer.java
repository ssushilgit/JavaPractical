package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer implements HelloInterface {
    public HelloServer() throws RemoteException {
        super();
    }
    @Override
    public String sayHello() throws RemoteException {
        return "Hello, RMI!";
    }

    public static void main(String[] args) {
        try {
            HelloServer server = new HelloServer();
            HelloInterface stub = (HelloInterface) UnicastRemoteObject.exportObject(server, 0);
            Registry registry = LocateRegistry.createRegistry(1099); // Default RMI registry port
            registry.rebind("HelloService", stub);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}