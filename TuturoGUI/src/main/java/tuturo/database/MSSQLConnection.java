/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuturo.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSSQLConnection {
    public Connection conn = null;
    
//    public void checkConn() {
//        try {
//            String dbURL = "jdbc:sqlserver://RYZENKHLVN\\SQLEXPRESS;databaseName=tuturo_db;encrypt=true;trustServerCertificate=true";
//            String u = "SQLpuno";
//            String p = "punopogi";
//            
//            conn = DriverManager.getConnection(dbURL, u, p);
//            
//            if (conn != null) {
//                DatabaseMetaData dbfetch = (DatabaseMetaData) conn.getMetaData();
//                System.out.println("Driver Name: " + dbfetch.getDriverName());
//                System.out.println("Driver Version: " + dbfetch.getDriverVersion());
//                System.out.println("Product Name: " + dbfetch.getDatabaseProductName());
//                System.out.println("Product Version: " + dbfetch.getDatabaseProductVersion());
//                System.out.println("Ze bluetooth devays hez connictid uhh suczessfuley.");
//                
//            }
//            
//        } catch (SQLException error) {
//            System.out.println(":(( : " + error);
//        }
//    }
    
    public Connection connect() {
        String dbURL = "jdbc:sqlserver://RYZENKHLVN\\SQLEXPRESS;databaseName=tuturo_db;encrypt=true;trustServerCertificate=true";
        String u = "SQLpuno";
        String p = "punopogi";

        try {
            conn = DriverManager.getConnection(dbURL, u, p);
            if (conn != null) {
                System.out.println("Connection Successful!");
            }
        } catch (SQLException ex) {
            System.out.println(":(( Connection Failed!");
        }
        return conn;
    }
}
