package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {

     public static Connection getConnection() {
        Connection connection = null;
        try {
            String userNAme = "root";
            String password = "Password";
            String url = "jdbc:MySQL://localhost/schema?useSSL=false&allowPublicKeyRetrieval=true";
            connection = DriverManager.getConnection(url, userNAme, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return connection;
    }
}
