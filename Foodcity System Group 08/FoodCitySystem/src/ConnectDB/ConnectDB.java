/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectDB {

    public static Connection DBConnection() {

        Connection c = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/FoodCityDB", "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Connection Error", "Error", 0);
        }

        if (c == null) {
            System.out.println("connection is not set");
        }else{
            System.out.println("connection is set");
        }

        return c;
        

    }
    

}
