package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;
    
    public static Connection ambilKoneksi(){
    if(conn==null){
    try{
        String url  = "jdbc:mysql://localhost:3306/barbershop";
        String user = "root";
        String pass = "#Raul>92";
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        conn = (Connection) DriverManager.getConnection(url,user,pass);
        }catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return conn;
    }
}