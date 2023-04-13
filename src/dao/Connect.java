/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

public class Connect {
    private Connection conn;

    public Connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYTHUVIEN";
        String user = "sa";
        String password = "vulong12345";
        this.conn = DriverManager.getConnection(url, user, password);
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
    public ResultSet getSachList() throws SQLException {
        String sql = "SELECT * FROM SACH";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        return result;
    }
}