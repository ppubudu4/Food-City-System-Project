/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test11;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Connection_DB {

    public static Connection connect_to_DB() {
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodcitydb", "root", "nishan96");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return c;
    }

}
