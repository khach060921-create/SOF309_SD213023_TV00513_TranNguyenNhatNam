/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycafe.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DBConnection {
    
    private static final String SERVER = "localhost";
    private static final String PORT = "1433";
    private static final String DB_NAME = "CafeDB";
    private static final String USER = "sa";
    private static final String PASSWORD = "Anhviet1109";

    private static final String URL = "jdbc:sqlserver://" + SERVER + ":" + PORT
            + ";databaseName=" + DB_NAME
            + ";encrypt=true;trustServerCertificate=true";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Chạy thử kết nối
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Kết nối thành công: " + conn.getCatalog());
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại: " + e.getMessage());
        }
    }
}
