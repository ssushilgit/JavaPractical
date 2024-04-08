package Databasee;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveData{
    public static void main(String[] args){
        getData();
    }
    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/student";
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
            ResultSet result = statement.executeQuery("select * from student_profile");
            while(result.next()){
                System.out.println(result.getString("id"));
                System.out.println(result.getString("username"));
                System.out.println(result.getString("password"));
            }
        }
        catch(Exception e){
            System.out.println("Some error "+e);
        }
    }
}