/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Login;

import java.sql.ResultSet;

public class EmpID {

    private static String eID;
    private static String empAccl;

    public void SetEID(String ID) {
        eID = ID;
        setEmpAccl(eID);
    }

    public String GetEID() {
        return eID;
    }

    public void setEmpAccl(String eID) {
        try {
            ResultSet resEmpAccl = ConnectDB.ConnectDB.DBConnection().createStatement().executeQuery("SELECT Emp_AccL FROM employee WHERE Emp_ID='" + eID + "'");
            if(resEmpAccl.next()){
                empAccl = resEmpAccl.getString("Emp_AccL");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public String getEmpAccl(){
        return empAccl;
    }
}
