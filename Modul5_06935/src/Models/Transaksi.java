
package Models;

import java.util.Date;
import java.util.ArrayList;

public class Transaksi {
    private Integer Id_transaksi;
    private Integer Id_admin;
    private Integer Id_penyewa;
    private Integer Lama_sewa;
    private Date Tgl_Sewa;
    private Detail_Transaksi Detail;

    public Detail_Transaksi getDetail() {
        return Detail;
    }

    public void setDetail(Detail_Transaksi Detail) {
        this.Detail = Detail;
    }
           
    public Integer getId_transaksi() {
        return Id_transaksi;
    }

    public void setId_transaksi(Integer Id_transaksi) {
        this.Id_transaksi = Id_transaksi;
    }

    public Integer getId_admin() {
        return Id_admin;
    }

    public void setId_admin(Integer Id_admin) {
        this.Id_admin = Id_admin;
    }

    public Integer getId_penyewa() {
        return Id_penyewa;
    }

    public void setId_penyewa(Integer Id_penyewa) {
        this.Id_penyewa = Id_penyewa;
    }

    public Integer getLama_sewa() {
        return Lama_sewa;
    }

    public void setLama_sewa(Integer Lama_sewa) {
        this.Lama_sewa = Lama_sewa;
    }

    public Date getTgl_Sewa() {
        return Tgl_Sewa;
    }

    public void setTgl_Sewa(Date Tgl_Sewa) {
        this.Tgl_Sewa = Tgl_Sewa;
    }
    
    
}
