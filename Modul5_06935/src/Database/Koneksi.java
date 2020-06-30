
package database;



import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Koneksi {
    private Connection connect;
    private Statement db;
    private String database = "fatchurrosii06935";
   
    public Koneksi(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Class Driver ditemukan");
            try{
                connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","fatchurrosii06935", "1234");
                System.out.println("Koneksi Database sukses");
            }
            catch (SQLException se){
                System.out.println("Koneksi Database gagal : " + se);
            }
        }
        catch (ClassNotFoundException err){
            System.out.println("Class Driver tidak ditemukan, Terjadi kesalahan pada : " + err);
        }
    }
    
   
    public ResultSet GetData(String sql){
        try {
            db = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return db.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
    }
    public int ManipulasiData(String sql){
        try {
            db =  connect.createStatement();
            return db.executeUpdate(sql);
        } catch (SQLException e) {
            return 0;
        }
    }
}