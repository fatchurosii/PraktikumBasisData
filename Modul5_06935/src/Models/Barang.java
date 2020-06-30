
package Models;
import database.Koneksi;
import java.sql.ResultSet;
public class Barang {
    private Integer id_barang;
    private String nm_barang;
    private Integer hrg_sewa;
    private Integer stok;
    
    public Integer getId_Barang(){
            return id_barang;
        }
        
        public void setId_Barang(Integer id_barang){
            this.id_barang = id_barang;
        }
    public String getNmbarang(){
        return nm_barang;
    }
    public void setNmbarang(String nm_barang){
        this.nm_barang = nm_barang;
    }
    public Integer getHrg_Sewa(){
        return hrg_sewa;
    }
    public void setHrg_Sewa(Integer hrg_sewa){
        this.hrg_sewa = hrg_sewa;
    }
    public Integer getStok(){
        return stok;
    }
    public void setStok(Integer stok){
        this.stok = stok;
    }
}

