package Databasee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Main {
    public static void main(String[] args) {
        getConnection();
    }

    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/jdbc";
            String userName = "root";
            String password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl, userName, password);
            System.out.println("Connected Successfully");
            return conn;
        } catch (Exception e) {
            System.out.println("some error " + e);
        }
        return null;
    }
}