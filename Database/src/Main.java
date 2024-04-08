import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        getConnection();
    }
    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/mysql";
            String userName = "root";
            String password = "admin";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl,userName,password);
            System.out.println("COnnection Successfull");
            return conn;

        }
        catch(Exception e){
            System.out.println("Some error "+e);
        }
        return null;
    }
}