
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main{
    public static void main(String[] args){
        getData();
    }
    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "";
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(databaseUrl, userName, password);
            System.out.println("Connected Successfully");
            return conn;
        }
        catch(Exception e){
            System.out.println("some error "+e);
        }
        return null;
    }
    public static void getData(){
        try{
            Statement statement= getConnection().createStatement();
            ResultSet result = statement.executeQuery("select * from jdbctable");
            while(result.next()){
                System.out.println(result.getString("id"));
                System.out.println(result.getString("Name"));
                System.out.println(result.getString("Address"));
                System.out.println(result.getString("Contact"));
            }
        }
        catch(Exception e){
            System.out.println("Some error "+e);
        }
    }
}