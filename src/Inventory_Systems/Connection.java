/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory_Systems;

import java.sql.*; 


/**
 *
 * @author Thimedu Alwis
 */
public class Connection {
    
    public java.sql.Connection con;
    
    public java.sql.Connection getConnection(){
        try{ 
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost/inventory","root","");  
            
            return con;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
    
