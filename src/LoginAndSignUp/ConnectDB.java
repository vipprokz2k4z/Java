/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginAndSignUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {
    private static final String url = "jdbc:mysql://localhost:3306/taikhoan"; 
    private static final String user = "root"; 
    private static final String password = ""; 

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Kết nối đến MySQL
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("ket noi thanh cong!");
        } catch (SQLException e) {
            System.out.println("ket noi that bai!");
            e.printStackTrace();
        }
        return connection;
    }
    public static void main(String[] args) {
        ConnectDB.getConnection();
    }

}
