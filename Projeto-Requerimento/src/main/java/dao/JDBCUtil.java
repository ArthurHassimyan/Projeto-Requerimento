/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Arthur Hassimyan
 */
public class JDBCUtil {
    private static String url;
    private static String username;
    private static String password;
    
    public static void init(String filename) throws IOException, ClassNotFoundException{
        Properties props = new Properties();
        props.load(new FileInputStream(filename));
        String driver = props.getProperty("jdbc.driver");
        url = props.getProperty("jdbc.url");
        username = props.getProperty("jdbc.username");
        if (username == null) {
            username = "";
        }
        password = props.getProperty("jdbc.password");
        if (password == null) {
            password = "";
        }
        if (driver != null) {
            Class.forName(driver);
        }
        
    }
    
    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }

}