package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String dbName = "billingsystem";
    private static final String path = "jdbc:mysql://localhost:3306/"+ dbName;
    private static final String username = "root";
    private static final String password = "";

    public static Connection connect() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(path, username, password);
        return conn;
    }

}