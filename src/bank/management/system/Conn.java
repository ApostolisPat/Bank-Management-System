package bank.management.system;

import java.sql.*;


// 5 steps
//      - Register the driver
//      - Create the connection
//      - Create the Statement
//      - Execute the Query
//      - Close the connection

public class Conn {

    Connection c;
    Statement s;

    public Conn(){
        try{
            // Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create the Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "root");
            // Create the Statement
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
