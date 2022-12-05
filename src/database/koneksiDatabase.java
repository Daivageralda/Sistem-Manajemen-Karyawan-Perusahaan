package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksiDatabase {
    
    private static Connection conn;
    public static Connection db() throws SQLException{
        
        try{
            final String url  = "jdbc:mysql://localhost:3306/uaspbo";
            final String user = "root";
            final String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url,user,pass);
           
        }catch (SQLException r){
            System.out.println("Pesan : "+r.getMessage());
        }
        return conn;
    }
}
