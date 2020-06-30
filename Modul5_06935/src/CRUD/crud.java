
package CRUD;

import database.Koneksi;
import Models.Barang;
import java.sql.ResultSet;
import java.sql.SQLException;
import Models.Admin;
import Models.Penyewa;
import Models.Transaksi;
import Models.Detail_Transaksi;
import Models.viewTabel;
import com.sun.javafx.scene.control.skin.FXVK;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class crud {
   public Koneksi koneksi;
   public static ArrayList<Admin> arrAdmin;
   public static Admin admin;
   public static ArrayList<Penyewa> arrPenyewa;
   public static Penyewa penyewa;
   public static ArrayList<Transaksi> arrTransaksi;
   public static Barang barang;
   public static ArrayList<Barang> arrBarang;
   public static ArrayList<Detail_Transaksi> arrDetail_transaksi;
   public static ArrayList<viewTabel> arrview;
    
    
    public  crud() throws SQLException  {
        this.koneksi = new Koneksi();
        this.arrAdmin = new ArrayList<>();
        this.admin = new Admin();
        this.arrPenyewa = new ArrayList<>();
        this.penyewa = new Penyewa();
        this.barang = new Barang();
        this.arrBarang = new ArrayList<>();
        this.arrTransaksi = new ArrayList<>();
        this.arrview = new ArrayList<>();
        
        
}
    
    public void update(Transaksi transaksi){
        this.koneksi.ManipulasiData("UPDATE DETAIL_TRANSAKSI SET JUMLAH_BARANG = " + transaksi.getDetail().getJumlah_barang() + ", HARGA_TOTAL = " + transaksi.getDetail().getHarga_total() + "WHERE ID_TRANSAKSI = " + transaksi.getId_transaksi());
        this.koneksi.ManipulasiData("UPDATE TRANSAKSI SET LAMA_SEWA = " + transaksi.getLama_sewa() + "WHERE ID_TRANSAKSI = " + transaksi.getId_transaksi());
    }
    
    public void delete(Integer id){
        this.koneksi.ManipulasiData("DELETE DETAIL_TRANSAKSI WHERE ID_TRANSAKSI = " + id);
        this.koneksi.ManipulasiData("DELETE TRANSAKSI WHERE ID_TRANSAKSI = " + id);
    }
    
    public ArrayList<viewTabel> getDataView() throws SQLException{
        this.arrview.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM DETAILVIEW");
        while(rs.next()){
            viewTabel view = new viewTabel();
            view.setTransaksi(rs.getInt("ID_TRANSAKSI"));
            view.setAdmin(rs.getString("NAMA_ADMIN"));
            view.setPenyewa(rs.getString("NAMA_PENYEWA"));
            view.setBarang(rs.getString("NAMA_BARANG"));
            view.setJumlah(rs.getInt("JUMLAH"));
            view.setHarga_total(rs.getInt("HARGA_TOTAL"));
            this.arrview.add(view);
        }
        return this.arrview;
        
    }
    
    public Barang getDataIdBarang(String barang) throws SQLException{
        ResultSet rs = this.koneksi.GetData("SELECT * FROM BARANG WHERE NM_BARANG= '" + barang + "'");
        rs.next();
        Barang brg = new Barang();
        brg.setId_Barang(rs.getInt("ID_BARANG"));
        brg.setNmbarang(rs.getString("NM_BARANG"));
        brg.setHrg_Sewa(rs.getInt("HARGA_SEWA"));
        brg.setStok(rs.getInt("STOK"));
        this.barang = brg;
        return this.barang;
    }
    
    public Admin getDataIdAdmin(String nama) throws SQLException{
        ResultSet rs = this.koneksi.GetData("SELECT * FROM ADMIN WHERE USERNAME = '" + nama + "'");
        rs.next();
        Admin admin = new Admin();
        admin.setId_admin(rs.getInt("ID_ADMIN"));
        admin.setUsername(rs.getString("USERNAME"));
        admin.setPassword(rs.getString("PASSWORD"));
        this.admin = admin;
        
        return this.admin;
    }
    
    public ArrayList<Admin> getDataAdmin() throws SQLException {
            this.arrAdmin.clear();
            ResultSet rs = this.koneksi.GetData("SELECT * FROM ADMIN");
            while(rs.next()){
                Admin admin = new Admin();
                admin.setId_admin(rs.getInt("ID_ADMIN"));
                admin.setUsername(rs.getString("USERNAME"));
                admin.setPassword(rs.getString("PASSWORD"));
                
                this.arrAdmin.add(admin);
                
            }
            return this.arrAdmin;
            
    }
    public ArrayList<Penyewa> getDataPenyewa() throws SQLException {
        this.arrPenyewa.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM PENYEWA");
        while(rs.next()){
            Penyewa penyewa = new Penyewa();
            penyewa.setId_penyewa(rs.getInt("ID_PENYEWA"));
            penyewa.setNm_penyewa(rs.getString("NM_PENYEWA"));
            penyewa.setAlamat(rs.getString("ALAMAT"));
            penyewa.setNo_telp(rs.getString("NO_TELP"));
            penyewa.setNo_kk(rs.getString("NO_KK"));
            this.arrPenyewa.add(penyewa);
        }
        return this.arrPenyewa;
    }
    
        public Penyewa getDataIdPenyewa(String nama) throws SQLException {
        ResultSet rs = this.koneksi.GetData("SELECT * FROM PENYEWA WHERE NM_PENYEWA = '" + nama + "'");
        rs.next();
            Penyewa penyewa = new Penyewa();
            penyewa.setId_penyewa(rs.getInt("ID_PENYEWA"));
            penyewa.setNm_penyewa(rs.getString("NM_PENYEWA"));
            penyewa.setAlamat(rs.getString("ALAMAT"));
            penyewa.setNo_telp(rs.getString("NO_TELP"));
            penyewa.setNo_kk(rs.getString("NO_KK"));
            this.penyewa = penyewa;
        
        return this.penyewa;
    }
    
    public ArrayList<Barang> getDataBarang() throws SQLException {
        this.arrBarang.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM BARANG");
        while(rs.next()){
            Barang barang = new Barang();
            barang.setId_Barang(rs.getInt("ID_BARANG"));
            barang.setNmbarang(rs.getString("NM_BARANG"));
            barang.setHrg_Sewa(rs.getInt("HARGA_SEWA"));
            barang.setStok(rs.getInt("STOK"));
            this.arrBarang.add(barang);
    }
        return this.arrBarang;
    }
    public void insert(Transaksi transaksi){
        try {
            String TglSewa = new SimpleDateFormat("dd/MM/yyyy").format(transaksi.getTgl_Sewa());
            this.koneksi.ManipulasiData("INSERT INTO TRANSAKSI VALUES(ID_TRANSAKSI.NEXTVAL, " + transaksi.getId_admin() + ", " + transaksi.getId_penyewa() + ", " + transaksi.getLama_sewa() + ", TO_DATE('" + TglSewa + "', 'dd/MM/yyyy'))");
            System.out.println("INSERT INTO TRANSAKSI VALUES(ID_TRANSAKSI.NEXTVAL, " + transaksi.getId_admin().toString() + ", " + transaksi.getId_penyewa().toString() + ", " + transaksi.getLama_sewa().toString() + ", " + TglSewa + ")");
            
            ResultSet rs = this.koneksi.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
            rs.next();
            Integer id = rs.getInt("CURRVAL");  
            this.koneksi.ManipulasiData("INSERT INTO DETAIL_TRANSAKSI VALUES ( " + transaksi.getDetail().getId_barang() + ", " + transaksi.getDetail().getJumlah_barang() + ", " + transaksi.getDetail().getHarga_total() + ", " + id + ")");
            System.out.println("INSERT INTO DETAIL_TRANSAKSI VALUES ( " + transaksi.getDetail().getId_barang() + ", " + transaksi.getDetail().getJumlah_barang() + ", " + transaksi.getDetail().getHarga_total() + ", " + id + ")");
            
        }
        catch(SQLException ex){
            System.out.println(ex);
            
        }
    }

   
        
    }
    
    

        
    
    
    
    


