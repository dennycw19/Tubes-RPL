/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smart.lamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Denny Cahyo
 */
public class Database {
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Database(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/smartlamp","root","");
            stmt = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage());
        }
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
        return rs;
    }
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error: "+e.getMessage());
        }
    }
}
